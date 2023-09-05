package me.hydos.trifecta;

import gg.generations.pokeutils.reader.TextureReference;
import gg.generations.rarecandy.arceus.core.RareCandyScene;
import gg.generations.rarecandy.legacy.model.misc.Texture;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;
import me.hydos.trifecta.editor.EditorLogic;
import me.hydos.trifecta.flatbuffers.Titan.TrinityScene.trinity_ScriptComponentT;
import me.hydos.trifecta.renderer.TrinityRenderGraph;
import me.hydos.trifecta.renderer.TrinityRenderInstance;
import me.hydos.trifecta.renderer.Window;
import me.hydos.trifecta.trinity.scene.TrinityScene;
import org.joml.Matrix4f;
import org.luaj.vm2.LuaError;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;
import org.lwjgl.system.Configuration;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.Path;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11C.glEnable;

public class Main {
    public static final RareCandyScene<TrinityRenderInstance> SCENE = new RareCandyScene<>();
    private static final TrinityRenderGraph GRAPH = new TrinityRenderGraph(SCENE);
    public static ShaderProgram POKEMON_SIMPLE;
    private static final int FOV = 90;

    public static void main(String[] args) {
        var window = new Window();
        var editor = new EditorLogic(window);
        setUpSharedGLFWCallbacks(window, editor);
        try {
            var tex = new Texture(TextureReference.read(Paths.get("C:/Users/hydos/Desktop/notex.png")));

            POKEMON_SIMPLE = new ShaderProgram.Builder()
                    .shader(getShader("simple.vs"), getShader("simple.fs"))
                    .supplyUniform(ShaderProgram.Builder.UniformType.SHARED, "projectionMatrix", ctx -> ctx.uniform().uploadMat4f(calculateProjection(window)))
                    .supplyUniform(ShaderProgram.Builder.UniformType.SHARED, "viewMatrix", ctx -> ctx.uniform().uploadMat4f(editor.getEditorCamera()))
                    .supplyUniform(ShaderProgram.Builder.UniformType.SHARED, "textureSampler", ctx -> {
                        ctx.bindAndUploadTex(tex, 0);
                    })
                    .supplyUniform(ShaderProgram.Builder.UniformType.INSTANCE, "modelMatrix", ctx -> ctx.uniform().uploadMat4f(ctx.instance().getTransform()))
                    .build();

            window.run(w -> {
                glEnable(GL_DEPTH_TEST);
                GRAPH.render();
            }, editor::update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setUpSharedGLFWCallbacks(Window window, EditorLogic editorLogic) {
        glfwSetScrollCallback(window.pWindow, (long windowP, double xoffset, double yoffset) -> {
            window.uiRenderer.onScroll(windowP, xoffset, yoffset);
            editorLogic.handleMouseScroll(windowP, xoffset, yoffset);
        });

        glfwSetKeyCallback(window.pWindow, (pWindow, key, scancode, action, mods) -> {
           window.uiRenderer.onKey(pWindow, key, scancode, action, mods);
           editorLogic.handleKeyboardInput(pWindow, key, scancode, action, mods);
        });

        glfwSetMouseButtonCallback(window.pWindow, (window1, button, action, mods) -> {
            window.uiRenderer.mouseClick(window1, button, action, mods);
            editorLogic.handleMouseInput(window1, button, action, mods);
        });

    }

    private static Matrix4f calculateProjection(Window window) {
        return new Matrix4f().perspective((float) Math.toRadians(FOV), (float) window.width / window.height, 0.1f, 1000.0f);
    }

    private static String getShader(String path) {
        try {
            return new String(Main.class.getResourceAsStream("/shader/" + path + ".glsl").readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        System.loadLibrary("renderdoc");
        Configuration.DEBUG_STREAM.set(System.out);
    }
}