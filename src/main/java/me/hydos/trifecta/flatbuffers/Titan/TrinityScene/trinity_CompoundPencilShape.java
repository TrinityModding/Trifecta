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
public final class trinity_CompoundPencilShape extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_CompoundPencilShape getRootAstrinity_CompoundPencilShape(ByteBuffer _bb) { return getRootAstrinity_CompoundPencilShape(_bb, new trinity_CompoundPencilShape()); }
  public static trinity_CompoundPencilShape getRootAstrinity_CompoundPencilShape(ByteBuffer _bb, trinity_CompoundPencilShape obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_CompoundPencilShape __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public me.hydos.trifecta.flatbuffers.Vec3f unk0() { return unk0(new me.hydos.trifecta.flatbuffers.Vec3f()); }
  public me.hydos.trifecta.flatbuffers.Vec3f unk0(me.hydos.trifecta.flatbuffers.Vec3f obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float unk1() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk2() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk3() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public long unk4() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static void starttrinity_CompoundPencilShape(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addUnk0(FlatBufferBuilder builder, int unk0Offset) { builder.addStruct(1, unk0Offset, 0); }
  public static void addUnk1(FlatBufferBuilder builder, float unk1) { builder.addFloat(2, unk1, 0.0f); }
  public static void addUnk2(FlatBufferBuilder builder, float unk2) { builder.addFloat(3, unk2, 0.0f); }
  public static void addUnk3(FlatBufferBuilder builder, float unk3) { builder.addFloat(4, unk3, 0.0f); }
  public static void addUnk4(FlatBufferBuilder builder, long unk4) { builder.addInt(5, (int) unk4, (int) 0L); }
  public static int endtrinity_CompoundPencilShape(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_CompoundPencilShapeBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_CompoundPencilShapeBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_CompoundPencilShape get(int j) { return get(new trinity_CompoundPencilShape(), j); }
    public trinity_CompoundPencilShape get(trinity_CompoundPencilShape obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_CompoundPencilShapeT unpack() {
    trinity_CompoundPencilShapeT _o = new trinity_CompoundPencilShapeT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_CompoundPencilShapeT _o) {
    String _oName = name();
    _o.setName(_oName);
    if (unk0() != null) unk0().unpackTo(_o.getUnk0());
    else _o.setUnk0(null);
    float _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    float _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    float _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    long _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
  }
  public static int pack(FlatBufferBuilder builder, trinity_CompoundPencilShapeT _o) {
    if (_o == null) return 0;
    int _name = _o.getName() == null ? 0 : builder.createString(_o.getName());
    starttrinity_CompoundPencilShape(builder);
    addName(builder, _name);
    addUnk0(builder, me.hydos.trifecta.flatbuffers.Vec3f.pack(builder, _o.getUnk0()));
    addUnk1(builder, _o.getUnk1());
    addUnk2(builder, _o.getUnk2());
    addUnk3(builder, _o.getUnk3());
    addUnk4(builder, _o.getUnk4());
    return endtrinity_CompoundPencilShape(builder);
  }
}

