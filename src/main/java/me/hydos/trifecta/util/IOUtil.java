package me.hydos.trifecta.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

import static org.lwjgl.system.MemoryUtil.memCalloc;
import static org.lwjgl.system.MemoryUtil.memSlice;

public final class IOUtil {

    public static ByteBuffer ioResourceToByteBuffer(String resource, int initialSize) throws IOException {
        var bytes = Objects.requireNonNull(IOUtil.class.getResourceAsStream("/" + resource), "Resource \"" + resource + "\" not found").readAllBytes();
        var size = Math.max(bytes.length, initialSize);
        var buffer = memCalloc(size);
        buffer.put(bytes);
        buffer.flip();
        return memSlice(buffer);
    }
}