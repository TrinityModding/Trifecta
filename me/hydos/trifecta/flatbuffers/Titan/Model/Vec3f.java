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
public final class Vec3f extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Vec3f __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float z() { return bb.getFloat(bb_pos + 8); }

  public static int createVec3f(FlatBufferBuilder builder, float x, float y, float z) {
    builder.prep(4, 12);
    builder.putFloat(z);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Vec3f get(int j) { return get(new Vec3f(), j); }
    public Vec3f get(Vec3f obj, int j) {  return obj.__assign(__element(j), bb); }
  }
  public Vec3fT unpack() {
    Vec3fT _o = new Vec3fT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(Vec3fT _o) {
    float _oX = x();
    _o.setX(_oX);
    float _oY = y();
    _o.setY(_oY);
    float _oZ = z();
    _o.setZ(_oZ);
  }
  public static int pack(FlatBufferBuilder builder, Vec3fT _o) {
    if (_o == null) return 0;
    return createVec3f(
      builder,
      _o.getX(),
      _o.getY(),
      _o.getZ());
  }
}

