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
public final class trinity_NavmeshComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_NavmeshComponent getRootAstrinity_NavmeshComponent(ByteBuffer _bb) { return getRootAstrinity_NavmeshComponent(_bb, new trinity_NavmeshComponent()); }
  public static trinity_NavmeshComponent getRootAstrinity_NavmeshComponent(ByteBuffer _bb, trinity_NavmeshComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_NavmeshComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String navmeshFilePath() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer navmeshFilePathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer navmeshFilePathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean unk2() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public float unk3() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createtrinity_NavmeshComponent(FlatBufferBuilder builder,
      int navmeshFilePathOffset,
      int nameOffset,
      boolean unk2,
      float unk3) {
    builder.startTable(4);
    trinity_NavmeshComponent.addUnk3(builder, unk3);
    trinity_NavmeshComponent.addName(builder, nameOffset);
    trinity_NavmeshComponent.addNavmeshFilePath(builder, navmeshFilePathOffset);
    trinity_NavmeshComponent.addUnk2(builder, unk2);
    return trinity_NavmeshComponent.endtrinity_NavmeshComponent(builder);
  }

  public static void starttrinity_NavmeshComponent(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addNavmeshFilePath(FlatBufferBuilder builder, int navmeshFilePathOffset) { builder.addOffset(0, navmeshFilePathOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, boolean unk2) { builder.addBoolean(2, unk2, false); }
  public static void addUnk3(FlatBufferBuilder builder, float unk3) { builder.addFloat(3, unk3, 0.0f); }
  public static int endtrinity_NavmeshComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_NavmeshComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_NavmeshComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_NavmeshComponent get(int j) { return get(new trinity_NavmeshComponent(), j); }
    public trinity_NavmeshComponent get(trinity_NavmeshComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_NavmeshComponentT unpack() {
    trinity_NavmeshComponentT _o = new trinity_NavmeshComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_NavmeshComponentT _o) {
    String _oNavmeshFilePath = navmeshFilePath();
    _o.setNavmeshFilePath(_oNavmeshFilePath);
    String _oName = name();
    _o.setName(_oName);
    boolean _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    float _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
  }
  public static int pack(FlatBufferBuilder builder, trinity_NavmeshComponentT _o) {
    if (_o == null) return 0;
    int _navmeshFilePath = _o.getNavmeshFilePath() == null ? 0 : builder.createString(_o.getNavmeshFilePath());
    int _name = _o.getName() == null ? 0 : builder.createString(_o.getName());
    return createtrinity_NavmeshComponent(
      builder,
      _navmeshFilePath,
      _name,
      _o.getUnk2(),
      _o.getUnk3());
  }
}

