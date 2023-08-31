// automatically generated by the FlatBuffers compiler, do not modify

package me.hydos.trifecta.flatbuffers.Titan.TrinityScene;

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
public final class ti_AIPerceptualComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static ti_AIPerceptualComponent getRootAsti_AIPerceptualComponent(ByteBuffer _bb) { return getRootAsti_AIPerceptualComponent(_bb, new ti_AIPerceptualComponent()); }
  public static ti_AIPerceptualComponent getRootAsti_AIPerceptualComponent(ByteBuffer _bb, ti_AIPerceptualComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ti_AIPerceptualComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int value() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createti_AIPerceptualComponent(FlatBufferBuilder builder,
      int value) {
    builder.startTable(1);
    ti_AIPerceptualComponent.addValue(builder, value);
    return ti_AIPerceptualComponent.endti_AIPerceptualComponent(builder);
  }

  public static void startti_AIPerceptualComponent(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValue(FlatBufferBuilder builder, int value) { builder.addByte(0, (byte) value, (byte) 0); }
  public static int endti_AIPerceptualComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishti_AIPerceptualComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedti_AIPerceptualComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ti_AIPerceptualComponent get(int j) { return get(new ti_AIPerceptualComponent(), j); }
    public ti_AIPerceptualComponent get(ti_AIPerceptualComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ti_AIPerceptualComponentT unpack() {
    ti_AIPerceptualComponentT _o = new ti_AIPerceptualComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ti_AIPerceptualComponentT _o) {
    int _oValue = value();
    _o.setValue(_oValue);
  }
  public static int pack(FlatBufferBuilder builder, ti_AIPerceptualComponentT _o) {
    if (_o == null) return 0;
    return createti_AIPerceptualComponent(
      builder,
      _o.getValue());
  }
}
