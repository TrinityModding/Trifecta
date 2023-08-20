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
public final class Bounds extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Bounds getRootAsBounds(ByteBuffer _bb) { return getRootAsBounds(_bb, new Bounds()); }
  public static Bounds getRootAsBounds(ByteBuffer _bb, Bounds obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Bounds __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 min() { return min(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 min(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 max() { return max(new me.hydos.trifecta.flatbuffers.Titan.Model.Vec3()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 max(me.hydos.trifecta.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startBounds(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addMin(FlatBufferBuilder builder, int minOffset) { builder.addStruct(0, minOffset, 0); }
  public static void addMax(FlatBufferBuilder builder, int maxOffset) { builder.addStruct(1, maxOffset, 0); }
  public static int endBounds(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Bounds get(int j) { return get(new Bounds(), j); }
    public Bounds get(Bounds obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
