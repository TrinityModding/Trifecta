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
public final class TRMDL extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TRMDL getRootAsTRMDL(ByteBuffer _bb) { return getRootAsTRMDL(_bb, new TRMDL()); }
  public static TRMDL getRootAsTRMDL(ByteBuffer _bb, TRMDL obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TRMDL __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long unk0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes meshes(int j) { return meshes(new me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes meshes(me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int meshesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes.Vector meshesVector() { return meshesVector(new me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes.Vector meshesVector(me.hydos.trifecta.flatbuffers.Titan.Model.trmeshes.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trskeleton skeleton() { return skeleton(new me.hydos.trifecta.flatbuffers.Titan.Model.trskeleton()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.trskeleton skeleton(me.hydos.trifecta.flatbuffers.Titan.Model.trskeleton obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String materials(int j) { int o = __offset(10); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int materialsLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public StringVector materialsVector() { return materialsVector(new StringVector()); }
  public StringVector materialsVector(StringVector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Lod lods(int j) { return lods(new me.hydos.trifecta.flatbuffers.Titan.Model.Lod(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Lod lods(me.hydos.trifecta.flatbuffers.Titan.Model.Lod obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int lodsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Lod.Vector lodsVector() { return lodsVector(new me.hydos.trifecta.flatbuffers.Titan.Model.Lod.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Lod.Vector lodsVector(me.hydos.trifecta.flatbuffers.Titan.Model.Lod.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Bounds bounds() { return bounds(new me.hydos.trifecta.flatbuffers.Titan.Model.Bounds()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Bounds bounds(me.hydos.trifecta.flatbuffers.Titan.Model.Bounds obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec4 unkVec() { return unkVec(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec4()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec4 unkVec(me.hydos.trifecta.flatbuffers.Titan.Model.Vec4 obj) { int o = __offset(16); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk7() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk9() { int o = __offset(22); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static void startTRMDL(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addUnk0(FlatBufferBuilder builder, long unk0) { builder.addInt(0, (int) unk0, (int) 0L); }
  public static void addMeshes(FlatBufferBuilder builder, int meshesOffset) { builder.addOffset(1, meshesOffset, 0); }
  public static int createMeshesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMeshesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSkeleton(FlatBufferBuilder builder, int skeletonOffset) { builder.addOffset(2, skeletonOffset, 0); }
  public static void addMaterials(FlatBufferBuilder builder, int materialsOffset) { builder.addOffset(3, materialsOffset, 0); }
  public static int createMaterialsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLods(FlatBufferBuilder builder, int lodsOffset) { builder.addOffset(4, lodsOffset, 0); }
  public static int createLodsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startLodsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addBounds(FlatBufferBuilder builder, int boundsOffset) { builder.addOffset(5, boundsOffset, 0); }
  public static void addUnkVec(FlatBufferBuilder builder, int unkVecOffset) { builder.addStruct(6, unkVecOffset, 0); }
  public static void addUnk7(FlatBufferBuilder builder, long unk7) { builder.addInt(7, (int) unk7, (int) 0L); }
  public static void addUnk8(FlatBufferBuilder builder, long unk8) { builder.addInt(8, (int) unk8, (int) 0L); }
  public static void addUnk9(FlatBufferBuilder builder, long unk9) { builder.addInt(9, (int) unk9, (int) 0L); }
  public static int endTRMDL(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishTRMDLBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedTRMDLBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TRMDL get(int j) { return get(new TRMDL(), j); }
    public TRMDL get(TRMDL obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

