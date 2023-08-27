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
public final class trinity_OverrideSensorData extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_OverrideSensorData getRootAstrinity_OverrideSensorData(ByteBuffer _bb) { return getRootAstrinity_OverrideSensorData(_bb, new trinity_OverrideSensorData()); }
  public static trinity_OverrideSensorData getRootAstrinity_OverrideSensorData(ByteBuffer _bb, trinity_OverrideSensorData obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_OverrideSensorData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float unk0() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk1() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk2() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float unk3() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createtrinity_OverrideSensorData(FlatBufferBuilder builder,
      float unk0,
      float unk1,
      float unk2,
      float unk3) {
    builder.startTable(4);
    trinity_OverrideSensorData.addUnk3(builder, unk3);
    trinity_OverrideSensorData.addUnk2(builder, unk2);
    trinity_OverrideSensorData.addUnk1(builder, unk1);
    trinity_OverrideSensorData.addUnk0(builder, unk0);
    return trinity_OverrideSensorData.endtrinity_OverrideSensorData(builder);
  }

  public static void starttrinity_OverrideSensorData(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addUnk0(FlatBufferBuilder builder, float unk0) { builder.addFloat(0, unk0, 0.0f); }
  public static void addUnk1(FlatBufferBuilder builder, float unk1) { builder.addFloat(1, unk1, 0.0f); }
  public static void addUnk2(FlatBufferBuilder builder, float unk2) { builder.addFloat(2, unk2, 0.0f); }
  public static void addUnk3(FlatBufferBuilder builder, float unk3) { builder.addFloat(3, unk3, 0.0f); }
  public static int endtrinity_OverrideSensorData(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_OverrideSensorDataBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_OverrideSensorDataBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_OverrideSensorData get(int j) { return get(new trinity_OverrideSensorData(), j); }
    public trinity_OverrideSensorData get(trinity_OverrideSensorData obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_OverrideSensorDataT unpack() {
    trinity_OverrideSensorDataT _o = new trinity_OverrideSensorDataT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_OverrideSensorDataT _o) {
    float _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    float _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    float _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    float _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
  }
  public static int pack(FlatBufferBuilder builder, trinity_OverrideSensorDataT _o) {
    if (_o == null) return 0;
    return createtrinity_OverrideSensorData(
      builder,
      _o.getUnk0(),
      _o.getUnk1(),
      _o.getUnk2(),
      _o.getUnk3());
  }
}

