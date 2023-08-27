package me.hydos.trifecta.bntx;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Map;

public class DSS {
    public static final List<String> dx10_formats = List.of("BC4U", "BC4S", "BC5U", "BC5S", "BC6H_UF16", "BC6H_SF16", "BC7");

    public static byte[] generateHeader(int num_mipMaps, int w, int h, FormatIndicator format_, List<Integer> compSel, int size, boolean compressed) {
        var hdr = new byte[128];

        var luminance = false;
        var rgb = false;
        var has_alpha = true;

        Map<Integer, Integer> compSels = null;
        int fmtbpp = 0;

        if (format_.getNumericValue() == 28) {
            rgb = true;
            compSels = Map.of(2, 0x000000ff, 3, 0x0000ff00, 4, 0x00ff0000, 5, 0xff000000, 1, 0);
            fmtbpp = 4;
        } else if (format_.getNumericValue() == 24) {
            rgb = true;
            compSels = Map.of(2, 0x3ff00000, 3, 0x000ffc00, 4, 0x000003ff, 5, 0xc0000000, 1, 0);
            fmtbpp = 4;
        } else if (format_.getNumericValue() == 85) {
            rgb = true;
            compSels = Map.of(2, 0x0000f800, 3, 0x000007e0, 4, 0x0000001f, 5, 0, 1, 0);
            fmtbpp = 2;
            has_alpha = false;
        } else if (format_.getNumericValue() == 61) {
            luminance = true;
            compSels = Map.of(2, 0x000000ff, 3, 0, 4, 0, 5, 0, 1, 0);
            fmtbpp = 2;
            if (compSels.get(3) != 2) has_alpha = false;

        } else if (format_.getNumericValue() == 49) {
            luminance = true;
            compSels = Map.of(2, 0x000000ff, 3, 0x00000ff00, 4, 0, 5, 0, 1, 0);
            fmtbpp = 2;
        }

        int flags = 0x00000001 | 0x00001000 | 0x00000004 | 0x00000002;

        int caps = 0x00001000;

        if (num_mipMaps == 0) num_mipMaps = 1;
        else if (num_mipMaps != 1) {
            flags |= 0x00020000;
            caps |= 0x00000008 | 0x00400000;
        }

        int pflags;

        byte[] fourcc = new byte[0];

        if (!compressed) {
            flags |= 0x00000008;

            var a = false;

            if (compSel.get(0) != 2 && compSel.get(1) != 2 && compSel.get(2) != 2 && compSel.get(3) == 2) {
                a = true;
                pflags = 0x00000002;

            } else if (luminance)
                pflags = 0x00020000;

            else if (rgb)
                pflags = 0x00000040;

            else return new byte[0];

            if (has_alpha && !a)
                pflags |= 0x00000001;

            size = w * fmtbpp;
        } else {
            flags |= 0x00080000;
            pflags = 0x00000004;

            if (format_.getStringValue().equals("ETC1")) fourcc = new byte[]{'E', 'T', 'C', '1'};
            else if (format_.getStringValue().equals("BC1")) fourcc = new byte[]{'D', 'X', 'T', '1'};
            else if (format_.getStringValue().equals("BC2")) fourcc = new byte[]{'D', 'X', 'T', '3'};
            else if (format_.getStringValue().equals("BC3")) fourcc = new byte[]{'D', 'X', 'T', '5'};
            else if (dx10_formats.contains(format_.getStringValue())) fourcc = new byte[]{'D', 'X', '1', '0'};
        }

        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).put("DDS ".getBytes()).array(), 0, hdr, 0, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(124).array(), 0, hdr, 4, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(flags).array(), 0, hdr, 8, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(h).array(), 0, hdr, 12, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(w).array(), 0, hdr, 16, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(size).array(), 0, hdr, 20, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(num_mipMaps).array(), 0, hdr, 28, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(0x20).array(), 0, hdr, 76, 4);
        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(pflags).array(), 0, hdr, 80, 4);

        if (compressed) {
            System.arraycopy(fourcc, 0, hdr, 84, 4);
        } else {
            System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(fmtbpp << 3).array(), 0, hdr, 88, 4);
            System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(compSels.get(compSel.get(0))).array(), 0, hdr, 92, 4);
            System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(compSels.get(compSel.get(1))).array(), 0, hdr, 96, 4);
            System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(compSels.get(compSel.get(2))).array(), 0, hdr, 100, 4);
            System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(compSels.get(compSel.get(3))).array(), 0, hdr, 104, 4);
        }

        System.arraycopy(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(caps).array(), 0, hdr, 108, 4);

        if (format_.equals("BC4U")) {
            byte[] bytesToAdd = new byte[] { (byte)0x50, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC4S")) {
            byte[] bytesToAdd = new byte[] { (byte)0x51, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC5U")) {
            byte[] bytesToAdd = new byte[] { (byte)0x53, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC5S")) {
            byte[] bytesToAdd = new byte[] { (byte)0x54, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC6H_UF16")) {
            byte[] bytesToAdd = new byte[] { (byte)0x5F, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC6H_SF16")) {
            byte[] bytesToAdd = new byte[] { (byte)0x60, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        } else if (format_.equals("BC7")) {
            byte[] bytesToAdd = new byte[]{(byte) 0x62, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
            hdr = concatenateByteArrays(hdr, bytesToAdd);
        }

        return hdr;
    }

    public static byte[] concatenateByteArrays(byte[] array1, byte[] array2) {
        byte[] result = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
