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
public final class VertexAccessor extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static VertexAccessor getRootAsVertexAccessor(ByteBuffer _bb) { return getRootAsVertexAccessor(_bb, new VertexAccessor()); }
  public static VertexAccessor getRootAsVertexAccessor(ByteBuffer _bb, VertexAccessor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public VertexAccessor __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int attr0() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : -1; }
  public long attribute() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long attributeLayer() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long type() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long position() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createVertexAccessor(FlatBufferBuilder builder,
      int attr0,
      long attribute,
      long attributeLayer,
      long type,
      long position) {
    builder.startTable(5);
    VertexAccessor.addPosition(builder, position);
    VertexAccessor.addType(builder, type);
    VertexAccessor.addAttributeLayer(builder, attributeLayer);
    VertexAccessor.addAttribute(builder, attribute);
    VertexAccessor.addAttr0(builder, attr0);
    return VertexAccessor.endVertexAccessor(builder);
  }

  public static void startVertexAccessor(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addAttr0(FlatBufferBuilder builder, int attr0) { builder.addInt(0, attr0, -1); }
  public static void addAttribute(FlatBufferBuilder builder, long attribute) { builder.addInt(1, (int) attribute, (int) 0L); }
  public static void addAttributeLayer(FlatBufferBuilder builder, long attributeLayer) { builder.addInt(2, (int) attributeLayer, (int) 0L); }
  public static void addType(FlatBufferBuilder builder, long type) { builder.addInt(3, (int) type, (int) 0L); }
  public static void addPosition(FlatBufferBuilder builder, long position) { builder.addInt(4, (int) position, (int) 0L); }
  public static int endVertexAccessor(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public VertexAccessor get(int j) { return get(new VertexAccessor(), j); }
    public VertexAccessor get(VertexAccessor obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public VertexAccessorT unpack() {
    VertexAccessorT _o = new VertexAccessorT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(VertexAccessorT _o) {
    int _oAttr0 = attr0();
    _o.setAttr0(_oAttr0);
    long _oAttribute = attribute();
    _o.setAttribute(_oAttribute);
    long _oAttributeLayer = attributeLayer();
    _o.setAttributeLayer(_oAttributeLayer);
    long _oType = type();
    _o.setType(_oType);
    long _oPosition = position();
    _o.setPosition(_oPosition);
  }
  public static int pack(FlatBufferBuilder builder, VertexAccessorT _o) {
    if (_o == null) return 0;
    return createVertexAccessor(
      builder,
      _o.getAttr0(),
      _o.getAttribute(),
      _o.getAttributeLayer(),
      _o.getType(),
      _o.getPosition());
  }
}

