package me.hydos.trifecta.tools;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RGBChannelExtractor {

    public static void main(String[] args) throws IOException {
        var inputImagePath = Paths.get("C:/Users/hydos/Desktop/pm0774_12_00_body_a_lym.png"); // Replace with your input image path
        var outputFolder = Paths.get("output"); // Replace with your output folder path

        // Read the input image
        var image = ImageIO.read(inputImagePath.toFile());

        // Separate RGB channels
        var redChannel = extractChannel(image, 0);   // Red channel
        var greenChannel = extractChannel(image, 1); // Green channel
        var blueChannel = extractChannel(image, 2);  // Blue channel
        var alphaChannel = extractChannel(image, 3); // Alpha channel

        // Create the output folder if it doesn't exist
        Files.createDirectories(outputFolder);

        // Save the channels as separate images
        ImageIO.write(redChannel, "png", outputFolder.resolve("red_channel.png").toFile());
        ImageIO.write(greenChannel, "png", outputFolder.resolve("green_channel.png").toFile());
        ImageIO.write(blueChannel, "png", outputFolder.resolve("blue_channel.png").toFile());
        ImageIO.write(alphaChannel, "png", outputFolder.resolve("alpha_channel.png").toFile());

        System.out.println("Channels extracted and saved successfully.");
    }

    // Extract a specific channel from the image
    private static BufferedImage extractChannel(BufferedImage image, int channelIndex) {
        var channelImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);

        for (var y = 0; y < image.getHeight(); y++) {
            for (var x = 0; x < image.getWidth(); x++) {
                var rgb = image.getRGB(x, y);
                var channelValue = (rgb >> (channelIndex * 8)) & 0xFF;
                var grayValue = (channelValue << 16) | (channelValue << 8) | channelValue;
                channelImage.setRGB(x, y, grayValue);
            }
        }

        return channelImage;
    }
}