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
public final class Transform extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Transform getRootAsTransform(ByteBuffer _bb) { return getRootAsTransform(_bb, new Transform()); }
  public static Transform getRootAsTransform(ByteBuffer _bb, Transform obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Transform __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecScale() { return vecScale(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecScale(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecRot() { return vecRot(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecRot(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecTranslate() { return vecTranslate(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 vecTranslate(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startTransform(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addVecScale(FlatBufferBuilder builder, int vecScaleOffset) { builder.addStruct(0, vecScaleOffset, 0); }
  public static void addVecRot(FlatBufferBuilder builder, int vecRotOffset) { builder.addStruct(1, vecRotOffset, 0); }
  public static void addVecTranslate(FlatBufferBuilder builder, int vecTranslateOffset) { builder.addStruct(2, vecTranslateOffset, 0); }
  public static int endTransform(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Transform get(int j) { return get(new Transform(), j); }
    public Transform get(Transform obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

