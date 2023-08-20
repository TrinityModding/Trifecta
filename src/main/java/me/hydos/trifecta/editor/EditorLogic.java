package me.hydos.trifecta.editor;

import me.hydos.trifecta.renderer.Window;
import org.lwjgl.system.MemoryUtil;

import java.nio.DoubleBuffer;

import static org.lwjgl.glfw.GLFW.*;

public class EditorLogic {

    public final EditorUi ui = new EditorUi();
    private final Window window;
    private final DoubleBuffer mouseX = MemoryUtil.memAllocDouble(1);
    private final DoubleBuffer mouseY = MemoryUtil.memAllocDouble(1);
    public boolean isDragging = false;

    public EditorLogic(Window window) {
        this.window = window;
        glfwSetMouseButtonCallback(window.pWindow, this::handleMouseInput);
    }

    // Called every frame. Aim for < 2ms
    public void update() {
        ui.render(window.uiRenderer.ctx, window.width, window.height);

        glfwGetCursorPos(window.pWindow, mouseX, mouseY);
    }

    private void handleMouseInput(long pWindow, int key, int action, int mods) {
        switch (key) {
            case GLFW_MOUSE_BUTTON_MIDDLE -> this.isDragging = action == GLFW_PRESS;

            case GLFW_MOUSE_BUTTON_RIGHT -> System.out.println("Handle context right click");
        }
    }
}
