// automatically generated by the FlatBuffers compiler, do not modify

package me.hydos.trifecta.flatbuffers.Titan.Model;

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
public final class BoneMatrix extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static BoneMatrix getRootAsBoneMatrix(ByteBuffer _bb) { return getRootAsBoneMatrix(_bb, new BoneMatrix()); }
  public static BoneMatrix getRootAsBoneMatrix(ByteBuffer _bb, BoneMatrix obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public BoneMatrix __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 x() { return x(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 x(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 y() { return y(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 y(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 z() { return z(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 z(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 w() { return w(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 w(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startBoneMatrix(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addX(FlatBufferBuilder builder, int xOffset) { builder.addStruct(0, xOffset, 0); }
  public static void addY(FlatBufferBuilder builder, int yOffset) { builder.addStruct(1, yOffset, 0); }
  public static void addZ(FlatBufferBuilder builder, int zOffset) { builder.addStruct(2, zOffset, 0); }
  public static void addW(FlatBufferBuilder builder, int wOffset) { builder.addStruct(3, wOffset, 0); }
  public static int endBoneMatrix(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public BoneMatrix get(int j) { return get(new BoneMatrix(), j); }
    public BoneMatrix get(BoneMatrix obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

