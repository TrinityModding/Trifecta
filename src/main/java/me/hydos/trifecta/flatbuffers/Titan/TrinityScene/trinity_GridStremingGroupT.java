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

public class trinity_GridStremingGroupT {
  private String unk0;
  private boolean unk1;
  private me.hydos.trifecta.flatbuffers.Vec3fT unk2;
  private float[] unk3;
  private int[] unk4;
  private float unk5;
  private float unk6;

  public String getUnk0() { return unk0; }

  public void setUnk0(String unk0) { this.unk0 = unk0; }

  public boolean getUnk1() { return unk1; }

  public void setUnk1(boolean unk1) { this.unk1 = unk1; }

  public me.hydos.trifecta.flatbuffers.Vec3fT getUnk2() { return unk2; }

  public void setUnk2(me.hydos.trifecta.flatbuffers.Vec3fT unk2) { this.unk2 = unk2; }

  public float[] getUnk3() { return unk3; }

  public void setUnk3(float[] unk3) { this.unk3 = unk3; }

  public int[] getUnk4() { return unk4; }

  public void setUnk4(int[] unk4) { this.unk4 = unk4; }

  public float getUnk5() { return unk5; }

  public void setUnk5(float unk5) { this.unk5 = unk5; }

  public float getUnk6() { return unk6; }

  public void setUnk6(float unk6) { this.unk6 = unk6; }


  public trinity_GridStremingGroupT() {
    this.unk0 = null;
    this.unk1 = false;
    this.unk2 = new me.hydos.trifecta.flatbuffers.Vec3fT();
    this.unk3 = null;
    this.unk4 = null;
    this.unk5 = 0.0f;
    this.unk6 = 0.0f;
  }
  public static trinity_GridStremingGroupT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_GridStremingGroup.getRootAstrinity_GridStremingGroup(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_GridStremingGroup.finishtrinity_GridStremingGroupBuffer(fbb, trinity_GridStremingGroup.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}
