package me.hydos.trifecta.type;

import gg.generations.pokeutils.ModelNode;
import gg.generations.rarecandy.arceus.model.lowlevel.VertexData;

import java.util.ArrayList;
import java.util.List;

public class Model implements TrifectaType {

    public String name;
    public ModelNode armature;
    public final List<VertexData> meshes = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }
}
