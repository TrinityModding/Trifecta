package me.hydos.trifecta.util;

import org.joml.Matrix4f;
import org.joml.Vector3f;

public class EditorCamera {
    public final Matrix4f viewMatrix = new Matrix4f();
    private final Vector3f position = new Vector3f();
    private float radius;
    private float angleX;
    private float angleY;
    private double lastX;
    private double lastY;
    private float offsetX, offsetY;

    public EditorCamera(float radius, float angleX, float angleY) {
        this.radius = radius;
        this.angleX = angleX;
        this.angleY = angleY;
        update();
    }

    public void update() {
        viewMatrix.identity().arcball(radius, position.x, position.y, position.z, (angleY + offsetY) * (float) Math.PI * 2f, (angleX + offsetX) * (float) Math.PI * 2f);
    }

    public void onMouseScrolled(double rotation) {
        radius += (float) (rotation * 0.1f);
        update();
    }

    public void onMouseDragged(double mouseX, double mouseY, boolean shiftDown) {
        if(!shiftDown) {
            this.offsetX = (float) ((mouseX - lastX) * 0.001f);
            this.offsetY = (float) ((mouseY - lastY) * 0.001f);
        } else {
            position.x = (float) -((mouseX - lastX) * 0.001f);
            position.y = (float) ((mouseY - lastY) * 0.001f);
        }

        update();
    }

    public void onMmbClicked(double mouseX, double mouseY) {
        this.offsetX = 0;
        this.offsetY = 0;
        this.lastX = mouseX;
        this.lastY = mouseY;
    }

    public void onMmbReleased() {
        this.angleX += offsetX;
        this.angleY += offsetY;
        this.offsetX = 0;
        this.offsetY = 0;
        this.lastX = 0;
        this.lastY = 0;
        update();
    }
}
