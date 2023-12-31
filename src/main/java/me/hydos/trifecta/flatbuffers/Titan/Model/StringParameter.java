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
public final class StringParameter extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static StringParameter getRootAsStringParameter(ByteBuffer _bb) { return getRootAsStringParameter(_bb, new StringParameter()); }
  public static StringParameter getRootAsStringParameter(ByteBuffer _bb, StringParameter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StringParameter __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String stringName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer stringNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer stringNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String stringValue() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer stringValueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer stringValueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createStringParameter(FlatBufferBuilder builder,
      int stringNameOffset,
      int stringValueOffset) {
    builder.startTable(2);
    StringParameter.addStringValue(builder, stringValueOffset);
    StringParameter.addStringName(builder, stringNameOffset);
    return StringParameter.endStringParameter(builder);
  }

  public static void startStringParameter(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addStringName(FlatBufferBuilder builder, int stringNameOffset) { builder.addOffset(0, stringNameOffset, 0); }
  public static void addStringValue(FlatBufferBuilder builder, int stringValueOffset) { builder.addOffset(1, stringValueOffset, 0); }
  public static int endStringParameter(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StringParameter get(int j) { return get(new StringParameter(), j); }
    public StringParameter get(StringParameter obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

