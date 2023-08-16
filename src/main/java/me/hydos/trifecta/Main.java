package me.hydos.trifecta;


import me.hydos.trifecta.renderer.EditorRenderer;
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
        System.loadLibrary("renderdoc");
        Configuration.DEBUG_STREAM.set(System.out);
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

        var win = glfwCreateWindow(1920, 1080, "Trifecta Trinity Editor", NULL, NULL);
        if (win == NULL) throw new RuntimeException("Failed to create the GLFW window");
        glfwMakeContextCurrent(win);
        var caps = GL.createCapabilities();
        var debugProc = GLUtil.setupDebugMessageCallback();

        if (caps.OpenGL43)
            GL43.glDebugMessageControl(GL43.GL_DEBUG_SOURCE_API, GL43.GL_DEBUG_TYPE_OTHER, GL43.GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer) null, false);
        else if (caps.GL_KHR_debug)
            KHRDebug.glDebugMessageControl(KHRDebug.GL_DEBUG_SOURCE_API, KHRDebug.GL_DEBUG_TYPE_OTHER, KHRDebug.GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer) null, false);
        else if (caps.GL_ARB_debug_output)
            glDebugMessageControlARB(GL_DEBUG_SOURCE_API_ARB, GL_DEBUG_TYPE_OTHER_ARB, GL_DEBUG_SEVERITY_LOW_ARB, (IntBuffer) null, false);

        var renderer = new EditorRenderer(win);
        renderer.run();
        debugProc.free();
        renderer.close();
    }
}