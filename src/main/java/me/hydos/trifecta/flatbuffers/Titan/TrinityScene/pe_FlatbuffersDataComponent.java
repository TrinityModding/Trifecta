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
public final class pe_FlatbuffersDataComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static pe_FlatbuffersDataComponent getRootAspe_FlatbuffersDataComponent(ByteBuffer _bb) { return getRootAspe_FlatbuffersDataComponent(_bb, new pe_FlatbuffersDataComponent()); }
  public static pe_FlatbuffersDataComponent getRootAspe_FlatbuffersDataComponent(ByteBuffer _bb, pe_FlatbuffersDataComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public pe_FlatbuffersDataComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String dataFbs() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dataFbsAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer dataFbsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data unk1(int j) { return unk1(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data unk1(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int unk1Length() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data.Vector unk1Vector() { return unk1Vector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data.Vector unk1Vector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createpe_FlatbuffersDataComponent(FlatBufferBuilder builder,
      int dataFbsOffset,
      int unk1Offset) {
    builder.startTable(2);
    pe_FlatbuffersDataComponent.addUnk1(builder, unk1Offset);
    pe_FlatbuffersDataComponent.addDataFbs(builder, dataFbsOffset);
    return pe_FlatbuffersDataComponent.endpe_FlatbuffersDataComponent(builder);
  }

  public static void startpe_FlatbuffersDataComponent(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addDataFbs(FlatBufferBuilder builder, int dataFbsOffset) { builder.addOffset(0, dataFbsOffset, 0); }
  public static void addUnk1(FlatBufferBuilder builder, int unk1Offset) { builder.addOffset(1, unk1Offset, 0); }
  public static int createUnk1Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk1Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endpe_FlatbuffersDataComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishpe_FlatbuffersDataComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedpe_FlatbuffersDataComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public pe_FlatbuffersDataComponent get(int j) { return get(new pe_FlatbuffersDataComponent(), j); }
    public pe_FlatbuffersDataComponent get(pe_FlatbuffersDataComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public pe_FlatbuffersDataComponentT unpack() {
    pe_FlatbuffersDataComponentT _o = new pe_FlatbuffersDataComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(pe_FlatbuffersDataComponentT _o) {
    String _oDataFbs = dataFbs();
    _o.setDataFbs(_oDataFbs);
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_dataT[] _oUnk1 = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_dataT[unk1Length()];
    for (int _j = 0; _j < unk1Length(); ++_j) {_oUnk1[_j] = (unk1(_j) != null ? unk1(_j).unpack() : null);}
    _o.setUnk1(_oUnk1);
  }
  public static int pack(FlatBufferBuilder builder, pe_FlatbuffersDataComponentT _o) {
    if (_o == null) return 0;
    int _dataFbs = _o.getDataFbs() == null ? 0 : builder.createString(_o.getDataFbs());
    int _unk1 = 0;
    if (_o.getUnk1() != null) {
      int[] __unk1 = new int[_o.getUnk1().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_dataT _e : _o.getUnk1()) { __unk1[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.fbdc_additional_data.pack(builder, _e); _j++;}
      _unk1 = createUnk1Vector(builder, __unk1);
    }
    return createpe_FlatbuffersDataComponent(
      builder,
      _dataFbs,
      _unk1);
  }
}
