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
public final class someTable extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static someTable getRootAssomeTable(ByteBuffer _bb) { return getRootAssomeTable(_bb, new someTable()); }
  public static someTable getRootAssomeTable(ByteBuffer _bb, someTable obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public someTable __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int unk0() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable2 unk1() { return unk1(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable2()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable2 unk1(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable2 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unkStruct0xc unk2() { return unk2(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unkStruct0xc()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unkStruct0xc unk2(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unkStruct0xc obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float unk3() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public int unk4() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public float unk5() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public int unk6() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public long unk7() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long unk9(int j) { int o = __offset(22); return o != 0 ? (long)bb.getInt(__vector(o) + j * 4) & 0xFFFFFFFFL : 0; }
  public int unk9Length() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public IntVector unk9Vector() { return unk9Vector(new IntVector()); }
  public IntVector unk9Vector(IntVector obj) { int o = __offset(22); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer unk9AsByteBuffer() { return __vector_as_bytebuffer(22, 4); }
  public ByteBuffer unk9InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 4); }

  public static void startsomeTable(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addUnk0(FlatBufferBuilder builder, int unk0) { builder.addByte(0, (byte) unk0, (byte) 0); }
  public static void addUnk1(FlatBufferBuilder builder, int unk1Offset) { builder.addOffset(1, unk1Offset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, int unk2Offset) { builder.addStruct(2, unk2Offset, 0); }
  public static void addUnk3(FlatBufferBuilder builder, float unk3) { builder.addFloat(3, unk3, 0.0f); }
  public static void addUnk4(FlatBufferBuilder builder, int unk4) { builder.addByte(4, (byte) unk4, (byte) 0); }
  public static void addUnk5(FlatBufferBuilder builder, float unk5) { builder.addFloat(5, unk5, 0.0f); }
  public static void addUnk6(FlatBufferBuilder builder, int unk6) { builder.addByte(6, (byte) unk6, (byte) 0); }
  public static void addUnk7(FlatBufferBuilder builder, long unk7) { builder.addInt(7, (int) unk7, (int) 0L); }
  public static void addRes8(FlatBufferBuilder builder, long res8) { builder.addInt(8, (int) res8, (int) 0L); }
  public static void addUnk9(FlatBufferBuilder builder, int unk9Offset) { builder.addOffset(9, unk9Offset, 0); }
  public static int createUnk9Vector(FlatBufferBuilder builder, long[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt((int) data[i]); return builder.endVector(); }
  public static void startUnk9Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endsomeTable(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public someTable get(int j) { return get(new someTable(), j); }
    public someTable get(someTable obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public someTableT unpack() {
    someTableT _o = new someTableT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(someTableT _o) {
    int _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    if (unk1() != null) _o.setUnk1(unk1().unpack());
    else _o.setUnk1(null);
    if (unk2() != null) unk2().unpackTo(_o.getUnk2());
    else _o.setUnk2(null);
    float _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    int _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
    float _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
    int _oUnk6 = unk6();
    _o.setUnk6(_oUnk6);
    long _oUnk7 = unk7();
    _o.setUnk7(_oUnk7);
    long _oRes8 = res8();
    _o.setRes8(_oRes8);
    long[] _oUnk9 = new long[unk9Length()];
    for (int _j = 0; _j < unk9Length(); ++_j) {_oUnk9[_j] = unk9(_j);}
    _o.setUnk9(_oUnk9);
  }
  public static int pack(FlatBufferBuilder builder, someTableT _o) {
    if (_o == null) return 0;
    int _unk1 = _o.getUnk1() == null ? 0 : me.hydos.trifecta.flatbuffers.Titan.TrinityScene.someTable2.pack(builder, _o.getUnk1());
    int _unk9 = 0;
    if (_o.getUnk9() != null) {
      _unk9 = createUnk9Vector(builder, _o.getUnk9());
    }
    startsomeTable(builder);
    addUnk0(builder, _o.getUnk0());
    addUnk1(builder, _unk1);
    addUnk2(builder, me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unkStruct0xc.pack(builder, _o.getUnk2()));
    addUnk3(builder, _o.getUnk3());
    addUnk4(builder, _o.getUnk4());
    addUnk5(builder, _o.getUnk5());
    addUnk6(builder, _o.getUnk6());
    addUnk7(builder, _o.getUnk7());
    addRes8(builder, _o.getRes8());
    addUnk9(builder, _unk9);
    return endsomeTable(builder);
  }
}

