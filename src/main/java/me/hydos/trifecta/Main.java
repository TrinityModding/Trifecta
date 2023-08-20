package me.hydos.trifecta;

import gg.generations.rarecandy.arceus.core.DefaultRenderGraph;
import gg.generations.rarecandy.arceus.core.RareCandyScene;
import gg.generations.rarecandy.arceus.model.Model;
import gg.generations.rarecandy.arceus.model.RenderingInstance;
import gg.generations.rarecandy.legacy.model.misc.Material;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;
import me.hydos.trifecta.renderer.Window;
import me.hydos.trifecta.util.ShapeModelGenerator;
import org.joml.Matrix4f;
import org.lwjgl.system.Configuration;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.lwjgl.opengl.GL11C.GL_DEPTH;
import static org.lwjgl.opengl.GL11C.glEnable;

public class Main {
    private static final RareCandyScene SCENE = new RareCandyScene();
    private static final DefaultRenderGraph GRAPH = new DefaultRenderGraph(SCENE);
    private static final Matrix4f VIEW_MAT = new Matrix4f().lookAt(0.01f, -0.5f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    private static final int FOV = 90;

    public static void main(String[] args) {
        var window = new Window();

        var cylinderModel = ShapeModelGenerator.createCylinder(new ShaderProgram.Builder()
                .shader(getShader("simple.vs"), getShader("simple.fs"))
                .supplyUniform(ShaderProgram.Builder.UniformType.SHARED, "projectionMatrix", ctx -> ctx.uniform().uploadMat4f(calculateProjection(window)))
                .supplyUniform(ShaderProgram.Builder.UniformType.SHARED, "viewMatrix", ctx -> ctx.uniform().uploadMat4f(VIEW_MAT))
                .supplyUniform(ShaderProgram.Builder.UniformType.INSTANCE, "modelMatrix", ctx -> ctx.uniform().uploadMat4f(ctx.instance().getTransform()))
                .build()
        );
        var instance = new RenderingInstance() {

            @Override
            public Model getModel() {
                return cylinderModel;
            }

            @Override
            public Material getMaterial() {
                return null; // TODO: maybe we should remove this? Im on the fence about it
            }

            @Override
            public Matrix4f getTransform() {
                return new Matrix4f();
            }
        };

        SCENE.addInstance(instance);
        window.run(w -> {
            glEnable(GL_DEPTH);
            GRAPH.render();
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
        //System.loadLibrary("renderdoc");
        Configuration.DEBUG_STREAM.set(System.out);
    }
}