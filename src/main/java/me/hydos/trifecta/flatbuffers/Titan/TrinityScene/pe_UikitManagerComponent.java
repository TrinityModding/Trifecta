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
public final class pe_UikitManagerComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static pe_UikitManagerComponent getRootAspe_UikitManagerComponent(ByteBuffer _bb) { return getRootAspe_UikitManagerComponent(_bb, new pe_UikitManagerComponent()); }
  public static pe_UikitManagerComponent getRootAspe_UikitManagerComponent(ByteBuffer _bb, pe_UikitManagerComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public pe_UikitManagerComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String filepath() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filepathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer filepathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long unk1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk2() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1 unk3(int j) { return unk3(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1 unk3(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1 obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int unk3Length() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1.Vector unk3Vector() { return unk3Vector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1.Vector unk3Vector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2 unk4(int j) { return unk4(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2 unk4(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2 obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int unk4Length() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2.Vector unk4Vector() { return unk4Vector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2.Vector unk4Vector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createpe_UikitManagerComponent(FlatBufferBuilder builder,
      int filepathOffset,
      long unk1,
      long unk2,
      int unk3Offset,
      int unk4Offset) {
    builder.startTable(5);
    pe_UikitManagerComponent.addUnk4(builder, unk4Offset);
    pe_UikitManagerComponent.addUnk3(builder, unk3Offset);
    pe_UikitManagerComponent.addUnk2(builder, unk2);
    pe_UikitManagerComponent.addUnk1(builder, unk1);
    pe_UikitManagerComponent.addFilepath(builder, filepathOffset);
    return pe_UikitManagerComponent.endpe_UikitManagerComponent(builder);
  }

  public static void startpe_UikitManagerComponent(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addFilepath(FlatBufferBuilder builder, int filepathOffset) { builder.addOffset(0, filepathOffset, 0); }
  public static void addUnk1(FlatBufferBuilder builder, long unk1) { builder.addInt(1, (int) unk1, (int) 0L); }
  public static void addUnk2(FlatBufferBuilder builder, long unk2) { builder.addInt(2, (int) unk2, (int) 0L); }
  public static void addUnk3(FlatBufferBuilder builder, int unk3Offset) { builder.addOffset(3, unk3Offset, 0); }
  public static int createUnk3Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk3Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk4(FlatBufferBuilder builder, int unk4Offset) { builder.addOffset(4, unk4Offset, 0); }
  public static int createUnk4Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk4Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endpe_UikitManagerComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishpe_UikitManagerComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedpe_UikitManagerComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public pe_UikitManagerComponent get(int j) { return get(new pe_UikitManagerComponent(), j); }
    public pe_UikitManagerComponent get(pe_UikitManagerComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public pe_UikitManagerComponentT unpack() {
    pe_UikitManagerComponentT _o = new pe_UikitManagerComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(pe_UikitManagerComponentT _o) {
    String _oFilepath = filepath();
    _o.setFilepath(_oFilepath);
    long _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    long _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1T[] _oUnk3 = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1T[unk3Length()];
    for (int _j = 0; _j < unk3Length(); ++_j) {_oUnk3[_j] = (unk3(_j) != null ? unk3(_j).unpack() : null);}
    _o.setUnk3(_oUnk3);
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2T[] _oUnk4 = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2T[unk4Length()];
    for (int _j = 0; _j < unk4Length(); ++_j) {_oUnk4[_j] = (unk4(_j) != null ? unk4(_j).unpack() : null);}
    _o.setUnk4(_oUnk4);
  }
  public static int pack(FlatBufferBuilder builder, pe_UikitManagerComponentT _o) {
    if (_o == null) return 0;
    int _filepath = _o.getFilepath() == null ? 0 : builder.createString(_o.getFilepath());
    int _unk3 = 0;
    if (_o.getUnk3() != null) {
      int[] __unk3 = new int[_o.getUnk3().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1T _e : _o.getUnk3()) { __unk3[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_1.pack(builder, _e); _j++;}
      _unk3 = createUnk3Vector(builder, __unk3);
    }
    int _unk4 = 0;
    if (_o.getUnk4() != null) {
      int[] __unk4 = new int[_o.getUnk4().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2T _e : _o.getUnk4()) { __unk4[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.umc_data_2.pack(builder, _e); _j++;}
      _unk4 = createUnk4Vector(builder, __unk4);
    }
    return createpe_UikitManagerComponent(
      builder,
      _filepath,
      _o.getUnk1(),
      _o.getUnk2(),
      _unk3,
      _unk4);
  }
}

