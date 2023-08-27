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

public class trinity_ModelComponentT {
  private String modelFilePath;
  private String name;
  private String materialOverrideFilePath;
  private String unk3;
  private boolean unk4;
  private float unk5;
  private float unk6;
  private float unk7;
  private long unk8;
  private float unk9;
  private long unk10;
  private float unk11;
  private String unk12;
  private float unk13;
  private String unk14;
  private float unk15;
  private long unk16;
  private boolean unk17;
  private long unk18;
  private String unk19;
  private String unk20;
  private boolean unk21;
  private String unk22;
  private boolean unk23;

  public String getModelFilePath() { return modelFilePath; }

  public void setModelFilePath(String modelFilePath) { this.modelFilePath = modelFilePath; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getMaterialOverrideFilePath() { return materialOverrideFilePath; }

  public void setMaterialOverrideFilePath(String materialOverrideFilePath) { this.materialOverrideFilePath = materialOverrideFilePath; }

  public String getUnk3() { return unk3; }

  public void setUnk3(String unk3) { this.unk3 = unk3; }

  public boolean getUnk4() { return unk4; }

  public void setUnk4(boolean unk4) { this.unk4 = unk4; }

  public float getUnk5() { return unk5; }

  public void setUnk5(float unk5) { this.unk5 = unk5; }

  public float getUnk6() { return unk6; }

  public void setUnk6(float unk6) { this.unk6 = unk6; }

  public float getUnk7() { return unk7; }

  public void setUnk7(float unk7) { this.unk7 = unk7; }

  public long getUnk8() { return unk8; }

  public void setUnk8(long unk8) { this.unk8 = unk8; }

  public float getUnk9() { return unk9; }

  public void setUnk9(float unk9) { this.unk9 = unk9; }

  public long getUnk10() { return unk10; }

  public void setUnk10(long unk10) { this.unk10 = unk10; }

  public float getUnk11() { return unk11; }

  public void setUnk11(float unk11) { this.unk11 = unk11; }

  public String getUnk12() { return unk12; }

  public void setUnk12(String unk12) { this.unk12 = unk12; }

  public float getUnk13() { return unk13; }

  public void setUnk13(float unk13) { this.unk13 = unk13; }

  public String getUnk14() { return unk14; }

  public void setUnk14(String unk14) { this.unk14 = unk14; }

  public float getUnk15() { return unk15; }

  public void setUnk15(float unk15) { this.unk15 = unk15; }

  public long getUnk16() { return unk16; }

  public void setUnk16(long unk16) { this.unk16 = unk16; }

  public boolean getUnk17() { return unk17; }

  public void setUnk17(boolean unk17) { this.unk17 = unk17; }

  public long getUnk18() { return unk18; }

  public void setUnk18(long unk18) { this.unk18 = unk18; }

  public String getUnk19() { return unk19; }

  public void setUnk19(String unk19) { this.unk19 = unk19; }

  public String getUnk20() { return unk20; }

  public void setUnk20(String unk20) { this.unk20 = unk20; }

  public boolean getUnk21() { return unk21; }

  public void setUnk21(boolean unk21) { this.unk21 = unk21; }

  public String getUnk22() { return unk22; }

  public void setUnk22(String unk22) { this.unk22 = unk22; }

  public boolean getUnk23() { return unk23; }

  public void setUnk23(boolean unk23) { this.unk23 = unk23; }


  public trinity_ModelComponentT() {
    this.modelFilePath = null;
    this.name = null;
    this.materialOverrideFilePath = null;
    this.unk3 = null;
    this.unk4 = false;
    this.unk5 = 0.0f;
    this.unk6 = 0.0f;
    this.unk7 = 0.0f;
    this.unk8 = 0L;
    this.unk9 = 0.0f;
    this.unk10 = 0L;
    this.unk11 = 0.0f;
    this.unk12 = null;
    this.unk13 = 0.0f;
    this.unk14 = null;
    this.unk15 = 0.0f;
    this.unk16 = 0L;
    this.unk17 = true;
    this.unk18 = 0L;
    this.unk19 = null;
    this.unk20 = null;
    this.unk21 = false;
    this.unk22 = null;
    this.unk23 = false;
  }
  public static trinity_ModelComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_ModelComponent.getRootAstrinity_ModelComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_ModelComponent.finishtrinity_ModelComponentBuffer(fbb, trinity_ModelComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

