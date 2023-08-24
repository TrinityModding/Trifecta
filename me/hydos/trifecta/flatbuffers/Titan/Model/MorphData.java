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
public final class MorphData extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MorphData getRootAsMorphData(ByteBuffer _bb) { return getRootAsMorphData(_bb, new MorphData()); }
  public static MorphData getRootAsMorphData(ByteBuffer _bb, MorphData obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MorphData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor attrs(int j) { return attrs(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor attrs(me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int attrsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor.Vector attrsVector() { return attrsVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor.Vector attrsVector(me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize size(int j) { return size(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize size(me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int sizeLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize.Vector sizeVector() { return sizeVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize.Vector sizeVector(me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createMorphData(FlatBufferBuilder builder,
      int attrsOffset,
      int sizeOffset) {
    builder.startTable(2);
    MorphData.addSize(builder, sizeOffset);
    MorphData.addAttrs(builder, attrsOffset);
    return MorphData.endMorphData(builder);
  }

  public static void startMorphData(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addAttrs(FlatBufferBuilder builder, int attrsOffset) { builder.addOffset(0, attrsOffset, 0); }
  public static int createAttrsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAttrsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSize(FlatBufferBuilder builder, int sizeOffset) { builder.addOffset(1, sizeOffset, 0); }
  public static int createSizeVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSizeVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMorphData(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MorphData get(int j) { return get(new MorphData(), j); }
    public MorphData get(MorphData obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public MorphDataT unpack() {
    MorphDataT _o = new MorphDataT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(MorphDataT _o) {
    me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessorT[] _oAttrs = new me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessorT[attrsLength()];
    for (int _j = 0; _j < attrsLength(); ++_j) {_oAttrs[_j] = (attrs(_j) != null ? attrs(_j).unpack() : null);}
    _o.setAttrs(_oAttrs);
    me.hydos.trifecta.flatbuffers.Titan.Model.MorphSizeT[] _oSize = new me.hydos.trifecta.flatbuffers.Titan.Model.MorphSizeT[sizeLength()];
    for (int _j = 0; _j < sizeLength(); ++_j) {_oSize[_j] = (size(_j) != null ? size(_j).unpack() : null);}
    _o.setSize(_oSize);
  }
  public static int pack(FlatBufferBuilder builder, MorphDataT _o) {
    if (_o == null) return 0;
    int _attrs = 0;
    if (_o.getAttrs() != null) {
      int[] __attrs = new int[_o.getAttrs().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessorT _e : _o.getAttrs()) { __attrs[_j] = me.hydos.trifecta.flatbuffers.Titan.Model.MorphAccessor.pack(builder, _e); _j++;}
      _attrs = createAttrsVector(builder, __attrs);
    }
    int _size = 0;
    if (_o.getSize() != null) {
      int[] __size = new int[_o.getSize().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.Model.MorphSizeT _e : _o.getSize()) { __size[_j] = me.hydos.trifecta.flatbuffers.Titan.Model.MorphSize.pack(builder, _e); _j++;}
      _size = createSizeVector(builder, __size);
    }
    return createMorphData(
      builder,
      _attrs,
      _size);
  }
}

