package me.hydos.trifecta.renderer;

import me.hydos.trifecta.util.RenderAction;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL45C;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Platform;

import java.io.Closeable;
import java.util.Objects;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30C.*;
import static org.lwjgl.opengl.GL43C.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window implements Closeable {
    private final NuklearRenderer uiRenderer;
    private final long pWindow;
    public int width, height;
    public int fboWidth, fboHeight;

    public Window() {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize glfw");
        if (Platform.get() == Platform.MACOSX)
            throw new RuntimeException("MacOS does not support modern OpenGL. Fuck you apple.");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

        this.pWindow = glfwCreateWindow(1920, 1080, "Trifecta Trinity Editor", NULL, NULL);
        if (pWindow == NULL) throw new RuntimeException("Failed to create the GLFW window");
        glfwMakeContextCurrent(pWindow);
        var caps = GL.createCapabilities();

        if (caps.OpenGL45) {
            GL45C.glDebugMessageCallback(this::onGlError, MemoryUtil.NULL);
            GL45C.glEnable(GL45C.GL_DEBUG_OUTPUT);
        }
        glfwSetErrorCallback(this::onGlfwError);
        this.uiRenderer = new NuklearRenderer(pWindow);
    }

    public void run(RenderAction action) {
        var ctx = uiRenderer.ctx;
        glfwShowWindow(pWindow);

        while (!glfwWindowShouldClose(pWindow)) {
            newFrame();
            action.render(this);
            uiRenderer.render(ctx, width, height);

            try (var stack = stackPush()) {
                var width = stack.mallocInt(1);
                var height = stack.mallocInt(1);

                glfwGetWindowSize(pWindow, width, height);
                glViewport(0, 0, width.get(0), height.get(0));
                this.width = width.get(0);
                this.height = height.get(0);

                var bg = uiRenderer.editorUi.clearCol;
                glClearColor(bg.r(), bg.g(), bg.b(), bg.a());
            }
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            uiRenderer.glRender(width, height, fboWidth, fboHeight);
            glfwSwapBuffers(pWindow);
        }

        close();
        glfwFreeCallbacks(pWindow);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    private void newFrame() {
        try (var stack = stackPush()) {
            var w = stack.mallocInt(1);
            var h = stack.mallocInt(1);

            glfwGetWindowSize(pWindow, w, h);
            width = w.get(0);
            height = h.get(0);

            glfwGetFramebufferSize(pWindow, w, h);
            fboWidth = w.get(0);
            fboHeight = h.get(0);
        }

        uiRenderer.handleInput(pWindow);
    }

    private void onGlError(int glSource, int glType, int id, int severity, int length, long pMessage, long userParam) {
        String source = switch (glSource) {
            case GL_DEBUG_SOURCE_API -> "api";
            case GL_DEBUG_SOURCE_WINDOW_SYSTEM -> "window system";
            case GL_SHADER_COMPILER -> "shader compiler";
            case GL_DEBUG_SOURCE_THIRD_PARTY -> "3rd party";
            case GL_DEBUG_SOURCE_APPLICATION -> "application";
            case GL_DEBUG_SOURCE_OTHER -> "'other'";
            default -> throw new IllegalStateException("Unexpected value: " + glSource);
        };

        String type = switch (glType) {
            case GL_DEBUG_TYPE_ERROR -> "error";
            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR -> "deprecated behaviour";
            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR -> "undefined behaviour";
            case GL_DEBUG_TYPE_PORTABILITY -> "portability";
            case GL_DEBUG_TYPE_PERFORMANCE -> "performance";
            case GL_DEBUG_TYPE_MARKER -> "marker";
            case GL_DEBUG_TYPE_OTHER -> "'other'";
            default -> throw new IllegalStateException("Unexpected value: " + glType);
        };

        if (glType == GL_DEBUG_TYPE_ERROR)
            throw new RuntimeException("[OpenGL " + source + " " + type + "] Message: " + MemoryUtil.memUTF8(pMessage));
        else
            System.out.println("[OpenGL " + source + " " + type + "] Message: " + MemoryUtil.memUTF8(pMessage));
    }

    private void onGlfwError(int error, long pDescription) {
        String description = MemoryUtil.memUTF8(pDescription);
        throw new RuntimeException("An Error has Occurred! (%d%n) Description: %s%n".formatted(error, description));
    }

    @Override
    public void close() {
        uiRenderer.close();
    }
}