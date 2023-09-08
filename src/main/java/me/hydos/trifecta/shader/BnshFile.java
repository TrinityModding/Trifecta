package me.hydos.trifecta.shader;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class BnshFile {

    public final int versionMajor;
    public final int versionMajor2;
    public final int versionMinor;
    public final int versionMinor2;
    public final String name;
    public final ArrayList<ShaderVariation> variations;

    public BnshFile(ByteBuffer buffer) {
        validateSignature(buffer, "BNSH");
        buffer.getInt(); // Padding
        var version = getUnsignedInt(buffer);
        this.versionMajor = (int) (version >> 24);
        this.versionMajor2 = (int) (version >> 16 & 0xFF);
        this.versionMinor = (int) (version >> 8 & 0xFF);
        this.versionMinor2 = (int) (version & 0xFF);
        buffer.getShort(); // byte order mark
        buffer.get(); // alignment
        buffer.get(); // target
        this.name = readString(buffer);
        getUnsignedInt(buffer); // pathOffset
        getUnsignedInt(buffer); // relocationTableOffset
        getUnsignedInt(buffer); // fileSize

        buffer.position(buffer.position() + 0x40); // padding
        validateSignature(buffer, "grsc");

        getUnsignedInt(buffer); // blockOffset
        buffer.getLong(); // blockSize

        var e = 0b10000000000000000000;

        buffer.position(buffer.position() + 0x0C); // padding
        var variationCount = (int) getUnsignedInt(buffer);
        var variationOffset = (int) getUnsignedInt(buffer);

        this.variations = new ArrayList<>();
        buffer.position(variationOffset);
        for (var i = 0; i < variationCount; i++) variations.add(new ShaderVariation(i, buffer));
    }

    private String readString(ByteBuffer bb) {
        var offset = (int) getUnsignedInt(bb);
        if (offset == 0) return "";
        var oldPos = bb.position();
        bb.position(offset);
        var builder = new StringBuilder();
        while (true) {
            var c = ((char) bb.get());
            if (c == '\0') break;
            builder.append(c);
        }

        bb.position(oldPos);
        return builder.toString();
    }

    private void validateSignature(ByteBuffer buffer, String sig) {
        var bufferSig = new byte[sig.length()];
        buffer.get(bufferSig);
        for (int i = 0; i < sig.length(); i++)
            if (((char) bufferSig[i]) != sig.charAt(i)) throw new RuntimeException("Signature does not match");
    }

    public static long getUnsignedInt(ByteBuffer bb) {
        return ((long) bb.getInt() & 0xffffffffL);
    }

    public static int getUnsignedShort(ByteBuffer bb) {
        return (bb.getShort() & 0xffff);
    }
}
