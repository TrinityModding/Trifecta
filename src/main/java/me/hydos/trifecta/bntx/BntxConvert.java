package me.hydos.trifecta.bntx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class BntxConvert {
    public static record BlockSize(int width, int height) { }

    public static Map<Integer, BlockSize> blkDims = blkDims();

    public static Map<Integer, String> formats = formats();

    public static List<Integer> astcFormats = astcFormats();

    public static List<Integer> bcnFormats = bcnFormats();;

    public static Map<Integer, Integer> bpps = bpps();

    public static void main(String[] args) {


        try {
            for(Path path : Files.newDirectoryStream(Path.of(""), "*.bntx")) {
                bntxConvert(path);
            }

//            System.out.println();


            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

//        System.out.println("Hello world!");
    }

    public static void bntxConvert(Path path) throws IOException {
        var textures = readBNTX(path);
        proccessTexture(textures);
    }

    private static void proccessTexture(TexInfo[] textures) {
        for(var tex : textures) {
            if (formats.containsKey((int) tex.format) && tex.numFaces < 2) {
                var format_ = getFormatIndicator((int) tex.format);

                var blockDim = blkDims.getOrDefault((int) tex.format >> 8, new BlockSize(1, 1));

                var bpp = BntxConvert.bpps.get((int) tex.format >> 8);

                var size = Swizzle.divRoundUp(tex.width, blockDim.width) * Swizzle.divRoundUp(tex.height, blockDim.height);

                var result = Swizzle.deswizzle(tex.width, tex.height, blockDim.width, blockDim.height, bpp, tex.tileMode, tex.alignment, tex.sizeRange, tex.data);

//                    result = Arrays.copyOf(result, size);

                if (astcFormats.contains((int) (tex.format / 256))) {
//                    System.out.println();
                } else {
                    Collections.reverse(tex.compSel);
                    var hdr = DSS.generateHeader(1, tex.width, tex.height, format_, tex.compSel, size, bcnFormats.contains((int) tex.format >> 8));

                    try (FileOutputStream output = new FileOutputStream(tex.name + ".dds")) {
                        output.write(DSS.concatenateByteArrays(hdr, result));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static List<Integer> bcnFormats() {
        List<Integer> bcnFormats = new ArrayList<>();
        bcnFormats.add(0x1a);
        bcnFormats.add(0x1b);
        bcnFormats.add(0x1c);
        bcnFormats.add(0x1d);
        bcnFormats.add(0x1e);
        bcnFormats.add(0x1f);
        bcnFormats.add(0x20);
        return bcnFormats;
    }

    private static List<Integer> astcFormats() {
        List<Integer> astcFormats = new ArrayList<>();
        astcFormats.add(0x2d);
        astcFormats.add(0x2e);
        astcFormats.add(0x2f);
        astcFormats.add(0x30);
        astcFormats.add(0x31);
        astcFormats.add(0x32);
        astcFormats.add(0x33);
        astcFormats.add(0x34);
        astcFormats.add(0x35);
        astcFormats.add(0x36);
        astcFormats.add(0x37);
        astcFormats.add(0x38);
        astcFormats.add(0x39);
        astcFormats.add(0x3a);
        return astcFormats;
    }

    private static Map<Integer, String> formats() {
        Map<Integer, String> formats = new HashMap<>();
        formats.put(0x0b01, "R8_G8_B8_A8_UNORM");
        formats.put(0x0b06, "R8_G8_B8_A8_SRGB");
        formats.put(0x0701, "R5_G6_B5_UNORM");
        formats.put(0x0201, "R8_UNORM");
        formats.put(0x0901, "R8_G8_UNORM");
        formats.put(0x1a01, "BC1_UNORM");
        formats.put(0x1a06, "BC1_SRGB");
        formats.put(0x1b01, "BC2_UNORM");
        formats.put(0x1b06, "BC2_SRGB");
        formats.put(0x1c01, "BC3_UNORM");
        formats.put(0x1c06, "BC3_SRGB");
        formats.put(0x1d01, "BC4_UNORM");
        formats.put(0x1d02, "BC4_SNORM");
        formats.put(0x1e01, "BC5_UNORM");
        formats.put(0x1e02, "BC5_SNORM");
        formats.put(0x1f01, "BC6H_UF16");
        formats.put(0x1f02, "BC6H_SF16");
        formats.put(0x2001, "BC7_UNORM");
        formats.put(0x2006, "BC7_SRGB");
        formats.put(0x2d01, "ASTC4x4");
        formats.put(0x2d06, "ASTC4x4 SRGB");
        formats.put(0x2e01, "ASTC5x4");
        formats.put(0x2e06, "ASTC5x4 SRGB");
        formats.put(0x2f01, "ASTC5x5");
        formats.put(0x2f06, "ASTC5x5 SRGB");
        formats.put(0x3001, "ASTC6x5");
        formats.put(0x3006, "ASTC6x5 SRGB");
        formats.put(0x3101, "ASTC6x6");
        formats.put(0x3106, "ASTC6x6 SRGB");
        formats.put(0x3201, "ASTC8x5");
        formats.put(0x3206, "ASTC8x5 SRGB");
        formats.put(0x3301, "ASTC8x6");
        formats.put(0x3306, "ASTC8x6 SRGB");
        formats.put(0x3401, "ASTC8x8");
        formats.put(0x3406, "ASTC8x8 SRGB");
        formats.put(0x3501, "ASTC10x5");
        formats.put(0x3506, "ASTC10x5 SRGB");
        formats.put(0x3601, "ASTC10x6");
        formats.put(0x3606, "ASTC10x6 SRGB");
        formats.put(0x3701, "ASTC10x8");
        formats.put(0x3706, "ASTC10x8 SRGB");
        formats.put(0x3801, "ASTC10x10");
        formats.put(0x3806, "ASTC10x10 SRGB");
        formats.put(0x3901, "ASTC12x10");
        formats.put(0x3906, "ASTC12x10 SRGB");
        formats.put(0x3a01, "ASTC12x12");
        formats.put(0x3a06, "ASTC12x12 SRGB");
        return formats;
    }

    private static Map<Integer, Integer> bpps() {
        Map<Integer, Integer> bpps = new HashMap<>();
        bpps.put(0x0b, 0x04);
        bpps.put(0x07, 0x02);
        bpps.put(0x02, 0x01);
        bpps.put(0x09, 0x02);
        bpps.put(0x1a, 0x08);
        bpps.put(0x1b, 0x10);
        bpps.put(0x1c, 0x10);
        bpps.put(0x1d, 0x08);
        bpps.put(0x1e, 0x10);
        bpps.put(0x1f, 0x10);
        bpps.put(0x20, 0x10);
        bpps.put(0x2d, 0x10);
        bpps.put(0x2e, 0x10);
        bpps.put(0x2f, 0x10);
        bpps.put(0x30, 0x10);
        bpps.put(0x31, 0x10);
        bpps.put(0x32, 0x10);
        bpps.put(0x33, 0x10);
        bpps.put(0x34, 0x10);
        bpps.put(0x35, 0x10);
        bpps.put(0x36, 0x10);
        bpps.put(0x37, 0x10);
        bpps.put(0x38, 0x10);
        bpps.put(0x39, 0x10);
        bpps.put(0x3a, 0x10);

        return bpps;
    }

    private static Map<Integer, BlockSize> blkDims() {
        Map<Integer, BlockSize> blkDims = new HashMap<>();
        blkDims.put(0x1a, new BlockSize(4, 4));
        blkDims.put(0x1b, new BlockSize(4, 4));
        blkDims.put(0x1c, new BlockSize(4, 4));
        blkDims.put(0x1d, new BlockSize(4, 4));
        blkDims.put(0x1e, new BlockSize(4, 4));
        blkDims.put(0x1f, new BlockSize(4, 4));
        blkDims.put(0x20, new BlockSize(4, 4));
        blkDims.put(0x2d, new BlockSize(4, 4));
        blkDims.put(0x2e, new BlockSize(5, 4));
        blkDims.put(0x2f, new BlockSize(5, 5));
        blkDims.put(0x30, new BlockSize(6, 5));
        blkDims.put(0x31, new BlockSize(6, 6));
        blkDims.put(0x32, new BlockSize(8, 5));
        blkDims.put(0x33, new BlockSize(8, 6));
        blkDims.put(0x34, new BlockSize(8, 8));
        blkDims.put(0x35, new BlockSize(10, 5));
        blkDims.put(0x36, new BlockSize(10, 6));
        blkDims.put(0x37, new BlockSize(10, 8));
        blkDims.put(0x38, new BlockSize(10, 10));
        blkDims.put(0x39, new BlockSize(12, 10));
        blkDims.put(0x3a, new BlockSize(12, 12));
        return blkDims;
    }

    private static TexInfo[] readBNTX(Path path) throws IOException {
        var array = Files.newInputStream(path).readAllBytes();
        var buffer = ByteBuffer.wrap(array);

        short bomUtf16LE = (short) 0xFFFE;
        short bomUtf16BE = (short) 0xFEFF;

        ByteOrder bom = bom(bomUtf16LE, bomUtf16BE, buffer.getShort(12));
        buffer.order(bom);

        var header = new BNTXHeader(buffer);

        if(!header.magic.equals("BNTX")) {
            throw new IllegalArgumentException("Invalid file header!");
        }

//        System.out.println("File name: " + bytesToString(buffer, header.fileNameAddr, 30));

        var nx = new NXHeader(buffer);

        TexInfo[] textures = new TexInfo[(int) nx.count];

        for (int i = 0; i < nx.count; i++) {
            buffer.position((int) (nx.infoPtrAddr + (i * 8)));

            buffer.position((int) buffer.getLong());

            var info = new BRTIInfo(buffer);

            var nameLen = Short.toUnsignedInt(buffer.getShort((int) info.nameAddr));
            var name = bytesToString(buffer, (int) (info.nameAddr + 2), nameLen);

//            System.out.println();
//            System.out.println("Image: " + i + " name " + name);


            var compSel = compSel(info);

            var dataAddr = buffer.getLong((int) info.ptrsAddr);

            var mipOffsets = new HashMap<Integer, Integer>();
            mipOffsets.put(0, 0);

            for (int j = 1; j < info.numMips; j++) {
                var mipOffset = buffer.getLong((int) (info.ptrsAddr + (j * 8)));
                mipOffsets.put(j, (int) (mipOffset - dataAddr));
            }

            var tex = new TexInfo();
            tex.name = name;
            tex.tileMode = info.tileMode;
            tex.numMips = info.numMips;
            tex.mipOffsets = mipOffsets;
            tex.width = info.width;
            tex.height = info.height;
            tex.format = info.format_;
            tex.numFaces = info.numFaces;
            tex.sizeRange = info.sizeRange;
            tex.compSel = compSel;
            tex.alignment = info.alignment;
            tex.type = info.type_;

            tex.data = new byte[info.imageSize];
            buffer.get((int) dataAddr, tex.data);

            textures[i] = tex;

        }

        return textures;
    }

    public static class TexInfo {
        public String name;
        public boolean tileMode;
        public int numMips;
        public HashMap<Integer, Integer> mipOffsets;
        public int width;
        public int height;
        public long format;
        public int numFaces;
        public int sizeRange;
        public List<Integer> compSel;
        public int alignment;
        public int type;
        public byte[] data;
    }

    private static List<Integer> compSel(BRTIInfo info) {
        List<Integer> compSel = new ArrayList<>();
        Map<Integer, String> compSels = new HashMap<>();
        compSels.put(0, "0");
        compSels.put(1, "1");
        compSels.put(2, "Red");
        compSels.put(3, "Green");
        compSels.put(4, "Blue");
        compSels.put(5, "Alpha");

        for (int j = 0; j < 4; j++) {
            int value = (info.compSel >> (8 * (3 - j))) & 0xff;
            if (value == 0) {
                value = compSel.size() + 2;
            }
            compSel.add(value);
        }

        return compSel;
    }

    public static String bytesToString(ByteBuffer buffer, int startPos, int length) {
        int originalPosition = buffer.position();
        buffer.position(startPos);

        byte[] bytes = new byte[length];
        buffer.get(bytes);

        buffer.position(originalPosition); // Restore the original position
        return new String(bytes, StandardCharsets.UTF_8); // Change charset if needed
    }


    private static ByteOrder bom(short bomUtf16LE, short bomUtf16BE, short extractedShort) {
        if (extractedShort == bomUtf16LE) {
            return ByteOrder.LITTLE_ENDIAN;
        } else if (extractedShort == bomUtf16BE) {
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IllegalArgumentException("Invalid BOM!");
        }
    }

    public static class BNTXHeader {
        public String magic;
        public int version;
        public int bom;
        public short revision;
        public int fileNameAddr;
        public int strAddr;
        public int relocAddr;
        public int fileSize;

        public BNTXHeader(ByteBuffer buffer) {
            byte[] magicBytes = new byte[8];
            buffer.get(magicBytes);
            magic = new String(magicBytes).trim();
            version = buffer.getInt();
            bom = (short) Short.toUnsignedInt(buffer.getShort());
            revision = (short) Short.toUnsignedInt(buffer.getShort());
            fileNameAddr = buffer.getInt();

            buffer.get();
            buffer.get();

            strAddr = buffer.getShort();
            relocAddr = buffer.getInt();
            fileSize = buffer.getInt();
        }
    }

    public static class NXHeader {
        public String magic;
        public long count;
        public long infoPtrAddr;
        public long dataBlkAddr;
        public long dictAddr;
        public int strDictSize;

        public NXHeader(ByteBuffer buffer) {
            byte[] magicBytes = new byte[4];
            buffer.get(magicBytes);
            magic = new String(magicBytes);

            count = Integer.toUnsignedLong(buffer.getInt());
            infoPtrAddr = buffer.getLong();
            dataBlkAddr = buffer.getLong();
            dictAddr = buffer.getLong();
            strDictSize = (int) Integer.toUnsignedLong(buffer.getInt());
        }
    }

    static class BRTIInfo {
        String magic;
        int size_;
        long size_2;
        boolean tileMode;
        int dim;
        int flags;
        int swizzle;
        int numMips;
        long unk18;
        long format_;
        long unk20;
        int width;
        int height;
        int unk2C;
        int numFaces;
        int sizeRange;
        long unk38;
        long unk3C;
        long unk40;
        long unk44;
        long unk48;
        long unk4C;
        int imageSize;
        int alignment;
        int compSel;
        int type_;
        long nameAddr;
        long parentAddr;
        long ptrsAddr;

        public BRTIInfo(ByteBuffer buffer) {
            buffer.order(ByteOrder.LITTLE_ENDIAN); // Set the byte order to little-endian

            byte[] magicBytes = new byte[4];
            buffer.get(magicBytes);
            magic = new String(magicBytes);

            size_ = buffer.getInt();
            size_2 = buffer.getLong();
            tileMode = buffer.get() != 0;
            dim = buffer.get();
            flags = Short.toUnsignedInt(buffer.getShort());
            swizzle = Short.toUnsignedInt(buffer.getShort());
            numMips = Short.toUnsignedInt(buffer.getShort());
            unk18 = Integer.toUnsignedLong(buffer.getInt());
            format_ = Integer.toUnsignedLong(buffer.getInt());
            unk20 = Integer.toUnsignedLong(buffer.getInt());
            width = buffer.getInt();
            height = buffer.getInt();
            unk2C = buffer.getInt();
            numFaces = buffer.getInt();
            sizeRange = buffer.getInt();
            unk38 = Integer.toUnsignedLong(buffer.getInt());
            unk3C = Integer.toUnsignedLong(buffer.getInt());
            unk40 = Integer.toUnsignedLong(buffer.getInt());
            unk44 = Integer.toUnsignedLong(buffer.getInt());
            unk48 = Integer.toUnsignedLong(buffer.getInt());
            unk4C = Integer.toUnsignedLong(buffer.getInt());
            imageSize = buffer.getInt();
            alignment = buffer.getInt();
            compSel = buffer.getInt();
            type_ = buffer.getInt();
            nameAddr = buffer.getLong();
            parentAddr = buffer.getLong();
            ptrsAddr = buffer.getLong();
        }
    }

    public static FormatIndicator getFormatIndicator(int formatCode) {
        FormatIndicator formatIndicator;

        if ((formatCode >> 8) == 0xb) {
            formatIndicator = new FormatIndicator(28);
        } else if (formatCode == 0x701) {
            formatIndicator = new FormatIndicator(85);
        } else if (formatCode == 0x201) {
            formatIndicator = new FormatIndicator(61);
        } else if (formatCode == 0x901) {
            formatIndicator = new FormatIndicator(49);
        } else if ((formatCode >> 8) == 0x1a) {
            formatIndicator = new FormatIndicator("BC1");
        } else if ((formatCode >> 8) == 0x1b) {
            formatIndicator = new FormatIndicator("BC2");
        } else if ((formatCode >> 8) == 0x1c) {
            formatIndicator = new FormatIndicator("BC3");
        } else if (formatCode == 0x1d01) {
            formatIndicator = new FormatIndicator("BC4U");
        } else if (formatCode == 0x1d02) {
            formatIndicator = new FormatIndicator("BC4S");
        } else if (formatCode == 0x1e01) {
            formatIndicator = new FormatIndicator("BC5U");
        } else if (formatCode == 0x1e02) {
            formatIndicator = new FormatIndicator("BC5S");
        } else if (formatCode == 0x1f01) {
            formatIndicator = new FormatIndicator("BC6H_UF16");
        } else if (formatCode == 0x1f02) {
            formatIndicator = new FormatIndicator("BC6H_SF16");
        } else if ((formatCode >> 8) == 0x20) {
            formatIndicator = new FormatIndicator("BC7");
        } else {
            formatIndicator = null;
        }

        return formatIndicator;
    }
}

class FormatIndicator {
    private Integer numericValue;
    private String stringValue;

    public FormatIndicator(Integer numericValue) {
        this.numericValue = numericValue;
    }

    public FormatIndicator(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getNumericValue() {
        return numericValue == null ? -1 :numericValue;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(numericValue, obj) || Objects.equals(stringValue, obj);
    }

    public String getStringValue() {
        return stringValue == null ? "" : stringValue;
    }
}