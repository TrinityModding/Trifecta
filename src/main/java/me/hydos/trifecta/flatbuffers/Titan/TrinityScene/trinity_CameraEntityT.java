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

public class trinity_CameraEntityT {
  private String cameraName;
  private long res1;
  private me.hydos.trifecta.flatbuffers.Vec3fT unk2;
  private me.hydos.trifecta.flatbuffers.Vec3fT unk3;
  private float unk4;
  private float unk5;
  private float unk6;
  private float unk7;
  private long res8;
  private int unk9;
  private String unk10;
  private long res11;
  private long res12;
  private int res13;

  public String getCameraName() { return cameraName; }

  public void setCameraName(String cameraName) { this.cameraName = cameraName; }

  public long getRes1() { return res1; }

  public void setRes1(long res1) { this.res1 = res1; }

  public me.hydos.trifecta.flatbuffers.Vec3fT getUnk2() { return unk2; }

  public void setUnk2(me.hydos.trifecta.flatbuffers.Vec3fT unk2) { this.unk2 = unk2; }

  public me.hydos.trifecta.flatbuffers.Vec3fT getUnk3() { return unk3; }

  public void setUnk3(me.hydos.trifecta.flatbuffers.Vec3fT unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }

  public float getUnk5() { return unk5; }

  public void setUnk5(float unk5) { this.unk5 = unk5; }

  public float getUnk6() { return unk6; }

  public void setUnk6(float unk6) { this.unk6 = unk6; }

  public float getUnk7() { return unk7; }

  public void setUnk7(float unk7) { this.unk7 = unk7; }

  public long getRes8() { return res8; }

  public void setRes8(long res8) { this.res8 = res8; }

  public int getUnk9() { return unk9; }

  public void setUnk9(int unk9) { this.unk9 = unk9; }

  public String getUnk10() { return unk10; }

  public void setUnk10(String unk10) { this.unk10 = unk10; }

  public long getRes11() { return res11; }

  public void setRes11(long res11) { this.res11 = res11; }

  public long getRes12() { return res12; }

  public void setRes12(long res12) { this.res12 = res12; }

  public int getRes13() { return res13; }

  public void setRes13(int res13) { this.res13 = res13; }


  public trinity_CameraEntityT() {
    this.cameraName = null;
    this.res1 = 0L;
    this.unk2 = new me.hydos.trifecta.flatbuffers.Vec3fT();
    this.unk3 = new me.hydos.trifecta.flatbuffers.Vec3fT();
    this.unk4 = 0.0f;
    this.unk5 = 0.0f;
    this.unk6 = 0.0f;
    this.unk7 = 0.0f;
    this.res8 = 0L;
    this.unk9 = 0;
    this.unk10 = null;
    this.res11 = 0L;
    this.res12 = 0L;
    this.res13 = 0;
  }
  public static trinity_CameraEntityT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_CameraEntity.getRootAstrinity_CameraEntity(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_CameraEntity.finishtrinity_CameraEntityBuffer(fbb, trinity_CameraEntity.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

