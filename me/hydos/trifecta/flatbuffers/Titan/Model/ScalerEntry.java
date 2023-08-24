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
public final class ScalerEntry extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static ScalerEntry getRootAsScalerEntry(ByteBuffer _bb) { return getRootAsScalerEntry(_bb, new ScalerEntry()); }
  public static ScalerEntry getRootAsScalerEntry(ByteBuffer _bb, ScalerEntry obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ScalerEntry __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String slotName(int j) { int o = __offset(6); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int slotNameLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public StringVector slotNameVector() { return slotNameVector(new StringVector()); }
  public StringVector slotNameVector(StringVector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public int unk3() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public float unk4(int j) { int o = __offset(10); return o != 0 ? bb.getFloat(__vector(o) + j * 4) : 0; }
  public int unk4Length() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public FloatVector unk4Vector() { return unk4Vector(new FloatVector()); }
  public FloatVector unk4Vector(FloatVector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer unk4AsByteBuffer() { return __vector_as_bytebuffer(10, 4); }
  public ByteBuffer unk4InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 4); }

  public static int createScalerEntry(FlatBufferBuilder builder,
      int nameOffset,
      int slotNameOffset,
      int unk3,
      int unk4Offset) {
    builder.startTable(4);
    ScalerEntry.addUnk4(builder, unk4Offset);
    ScalerEntry.addSlotName(builder, slotNameOffset);
    ScalerEntry.addName(builder, nameOffset);
    ScalerEntry.addUnk3(builder, unk3);
    return ScalerEntry.endScalerEntry(builder);
  }

  public static void startScalerEntry(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addSlotName(FlatBufferBuilder builder, int slotNameOffset) { builder.addOffset(1, slotNameOffset, 0); }
  public static int createSlotNameVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSlotNameVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk3(FlatBufferBuilder builder, int unk3) { builder.addByte(2, (byte) unk3, (byte) 0); }
  public static void addUnk4(FlatBufferBuilder builder, int unk4Offset) { builder.addOffset(3, unk4Offset, 0); }
  public static int createUnk4Vector(FlatBufferBuilder builder, float[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addFloat(data[i]); return builder.endVector(); }
  public static void startUnk4Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endScalerEntry(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ScalerEntry get(int j) { return get(new ScalerEntry(), j); }
    public ScalerEntry get(ScalerEntry obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ScalerEntryT unpack() {
    ScalerEntryT _o = new ScalerEntryT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ScalerEntryT _o) {
    String _oName = name();
    _o.setName(_oName);
    String[] _oSlotName = new String[slotNameLength()];
    for (int _j = 0; _j < slotNameLength(); ++_j) {_oSlotName[_j] = slotName(_j);}
    _o.setSlotName(_oSlotName);
    int _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    float[] _oUnk4 = new float[unk4Length()];
    for (int _j = 0; _j < unk4Length(); ++_j) {_oUnk4[_j] = unk4(_j);}
    _o.setUnk4(_oUnk4);
  }
  public static int pack(FlatBufferBuilder builder, ScalerEntryT _o) {
    if (_o == null) return 0;
    int _name = _o.getName() == null ? 0 : builder.createString(_o.getName());
    int _slotName = 0;
    if (_o.getSlotName() != null) {
      int[] __slotName = new int[_o.getSlotName().length];
      int _j = 0;
      for (String _e : _o.getSlotName()) { __slotName[_j] = builder.createString(_e); _j++;}
      _slotName = createSlotNameVector(builder, __slotName);
    }
    int _unk4 = 0;
    if (_o.getUnk4() != null) {
      _unk4 = createUnk4Vector(builder, _o.getUnk4());
    }
    return createScalerEntry(
      builder,
      _name,
      _slotName,
      _o.getUnk3(),
      _unk4);
  }
}

