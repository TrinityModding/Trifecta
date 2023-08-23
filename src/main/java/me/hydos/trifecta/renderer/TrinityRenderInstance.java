package me.hydos.trifecta.renderer;

import gg.generations.rarecandy.arceus.model.Model;
import gg.generations.rarecandy.arceus.model.RenderingInstance;
import gg.generations.rarecandy.legacy.model.misc.Material;
import org.joml.Matrix4f;

public class TrinityRenderInstance implements RenderingInstance {

    public final Matrix4f transform = new Matrix4f();
    private final me.hydos.trifecta.type.Model model;

    public TrinityRenderInstance(me.hydos.trifecta.type.Model model) {
        this.model = model;
    }

    public me.hydos.trifecta.type.Model getTrinityModel() {
        return model;
    }

    @Deprecated(forRemoval = true)
    @Override
    public Model getModel() {
        throw new RuntimeException("Base method not implemented. You are not using this right");
    }

    @Override
    public Material getMaterial() {
        throw new RuntimeException("Base method not implemented. You are not using this right");
    }

    @Override
    public Matrix4f getTransform() {
        return transform;
    }
}
