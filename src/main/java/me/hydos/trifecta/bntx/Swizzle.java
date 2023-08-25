package me.hydos.trifecta.bntx;

public class Swizzle {
    public static int divRoundUp(int n, int d) {
        return (n + d - 1) / d;
    }

    public static byte[] deswizzle(int width, int height, int blkWidth, int blkHeight, Integer bpp, boolean tileMode, int alignment, int sizeRange, byte[] data) {
        assert 0 <= sizeRange && sizeRange <= 5;
        var block_height = 1 << sizeRange;

        width = divRoundUp(width, blkWidth);
        height = divRoundUp(height, blkHeight);


        int pitch, surfSize;
        if(!tileMode) {
            pitch = roundUp(width * bpp, 32);
            surfSize = roundUp(pitch * height, alignment);
        } else {
            pitch = roundUp(width * bpp, 32);
            surfSize = roundUp(pitch * roundUp(height, block_height * 8), alignment);
        }

        var result = new byte[surfSize];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pos;

                if(!tileMode) {
                    pos = y * pitch + x * bpp;
                } else {
                    pos = getAddrBlockLinear(x,y, width, bpp, 0, block_height);
                }

                var pos_ = (y * width + x) * bpp;

                if((pos + bpp) <= surfSize) {
                    System.arraycopy(data, pos, result, pos_, bpp);
                }
            }
        }

        return result;
    }

    private static int getAddrBlockLinear(int x, int y, int width, int bytesPerPixel, int baseAddress, int blockHeight) {
        var imageWidthInGOBs = divRoundUp(width * bytesPerPixel, 64);

        var GOB_address = baseAddress
                + (y / (8 * blockHeight)) * 512 * blockHeight * imageWidthInGOBs
                + (x * bytesPerPixel / 64) * 512 * blockHeight
                + (y % (8 * blockHeight) / 8) * 512;


        x *= bytesPerPixel;

        return GOB_address + ((x % 64) / 32) * 256 + ((y % 8) / 2) * 64
                + ((x % 32) / 16) * 32 + (y % 2) * 16 + (x % 16);

    }

    private static int roundUp(int x, int y) {
        return ((x -1) | y - 1) + 1;
    }
}
