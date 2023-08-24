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
public final class trmeshes extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trmeshes getRootAstrmeshes(ByteBuffer _bb) { return getRootAstrmeshes(_bb, new trmeshes()); }
  public static trmeshes getRootAstrmeshes(ByteBuffer _bb, trmeshes obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trmeshes __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filename() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filenameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filenameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createtrmeshes(FlatBufferBuilder builder,
      int filenameOffset) {
    builder.startTable(1);
    trmeshes.addFilename(builder, filenameOffset);
    return trmeshes.endtrmeshes(builder);
  }

  public static void starttrmeshes(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addFilename(FlatBufferBuilder builder, int filenameOffset) { builder.addOffset(0, filenameOffset, 0); }
  public static int endtrmeshes(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trmeshes get(int j) { return get(new trmeshes(), j); }
    public trmeshes get(trmeshes obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trmeshesT unpack() {
    trmeshesT _o = new trmeshesT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trmeshesT _o) {
    String _oFilename = filename();
    _o.setFilename(_oFilename);
  }
  public static int pack(FlatBufferBuilder builder, trmeshesT _o) {
    if (_o == null) return 0;
    int _filename = _o.getFilename() == null ? 0 : builder.createString(_o.getFilename());
    return createtrmeshes(
      builder,
      _filename);
  }
}

