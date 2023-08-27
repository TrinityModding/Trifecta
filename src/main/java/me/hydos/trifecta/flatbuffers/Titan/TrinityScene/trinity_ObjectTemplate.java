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
public final class trinity_ObjectTemplate extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_ObjectTemplate getRootAstrinity_ObjectTemplate(ByteBuffer _bb) { return getRootAstrinity_ObjectTemplate(_bb, new trinity_ObjectTemplate()); }
  public static trinity_ObjectTemplate getRootAstrinity_ObjectTemplate(ByteBuffer _bb, trinity_ObjectTemplate obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_ObjectTemplate __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String objectName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer objectNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer objectNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String templateName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer templateNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer templateNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String filePath() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filePathAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer filePathInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public boolean unk3() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String objectType() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer objectTypeAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer objectTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public int objectBytes(int j) { int o = __offset(14); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int objectBytesLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector objectBytesVector() { return objectBytesVector(new ByteVector()); }
  public ByteVector objectBytesVector(ByteVector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer objectBytesAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer objectBytesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }

  public static int createtrinity_ObjectTemplate(FlatBufferBuilder builder,
      int objectNameOffset,
      int templateNameOffset,
      int filePathOffset,
      boolean unk3,
      int objectTypeOffset,
      int objectBytesOffset) {
    builder.startTable(6);
    trinity_ObjectTemplate.addObjectBytes(builder, objectBytesOffset);
    trinity_ObjectTemplate.addObjectType(builder, objectTypeOffset);
    trinity_ObjectTemplate.addFilePath(builder, filePathOffset);
    trinity_ObjectTemplate.addTemplateName(builder, templateNameOffset);
    trinity_ObjectTemplate.addObjectName(builder, objectNameOffset);
    trinity_ObjectTemplate.addUnk3(builder, unk3);
    return trinity_ObjectTemplate.endtrinity_ObjectTemplate(builder);
  }

  public static void starttrinity_ObjectTemplate(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addObjectName(FlatBufferBuilder builder, int objectNameOffset) { builder.addOffset(0, objectNameOffset, 0); }
  public static void addTemplateName(FlatBufferBuilder builder, int templateNameOffset) { builder.addOffset(1, templateNameOffset, 0); }
  public static void addFilePath(FlatBufferBuilder builder, int filePathOffset) { builder.addOffset(2, filePathOffset, 0); }
  public static void addUnk3(FlatBufferBuilder builder, boolean unk3) { builder.addBoolean(3, unk3, false); }
  public static void addObjectType(FlatBufferBuilder builder, int objectTypeOffset) { builder.addOffset(4, objectTypeOffset, 0); }
  public static void addObjectBytes(FlatBufferBuilder builder, int objectBytesOffset) { builder.addOffset(5, objectBytesOffset, 0); }
  public static int createObjectBytesVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createObjectBytesVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startObjectBytesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endtrinity_ObjectTemplate(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_ObjectTemplateBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_ObjectTemplateBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_ObjectTemplate get(int j) { return get(new trinity_ObjectTemplate(), j); }
    public trinity_ObjectTemplate get(trinity_ObjectTemplate obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_ObjectTemplateT unpack() {
    trinity_ObjectTemplateT _o = new trinity_ObjectTemplateT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_ObjectTemplateT _o) {
    String _oObjectName = objectName();
    _o.setObjectName(_oObjectName);
    String _oTemplateName = templateName();
    _o.setTemplateName(_oTemplateName);
    String _oFilePath = filePath();
    _o.setFilePath(_oFilePath);
    boolean _oUnk3 = unk3();
    _o.setUnk3(_oUnk3);
    String _oObjectType = objectType();
    _o.setObjectType(_oObjectType);
    int[] _oObjectBytes = new int[objectBytesLength()];
    for (int _j = 0; _j < objectBytesLength(); ++_j) {_oObjectBytes[_j] = objectBytes(_j);}
    _o.setObjectBytes(_oObjectBytes);
  }
  public static int pack(FlatBufferBuilder builder, trinity_ObjectTemplateT _o) {
    if (_o == null) return 0;
    int _objectName = _o.getObjectName() == null ? 0 : builder.createString(_o.getObjectName());
    int _templateName = _o.getTemplateName() == null ? 0 : builder.createString(_o.getTemplateName());
    int _filePath = _o.getFilePath() == null ? 0 : builder.createString(_o.getFilePath());
    int _objectType = _o.getObjectType() == null ? 0 : builder.createString(_o.getObjectType());
    int _objectBytes = 0;
    if (_o.getObjectBytes() != null) {
      byte[] __objectBytes = new byte[_o.getObjectBytes().length];
      int _j = 0;
      for (int _e : _o.getObjectBytes()) { __objectBytes[_j] = (byte) _e; _j++;}
      _objectBytes = createObjectBytesVector(builder, __objectBytes);
    }
    return createtrinity_ObjectTemplate(
      builder,
      _objectName,
      _templateName,
      _filePath,
      _o.getUnk3(),
      _objectType,
      _objectBytes);
  }
}

