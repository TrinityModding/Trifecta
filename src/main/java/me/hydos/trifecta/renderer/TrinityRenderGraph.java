package me.hydos.trifecta.renderer;

import gg.generations.rarecandy.arceus.core.RareCandyScene;
import gg.generations.rarecandy.arceus.model.RenderingInstance;
import gg.generations.rarecandy.arceus.model.SmartObject;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;
import me.hydos.trifecta.type.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.lwjgl.opengl.GL11C.glDrawElements;

public class TrinityRenderGraph {

    private final RareCandyScene<TrinityRenderInstance> scene;
    private final List<SmartObject> updatableObjects = new ArrayList<>();
    private final Map<ShaderProgram, Map<Model, List<RenderingInstance>>> instanceMap = new HashMap<>();

    public TrinityRenderGraph(RareCandyScene<TrinityRenderInstance> scene) {
        this.scene = scene;
    }

    public void render() {
        if (scene.isDirty()) updateCache();
        updatableObjects.forEach(SmartObject::update);

        for (var shaderEntry : instanceMap.entrySet()) {
            var program = shaderEntry.getKey();
            program.bind();
            program.updateSharedUniforms();

            for (var modelEntry : shaderEntry.getValue().entrySet()) {
                var model = modelEntry.getKey();
                
                for (var instance : modelEntry.getValue()) {
                    program.updateInstanceUniforms(instance, null); // FIXME: i wonder how i can better handle shaders here...

                    for (var meshBatch : model.meshes) {
                        meshBatch.bind();
                        for (var mesh : meshBatch.meshes())
                            glDrawElements(meshBatch.renderData().mode.glType, (int) mesh.idxCount(), meshBatch.renderData().indexType.glType, (int) mesh.idxOffset());
                    }
                }
            }
        }
    }

    /**
     * Update the renderers storage objects, so it doesn't de-sync with the scene.
     */
    private void updateCache() {
        scene.removedInstances.forEach(this::removeInstance);
        scene.addedInstances.forEach(this::addInstance);
        scene.markClean();
    }

    private void addInstance(TrinityRenderInstance instance) {
        if (instance instanceof SmartObject object) updatableObjects.add(object);
        instanceMap.computeIfAbsent(instance.getTrinityModel().meshes.get(0).shader(), layout -> new HashMap<>())
                .computeIfAbsent(instance.getTrinityModel(), shaderProgram -> new ArrayList<>())
                .add(instance);
    }

    private void removeInstance(TrinityRenderInstance instance) {
        if (instance instanceof SmartObject) updatableObjects.remove(instance);
        instanceMap.get(instance.getTrinityModel().meshes.get(0).shader())
                .get(instance.getTrinityModel())
                .remove(instance);
    }
}
