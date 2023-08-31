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
public final class trinity_SceneObject extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_SceneObject getRootAstrinity_SceneObject(ByteBuffer _bb) { return getRootAstrinity_SceneObject(_bb, new trinity_SceneObject()); }
  public static trinity_SceneObject getRootAstrinity_SceneObject(ByteBuffer _bb, trinity_SceneObject obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_SceneObject __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public me.hydos.trifecta.flatbuffers.SRT srt() { return srt(new me.hydos.trifecta.flatbuffers.SRT()); }
  public me.hydos.trifecta.flatbuffers.SRT srt(me.hydos.trifecta.flatbuffers.SRT obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public boolean unk2() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean unk3() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String unk4() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer unk4AsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer unk4InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public boolean unk5() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long unk6() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data additionalSrtdata(int j) { return additionalSrtdata(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data additionalSrtdata(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int additionalSrtdataLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data.Vector additionalSrtdataVector() { return additionalSrtdataVector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data.Vector additionalSrtdataVector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data.Vector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk8(int j) { int o = __offset(20); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk8Length() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk8Vector() { return unk8Vector(new StringVector()); }
  public StringVector unk8Vector(StringVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unknown_sceneObject_data unk9() { return unk9(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unknown_sceneObject_data()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unknown_sceneObject_data unk9(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unknown_sceneObject_data obj) { int o = __offset(22); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createtrinity_SceneObject(FlatBufferBuilder builder,
      int nameOffset,
      int srtOffset,
      boolean unk2,
      boolean unk3,
      int unk4Offset,
      boolean unk5,
      long unk6,
      int additionalSrtdataOffset,
      int unk8Offset,
      int unk9Offset) {
    builder.startTable(10);
    trinity_SceneObject.addUnk9(builder, unk9Offset);
    trinity_SceneObject.addUnk8(builder, unk8Offset);
    trinity_SceneObject.addAdditionalSrtdata(builder, additionalSrtdataOffset);
    trinity_SceneObject.addUnk6(builder, unk6);
    trinity_SceneObject.addUnk4(builder, unk4Offset);
    trinity_SceneObject.addSrt(builder, srtOffset);
    trinity_SceneObject.addName(builder, nameOffset);
    trinity_SceneObject.addUnk5(builder, unk5);
    trinity_SceneObject.addUnk3(builder, unk3);
    trinity_SceneObject.addUnk2(builder, unk2);
    return trinity_SceneObject.endtrinity_SceneObject(builder);
  }

  public static void starttrinity_SceneObject(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addSrt(FlatBufferBuilder builder, int srtOffset) { builder.addOffset(1, srtOffset, 0); }
  public static void addUnk2(FlatBufferBuilder builder, boolean unk2) { builder.addBoolean(2, unk2, false); }
  public static void addUnk3(FlatBufferBuilder builder, boolean unk3) { builder.addBoolean(3, unk3, false); }
  public static void addUnk4(FlatBufferBuilder builder, int unk4Offset) { builder.addOffset(4, unk4Offset, 0); }
  public static void addUnk5(FlatBufferBuilder builder, boolean unk5) { builder.addBoolean(5, unk5, false); }
  public static void addUnk6(FlatBufferBuilder builder, long unk6) { builder.addInt(6, (int) unk6, (int) 0L); }
  public static void addAdditionalSrtdata(FlatBufferBuilder builder, int additionalSrtdataOffset) { builder.addOffset(7, additionalSrtdataOffset, 0); }
  public static int createAdditionalSrtdataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAdditionalSrtdataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk8(FlatBufferBuilder builder, int unk8Offset) { builder.addOffset(8, unk8Offset, 0); }
  public static int createUnk8Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk8Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk9(FlatBufferBuilder builder, int unk9Offset) { builder.addOffset(9, unk9Offset, 0); }
  public static int endtrinity_SceneObject(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_SceneObjectBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_SceneObjectBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_SceneObject get(int j) { return get(new trinity_SceneObject(), j); }
    public trinity_SceneObject get(trinity_SceneObject obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_SceneObjectT unpack() {
    trinity_SceneObjectT _o = new trinity_SceneObjectT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_SceneObjectT _o) {
    String _oName = name();
    _o.setName(_oName);
    if (srt() != null) _o.setSrt(srt().unpack());
    else _o.setSrt(null);
    boolean _oUnk2 = unk2();
    _o.setUnk2(_oUnk2);
    boolean _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    String _oUnk4 = unk4();
    _o.setUnk4(_oUnk4);
    boolean _oUnk5 = unk5();
    _o.setUnk5(_oUnk5);
    long _oUnk6 = unk6();
    _o.setUnk6(_oUnk6);
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_DataT[] _oAdditionalSrtdata = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_DataT[additionalSrtdataLength()];
    for (int _j = 0; _j < additionalSrtdataLength(); ++_j) {_oAdditionalSrtdata[_j] = (additionalSrtdata(_j) != null ? additionalSrtdata(_j).unpack() : null);}
    _o.setAdditionalSrtdata(_oAdditionalSrtdata);
    String[] _oUnk8 = new String[unk8Length()];
    for (int _j = 0; _j < unk8Length(); ++_j) {_oUnk8[_j] = unk8(_j);}
    _o.setUnk8(_oUnk8);
    if (unk9() != null) _o.setUnk9(unk9().unpack());
    else _o.setUnk9(null);
  }
  public static int pack(FlatBufferBuilder builder, trinity_SceneObjectT _o) {
    if (_o == null) return 0;
    int _name = _o.getName() == null ? 0 : builder.createString(_o.getName());
    int _srt = _o.getSrt() == null ? 0 : me.hydos.trifecta.flatbuffers.SRT.pack(builder, _o.getSrt());
    int _unk4 = _o.getUnk4() == null ? 0 : builder.createString(_o.getUnk4());
    int _additionalSrtdata = 0;
    if (_o.getAdditionalSrtdata() != null) {
      int[] __additionalSrtdata = new int[_o.getAdditionalSrtdata().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_DataT _e : _o.getAdditionalSrtdata()) { __additionalSrtdata[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.additional_SRT_Data.pack(builder, _e); _j++;}
      _additionalSrtdata = createAdditionalSrtdataVector(builder, __additionalSrtdata);
    }
    int _unk8 = 0;
    if (_o.getUnk8() != null) {
      int[] __unk8 = new int[_o.getUnk8().length];
      int _j = 0;
      for (String _e : _o.getUnk8()) { __unk8[_j] = builder.createString(_e); _j++;}
      _unk8 = createUnk8Vector(builder, __unk8);
    }
    int _unk9 = _o.getUnk9() == null ? 0 : me.hydos.trifecta.flatbuffers.Titan.TrinityScene.unknown_sceneObject_data.pack(builder, _o.getUnk9());
    return createtrinity_SceneObject(
      builder,
      _name,
      _srt,
      _o.getUnk2(),
      _o.getUnk3(),
      _unk4,
      _o.getUnk5(),
      _o.getUnk6(),
      _additionalSrtdata,
      _unk8,
      _unk9);
  }
}
