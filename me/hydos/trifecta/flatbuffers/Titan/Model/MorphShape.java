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
public final class MorphShape extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MorphShape getRootAsMorphShape(ByteBuffer _bb) { return getRootAsMorphShape(_bb, new MorphShape()); }
  public static MorphShape getRootAsMorphShape(ByteBuffer _bb, MorphShape obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MorphShape __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphData data(int j) { return data(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphData(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphData data(me.hydos.trifecta.flatbuffers.Titan.Model.MorphData obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int dataLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphData.Vector dataVector() { return dataVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphData.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphData.Vector dataVector(me.hydos.trifecta.flatbuffers.Titan.Model.MorphData.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData metadata(int j) { return metadata(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData metadata(me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int metadataLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData.Vector metadataVector() { return metadataVector(new me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData.Vector metadataVector(me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String morphName() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer morphNameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer morphNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createMorphShape(FlatBufferBuilder builder,
      int dataOffset,
      int metadataOffset,
      int morphNameOffset) {
    builder.startTable(3);
    MorphShape.addMorphName(builder, morphNameOffset);
    MorphShape.addMetadata(builder, metadataOffset);
    MorphShape.addData(builder, dataOffset);
    return MorphShape.endMorphShape(builder);
  }

  public static void startMorphShape(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(0, dataOffset, 0); }
  public static int createDataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMetadata(FlatBufferBuilder builder, int metadataOffset) { builder.addOffset(1, metadataOffset, 0); }
  public static int createMetadataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMetadataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMorphName(FlatBufferBuilder builder, int morphNameOffset) { builder.addOffset(2, morphNameOffset, 0); }
  public static int endMorphShape(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MorphShape get(int j) { return get(new MorphShape(), j); }
    public MorphShape get(MorphShape obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public MorphShapeT unpack() {
    MorphShapeT _o = new MorphShapeT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(MorphShapeT _o) {
    me.hydos.trifecta.flatbuffers.Titan.Model.MorphDataT[] _oData = new me.hydos.trifecta.flatbuffers.Titan.Model.MorphDataT[dataLength()];
    for (int _j = 0; _j < dataLength(); ++_j) {_oData[_j] = (data(_j) != null ? data(_j).unpack() : null);}
    _o.setData(_oData);
    me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaDataT[] _oMetadata = new me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaDataT[metadataLength()];
    for (int _j = 0; _j < metadataLength(); ++_j) {_oMetadata[_j] = (metadata(_j) != null ? metadata(_j).unpack() : null);}
    _o.setMetadata(_oMetadata);
    String _oMorphName = morphName();
    _o.setMorphName(_oMorphName);
  }
  public static int pack(FlatBufferBuilder builder, MorphShapeT _o) {
    if (_o == null) return 0;
    int _data = 0;
    if (_o.getData() != null) {
      int[] __data = new int[_o.getData().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.Model.MorphDataT _e : _o.getData()) { __data[_j] = me.hydos.trifecta.flatbuffers.Titan.Model.MorphData.pack(builder, _e); _j++;}
      _data = createDataVector(builder, __data);
    }
    int _metadata = 0;
    if (_o.getMetadata() != null) {
      int[] __metadata = new int[_o.getMetadata().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaDataT _e : _o.getMetadata()) { __metadata[_j] = me.hydos.trifecta.flatbuffers.Titan.Model.MorphMetaData.pack(builder, _e); _j++;}
      _metadata = createMetadataVector(builder, __metadata);
    }
    int _morphName = _o.getMorphName() == null ? 0 : builder.createString(_o.getMorphName());
    return createMorphShape(
      builder,
      _data,
      _metadata,
      _morphName);
  }
}

