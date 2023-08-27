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
public final class Entry extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Entry getRootAsEntry(ByteBuffer _bb) { return getRootAsEntry(_bb, new Entry()); }
  public static Entry getRootAsEntry(ByteBuffer _bb, Entry obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Entry __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property properties(int j) { return properties(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property properties(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int propertiesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property.Vector propertiesVector() { return propertiesVector(new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property.Vector propertiesVector(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createEntry(FlatBufferBuilder builder,
      int propertiesOffset) {
    builder.startTable(1);
    Entry.addProperties(builder, propertiesOffset);
    return Entry.endEntry(builder);
  }

  public static void startEntry(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addProperties(FlatBufferBuilder builder, int propertiesOffset) { builder.addOffset(0, propertiesOffset, 0); }
  public static int createPropertiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEntry(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Entry get(int j) { return get(new Entry(), j); }
    public Entry get(Entry obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public EntryT unpack() {
    EntryT _o = new EntryT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(EntryT _o) {
    me.hydos.trifecta.flatbuffers.Titan.TrinityScene.PropertyT[] _oProperties = new me.hydos.trifecta.flatbuffers.Titan.TrinityScene.PropertyT[propertiesLength()];
    for (int _j = 0; _j < propertiesLength(); ++_j) {_oProperties[_j] = (properties(_j) != null ? properties(_j).unpack() : null);}
    _o.setProperties(_oProperties);
  }
  public static int pack(FlatBufferBuilder builder, EntryT _o) {
    if (_o == null) return 0;
    int _properties = 0;
    if (_o.getProperties() != null) {
      int[] __properties = new int[_o.getProperties().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.TrinityScene.PropertyT _e : _o.getProperties()) { __properties[_j] = me.hydos.trifecta.flatbuffers.Titan.TrinityScene.Property.pack(builder, _e); _j++;}
      _properties = createPropertiesVector(builder, __properties);
    }
    return createEntry(
      builder,
      _properties);
  }
}

