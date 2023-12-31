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
public final class ti_FieldPokemonComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static ti_FieldPokemonComponent getRootAsti_FieldPokemonComponent(ByteBuffer _bb) { return getRootAsti_FieldPokemonComponent(_bb, new ti_FieldPokemonComponent()); }
  public static ti_FieldPokemonComponent getRootAsti_FieldPokemonComponent(ByteBuffer _bb, ti_FieldPokemonComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ti_FieldPokemonComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long nationalDexId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res2() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createti_FieldPokemonComponent(FlatBufferBuilder builder,
      long nationalDexId,
      long res1,
      long res2,
      long res3,
      long res4) {
    builder.startTable(5);
    ti_FieldPokemonComponent.addRes4(builder, res4);
    ti_FieldPokemonComponent.addRes3(builder, res3);
    ti_FieldPokemonComponent.addRes2(builder, res2);
    ti_FieldPokemonComponent.addRes1(builder, res1);
    ti_FieldPokemonComponent.addNationalDexId(builder, nationalDexId);
    return ti_FieldPokemonComponent.endti_FieldPokemonComponent(builder);
  }

  public static void startti_FieldPokemonComponent(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addNationalDexId(FlatBufferBuilder builder, long nationalDexId) { builder.addInt(0, (int) nationalDexId, (int) 0L); }
  public static void addRes1(FlatBufferBuilder builder, long res1) { builder.addInt(1, (int) res1, (int) 0L); }
  public static void addRes2(FlatBufferBuilder builder, long res2) { builder.addInt(2, (int) res2, (int) 0L); }
  public static void addRes3(FlatBufferBuilder builder, long res3) { builder.addInt(3, (int) res3, (int) 0L); }
  public static void addRes4(FlatBufferBuilder builder, long res4) { builder.addInt(4, (int) res4, (int) 0L); }
  public static int endti_FieldPokemonComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishti_FieldPokemonComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedti_FieldPokemonComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ti_FieldPokemonComponent get(int j) { return get(new ti_FieldPokemonComponent(), j); }
    public ti_FieldPokemonComponent get(ti_FieldPokemonComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ti_FieldPokemonComponentT unpack() {
    ti_FieldPokemonComponentT _o = new ti_FieldPokemonComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ti_FieldPokemonComponentT _o) {
    long _oNationalDexId = nationalDexId();
    _o.setNationalDexId(_oNationalDexId);
    long _oRes1 = res1();
    _o.setRes1(_oRes1);
    long _oRes2 = res2();
    _o.setRes2(_oRes2);
    long _oRes3 = res3();
    _o.setRes3(_oRes3);
    long _oRes4 = res4();
    _o.setRes4(_oRes4);
  }
  public static int pack(FlatBufferBuilder builder, ti_FieldPokemonComponentT _o) {
    if (_o == null) return 0;
    return createti_FieldPokemonComponent(
      builder,
      _o.getNationalDexId(),
      _o.getRes1(),
      _o.getRes2(),
      _o.getRes3(),
      _o.getRes4());
  }
}

