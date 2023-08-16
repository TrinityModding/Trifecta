package me.hydos.trifecta.renderer;

import java.io.Closeable;
import java.util.Objects;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30C.*;
import static org.lwjgl.system.MemoryStack.stackPush;

public class EditorRenderer implements Closeable {
    private final NuklearRenderer uiRenderer;
    private final long pWindow;
    private int width, height;
    private int displayWidth, displayHeight;

    public EditorRenderer(long pWindow) {
        this.pWindow = pWindow;
        this.uiRenderer = new NuklearRenderer();
    }

    public void run() {
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

                var bg = uiRenderer.editorUi.clearCol;
                glClearColor(bg.r(), bg.g(), bg.b(), bg.a());
            }
            glClear(GL_COLOR_BUFFER_BIT);

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
        uiRenderer.close();
    }
}