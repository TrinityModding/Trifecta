package me.hydos.trifecta.shader;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShaderVariation {

    private final int idx;
    public final ShaderProgram program;

    public ShaderVariation(int i, ByteBuffer buffer) {
        this.idx = i;
        var srcProgramOffset = buffer.getLong();
        buffer.getLong(); // unk2
        var shaderProgramOffset = buffer.getLong();
        buffer.getLong(); // Points back to grsc
        buffer.position(buffer.position() + 0x20);
        var oldPos = buffer.position();

        buffer.position((int) (shaderProgramOffset + srcProgramOffset));
        this.program = new ShaderProgram(buffer);
        buffer.position(oldPos);
    }

    public String getName() {
        return "Shader Variation " + idx;
    }

    public static class ShaderProgram {

        public final ShaderData vertexShader;
        public final ShaderData unk1Shader;
        public final ShaderData unk2Shader;
        public final ShaderData geometryShader;
        public final ShaderData fragmentShader;
        public final ShaderData computeShader;

        public ShaderProgram(ByteBuffer bb) {
            bb.get(); // shader type
            var format = bb.get();

            bb.position(bb.position() + 0x06);
            var vertexShaderOffset = bb.getLong();
            var unk1ShaderOffset = bb.getLong();
            var unk2ShaderOffset = bb.getLong();
            var geometryShaderOffset = bb.getLong();
            var fragmentShaderOffset = bb.getLong();
            var computeShaderOffset = bb.getLong();
            var returnPos = bb.position();

            this.vertexShader = readShader(bb, vertexShaderOffset, Type.VERTEX);
            this.fragmentShader = readShader(bb, fragmentShaderOffset, Type.FRAGMENT);

            if (format == 3) {
                this.unk1Shader = null;
                this.unk2Shader = null;
                this.geometryShader = null;
                this.computeShader = null;
            } else {
                this.unk1Shader = readShader(bb, unk1ShaderOffset, null);
                this.unk2Shader = readShader(bb, unk2ShaderOffset, null);
                this.geometryShader = readShader(bb, geometryShaderOffset, Type.GEOMETRY);
                this.computeShader = readShader(bb, computeShaderOffset, Type.COMPUTE);
            }

            bb.position(returnPos);
        }

        private ShaderData readShader(ByteBuffer bb, long startPosition, Type shaderType) {
            if (startPosition == 0) return null;
            bb.position((int) startPosition + 8);
            var shaderOffset = bb.getLong();
            var shaderOffset2 = bb.getLong();
            var shaderSize = bb.getInt();
            var shaderSize2 = bb.getInt();
            bb.position(bb.position() + 0x20);
            var oldPos = bb.position();

            bb.position((int) shaderOffset);
            var shader0 = new byte[shaderSize2];
            bb.get(shader0);

            bb.position((int) shaderOffset2);
            var shader1 = new byte[shaderSize];
            bb.get(shader1);

            bb.position(oldPos);
            return new ShaderData(shaderType, shader0, shader1);
        }

        public record ShaderData(
                Type type,
                byte[] shader0,
                byte[] shader1
        ) {

            public void exportShader0(Path path) {
                try {
                    Files.createDirectories(path.getParent());
                    Files.write(path, shader0);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to write shader0", e);
                }
            }

            public void exportShader1(Path path) {
                try {
                    Files.createDirectories(path.getParent());
                    Files.write(path, shader1);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to write shader1", e);
                }
            }
        }

        public enum Type {
            VERTEX,
            FRAGMENT,
            COMPUTE,
            GEOMETRY
        }
    }
}
