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
public final class pe_OffScreenComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static pe_OffScreenComponent getRootAspe_OffScreenComponent(ByteBuffer _bb) { return getRootAspe_OffScreenComponent(_bb, new pe_OffScreenComponent()); }
  public static pe_OffScreenComponent getRootAspe_OffScreenComponent(ByteBuffer _bb, pe_OffScreenComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public pe_OffScreenComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long unk0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public float unk2() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public long unk3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public String unk5() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer unk5AsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer unk5InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }

  public static int createpe_OffScreenComponent(FlatBufferBuilder builder,
      long unk0,
      long unk1,
      float unk2,
      long unk3,
      long unk4,
      int unk5Offset) {
    builder.startTable(6);
    pe_OffScreenComponent.addUnk5(builder, unk5Offset);
    pe_OffScreenComponent.addUnk4(builder, unk4);
    pe_OffScreenComponent.addUnk3(builder, unk3);
    pe_OffScreenComponent.addUnk2(builder, unk2);
    pe_OffScreenComponent.addUnk1(builder, unk1);
    pe_OffScreenComponent.addUnk0(builder, unk0);
    return pe_OffScreenComponent.endpe_OffScreenComponent(builder);
  }

  public static void startpe_OffScreenComponent(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addUnk0(FlatBufferBuilder builder, long unk0) { builder.addInt(0, (int) unk0, (int) 0L); }
  public static void addUnk1(FlatBufferBuilder builder, long unk1) { builder.addInt(1, (int) unk1, (int) 0L); }
  public static void addUnk2(FlatBufferBuilder builder, float unk2) { builder.addFloat(2, unk2, 0.0f); }
  public static void addUnk3(FlatBufferBuilder builder, long unk3) { builder.addInt(3, (int) unk3, (int) 0L); }
  public static void addUnk4(FlatBufferBuilder builder, long unk4) { builder.addInt(4, (int) unk4, (int) 0L); }
  public static void addUnk5(FlatBufferBuilder builder, int unk5Offset) { builder.addOffset(5, unk5Offset, 0); }
  public static int endpe_OffScreenComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishpe_OffScreenComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedpe_OffScreenComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public pe_OffScreenComponent get(int j) { return get(new pe_OffScreenComponent(), j); }
    public pe_OffScreenComponent get(pe_OffScreenComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public pe_OffScreenComponentT unpack() {
    pe_OffScreenComponentT _o = new pe_OffScreenComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(pe_OffScreenComponentT _o) {
    long _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    long _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    float _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    long _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    long _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
    String _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
  }
  public static int pack(FlatBufferBuilder builder, pe_OffScreenComponentT _o) {
    if (_o == null) return 0;
    int _unk5 = _o.getUnk5() == null ? 0 : builder.createString(_o.getUnk5());
    return createpe_OffScreenComponent(
      builder,
      _o.getUnk0(),
      _o.getUnk1(),
      _o.getUnk2(),
      _o.getUnk3(),
      _o.getUnk4(),
      _unk5);
  }
}

