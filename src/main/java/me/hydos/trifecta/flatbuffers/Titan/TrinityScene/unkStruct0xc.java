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
public final class unkStruct0xc extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public unkStruct0xc __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float unk0() { return bb.getFloat(bb_pos + 0); }
  public float unk1() { return bb.getFloat(bb_pos + 4); }
  public float unk2() { return bb.getFloat(bb_pos + 8); }
  public float unk3() { return bb.getFloat(bb_pos + 12); }

  public static int createunkStruct0xc(FlatBufferBuilder builder, float unk0, float unk1, float unk2, float unk3) {
    builder.prep(4, 16);
    builder.putFloat(unk3);
    builder.putFloat(unk2);
    builder.putFloat(unk1);
    builder.putFloat(unk0);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public unkStruct0xc get(int j) { return get(new unkStruct0xc(), j); }
    public unkStruct0xc get(unkStruct0xc obj, int j) {  return obj.__assign(__element(j), bb); }
  }
  public unkStruct0xcT unpack() {
    unkStruct0xcT _o = new unkStruct0xcT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(unkStruct0xcT _o) {
    float _oUnk0 = unk0();
    _o.setUnk0(_oUnk0);
    float _oUnk1 = unk1();
    _o.setUnk1(_oUnk1);
    float _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    float _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
  }
  public static int pack(FlatBufferBuilder builder, unkStruct0xcT _o) {
    if (_o == null) return 0;
    return createunkStruct0xc(
      builder,
      _o.getUnk0(),
      _o.getUnk1(),
      _o.getUnk2(),
      _o.getUnk3());
  }
}
