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
public final class trinity_ParticleComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_ParticleComponent getRootAstrinity_ParticleComponent(ByteBuffer _bb) { return getRootAstrinity_ParticleComponent(_bb, new trinity_ParticleComponent()); }
  public static trinity_ParticleComponent getRootAstrinity_ParticleComponent(ByteBuffer _bb, trinity_ParticleComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_ParticleComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filePath() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filePathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filePathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String unk1() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer unk1AsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer unk1InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean unk2() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String particleName() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer particleNameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer particleNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public String particleParent() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer particleParentAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer particleParentInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public long unk5() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean unk6() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean unk7() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long unk8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk9() { int o = __offset(22); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public float unk10() { int o = __offset(24); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean unk11() { int o = __offset(26); return o != 0 ? 0!=bb.get(o + bb_pos) : true; }

  public static int createtrinity_ParticleComponent(FlatBufferBuilder builder,
      int filePathOffset,
      int unk1Offset,
      boolean unk2,
      int particleNameOffset,
      int particleParentOffset,
      long unk5,
      boolean unk6,
      boolean unk7,
      long unk8,
      long unk9,
      float unk10,
      boolean unk11) {
    builder.startTable(12);
    trinity_ParticleComponent.addUnk10(builder, unk10);
    trinity_ParticleComponent.addUnk9(builder, unk9);
    trinity_ParticleComponent.addUnk8(builder, unk8);
    trinity_ParticleComponent.addUnk5(builder, unk5);
    trinity_ParticleComponent.addParticleParent(builder, particleParentOffset);
    trinity_ParticleComponent.addParticleName(builder, particleNameOffset);
    trinity_ParticleComponent.addUnk1(builder, unk1Offset);
    trinity_ParticleComponent.addFilePath(builder, filePathOffset);
    trinity_ParticleComponent.addUnk11(builder, unk11);
    trinity_ParticleComponent.addUnk7(builder, unk7);
    trinity_ParticleComponent.addUnk6(builder, unk6);
    trinity_ParticleComponent.addUnk2(builder, unk2);
    return trinity_ParticleComponent.endtrinity_ParticleComponent(builder);
  }

  public static void starttrinity_ParticleComponent(FlatBufferBuilder builder) { builder.startTable(12); }
  public static void addFilePath(FlatBufferBuilder builder, int filePathOffset) { builder.addOffset(0, filePathOffset, 0); }
  public static void addUnk1(FlatBufferBuilder builder, int unk1Offset) { builder.addOffset(1, unk1Offset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, boolean unk2) { builder.addBoolean(2, unk2, false); }
  public static void addParticleName(FlatBufferBuilder builder, int particleNameOffset) { builder.addOffset(3, particleNameOffset, 0); }
  public static void addParticleParent(FlatBufferBuilder builder, int particleParentOffset) { builder.addOffset(4, particleParentOffset, 0); }
  public static void addUnk5(FlatBufferBuilder builder, long unk5) { builder.addInt(5, (int) unk5, (int) 0L); }
  public static void addUnk6(FlatBufferBuilder builder, boolean unk6) { builder.addBoolean(6, unk6, false); }
  public static void addUnk7(FlatBufferBuilder builder, boolean unk7) { builder.addBoolean(7, unk7, false); }
  public static void addUnk8(FlatBufferBuilder builder, long unk8) { builder.addInt(8, (int) unk8, (int) 0L); }
  public static void addUnk9(FlatBufferBuilder builder, long unk9) { builder.addInt(9, (int) unk9, (int) 0L); }
  public static void addUnk10(FlatBufferBuilder builder, float unk10) { builder.addFloat(10, unk10, 0.0f); }
  public static void addUnk11(FlatBufferBuilder builder, boolean unk11) { builder.addBoolean(11, unk11, true); }
  public static int endtrinity_ParticleComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_ParticleComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_ParticleComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_ParticleComponent get(int j) { return get(new trinity_ParticleComponent(), j); }
    public trinity_ParticleComponent get(trinity_ParticleComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_ParticleComponentT unpack() {
    trinity_ParticleComponentT _o = new trinity_ParticleComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_ParticleComponentT _o) {
    String _oFilePath = filePath();
    _o.setFilePath(_oFilePath);
    String _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    boolean _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    String _oParticleName = particleName();
    _o.setParticleName(_oParticleName);
    String _oParticleParent = particleParent();
    _o.setParticleParent(_oParticleParent);
    long _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
    boolean _oUnk6 = unk6();
    _o.setUnk6(_oUnk6);
    boolean _oUnk7 = unk7();
    _o.setUnk7(_oUnk7);
    long _oUnk8 = unk8();
    _o.setUnk8(_oUnk8);
    long _oUnk9 = unk9();
    _o.setUnk9(_oUnk9);
    float _oUnk10 = unk10();
    _o.setUnk10(_oUnk10);
    boolean _oUnk11 = unk11();
    _o.setUnk11(_oUnk11);
  }
  public static int pack(FlatBufferBuilder builder, trinity_ParticleComponentT _o) {
    if (_o == null) return 0;
    int _filePath = _o.getFilePath() == null ? 0 : builder.createString(_o.getFilePath());
    int _unk1 = _o.getUnk1() == null ? 0 : builder.createString(_o.getUnk1());
    int _particleName = _o.getParticleName() == null ? 0 : builder.createString(_o.getParticleName());
    int _particleParent = _o.getParticleParent() == null ? 0 : builder.createString(_o.getParticleParent());
    return createtrinity_ParticleComponent(
      builder,
      _filePath,
      _unk1,
      _o.getUnk2(),
      _particleName,
      _particleParent,
      _o.getUnk5(),
      _o.getUnk6(),
      _o.getUnk7(),
      _o.getUnk8(),
      _o.getUnk9(),
      _o.getUnk10(),
      _o.getUnk11());
  }
}

