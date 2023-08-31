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
public final class trinity_CameraEntity extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_CameraEntity getRootAstrinity_CameraEntity(ByteBuffer _bb) { return getRootAstrinity_CameraEntity(_bb, new trinity_CameraEntity()); }
  public static trinity_CameraEntity getRootAstrinity_CameraEntity(ByteBuffer _bb, trinity_CameraEntity obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_CameraEntity __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String cameraName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cameraNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer cameraNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long res1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Vec3f unk2() { return unk2(new me.hydos.trifecta.flatbuffers.Vec3f()); }
  public me.hydos.trifecta.flatbuffers.Vec3f unk2(me.hydos.trifecta.flatbuffers.Vec3f obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Vec3f unk3() { return unk3(new me.hydos.trifecta.flatbuffers.Vec3f()); }
  public me.hydos.trifecta.flatbuffers.Vec3f unk3(me.hydos.trifecta.flatbuffers.Vec3f obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float unk4() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk5() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk6() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk7() { int o = __offset(18); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public long res8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int unk9() { int o = __offset(22); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String unk10() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer unk10AsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public ByteBuffer unk10InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 1); }
  public long res11() { int o = __offset(26); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res12() { int o = __offset(28); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int res13() { int o = __offset(30); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static void starttrinity_CameraEntity(FlatBufferBuilder builder) { builder.startTable(14); }
  public static void addCameraName(FlatBufferBuilder builder, int cameraNameOffset) { builder.addOffset(0, cameraNameOffset, 0); }
  public static void addRes1(FlatBufferBuilder builder, long res1) { builder.addInt(1, (int) res1, (int) 0L); }
  public static void addUnk2(FlatBufferBuilder builder, int unk2Offset) { builder.addStruct(2, unk2Offset, 0); }
  public static void addUnk3(FlatBufferBuilder builder, int unk3Offset) { builder.addStruct(3, unk3Offset, 0); }
  public static void addUnk4(FlatBufferBuilder builder, float unk4) { builder.addFloat(4, unk4, 0.0f); }
  public static void addUnk5(FlatBufferBuilder builder, float unk5) { builder.addFloat(5, unk5, 0.0f); }
  public static void addUnk6(FlatBufferBuilder builder, float unk6) { builder.addFloat(6, unk6, 0.0f); }
  public static void addUnk7(FlatBufferBuilder builder, float unk7) { builder.addFloat(7, unk7, 0.0f); }
  public static void addRes8(FlatBufferBuilder builder, long res8) { builder.addInt(8, (int) res8, (int) 0L); }
  public static void addUnk9(FlatBufferBuilder builder, int unk9) { builder.addByte(9, (byte) unk9, (byte) 0); }
  public static void addUnk10(FlatBufferBuilder builder, int unk10Offset) { builder.addOffset(10, unk10Offset, 0); }
  public static void addRes11(FlatBufferBuilder builder, long res11) { builder.addInt(11, (int) res11, (int) 0L); }
  public static void addRes12(FlatBufferBuilder builder, long res12) { builder.addInt(12, (int) res12, (int) 0L); }
  public static void addRes13(FlatBufferBuilder builder, int res13) { builder.addByte(13, (byte) res13, (byte) 0); }
  public static int endtrinity_CameraEntity(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_CameraEntityBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_CameraEntityBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_CameraEntity get(int j) { return get(new trinity_CameraEntity(), j); }
    public trinity_CameraEntity get(trinity_CameraEntity obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_CameraEntityT unpack() {
    trinity_CameraEntityT _o = new trinity_CameraEntityT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_CameraEntityT _o) {
    String _oCameraName = cameraName();
    _o.setCameraName(_oCameraName);
    long _oRes1 = res1();
    _o.setRes1(_oRes1);
    if (unk2() != null) unk2().unpackTo(_o.getUnk2());
    else _o.setUnk2(null);
    if (unk3() != null) unk3().unpackTo(_o.getUnk3());
    else _o.setUnk3(null);
    float _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
    float _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
    float _oUnk6 = unk6();
    _o.setUnk6(_oUnk6);
    float _oUnk7 = unk7();
    _o.setUnk7(_oUnk7);
    long _oRes8 = res8();
    _o.setRes8(_oRes8);
    int _oUnk9 = unk9();
    _o.setUnk9(_oUnk9);
    String _oUnk10 = unk10();
    _o.setUnk10(_oUnk10);
    long _oRes11 = res11();
    _o.setRes11(_oRes11);
    long _oRes12 = res12();
    _o.setRes12(_oRes12);
    int _oRes13 = res13();
    _o.setRes13(_oRes13);
  }
  public static int pack(FlatBufferBuilder builder, trinity_CameraEntityT _o) {
    if (_o == null) return 0;
    int _cameraName = _o.getCameraName() == null ? 0 : builder.createString(_o.getCameraName());
    int _unk10 = _o.getUnk10() == null ? 0 : builder.createString(_o.getUnk10());
    starttrinity_CameraEntity(builder);
    addCameraName(builder, _cameraName);
    addRes1(builder, _o.getRes1());
    addUnk2(builder, me.hydos.trifecta.flatbuffers.Vec3f.pack(builder, _o.getUnk2()));
    addUnk3(builder, me.hydos.trifecta.flatbuffers.Vec3f.pack(builder, _o.getUnk3()));
    addUnk4(builder, _o.getUnk4());
    addUnk5(builder, _o.getUnk5());
    addUnk6(builder, _o.getUnk6());
    addUnk7(builder, _o.getUnk7());
    addRes8(builder, _o.getRes8());
    addUnk9(builder, _o.getUnk9());
    addUnk10(builder, _unk10);
    addRes11(builder, _o.getRes11());
    addRes12(builder, _o.getRes12());
    addRes13(builder, _o.getRes13());
    return endtrinity_CameraEntity(builder);
  }
}
