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
public final class pe_TextComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static pe_TextComponent getRootAspe_TextComponent(ByteBuffer _bb) { return getRootAspe_TextComponent(_bb, new pe_TextComponent()); }
  public static pe_TextComponent getRootAspe_TextComponent(ByteBuffer _bb, pe_TextComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public pe_TextComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filepath() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filepathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filepathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createpe_TextComponent(FlatBufferBuilder builder,
      int filepathOffset) {
    builder.startTable(1);
    pe_TextComponent.addFilepath(builder, filepathOffset);
    return pe_TextComponent.endpe_TextComponent(builder);
  }

  public static void startpe_TextComponent(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addFilepath(FlatBufferBuilder builder, int filepathOffset) { builder.addOffset(0, filepathOffset, 0); }
  public static int endpe_TextComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishpe_TextComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedpe_TextComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public pe_TextComponent get(int j) { return get(new pe_TextComponent(), j); }
    public pe_TextComponent get(pe_TextComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public pe_TextComponentT unpack() {
    pe_TextComponentT _o = new pe_TextComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(pe_TextComponentT _o) {
    String _oFilepath = filepath();
    _o.setFilepath(_oFilepath);
  }
  public static int pack(FlatBufferBuilder builder, pe_TextComponentT _o) {
    if (_o == null) return 0;
    int _filepath = _o.getFilepath() == null ? 0 : builder.createString(_o.getFilepath());
    return createpe_TextComponent(
      builder,
      _filepath);
  }
}

