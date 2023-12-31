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
public final class IntParameter extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static IntParameter getRootAsIntParameter(ByteBuffer _bb) { return getRootAsIntParameter(_bb, new IntParameter()); }
  public static IntParameter getRootAsIntParameter(ByteBuffer _bb, IntParameter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IntParameter __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String intName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer intNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer intNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int intValue() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : -1; }

  public static int createIntParameter(FlatBufferBuilder builder,
      int intNameOffset,
      int intValue) {
    builder.startTable(2);
    IntParameter.addIntValue(builder, intValue);
    IntParameter.addIntName(builder, intNameOffset);
    return IntParameter.endIntParameter(builder);
  }

  public static void startIntParameter(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addIntName(FlatBufferBuilder builder, int intNameOffset) { builder.addOffset(0, intNameOffset, 0); }
  public static void addIntValue(FlatBufferBuilder builder, int intValue) { builder.addInt(1, intValue, -1); }
  public static int endIntParameter(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IntParameter get(int j) { return get(new IntParameter(), j); }
    public IntParameter get(IntParameter obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

