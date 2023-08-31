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
public final class ti_PokemonModelComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static ti_PokemonModelComponent getRootAsti_PokemonModelComponent(ByteBuffer _bb) { return getRootAsti_PokemonModelComponent(_bb, new ti_PokemonModelComponent()); }
  public static ti_PokemonModelComponent getRootAsti_PokemonModelComponent(ByteBuffer _bb, ti_PokemonModelComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ti_PokemonModelComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int nationalDexId() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public int formId() { int o = __offset(6); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public boolean res2() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long res3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public float res5() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public long res6() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res7() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean res8() { int o = __offset(20); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createti_PokemonModelComponent(FlatBufferBuilder builder,
      int nationalDexId,
      int formId,
      boolean res2,
      long res3,
      long res4,
      float res5,
      long res6,
      long res7,
      boolean res8) {
    builder.startTable(9);
    ti_PokemonModelComponent.addRes7(builder, res7);
    ti_PokemonModelComponent.addRes6(builder, res6);
    ti_PokemonModelComponent.addRes5(builder, res5);
    ti_PokemonModelComponent.addRes4(builder, res4);
    ti_PokemonModelComponent.addRes3(builder, res3);
    ti_PokemonModelComponent.addFormId(builder, formId);
    ti_PokemonModelComponent.addNationalDexId(builder, nationalDexId);
    ti_PokemonModelComponent.addRes8(builder, res8);
    ti_PokemonModelComponent.addRes2(builder, res2);
    return ti_PokemonModelComponent.endti_PokemonModelComponent(builder);
  }

  public static void startti_PokemonModelComponent(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addNationalDexId(FlatBufferBuilder builder, int nationalDexId) { builder.addShort(0, (short) nationalDexId, (short) 0); }
  public static void addFormId(FlatBufferBuilder builder, int formId) { builder.addShort(1, (short) formId, (short) 0); }
  public static void addRes2(FlatBufferBuilder builder, boolean res2) { builder.addBoolean(2, res2, false); }
  public static void addRes3(FlatBufferBuilder builder, long res3) { builder.addInt(3, (int) res3, (int) 0L); }
  public static void addRes4(FlatBufferBuilder builder, long res4) { builder.addInt(4, (int) res4, (int) 0L); }
  public static void addRes5(FlatBufferBuilder builder, float res5) { builder.addFloat(5, res5, 0.0f); }
  public static void addRes6(FlatBufferBuilder builder, long res6) { builder.addInt(6, (int) res6, (int) 0L); }
  public static void addRes7(FlatBufferBuilder builder, long res7) { builder.addInt(7, (int) res7, (int) 0L); }
  public static void addRes8(FlatBufferBuilder builder, boolean res8) { builder.addBoolean(8, res8, false); }
  public static int endti_PokemonModelComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishti_PokemonModelComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedti_PokemonModelComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ti_PokemonModelComponent get(int j) { return get(new ti_PokemonModelComponent(), j); }
    public ti_PokemonModelComponent get(ti_PokemonModelComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ti_PokemonModelComponentT unpack() {
    ti_PokemonModelComponentT _o = new ti_PokemonModelComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ti_PokemonModelComponentT _o) {
    int _oNationalDexId = nationalDexId();
    _o.setNationalDexId(_oNationalDexId);
    int _oFormId = formId();
    _o.setFormId(_oFormId);
    boolean _oRes2 = res2();
    _o.setRes2(_oRes2);
    long _oRes3 = res3();
    _o.setRes3(_oRes3);
    long _oRes4 = res4();
    _o.setRes4(_oRes4);
    float _oRes5 = res5();
    _o.setRes5(_oRes5);
    long _oRes6 = res6();
    _o.setRes6(_oRes6);
    long _oRes7 = res7();
    _o.setRes7(_oRes7);
    boolean _oRes8 = res8();
    _o.setRes8(_oRes8);
  }
  public static int pack(FlatBufferBuilder builder, ti_PokemonModelComponentT _o) {
    if (_o == null) return 0;
    return createti_PokemonModelComponent(
      builder,
      _o.getNationalDexId(),
      _o.getFormId(),
      _o.getRes2(),
      _o.getRes3(),
      _o.getRes4(),
      _o.getRes5(),
      _o.getRes6(),
      _o.getRes7(),
      _o.getRes8());
  }
}
