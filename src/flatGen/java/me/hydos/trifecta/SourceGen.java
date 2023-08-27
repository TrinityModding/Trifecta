package me.hydos.trifecta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SourceGen {
    private static final Path POKEDOCS_DIR = Paths.get("D:/NewProjects/Pokemon/Terasol/PokeDocs");
    private static final Path TRINITY = POKEDOCS_DIR.resolve("SV/FlatBuffers");
    private static final Path SRC_DIR = Paths.get("src/main/java");

    public static void main(String[] args) throws IOException {
        Files.list(TRINITY.resolve("scene")).forEach(SourceGen::generateObjectApiSrc);
    }

    private static void generateObjectApiSrc(Path path) {
        FlatC.generateSource("me.hydos.trifecta.flatbuffers", SRC_DIR, true, path);
    }
}
