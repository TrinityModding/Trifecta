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
public final class trinity_DecalComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_DecalComponent getRootAstrinity_DecalComponent(ByteBuffer _bb) { return getRootAstrinity_DecalComponent(_bb, new trinity_DecalComponent()); }
  public static trinity_DecalComponent getRootAstrinity_DecalComponent(ByteBuffer _bb, trinity_DecalComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_DecalComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String unk0() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer unk0AsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer unk0InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String filePath() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filePathAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer filePathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk2() { return unk2(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk2(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean unk4() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long unk5() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Vec4f unk6() { return unk6(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk6(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(16); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk7() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Vec4f unk9() { return unk9(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk9(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(22); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk10() { int o = __offset(24); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk11() { int o = __offset(26); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Vec4f unk12() { return unk12(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk12(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(28); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk13() { int o = __offset(30); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk14() { int o = __offset(32); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Vec4f unk15() { return unk15(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk15(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(34); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public long unk16() { int o = __offset(36); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk17() { int o = __offset(38); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk18() { int o = __offset(40); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk19() { int o = __offset(42); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean unk20() { int o = __offset(44); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public me.hydos.trifecta.flatbuffers.Vec4f unk21() { return unk21(new me.hydos.trifecta.flatbuffers.Vec4f()); }
  public me.hydos.trifecta.flatbuffers.Vec4f unk21(me.hydos.trifecta.flatbuffers.Vec4f obj) { int o = __offset(46); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void starttrinity_DecalComponent(FlatBufferBuilder builder) { builder.startTable(22); }
  public static void addUnk0(FlatBufferBuilder builder, int unk0Offset) { builder.addOffset(0, unk0Offset, 0); }
  public static void addFilePath(FlatBufferBuilder builder, int filePathOffset) { builder.addOffset(1, filePathOffset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, int unk2Offset) { builder.addStruct(2, unk2Offset, 0); }
  public static void addUnk3(FlatBufferBuilder builder, long unk3) { builder.addInt(3, (int) unk3, (int) 0L); }
  public static void addUnk4(FlatBufferBuilder builder, boolean unk4) { builder.addBoolean(4, unk4, false); }
  public static void addUnk5(FlatBufferBuilder builder, long unk5) { builder.addInt(5, (int) unk5, (int) 0L); }
  public static void addUnk6(FlatBufferBuilder builder, int unk6Offset) { builder.addStruct(6, unk6Offset, 0); }
  public static void addUnk7(FlatBufferBuilder builder, long unk7) { builder.addInt(7, (int) unk7, (int) 0L); }
  public static void addUnk8(FlatBufferBuilder builder, long unk8) { builder.addInt(8, (int) unk8, (int) 0L); }
  public static void addUnk9(FlatBufferBuilder builder, int unk9Offset) { builder.addStruct(9, unk9Offset, 0); }
  public static void addUnk10(FlatBufferBuilder builder, long unk10) { builder.addInt(10, (int) unk10, (int) 0L); }
  public static void addUnk11(FlatBufferBuilder builder, long unk11) { builder.addInt(11, (int) unk11, (int) 0L); }
  public static void addUnk12(FlatBufferBuilder builder, int unk12Offset) { builder.addStruct(12, unk12Offset, 0); }
  public static void addUnk13(FlatBufferBuilder builder, long unk13) { builder.addInt(13, (int) unk13, (int) 0L); }
  public static void addUnk14(FlatBufferBuilder builder, long unk14) { builder.addInt(14, (int) unk14, (int) 0L); }
  public static void addUnk15(FlatBufferBuilder builder, int unk15Offset) { builder.addStruct(15, unk15Offset, 0); }
  public static void addUnk16(FlatBufferBuilder builder, long unk16) { builder.addInt(16, (int) unk16, (int) 0L); }
  public static void addUnk17(FlatBufferBuilder builder, long unk17) { builder.addInt(17, (int) unk17, (int) 0L); }
  public static void addUnk18(FlatBufferBuilder builder, long unk18) { builder.addInt(18, (int) unk18, (int) 0L); }
  public static void addUnk19(FlatBufferBuilder builder, long unk19) { builder.addInt(19, (int) unk19, (int) 0L); }
  public static void addUnk20(FlatBufferBuilder builder, boolean unk20) { builder.addBoolean(20, unk20, false); }
  public static void addUnk21(FlatBufferBuilder builder, int unk21Offset) { builder.addStruct(21, unk21Offset, 0); }
  public static int endtrinity_DecalComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_DecalComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_DecalComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_DecalComponent get(int j) { return get(new trinity_DecalComponent(), j); }
    public trinity_DecalComponent get(trinity_DecalComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_DecalComponentT unpack() {
    trinity_DecalComponentT _o = new trinity_DecalComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_DecalComponentT _o) {
    String _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    String _oFilePath = filePath();
    _o.setFilePath(_oFilePath);
    if (unk2() != null) unk2().unpackTo(_o.getUnk2());
    else _o.setUnk2(null);
    long _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    boolean _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
    long _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
    if (unk6() != null) unk6().unpackTo(_o.getUnk6());
    else _o.setUnk6(null);
    long _oUnk7 = unk7();
    _o.setUnk7(_oUnk7);
    long _oUnk8 = unk8();
    _o.setUnk8(_oUnk8);
    if (unk9() != null) unk9().unpackTo(_o.getUnk9());
    else _o.setUnk9(null);
    long _oUnk10 = unk10();
    _o.setUnk10(_oUnk10);
    long _oUnk11 = unk11();
    _o.setUnk11(_oUnk11);
    if (unk12() != null) unk12().unpackTo(_o.getUnk12());
    else _o.setUnk12(null);
    long _oUnk13 = unk13();
    _o.setUnk13(_oUnk13);
    long _oUnk14 = unk14();
    _o.setUnk14(_oUnk14);
    if (unk15() != null) unk15().unpackTo(_o.getUnk15());
    else _o.setUnk15(null);
    long _oUnk16 = unk16();
    _o.setUnk16(_oUnk16);
    long _oUnk17 = unk17();
    _o.setUnk17(_oUnk17);
    long _oUnk18 = unk18();
    _o.setUnk18(_oUnk18);
    long _oUnk19 = unk19();
    _o.setUnk19(_oUnk19);
    boolean _oUnk20 = unk20();
    _o.setUnk20(_oUnk20);
    if (unk21() != null) unk21().unpackTo(_o.getUnk21());
    else _o.setUnk21(null);
  }
  public static int pack(FlatBufferBuilder builder, trinity_DecalComponentT _o) {
    if (_o == null) return 0;
    int _unk0 = _o.getUnk0() == null ? 0 : builder.createString(_o.getUnk0());
    int _filePath = _o.getFilePath() == null ? 0 : builder.createString(_o.getFilePath());
    starttrinity_DecalComponent(builder);
    addUnk0(builder, _unk0);
    addFilePath(builder, _filePath);
    addUnk2(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk2()));
    addUnk3(builder, _o.getUnk3());
    addUnk4(builder, _o.getUnk4());
    addUnk5(builder, _o.getUnk5());
    addUnk6(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk6()));
    addUnk7(builder, _o.getUnk7());
    addUnk8(builder, _o.getUnk8());
    addUnk9(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk9()));
    addUnk10(builder, _o.getUnk10());
    addUnk11(builder, _o.getUnk11());
    addUnk12(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk12()));
    addUnk13(builder, _o.getUnk13());
    addUnk14(builder, _o.getUnk14());
    addUnk15(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk15()));
    addUnk16(builder, _o.getUnk16());
    addUnk17(builder, _o.getUnk17());
    addUnk18(builder, _o.getUnk18());
    addUnk19(builder, _o.getUnk19());
    addUnk20(builder, _o.getUnk20());
    addUnk21(builder, me.hydos.trifecta.flatbuffers.Vec4f.pack(builder, _o.getUnk21()));
    return endtrinity_DecalComponent(builder);
  }
}

