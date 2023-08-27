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
public final class trinity_CollisionComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_CollisionComponent getRootAstrinity_CollisionComponent(ByteBuffer _bb) { return getRootAstrinity_CollisionComponent(_bb, new trinity_CollisionComponent()); }
  public static trinity_CollisionComponent getRootAstrinity_CollisionComponent(ByteBuffer _bb, trinity_CollisionComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_CollisionComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int unk0() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable unk1() { return unk1(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable unk1(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createtrinity_CollisionComponent(FlatBufferBuilder builder,
      int unk0,
      int unk1Offset) {
    builder.startTable(2);
    trinity_CollisionComponent.addUnk1(builder, unk1Offset);
    trinity_CollisionComponent.addUnk0(builder, unk0);
    return trinity_CollisionComponent.endtrinity_CollisionComponent(builder);
  }

  public static void starttrinity_CollisionComponent(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addUnk0(FlatBufferBuilder builder, int unk0) { builder.addByte(0, (byte) unk0, (byte) 0); }
  public static void addUnk1(FlatBufferBuilder builder, int unk1Offset) { builder.addOffset(1, unk1Offset, 0); }
  public static int endtrinity_CollisionComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_CollisionComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_CollisionComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_CollisionComponent get(int j) { return get(new trinity_CollisionComponent(), j); }
    public trinity_CollisionComponent get(trinity_CollisionComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_CollisionComponentT unpack() {
    trinity_CollisionComponentT _o = new trinity_CollisionComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_CollisionComponentT _o) {
    int _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    if (unk1() != null) _o.setUnk1(unk1().unpack());
    else _o.setUnk1(null);
  }
  public static int pack(FlatBufferBuilder builder, trinity_CollisionComponentT _o) {
    if (_o == null) return 0;
    int _unk1 = _o.getUnk1() == null ? 0 : me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable.pack(builder, _o.getUnk1());
    return createtrinity_CollisionComponent(
      builder,
      _o.getUnk0(),
      _unk1);
  }
}

