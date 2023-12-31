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
public final class TRMTR extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TRMTR getRootAsTRMTR(ByteBuffer _bb) { return getRootAsTRMTR(_bb, new TRMTR()); }
  public static TRMTR getRootAsTRMTR(ByteBuffer _bb, TRMTR obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TRMTR __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long res0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Material materials(int j) { return materials(new me.hydos.trifecta.flatbuffers.Titan.Model.Material(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Material materials(me.hydos.trifecta.flatbuffers.Titan.Model.Material obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int materialsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Material.Vector materialsVector() { return materialsVector(new me.hydos.trifecta.flatbuffers.Titan.Model.Material.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Material.Vector materialsVector(me.hydos.trifecta.flatbuffers.Titan.Model.Material.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createTRMTR(FlatBufferBuilder builder,
      long res0,
      int materialsOffset) {
    builder.startTable(2);
    TRMTR.addMaterials(builder, materialsOffset);
    TRMTR.addRes0(builder, res0);
    return TRMTR.endTRMTR(builder);
  }

  public static void startTRMTR(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addRes0(FlatBufferBuilder builder, long res0) { builder.addInt(0, (int) res0, (int) 0L); }
  public static void addMaterials(FlatBufferBuilder builder, int materialsOffset) { builder.addOffset(1, materialsOffset, 0); }
  public static int createMaterialsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTRMTR(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishTRMTRBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedTRMTRBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TRMTR get(int j) { return get(new TRMTR(), j); }
    public TRMTR get(TRMTR obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

