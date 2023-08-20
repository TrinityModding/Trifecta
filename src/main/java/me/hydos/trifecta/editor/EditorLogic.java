package me.hydos.trifecta.editor;

import me.hydos.trifecta.renderer.Window;
import me.hydos.trifecta.util.EditorCamera;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFWDropCallback;
import org.lwjgl.system.MemoryUtil;

import java.nio.DoubleBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.lwjgl.glfw.GLFW.*;

public class EditorLogic {
    private static final EditorCamera CAMERA = new EditorCamera(1, 0.125f, 0);
    public final EditorUi ui = new EditorUi();
    private final Window window;
    private final DoubleBuffer mouseX = MemoryUtil.memAllocDouble(1);
    private final DoubleBuffer mouseY = MemoryUtil.memAllocDouble(1);
    public boolean isDragging = false;
    public boolean shiftDown = false;

    public EditorLogic(Window window) {
        this.window = window;
        glfwSetKeyCallback(window.pWindow, this::handleKeyboardInput);
        glfwSetMouseButtonCallback(window.pWindow, this::handleMouseInput);
        glfwSetScrollCallback(window.pWindow, this::handleMouseScroll);
        glfwSetDropCallback(window.pWindow, this::handleFileDrop);
    }

    private void handleFileDrop(long pWindow, int count, long names) {
        for (int i = 0; i < count; i++) {
            var path = Paths.get(GLFWDropCallback.getName(names, i));
            handleFile(path);
        }
    }

    private void handleFile(Path path) {
        System.out.println("Opening File " + path);
    }

    private void handleKeyboardInput(long pWindow, int key, int scancode, int action, int mods) {
        if (key == GLFW_KEY_LEFT_SHIFT)
            shiftDown = (action == GLFW_PRESS || action == GLFW_REPEAT) && (shiftDown || !isDragging);
    }

    // Called every frame. Aim for < 2ms
    public void update() {
        window.uiRenderer.handleInput(window.pWindow);
        ui.render(window.uiRenderer.ctx, window.width, window.height);
        glfwGetCursorPos(window.pWindow, mouseX, mouseY);

        if (isDragging) CAMERA.onMouseDragged(mouseX.get(0), mouseY.get(0), shiftDown);
    }

    private void handleMouseScroll(long pWindow, double xOffset, double yOffset) {
        CAMERA.onMouseScrolled(-yOffset);
    }

    private void handleMouseInput(long pWindow, int key, int action, int mods) {
        switch (key) {
            case GLFW_MOUSE_BUTTON_MIDDLE -> {
                this.isDragging = action == GLFW_PRESS;
                if(isDragging) CAMERA.onMmbClicked(mouseX.get(0), mouseY.get(0));
                else CAMERA.onMmbReleased();
            }

            case GLFW_MOUSE_BUTTON_RIGHT -> System.out.println("Handle context right click");
        }
    }

    public Matrix4f getEditorCamera() {
        return CAMERA.viewMatrix;
    }
}
