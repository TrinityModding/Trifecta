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

public class pe_AmbientWindComponentT {
  private String unk0;
  private me.hydos.trifecta.flatbuffers.Vec3fT unk1;
  private float res2;
  private float unk3;
  private float unk4;

  public String getUnk0() { return unk0; }

  public void setUnk0(String unk0) { this.unk0 = unk0; }

  public me.hydos.trifecta.flatbuffers.Vec3fT getUnk1() { return unk1; }

  public void setUnk1(me.hydos.trifecta.flatbuffers.Vec3fT unk1) { this.unk1 = unk1; }

  public float getRes2() { return res2; }

  public void setRes2(float res2) { this.res2 = res2; }

  public float getUnk3() { return unk3; }

  public void setUnk3(float unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }


  public pe_AmbientWindComponentT() {
    this.unk0 = null;
    this.unk1 = new me.hydos.trifecta.flatbuffers.Vec3fT();
    this.res2 = 0.0f;
    this.unk3 = 0.0f;
    this.unk4 = 0.0f;
  }
  public static pe_AmbientWindComponentT deserializeFromBinary(byte[] fbBuffer) {
    return pe_AmbientWindComponent.getRootAspe_AmbientWindComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    pe_AmbientWindComponent.finishpe_AmbientWindComponentBuffer(fbb, pe_AmbientWindComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

