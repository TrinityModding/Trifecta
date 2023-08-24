package me.hydos.trifecta.trinity;

import gg.generations.rarecandy.arceus.model.lowlevel.Bindable;
import gg.generations.rarecandy.arceus.model.lowlevel.RenderData;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;

import java.util.List;

/**
 * In trinity, the trmbf and trmsh files define multiple "meshes". each mesh has 1 big index and 1 big vertex buffer,
 * the vertex layout, and some offsets and size of the sub meshes inside. the sub meshes (supposedly) are rendered by
 * using the offset and count and this is faster due to not needing to bind the buffer multiple times. Rare Candy was
 * designed to only handle the low level or simple rendering tasks, so we must reimplement this approach inside of
 * Trifecta. This may seem bad but in reality it gives us much more fine-grained control over how this works and allows
 * us to make our own optimisations tailored to us. Another note, the RenderData here is specifically designed for 1 shader
 * so it won't work unless you load the right shader
 */
public record MeshBatch(ShaderProgram shader, RenderData renderData, List<SubMesh> meshes) implements Bindable {

    @Override
    public void bind() {
        renderData.vertexData.bind();
        renderData.bind();
    }

    @Override
    public void unbind() {
        throw new RuntimeException("Unbinding is for people who are slow. safety is 2nd");
    }

    public record SubMesh(
            long idxOffset,
            long idxCount,
            String material
    ){}
}
