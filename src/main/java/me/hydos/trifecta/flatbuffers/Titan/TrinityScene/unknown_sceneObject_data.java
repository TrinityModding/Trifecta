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
public final class unknown_sceneObject_data extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static unknown_sceneObject_data getRootAsunknown_sceneObject_data(ByteBuffer _bb) { return getRootAsunknown_sceneObject_data(_bb, new unknown_sceneObject_data()); }
  public static unknown_sceneObject_data getRootAsunknown_sceneObject_data(ByteBuffer _bb, unknown_sceneObject_data obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public unknown_sceneObject_data __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Vec3f unk1() { return unk1(new me.hydos.trifecta.flatbuffers.Vec3f()); }
  public me.hydos.trifecta.flatbuffers.Vec3f unk1(me.hydos.trifecta.flatbuffers.Vec3f obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float unk2() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static void startunknown_sceneObject_data(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addUnk1(FlatBufferBuilder builder, int unk1Offset) { builder.addStruct(0, unk1Offset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, float unk2) { builder.addFloat(1, unk2, 0.0f); }
  public static int endunknown_sceneObject_data(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public unknown_sceneObject_data get(int j) { return get(new unknown_sceneObject_data(), j); }
    public unknown_sceneObject_data get(unknown_sceneObject_data obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public unknown_sceneObject_dataT unpack() {
    unknown_sceneObject_dataT _o = new unknown_sceneObject_dataT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(unknown_sceneObject_dataT _o) {
    if (unk1() != null) unk1().unpackTo(_o.getUnk1());
    else _o.setUnk1(null);
    float _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
  }
  public static int pack(FlatBufferBuilder builder, unknown_sceneObject_dataT _o) {
    if (_o == null) return 0;
    startunknown_sceneObject_data(builder);
    addUnk1(builder, me.hydos.trifecta.flatbuffers.Vec3f.pack(builder, _o.getUnk1()));
    addUnk2(builder, _o.getUnk2());
    return endunknown_sceneObject_data(builder);
  }
}

