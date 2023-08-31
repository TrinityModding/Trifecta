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
public final class trinity_TerrainCollision extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_TerrainCollision getRootAstrinity_TerrainCollision(ByteBuffer _bb) { return getRootAstrinity_TerrainCollision(_bb, new trinity_TerrainCollision()); }
  public static trinity_TerrainCollision getRootAstrinity_TerrainCollision(ByteBuffer _bb, trinity_TerrainCollision obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_TerrainCollision __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filePath() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filePathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filePathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long unk1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk2() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createtrinity_TerrainCollision(FlatBufferBuilder builder,
      int filePathOffset,
      long unk1,
      long unk2) {
    builder.startTable(3);
    trinity_TerrainCollision.addUnk2(builder, unk2);
    trinity_TerrainCollision.addUnk1(builder, unk1);
    trinity_TerrainCollision.addFilePath(builder, filePathOffset);
    return trinity_TerrainCollision.endtrinity_TerrainCollision(builder);
  }

  public static void starttrinity_TerrainCollision(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addFilePath(FlatBufferBuilder builder, int filePathOffset) { builder.addOffset(0, filePathOffset, 0); }
  public static void addUnk1(FlatBufferBuilder builder, long unk1) { builder.addInt(1, (int) unk1, (int) 0L); }
  public static void addUnk2(FlatBufferBuilder builder, long unk2) { builder.addInt(2, (int) unk2, (int) 0L); }
  public static int endtrinity_TerrainCollision(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_TerrainCollisionBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_TerrainCollisionBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_TerrainCollision get(int j) { return get(new trinity_TerrainCollision(), j); }
    public trinity_TerrainCollision get(trinity_TerrainCollision obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_TerrainCollisionT unpack() {
    trinity_TerrainCollisionT _o = new trinity_TerrainCollisionT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_TerrainCollisionT _o) {
    String _oFilePath = filePath();
    _o.setFilePath(_oFilePath);
    long _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    long _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
  }
  public static int pack(FlatBufferBuilder builder, trinity_TerrainCollisionT _o) {
    if (_o == null) return 0;
    int _filePath = _o.getFilePath() == null ? 0 : builder.createString(_o.getFilePath());
    return createtrinity_TerrainCollision(
      builder,
      _filePath,
      _o.getUnk1(),
      _o.getUnk2());
  }
}
