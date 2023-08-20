package me.hydos.trifecta.util;

import gg.generations.rarecandy.arceus.model.Model;
import gg.generations.rarecandy.arceus.model.lowlevel.*;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;
import org.lwjgl.system.MemoryUtil;

import java.util.List;

import static org.lwjgl.util.par.ParShapes.par_shapes_create_cylinder;
import static org.lwjgl.util.par.ParShapes.par_shapes_scale;

public class ShapeModelGenerator {

    public static Model createCylinder(ShaderProgram shader) {
        var mesh = par_shapes_create_cylinder(12, 1);
        if (mesh == null) throw new RuntimeException("Failed to generate model");
        par_shapes_scale(mesh, 0.1f, 0.1f, 0.3f);

        // Vertex Buffer
        var vertexCount = mesh.npoints();
        var vertexBuffer = MemoryUtil.memAlloc(vertexCount * (3 * Float.BYTES));
        var positions = mesh.points(vertexCount * 3);

        for (int i = 0; i < vertexCount; i++) {
            var x = positions.get();
            var y = positions.get();
            var z = positions.get();
            vertexBuffer.putFloat(x).putFloat(y).putFloat(z);
        }
        vertexBuffer.flip();

        // Index Buffer
        var idxCount = mesh.ntriangles() * 3;
        var srcIdxBuffer = mesh.triangles(idxCount);
        var idxBuffer = MemoryUtil.memAlloc(idxCount * Integer.BYTES);
        for (int i = 0; i < idxCount; i++) idxBuffer.putInt(srcIdxBuffer.get(i));
        idxBuffer.flip();

        // Free mesh data
        mesh.free();

        var vertexData = new VertexData(vertexBuffer, List.of(Attribute.POSITION));
        return new Model(new RenderData(DrawMode.TRIANGLES, vertexData, idxBuffer, IndexType.UNSIGNED_INT, idxCount), shader);
    }
}
