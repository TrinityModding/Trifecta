package me.hydos.trifecta.util;

import gg.generations.rarecandy.arceus.model.Model;
import gg.generations.rarecandy.arceus.model.lowlevel.*;
import gg.generations.rarecandy.legacy.pipeline.ShaderProgram;
import org.lwjgl.system.MemoryUtil;

import java.util.List;

import static org.lwjgl.util.par.ParShapes.par_shapes_create_cylinder;

public class ShapeModelGenerator {

    public static Model createCylinder(ShaderProgram shader) {
        var mesh = par_shapes_create_cylinder(3, 1);
        if(mesh == null) throw new RuntimeException("Failed to generate model");

        // Vertex Buffer
        var vertexCount = mesh.npoints();
        var vertexBuffer = MemoryUtil.memAlloc(vertexCount * ((3 * Float.BYTES) + (3 * Short.BYTES) + (4 * Byte.BYTES)));
        var positions = mesh.points(vertexCount * 3);
        var normals = mesh.normals(vertexCount * 3);
        if (normals == null) throw new RuntimeException("I made a mistake using this library");

        for (int i = 0; i < vertexCount; i++) {
            var x = positions.get();
            var y = positions.get();
            var z = positions.get();

            vertexBuffer
                    .putFloat(x).putFloat(y).putFloat(z)
                    .putShort(Float.floatToFloat16(normals.get())).putShort(Float.floatToFloat16(normals.get())).putShort(Float.floatToFloat16(normals.get()))
                    .put((byte) (x * 255)).put((byte) (y * 255)).put((byte) (z * 255)).put((byte) 0xFF);
        }

        // Index Buffer
        var idxCount = mesh.ntriangles();
        var indexBuffer = mesh.triangles(idxCount * 3);

        var vertexData = new VertexData(vertexBuffer, List.of(Attribute.POSITION, Attribute.NORMAL, Attribute.COLOR));
        return new Model(new RenderData(DrawMode.TRIANGLES, vertexData, MemoryUtil.memByteBuffer(indexBuffer), IndexType.UNSIGNED_INT, idxCount), shader);
    }
}
