package me.hydos.trifecta.trinity.scene;

import me.hydos.trifecta.flatbuffers.Titan.TrinityScene.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrinityScene {

    public final String name;
    public final String extra;
    public final List<Entry> objects;

    public TrinityScene(String sceneName, String sceneExtra, List<Entry> objects) {
        this.name = sceneName;
        this.extra = sceneExtra;
        this.objects = objects;
    }

    public static TrinityScene read(Path scene) {
        try {
            var trscn = trinity_SceneT.deserializeFromBinary(Files.readAllBytes(scene));
            var objects = new ArrayList<Entry>();
            for (var sceneEntry : trscn.getSceneObjectList()) objects.add(TrinityScene.convert(sceneEntry));
            return new TrinityScene(trscn.getSceneName(), trscn.getSceneExtra(), objects);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Entry convert(SceneEntryT scnEntry) {
        var data = switch (scnEntry.getTypeName()) {
            case "trinity_SceneObject" -> trinity_SceneObjectT.deserializeFromBinary(scnEntry.getNestedType());
            case "trinity_ScriptComponent" -> trinity_ScriptComponentT.deserializeFromBinary(scnEntry.getNestedType());
            case "trinity_OverrideSensorData" -> trinity_OverrideSensorDataT.deserializeFromBinary(scnEntry.getNestedType());
            case "SubScene" -> SubSceneT.deserializeFromBinary(scnEntry.getNestedType());
            default -> throw new RuntimeException("Unknown scene entry type " + scnEntry.getTypeName());
        };

        var children = Arrays.stream(scnEntry.getSubObjects()).map(TrinityScene::convert).toList();
        return new Entry(data, children);
    }

    public record Entry(
            Object data,
            List<Entry> children
    ) {
    }
}
