// automatically generated by the FlatBuffers compiler, do not modify

package me.hydos.trifecta.flatbuffers.Titan.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MMT extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MMT getRootAsMMT(ByteBuffer _bb) { return getRootAsMMT(_bb, new MMT()); }
  public static MMT getRootAsMMT(ByteBuffer _bb, MMT obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MMT __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String materialName(int j) { int o = __offset(6); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int materialNameLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public StringVector materialNameVector() { return materialNameVector(new StringVector()); }
  public StringVector materialNameVector(StringVector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches materialSwitches(int j) { return materialSwitches(new me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches materialSwitches(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int materialSwitchesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches.Vector materialSwitchesVector() { return materialSwitchesVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches.Vector materialSwitchesVector(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitches.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties materialProperties(int j) { return materialProperties(new me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties materialProperties(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int materialPropertiesLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties.Vector materialPropertiesVector() { return materialPropertiesVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties.Vector materialPropertiesVector(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialProperties.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createMMT(FlatBufferBuilder builder,
      int nameOffset,
      int materialNameOffset,
      int materialSwitchesOffset,
      int materialPropertiesOffset) {
    builder.startTable(4);
    MMT.addMaterialProperties(builder, materialPropertiesOffset);
    MMT.addMaterialSwitches(builder, materialSwitchesOffset);
    MMT.addMaterialName(builder, materialNameOffset);
    MMT.addName(builder, nameOffset);
    return MMT.endMMT(builder);
  }

  public static void startMMT(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addMaterialName(FlatBufferBuilder builder, int materialNameOffset) { builder.addOffset(1, materialNameOffset, 0); }
  public static int createMaterialNameVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialNameVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMaterialSwitches(FlatBufferBuilder builder, int materialSwitchesOffset) { builder.addOffset(2, materialSwitchesOffset, 0); }
  public static int createMaterialSwitchesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialSwitchesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMaterialProperties(FlatBufferBuilder builder, int materialPropertiesOffset) { builder.addOffset(3, materialPropertiesOffset, 0); }
  public static int createMaterialPropertiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMMT(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MMT get(int j) { return get(new MMT(), j); }
    public MMT get(MMT obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

