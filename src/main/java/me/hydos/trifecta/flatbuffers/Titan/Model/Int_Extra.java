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
public final class Int_Extra extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Int_Extra getRootAsInt_Extra(ByteBuffer _bb) { return getRootAsInt_Extra(_bb, new Int_Extra()); }
  public static Int_Extra getRootAsInt_Extra(ByteBuffer _bb, Int_Extra obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Int_Extra __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long res0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int value() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : -1; }

  public static int createInt_Extra(FlatBufferBuilder builder,
      long res0,
      int value) {
    builder.startTable(2);
    Int_Extra.addValue(builder, value);
    Int_Extra.addRes0(builder, res0);
    return Int_Extra.endInt_Extra(builder);
  }

  public static void startInt_Extra(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addRes0(FlatBufferBuilder builder, long res0) { builder.addInt(0, (int) res0, (int) 0L); }
  public static void addValue(FlatBufferBuilder builder, int value) { builder.addInt(1, value, -1); }
  public static int endInt_Extra(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Int_Extra get(int j) { return get(new Int_Extra(), j); }
    public Int_Extra get(Int_Extra obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

