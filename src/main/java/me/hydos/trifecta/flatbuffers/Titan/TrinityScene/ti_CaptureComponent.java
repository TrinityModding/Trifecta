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
public final class ti_CaptureComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static ti_CaptureComponent getRootAsti_CaptureComponent(ByteBuffer _bb) { return getRootAsti_CaptureComponent(_bb, new ti_CaptureComponent()); }
  public static ti_CaptureComponent getRootAsti_CaptureComponent(ByteBuffer _bb, ti_CaptureComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ti_CaptureComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long unk0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createti_CaptureComponent(FlatBufferBuilder builder,
      long unk0,
      long unk1) {
    builder.startTable(2);
    ti_CaptureComponent.addUnk1(builder, unk1);
    ti_CaptureComponent.addUnk0(builder, unk0);
    return ti_CaptureComponent.endti_CaptureComponent(builder);
  }

  public static void startti_CaptureComponent(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addUnk0(FlatBufferBuilder builder, long unk0) { builder.addInt(0, (int) unk0, (int) 0L); }
  public static void addUnk1(FlatBufferBuilder builder, long unk1) { builder.addInt(1, (int) unk1, (int) 0L); }
  public static int endti_CaptureComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishti_CaptureComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedti_CaptureComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ti_CaptureComponent get(int j) { return get(new ti_CaptureComponent(), j); }
    public ti_CaptureComponent get(ti_CaptureComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ti_CaptureComponentT unpack() {
    ti_CaptureComponentT _o = new ti_CaptureComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ti_CaptureComponentT _o) {
    long _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    long _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
  }
  public static int pack(FlatBufferBuilder builder, ti_CaptureComponentT _o) {
    if (_o == null) return 0;
    return createti_CaptureComponent(
      builder,
      _o.getUnk0(),
      _o.getUnk1());
  }
}

