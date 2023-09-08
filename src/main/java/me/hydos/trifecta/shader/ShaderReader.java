package me.hydos.trifecta.shader;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShaderReader {
    
    public static void main(String[] args) throws IOException {
        var shader = Paths.get("F:/PokemonScarlet/system_resource/gfx2/shader/NX64/env_titan/material/standard.bnsh");
        var buffer = ByteBuffer.wrap(Files.readAllBytes(shader)).order(ByteOrder.LITTLE_ENDIAN);
        var bnsh = new BnshFile(buffer);
        System.out.println("ok");
    }
}
