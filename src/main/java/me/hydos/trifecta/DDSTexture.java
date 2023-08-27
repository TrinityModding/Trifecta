package me.hydos.trifecta;

import net.buttology.lwjgl.dds.DDSFile;
import org.lwjgl.opengl.*;

import java.io.IOException;
import java.nio.file.Path;

public class DDSTexture implements AutoCloseable {
    private final int id;

    public DDSTexture(Path path) throws IOException {
        var file = new DDSFile(path.toString());

        this.id = GL11.glGenTextures();       // Generate a texture ID.
        GL13.glActiveTexture(GL13.GL_TEXTURE0);     // Depends on your implementation
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, id);
        for (int level = 0; level < file.getMipMapCount(); level++)
            GL13.glCompressedTexImage2D(
                    GL11.GL_TEXTURE_2D,
                    level,
                    file.getFormat(),
                    file.getWidth(level),
                    file.getHeight(level),
                    0,
                    file.getBuffer(level)
            );
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, file.getMipMapCount() - 1);
    }

    public void bind(int slot) {
        assert slot >= 0 && slot <= 31;

        GL13C.glActiveTexture(GL13C.GL_TEXTURE0 + slot);
        GL11C.glBindTexture(GL11C.GL_TEXTURE_2D, this.id);
    }

    @Override
    public void close() throws Exception {
        GL11.glDeleteTextures(id);
    }
}
