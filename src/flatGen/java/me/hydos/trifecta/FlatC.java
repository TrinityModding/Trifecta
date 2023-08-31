package me.hydos.trifecta;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper library to run FlatC commands
 */
public class FlatC {

    public static void generateSource(String pkgPrefix, Path srcDir, boolean useObjApi, Path schema) {
        try {
            var command = new ArrayList<>(List.of("flatc", "-j"));

            if (useObjApi) command.add("--gen-object-api");
            if (pkgPrefix != null) {
                command.add("--java-package-prefix");
                command.add(pkgPrefix);
            }

            command.add(schema.toAbsolutePath().toString());
            new ProcessBuilder(command)
                    .directory(srcDir.toFile())
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
