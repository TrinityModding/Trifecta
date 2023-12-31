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
public final class trinity_PropertySheet extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_PropertySheet getRootAstrinity_PropertySheet(ByteBuffer _bb) { return getRootAstrinity_PropertySheet(_bb, new trinity_PropertySheet()); }
  public static trinity_PropertySheet getRootAstrinity_PropertySheet(ByteBuffer _bb, trinity_PropertySheet obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_PropertySheet __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String template() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer templateAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer templateInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry entries(int j) { return entries(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry entries(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int entriesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry.Vector entriesVector() { return entriesVector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry.Vector entriesVector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createtrinity_PropertySheet(FlatBufferBuilder builder,
      int nameOffset,
      int templateOffset,
      int entriesOffset) {
    builder.startTable(3);
    trinity_PropertySheet.addEntries(builder, entriesOffset);
    trinity_PropertySheet.addTemplate(builder, templateOffset);
    trinity_PropertySheet.addName(builder, nameOffset);
    return trinity_PropertySheet.endtrinity_PropertySheet(builder);
  }

  public static void starttrinity_PropertySheet(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addTemplate(FlatBufferBuilder builder, int templateOffset) { builder.addOffset(1, templateOffset, 0); }
  public static void addEntries(FlatBufferBuilder builder, int entriesOffset) { builder.addOffset(2, entriesOffset, 0); }
  public static int createEntriesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEntriesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endtrinity_PropertySheet(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_PropertySheetBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_PropertySheetBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_PropertySheet get(int j) { return get(new trinity_PropertySheet(), j); }
    public trinity_PropertySheet get(trinity_PropertySheet obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_PropertySheetT unpack() {
    trinity_PropertySheetT _o = new trinity_PropertySheetT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_PropertySheetT _o) {
    String _oName = name();
    _o.setName(_oName);
    String _oTemplate = template();
    _o.setTemplate(_oTemplate);
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT[] _oEntries = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT[entriesLength()];
    for (int _j = 0; _j < entriesLength(); ++_j) {_oEntries[_j] = (entries(_j) != null ? entries(_j).unpack() : null);}
    _o.setEntries(_oEntries);
  }
  public static int pack(FlatBufferBuilder builder, trinity_PropertySheetT _o) {
    if (_o == null) return 0;
    int _name = _o.getName() == null ? 0 : builder.createString(_o.getName());
    int _template = _o.getTemplate() == null ? 0 : builder.createString(_o.getTemplate());
    int _entries = 0;
    if (_o.getEntries() != null) {
      int[] __entries = new int[_o.getEntries().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT _e : _o.getEntries()) { __entries[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Entry.pack(builder, _e); _j++;}
      _entries = createEntriesVector(builder, __entries);
    }
    return createtrinity_PropertySheet(
      builder,
      _name,
      _template,
      _entries);
  }
}

