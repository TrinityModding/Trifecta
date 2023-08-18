package me.hydos.trifecta;


import me.hydos.trifecta.renderer.Window;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.Platform;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.GL_DEBUG_SEVERITY_LOW_ARB;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Main {

    public static void main(String[] args) {
        Configuration.DEBUG_STREAM.set(System.out);
        var window = new Window();
        window.run(w -> {

        });
    }
}