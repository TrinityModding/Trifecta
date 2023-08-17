package me.hydos.trifecta.renderer;

import me.hydos.trifecta.util.IOUtil;
import org.lwjgl.nuklear.*;
import org.lwjgl.stb.STBTTAlignedQuad;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTTPackContext;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.system.Platform;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.opengl.GL12C.GL_UNSIGNED_INT_8_8_8_8_REV;
import static org.lwjgl.opengl.GL15C.*;
import static org.lwjgl.opengl.GL20C.*;
import static org.lwjgl.opengl.GL30C.glBindVertexArray;
import static org.lwjgl.opengl.GL30C.glGenVertexArrays;
import static org.lwjgl.stb.STBTruetype.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.*;

public class NuklearRenderer implements Closeable {
    private static final int BUFFER_INITIAL_SIZE = 4 * 1024;
    private static final int MAX_VERTEX_BUFFER = 512 * 1024;
    private static final int MAX_ELEMENT_BUFFER = 128 * 1024;
    public final NkAllocator allocator;
    public final NkDrawVertexLayoutElement.Buffer vertexLayout;
    public final EditorUi editorUi = new EditorUi();
    public final NkContext ctx = NkContext.create();
    public final NkUserFont font = NkUserFont.create();
    public final NkBuffer cmds = NkBuffer.create();
    public final NkDrawNullTexture null_texture = NkDrawNullTexture.create();
    // Gl Objects
    private int vbo, vao, ebo;
    private int prog;
    private int vertexShader;
    private int fragmentShader;
    private int uniformTex;
    private int uniformProj;

    public NuklearRenderer(long window) {
        try {
            this.allocator = NkAllocator.create()
                    .alloc((handle, old, size) -> nmemAllocChecked(size))
                    .mfree((handle, ptr) -> nmemFree(ptr));
            this.vertexLayout = NkDrawVertexLayoutElement.create(4)
                    .position(0).attribute(NK_VERTEX_POSITION).format(NK_FORMAT_FLOAT).offset(0)
                    .position(1).attribute(NK_VERTEX_TEXCOORD).format(NK_FORMAT_FLOAT).offset(8)
                    .position(2).attribute(NK_VERTEX_COLOR).format(NK_FORMAT_R8G8B8A8).offset(16)
                    .position(3).attribute(NK_VERTEX_ATTRIBUTE_COUNT).format(NK_FORMAT_COUNT).offset(0)
                    .flip();

            createContext(window);
            loadFont();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load font", e);
        }
    }

    public void handleInput(long win) {
        nk_input_begin(ctx);
        glfwPollEvents();

        var mouse = ctx.input().mouse();
        if (mouse.grab()) glfwSetInputMode(win, GLFW_CURSOR, GLFW_CURSOR_HIDDEN);
        else if (mouse.grabbed()) {
            var prevX = mouse.prev().x();
            var prevY = mouse.prev().y();
            glfwSetCursorPos(win, prevX, prevY);
            mouse.pos().x(prevX);
            mouse.pos().y(prevY);
        } else if (mouse.ungrab()) glfwSetInputMode(win, GLFW_CURSOR, GLFW_CURSOR_NORMAL);

        nk_input_end(ctx);
    }

    private void setupContext() {
        var NK_SHADER_VERSION = Platform.get() == Platform.MACOSX ? "#version 150\n" : "#version 300 es\n";
        var vertex_shader = NK_SHADER_VERSION + """
                uniform mat4 ProjMtx;
                in vec2 Position;
                in vec2 TexCoord;
                in vec4 Color;
                out vec2 Frag_UV;
                out vec4 Frag_Color;
                                
                void main() {
                   Frag_UV = TexCoord;
                   Frag_Color = Color;
                   gl_Position = ProjMtx * vec4(Position.xy, 0, 1);
                }""";
        var fragment_shader = NK_SHADER_VERSION + """
                precision mediump float;
                uniform sampler2D Texture;
                in vec2 Frag_UV;
                in vec4 Frag_Color;
                out vec4 Out_Color;
                                
                void main(){
                   Out_Color = Frag_Color * texture(Texture, Frag_UV.st);
                }""";

        nk_buffer_init(cmds, allocator, BUFFER_INITIAL_SIZE);
        prog = glCreateProgram();
        vertexShader = glCreateShader(GL_VERTEX_SHADER);
        fragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(vertexShader, vertex_shader);
        glShaderSource(fragmentShader, fragment_shader);
        glCompileShader(vertexShader);
        glCompileShader(fragmentShader);
        if (glGetShaderi(vertexShader, GL_COMPILE_STATUS) != GL_TRUE)
            throw new IllegalStateException("Failed to compile Nuklear vertex shader");

        if (glGetShaderi(fragmentShader, GL_COMPILE_STATUS) != GL_TRUE)
            throw new IllegalStateException("Failed to compile Nuklear fragment shader");

        glAttachShader(prog, vertexShader);
        glAttachShader(prog, fragmentShader);
        glLinkProgram(prog);
        if (glGetProgrami(prog, GL_LINK_STATUS) != GL_TRUE) throw new IllegalStateException("Failed to link shaders");

        this.uniformTex = glGetUniformLocation(prog, "Texture");
        this.uniformProj = glGetUniformLocation(prog, "ProjMtx");
        var attrib_pos = glGetAttribLocation(prog, "Position");
        var attrib_uv = glGetAttribLocation(prog, "TexCoord");
        var attrib_col = glGetAttribLocation(prog, "Color");

        // buffer setup
        this.vbo = glGenBuffers();
        this.ebo = glGenBuffers();
        this.vao = glGenVertexArrays();

        glBindVertexArray(vao);
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);

        glEnableVertexAttribArray(attrib_pos);
        glEnableVertexAttribArray(attrib_uv);
        glEnableVertexAttribArray(attrib_col);

        glVertexAttribPointer(attrib_pos, 2, GL_FLOAT, false, 20, 0);
        glVertexAttribPointer(attrib_uv, 2, GL_FLOAT, false, 20, 8);
        glVertexAttribPointer(attrib_col, 4, GL_UNSIGNED_BYTE, true, 20, 16);

        // null texture setup
        try (var stack = stackPush()) {
            var nullTexID = glGenTextures();
            null_texture.texture().id(nullTexID);
            null_texture.uv().set(0.5f, 0.5f);

            glBindTexture(GL_TEXTURE_2D, nullTexID);
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, 1, 1, 0, GL_RGBA, GL_UNSIGNED_INT_8_8_8_8_REV, stack.ints(0xFFFFFFFF));
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        }

        glBindTexture(GL_TEXTURE_2D, 0);
        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glBindVertexArray(0);
    }

    private void loadFont() throws IOException {
        var BITMAP_W = 1024;
        var BITMAP_H = 1024;
        var FONT_HEIGHT = 18;

        var fontBytes = IOUtil.ioResourceToByteBuffer("FiraSans-light.ttf", 512 * 1024);
        var fontTexID = glGenTextures();
        var fontInfo = STBTTFontinfo.create();
        var cdata = STBTTPackedchar.create(95);
        float scale;
        float descent;

        try (var stack = stackPush()) {
            stbtt_InitFont(fontInfo, fontBytes);
            scale = stbtt_ScaleForPixelHeight(fontInfo, FONT_HEIGHT);

            var d = stack.mallocInt(1);
            stbtt_GetFontVMetrics(fontInfo, null, d, null);
            descent = d.get(0) * scale;

            var bitmap = memAlloc(BITMAP_W * BITMAP_H);

            var pc = STBTTPackContext.malloc(stack);
            stbtt_PackBegin(pc, bitmap, BITMAP_W, BITMAP_H, 0, 1, NULL);
            stbtt_PackSetOversampling(pc, 4, 4);
            stbtt_PackFontRange(pc, fontBytes, 0, FONT_HEIGHT, 32, cdata);
            stbtt_PackEnd(pc);

            // Convert R8 to RGBA8
            var texture = memAlloc(BITMAP_W * BITMAP_H * 4);
            for (var i = 0; i < bitmap.capacity(); i++) {
                texture.putInt((bitmap.get(i) << 24) | 0x00FFFFFF);
            }
            texture.flip();

            glBindTexture(GL_TEXTURE_2D, fontTexID);
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, BITMAP_W, BITMAP_H, 0, GL_RGBA, GL_UNSIGNED_INT_8_8_8_8_REV, texture);
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);

            memFree(texture);
            memFree(bitmap);
        }

        font.width((handle, h, text, len) -> {
                    float text_width = 0;
                    try (var stack = stackPush()) {
                        var unicode = stack.mallocInt(1);

                        var glyph_len = nnk_utf_decode(text, memAddress(unicode), len);
                        var text_len = glyph_len;

                        if (glyph_len == 0) {
                            return 0;
                        }

                        var advance = stack.mallocInt(1);
                        while (text_len <= len && glyph_len != 0) {
                            if (unicode.get(0) == NK_UTF_INVALID) {
                                break;
                            }

                            /* query currently drawn glyph information */
                            stbtt_GetCodepointHMetrics(fontInfo, unicode.get(0), advance, null);
                            text_width += advance.get(0) * scale;

                            /* offset next glyph */
                            glyph_len = nnk_utf_decode(text + text_len, memAddress(unicode), len - text_len);
                            text_len += glyph_len;
                        }
                    }
                    return text_width;
                })
                .height(FONT_HEIGHT)
                .query((handle, font_height, glyph, codepoint, next_codepoint) -> {
                    try (var stack = stackPush()) {
                        var x = stack.floats(0.0f);
                        var y = stack.floats(0.0f);
                        var q = STBTTAlignedQuad.malloc(stack);
                        var advance = stack.mallocInt(1);

                        stbtt_GetPackedQuad(cdata, BITMAP_W, BITMAP_H, codepoint - 32, x, y, q, false);
                        stbtt_GetCodepointHMetrics(fontInfo, codepoint, advance, null);

                        var ufg = NkUserFontGlyph.create(glyph)
                                .width(q.x1() - q.x0())
                                .height(q.y1() - q.y0());

                        ufg.xadvance(advance.get(0) * scale).uv(0).set(q.s0(), q.t0());
                        ufg.offset().set(q.x0(), q.y0() + (FONT_HEIGHT + descent));
                        ufg.uv(1).set(q.s1(), q.t1());
                    }
                })
                .texture(it -> it.id(fontTexID));

        nk_style_set_font(ctx, font);
    }

    public void render(NkContext ctx, int width, int height) {
        editorUi.render(ctx, width, height);
    }

    /**
     * IMPORTANT: `nk_glfw_render` modifies some global OpenGL state
     * with blending, scissor, face culling, depth test and viewport and
     * defaults everything back into a default state.
     * Make sure to either a. save and restore or b. reset your own state after
     * rendering the UI.
     */
    public void glRender(int width, int height, int displayWidth, int displayHeight) {
        try (var stack = stackPush()) {
            // setup global state
            glEnable(GL_BLEND);
            glBlendEquation(GL_FUNC_ADD);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
            glDisable(GL_CULL_FACE);
            glDisable(GL_DEPTH_TEST);
            glEnable(GL_SCISSOR_TEST);
            glActiveTexture(GL_TEXTURE0);

            // setup program
            glUseProgram(prog);
            glUniform1i(uniformTex, 0);
            glUniformMatrix4fv(uniformProj, false, stack.floats(2.0f / width, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f / height, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f));
            glViewport(0, 0, displayWidth, displayHeight);
        }

        // allocate vertex and element buffer
        glBindVertexArray(vao);
        glBindBuffer(GL_ARRAY_BUFFER, vbo);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ebo);

        glBufferData(GL_ARRAY_BUFFER, MAX_VERTEX_BUFFER, GL_STREAM_DRAW);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, MAX_ELEMENT_BUFFER, GL_STREAM_DRAW);

        // load draw vertices & elements directly into vertex + element buffer
        var vertices = Objects.requireNonNull(glMapBuffer(GL_ARRAY_BUFFER, GL_WRITE_ONLY, MAX_ELEMENT_BUFFER, null));
        var elements = Objects.requireNonNull(glMapBuffer(GL_ELEMENT_ARRAY_BUFFER, GL_WRITE_ONLY, MAX_ELEMENT_BUFFER, null));
        try (var stack = stackPush()) {
            var config = NkConvertConfig.calloc(stack)
                    .vertex_layout(vertexLayout)
                    .vertex_size(20)
                    .vertex_alignment(4)
                    .tex_null(null_texture)
                    .circle_segment_count(22)
                    .curve_segment_count(22)
                    .arc_segment_count(22)
                    .global_alpha(1.0f)
                    .shape_AA(NK_ANTI_ALIASING_ON)
                    .line_AA(NK_ANTI_ALIASING_ON);

            // setup buffers to load vertices and elements
            var vbuf = NkBuffer.malloc(stack);
            var ebuf = NkBuffer.malloc(stack);

            nk_buffer_init_fixed(vbuf, vertices);
            nk_buffer_init_fixed(ebuf, elements);
            nk_convert(ctx, cmds, vbuf, ebuf, config);
        }

        glUnmapBuffer(GL_ELEMENT_ARRAY_BUFFER);
        glUnmapBuffer(GL_ARRAY_BUFFER);

        // iterate over and execute each draw command
        var fb_scale_x = (float) displayWidth / (float) width;
        var fb_scale_y = (float) displayHeight / (float) height;

        var offset = NULL;
        for (var cmd = nk__draw_begin(ctx, cmds); cmd != null; cmd = nk__draw_next(cmd, cmds, ctx)) {
            if (cmd.elem_count() == 0) continue;
            glBindTexture(GL_TEXTURE_2D, cmd.texture().id());
            glScissor((int) (cmd.clip_rect().x() * fb_scale_x), (int) ((height - (int) (cmd.clip_rect().y() + cmd.clip_rect().h())) * fb_scale_y), (int) (cmd.clip_rect().w() * fb_scale_x), (int) (cmd.clip_rect().h() * fb_scale_y));
            glDrawElements(GL_TRIANGLES, cmd.elem_count(), GL_UNSIGNED_SHORT, offset);
            offset += cmd.elem_count() * 2L;
        }
        nk_clear(ctx);
        nk_buffer_clear(cmds);

        // default OpenGL state
        glUseProgram(0);
        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glBindVertexArray(0);
        glDisable(GL_BLEND);
        glDisable(GL_SCISSOR_TEST);
    }

    public void createContext(long win) {
        glfwSetScrollCallback(win, (window, xoffset, yoffset) -> {
            try (var stack = stackPush()) {
                var scroll = NkVec2.malloc(stack).x((float) xoffset).y((float) yoffset);
                nk_input_scroll(ctx, scroll);
            }
        });
        glfwSetCharCallback(win, (window, codepoint) -> nk_input_unicode(ctx, codepoint));
        glfwSetKeyCallback(win, (window, key, scancode, action, mods) -> {
            var press = action == GLFW_PRESS;
            switch (key) {
                case GLFW_KEY_ESCAPE -> glfwSetWindowShouldClose(window, true);
                case GLFW_KEY_DELETE -> nk_input_key(ctx, NK_KEY_DEL, press);
                case GLFW_KEY_ENTER -> nk_input_key(ctx, NK_KEY_ENTER, press);
                case GLFW_KEY_TAB -> nk_input_key(ctx, NK_KEY_TAB, press);
                case GLFW_KEY_BACKSPACE -> nk_input_key(ctx, NK_KEY_BACKSPACE, press);
                case GLFW_KEY_UP -> nk_input_key(ctx, NK_KEY_UP, press);
                case GLFW_KEY_DOWN -> nk_input_key(ctx, NK_KEY_DOWN, press);
                case GLFW_KEY_HOME -> {
                    nk_input_key(ctx, NK_KEY_TEXT_START, press);
                    nk_input_key(ctx, NK_KEY_SCROLL_START, press);
                }
                case GLFW_KEY_END -> {
                    nk_input_key(ctx, NK_KEY_TEXT_END, press);
                    nk_input_key(ctx, NK_KEY_SCROLL_END, press);
                }
                case GLFW_KEY_PAGE_DOWN -> nk_input_key(ctx, NK_KEY_SCROLL_DOWN, press);
                case GLFW_KEY_PAGE_UP -> nk_input_key(ctx, NK_KEY_SCROLL_UP, press);
                case GLFW_KEY_LEFT_SHIFT, GLFW_KEY_RIGHT_SHIFT -> nk_input_key(ctx, NK_KEY_SHIFT, press);
                case GLFW_KEY_LEFT_CONTROL, GLFW_KEY_RIGHT_CONTROL -> {
                    if (press) {
                        nk_input_key(ctx, NK_KEY_COPY, glfwGetKey(window, GLFW_KEY_C) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_PASTE, glfwGetKey(window, GLFW_KEY_P) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_CUT, glfwGetKey(window, GLFW_KEY_X) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_UNDO, glfwGetKey(window, GLFW_KEY_Z) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_REDO, glfwGetKey(window, GLFW_KEY_R) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_WORD_LEFT, glfwGetKey(window, GLFW_KEY_LEFT) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_WORD_RIGHT, glfwGetKey(window, GLFW_KEY_RIGHT) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_LINE_START, glfwGetKey(window, GLFW_KEY_B) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_TEXT_LINE_END, glfwGetKey(window, GLFW_KEY_E) == GLFW_PRESS);
                    } else {
                        nk_input_key(ctx, NK_KEY_LEFT, glfwGetKey(window, GLFW_KEY_LEFT) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_RIGHT, glfwGetKey(window, GLFW_KEY_RIGHT) == GLFW_PRESS);
                        nk_input_key(ctx, NK_KEY_COPY, false);
                        nk_input_key(ctx, NK_KEY_PASTE, false);
                        nk_input_key(ctx, NK_KEY_CUT, false);
                        nk_input_key(ctx, NK_KEY_SHIFT, false);
                    }
                }
            }
        });

        glfwSetCursorPosCallback(win, (window, xpos, ypos) -> nk_input_motion(ctx, (int) xpos, (int) ypos));
        glfwSetMouseButtonCallback(win, (window, button, action, mods) -> {
            try (var stack = stackPush()) {
                var cx = stack.mallocDouble(1);
                var cy = stack.mallocDouble(1);

                glfwGetCursorPos(window, cx, cy);

                var x = (int) cx.get(0);
                var y = (int) cy.get(0);

                int nkButton;
                switch (button) {
                    case GLFW_MOUSE_BUTTON_RIGHT:
                        nkButton = NK_BUTTON_RIGHT;
                        break;
                    case GLFW_MOUSE_BUTTON_MIDDLE:
                        nkButton = NK_BUTTON_MIDDLE;
                        break;
                    default:
                        nkButton = NK_BUTTON_LEFT;
                }
                nk_input_button(ctx, nkButton, x, y, action == GLFW_PRESS);
            }
        });

        nk_init(ctx, allocator, null);
        ctx.clip().copy((handle, text, len) -> {
            if (len == 0) {
                return;
            }

            try (var stack = stackPush()) {
                var str = stack.malloc(len + 1);
                memCopy(text, memAddress(str), len);
                str.put(len, (byte) 0);

                glfwSetClipboardString(win, str);
            }
        }).paste((handle, edit) -> {
            var text = nglfwGetClipboardString(win);
            if (text != NULL) {
                nnk_textedit_paste(edit, text, nnk_strlen(text));
            }
        });

        setupContext();
    }

    @Override
    public void close() {
        System.out.println("Closing");
        // Nk objects
        Objects.requireNonNull(ctx.clip().copy()).free();
        Objects.requireNonNull(ctx.clip().paste()).free();
        nk_free(ctx);
        nk_buffer_free(cmds);
        Objects.requireNonNull(font.query()).free();
        Objects.requireNonNull(font.width()).free();

        // Nk allocator
        Objects.requireNonNull(allocator.alloc()).free();
        Objects.requireNonNull(allocator.mfree()).free();

        // OpenGL objects
        glDeleteTextures(font.texture().id());
        glDeleteTextures(null_texture.texture().id());
        glDetachShader(prog, vertexShader);
        glDetachShader(prog, fragmentShader);
        glDeleteShader(vertexShader);
        glDeleteShader(fragmentShader);
        glDeleteProgram(prog);

        glDeleteBuffers(vbo);
        glDeleteBuffers(ebo);
    }
}
