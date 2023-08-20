package me.hydos.trifecta.editor;

import me.hydos.trifecta.flatbuffers.Titan.Model.*;

import javax.swing.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class FileImporter {

    private static void importModel(Path path, EditorLogic editor) {
        var parent = path.getParent();
        var trmdl = TRMDL.getRootAsTRMDL(read(path));
        var trskl = TRSKL.getRootAsTRSKL(read(parent.resolve(Objects.requireNonNull(trmdl.skeleton().filename()))));
        var trmtr = TRMTR.getRootAsTRMTR(read(parent.resolve(Objects.requireNonNull(trmdl.materials(0)))));

        var meshes = new ArrayList<TRMSH>();
        var meshBuffers = new ArrayList<TRMBF>();
        for (var i = 0; i < trmdl.meshesLength(); i++) {
            var meshName = Objects.requireNonNull(trmdl.meshes(i).filename(), "Mesh name was null");
            var meshI = TRMSH.getRootAsTRMSH(read(parent.resolve(meshName)));
            var meshD = TRMBF.getRootAsTRMBF(read(parent.resolve(meshName.replace(".trmsh", ".trmbf"))));
            meshes.add(meshI);
            meshBuffers.add(meshD);
        }

        System.out.println("Trinity Model imported");
    }

    public static void handleFile(Path path, EditorLogic editor) {
        System.out.println("Opening File " + path);
        var extension = getFileExtension(path);

        switch (extension) {
            case "trmdl" -> importModel(path, editor);
            // TODO: data files
            // TODO: scene formats
            default ->
                    JOptionPane.showMessageDialog(null, path + " cannot be opened. Reason: unknown extension \"" + extension + "\"", "File Import", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String getFileExtension(Path path) {
        return Optional.of(path.getFileName().toString())
                .filter(f -> f.contains("."))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)).orElse("");
    }

    private static ByteBuffer read(Path path) {
        try {
            return ByteBuffer.wrap(Files.readAllBytes(path));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read " + path.getFileName(), e);
        }
    }
}
