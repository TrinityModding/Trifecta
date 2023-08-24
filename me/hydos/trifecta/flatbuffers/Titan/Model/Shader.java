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
public final class Shader extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Shader getRootAsShader(ByteBuffer _bb) { return getRootAsShader(_bb, new Shader()); }
  public static Shader getRootAsShader(ByteBuffer _bb, Shader obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Shader __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String shaderName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer shaderNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer shaderNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter shaderValues(int j) { return shaderValues(new me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter(), j); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter shaderValues(me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int shaderValuesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter.Vector shaderValuesVector() { return shaderValuesVector(new me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter.Vector()); }
  public me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter.Vector shaderValuesVector(me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createShader(FlatBufferBuilder builder,
      int shaderNameOffset,
      int shaderValuesOffset) {
    builder.startTable(2);
    Shader.addShaderValues(builder, shaderValuesOffset);
    Shader.addShaderName(builder, shaderNameOffset);
    return Shader.endShader(builder);
  }

  public static void startShader(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addShaderName(FlatBufferBuilder builder, int shaderNameOffset) { builder.addOffset(0, shaderNameOffset, 0); }
  public static void addShaderValues(FlatBufferBuilder builder, int shaderValuesOffset) { builder.addOffset(1, shaderValuesOffset, 0); }
  public static int createShaderValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startShaderValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endShader(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Shader get(int j) { return get(new Shader(), j); }
    public Shader get(Shader obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ShaderT unpack() {
    ShaderT _o = new ShaderT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ShaderT _o) {
    String _oShaderName = shaderName();
    _o.setShaderName(_oShaderName);
    me.hydos.trifecta.flatbuffers.Titan.Model.StringParameterT[] _oShaderValues = new me.hydos.trifecta.flatbuffers.Titan.Model.StringParameterT[shaderValuesLength()];
    for (int _j = 0; _j < shaderValuesLength(); ++_j) {_oShaderValues[_j] = (shaderValues(_j) != null ? shaderValues(_j).unpack() : null);}
    _o.setShaderValues(_oShaderValues);
  }
  public static int pack(FlatBufferBuilder builder, ShaderT _o) {
    if (_o == null) return 0;
    int _shaderName = _o.getShaderName() == null ? 0 : builder.createString(_o.getShaderName());
    int _shaderValues = 0;
    if (_o.getShaderValues() != null) {
      int[] __shaderValues = new int[_o.getShaderValues().length];
      int _j = 0;
      for (me.hydos.trifecta.flatbuffers.Titan.Model.StringParameterT _e : _o.getShaderValues()) { __shaderValues[_j] = me.hydos.trifecta.flatbuffers.Titan.Model.StringParameter.pack(builder, _e); _j++;}
      _shaderValues = createShaderValuesVector(builder, __shaderValues);
    }
    return createShader(
      builder,
      _shaderName,
      _shaderValues);
  }
}

