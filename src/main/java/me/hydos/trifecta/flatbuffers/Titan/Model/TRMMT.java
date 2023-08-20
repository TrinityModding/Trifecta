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
public final class TRMMT extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TRMMT getRootAsTRMMT(ByteBuffer _bb) { return getRootAsTRMMT(_bb, new TRMMT()); }
  public static TRMMT getRootAsTRMMT(ByteBuffer _bb, TRMMT obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TRMMT __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long res0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MMT material(int j) { return material(new me.hydos.trifecta.flatbuffers.Titan.Model.MMT(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MMT material(me.hydos.trifecta.flatbuffers.Titan.Model.MMT obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int materialLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MMT.Vector materialVector() { return materialVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MMT.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MMT.Vector materialVector(me.hydos.trifecta.flatbuffers.Titan.Model.MMT.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createTRMMT(FlatBufferBuilder builder,
      long res0,
      long res1,
      int materialOffset) {
    builder.startTable(3);
    TRMMT.addMaterial(builder, materialOffset);
    TRMMT.addRes1(builder, res1);
    TRMMT.addRes0(builder, res0);
    return TRMMT.endTRMMT(builder);
  }

  public static void startTRMMT(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addRes0(FlatBufferBuilder builder, long res0) { builder.addInt(0, (int) res0, (int) 0L); }
  public static void addRes1(FlatBufferBuilder builder, long res1) { builder.addInt(1, (int) res1, (int) 0L); }
  public static void addMaterial(FlatBufferBuilder builder, int materialOffset) { builder.addOffset(2, materialOffset, 0); }
  public static int createMaterialVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMaterialVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTRMMT(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishTRMMTBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedTRMMTBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TRMMT get(int j) { return get(new TRMMT(), j); }
    public TRMMT get(TRMMT obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
