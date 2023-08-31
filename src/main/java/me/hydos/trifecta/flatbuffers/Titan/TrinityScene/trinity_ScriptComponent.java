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
public final class trinity_ScriptComponent extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static trinity_ScriptComponent getRootAstrinity_ScriptComponent(ByteBuffer _bb) { return getRootAstrinity_ScriptComponent(_bb, new trinity_ScriptComponent()); }
  public static trinity_ScriptComponent getRootAstrinity_ScriptComponent(ByteBuffer _bb, trinity_ScriptComponent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public trinity_ScriptComponent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String scriptFile() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer scriptFileAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer scriptFileInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String functionHash() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer functionHashAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer functionHashInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public boolean res2() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long res3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean res4() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String className() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer classNameAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer classNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }

  public static int createtrinity_ScriptComponent(FlatBufferBuilder builder,
      int scriptFileOffset,
      int functionHashOffset,
      boolean res2,
      long res3,
      boolean res4,
      int classNameOffset) {
    builder.startTable(6);
    trinity_ScriptComponent.addClassName(builder, classNameOffset);
    trinity_ScriptComponent.addRes3(builder, res3);
    trinity_ScriptComponent.addFunctionHash(builder, functionHashOffset);
    trinity_ScriptComponent.addScriptFile(builder, scriptFileOffset);
    trinity_ScriptComponent.addRes4(builder, res4);
    trinity_ScriptComponent.addRes2(builder, res2);
    return trinity_ScriptComponent.endtrinity_ScriptComponent(builder);
  }

  public static void starttrinity_ScriptComponent(FlatBufferBuilder builder) { builder.startTable(6); }
  public static void addScriptFile(FlatBufferBuilder builder, int scriptFileOffset) { builder.addOffset(0, scriptFileOffset, 0); }
  public static void addFunctionHash(FlatBufferBuilder builder, int functionHashOffset) { builder.addOffset(1, functionHashOffset, 0); }
  public static void addRes2(FlatBufferBuilder builder, boolean res2) { builder.addBoolean(2, res2, false); }
  public static void addRes3(FlatBufferBuilder builder, long res3) { builder.addInt(3, (int) res3, (int) 0L); }
  public static void addRes4(FlatBufferBuilder builder, boolean res4) { builder.addBoolean(4, res4, false); }
  public static void addClassName(FlatBufferBuilder builder, int classNameOffset) { builder.addOffset(5, classNameOffset, 0); }
  public static int endtrinity_ScriptComponent(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishtrinity_ScriptComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedtrinity_ScriptComponentBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public trinity_ScriptComponent get(int j) { return get(new trinity_ScriptComponent(), j); }
    public trinity_ScriptComponent get(trinity_ScriptComponent obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public trinity_ScriptComponentT unpack() {
    trinity_ScriptComponentT _o = new trinity_ScriptComponentT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(trinity_ScriptComponentT _o) {
    String _oScriptFile = scriptFile();
    _o.setScriptFile(_oScriptFile);
    String _oFunctionHash = functionHash();
    _o.setFunctionHash(_oFunctionHash);
    boolean _oRes2 = res2();
    _o.setRes2(_oRes2);
    long _oRes3 = res3();
    _o.setRes3(_oRes3);
    boolean _oRes4 = res4();
    _o.setRes4(_oRes4);
    String _oClassName = className();
    _o.setClassName(_oClassName);
  }
  public static int pack(FlatBufferBuilder builder, trinity_ScriptComponentT _o) {
    if (_o == null) return 0;
    int _scriptFile = _o.getScriptFile() == null ? 0 : builder.createString(_o.getScriptFile());
    int _functionHash = _o.getFunctionHash() == null ? 0 : builder.createString(_o.getFunctionHash());
    int _className = _o.getClassName() == null ? 0 : builder.createString(_o.getClassName());
    return createtrinity_ScriptComponent(
      builder,
      _scriptFile,
      _functionHash,
      _o.getRes2(),
      _o.getRes3(),
      _o.getRes4(),
      _className);
  }
}
