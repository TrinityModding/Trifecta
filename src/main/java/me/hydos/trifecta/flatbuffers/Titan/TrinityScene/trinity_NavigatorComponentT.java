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

public class trinity_NavigatorComponentT {
  private String componentName;
  private float unk1;
  private float unk2;
  private float unk3;
  private float unk4;
  private float unk5;
  private float unk6;
  private float unk7;
  private float unk8;
  private float unk9;
  private float unk10;
  private float unk11;
  private float unk12;
  private float unk13;
  private float unk14;
  private float unk15;
  private long unk16;

  public String getComponentName() { return componentName; }

  public void setComponentName(String componentName) { this.componentName = componentName; }

  public float getUnk1() { return unk1; }

  public void setUnk1(float unk1) { this.unk1 = unk1; }

  public float getUnk2() { return unk2; }

  public void setUnk2(float unk2) { this.unk2 = unk2; }

  public float getUnk3() { return unk3; }

  public void setUnk3(float unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }

  public float getUnk5() { return unk5; }

  public void setUnk5(float unk5) { this.unk5 = unk5; }

  public float getUnk6() { return unk6; }

  public void setUnk6(float unk6) { this.unk6 = unk6; }

  public float getUnk7() { return unk7; }

  public void setUnk7(float unk7) { this.unk7 = unk7; }

  public float getUnk8() { return unk8; }

  public void setUnk8(float unk8) { this.unk8 = unk8; }

  public float getUnk9() { return unk9; }

  public void setUnk9(float unk9) { this.unk9 = unk9; }

  public float getUnk10() { return unk10; }

  public void setUnk10(float unk10) { this.unk10 = unk10; }

  public float getUnk11() { return unk11; }

  public void setUnk11(float unk11) { this.unk11 = unk11; }

  public float getUnk12() { return unk12; }

  public void setUnk12(float unk12) { this.unk12 = unk12; }

  public float getUnk13() { return unk13; }

  public void setUnk13(float unk13) { this.unk13 = unk13; }

  public float getUnk14() { return unk14; }

  public void setUnk14(float unk14) { this.unk14 = unk14; }

  public float getUnk15() { return unk15; }

  public void setUnk15(float unk15) { this.unk15 = unk15; }

  public long getUnk16() { return unk16; }

  public void setUnk16(long unk16) { this.unk16 = unk16; }


  public trinity_NavigatorComponentT() {
    this.componentName = null;
    this.unk1 = 0.0f;
    this.unk2 = 0.0f;
    this.unk3 = 0.0f;
    this.unk4 = 0.0f;
    this.unk5 = 0.0f;
    this.unk6 = 0.0f;
    this.unk7 = 0.0f;
    this.unk8 = 0.0f;
    this.unk9 = 0.0f;
    this.unk10 = 0.0f;
    this.unk11 = 0.0f;
    this.unk12 = 0.0f;
    this.unk13 = 0.0f;
    this.unk14 = 0.0f;
    this.unk15 = 0.0f;
    this.unk16 = 0L;
  }
  public static trinity_NavigatorComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_NavigatorComponent.getRootAstrinity_NavigatorComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_NavigatorComponent.finishtrinity_NavigatorComponentBuffer(fbb, trinity_NavigatorComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

