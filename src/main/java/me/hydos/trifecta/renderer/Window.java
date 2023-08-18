package me.hydos.trifecta.renderer;

import me.hydos.trifecta.util.RenderAction;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Platform;

import java.io.Closeable;
import java.nio.IntBuffer;
import java.util.Objects;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.GL_DEBUG_SEVERITY_LOW_ARB;
import static org.lwjgl.opengl.GL30C.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window implements Closeable {
    private final NuklearRenderer uiRenderer;
    private final long pWindow;
    private final Callback debugProc;
    private int width, height;
    private int displayWidth, displayHeight;

    public Window() {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) throw new IllegalStateException("Unable to initialize glfw");
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

        this.pWindow = glfwCreateWindow(1920, 1080, "Trifecta Trinity Editor", NULL, NULL);
        if (pWindow == NULL) throw new RuntimeException("Failed to create the GLFW window");
        glfwMakeContextCurrent(pWindow);
        var caps = GL.createCapabilities();
        this.debugProc = GLUtil.setupDebugMessageCallback();

        if (caps.OpenGL43)
            GL43.glDebugMessageControl(GL43.GL_DEBUG_SOURCE_API, GL43.GL_DEBUG_TYPE_OTHER, GL43.GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer) null, false);
        else if (caps.GL_KHR_debug)
            KHRDebug.glDebugMessageControl(KHRDebug.GL_DEBUG_SOURCE_API, KHRDebug.GL_DEBUG_TYPE_OTHER, KHRDebug.GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer) null, false);
        else if (caps.GL_ARB_debug_output)
            glDebugMessageControlARB(GL_DEBUG_SOURCE_API_ARB, GL_DEBUG_TYPE_OTHER_ARB, GL_DEBUG_SEVERITY_LOW_ARB, (IntBuffer) null, false);
        this.uiRenderer = new NuklearRenderer(pWindow);
    }

    public void run(RenderAction action) {
        var ctx = uiRenderer.ctx;
        glfwShowWindow(pWindow);

        while (!glfwWindowShouldClose(pWindow)) {
            newFrame();
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

            uiRenderer.glRender(width, height, displayWidth, displayHeight);
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
            displayWidth = w.get(0);
            displayHeight = h.get(0);
        }

        uiRenderer.handleInput(pWindow);
    }

    @Override
    public void close() {
        debugProc.free();
        uiRenderer.close();
    }
}