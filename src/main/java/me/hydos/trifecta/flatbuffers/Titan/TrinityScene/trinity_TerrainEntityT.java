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

public class trinity_TerrainEntityT {
  private String name;
  private float filePath;
  private boolean unk2;
  private long unk3;
  private float unk4;
  private String materialLowFilePath;
  private String materialMidFilePath;
  private String materialFilePath;
  private long[] unk8;
  private boolean unk9;
  private float unk10;
  private float unk11;
  private float unk12;
  private String[] unk13;
  private boolean unk14;

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public float getFilePath() { return filePath; }

  public void setFilePath(float filePath) { this.filePath = filePath; }

  public boolean getUnk2() { return unk2; }

  public void setUnk2(boolean unk2) { this.unk2 = unk2; }

  public long getUnk3() { return unk3; }

  public void setUnk3(long unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }

  public String getMaterialLowFilePath() { return materialLowFilePath; }

  public void setMaterialLowFilePath(String materialLowFilePath) { this.materialLowFilePath = materialLowFilePath; }

  public String getMaterialMidFilePath() { return materialMidFilePath; }

  public void setMaterialMidFilePath(String materialMidFilePath) { this.materialMidFilePath = materialMidFilePath; }

  public String getMaterialFilePath() { return materialFilePath; }

  public void setMaterialFilePath(String materialFilePath) { this.materialFilePath = materialFilePath; }

  public long[] getUnk8() { return unk8; }

  public void setUnk8(long[] unk8) { this.unk8 = unk8; }

  public boolean getUnk9() { return unk9; }

  public void setUnk9(boolean unk9) { this.unk9 = unk9; }

  public float getUnk10() { return unk10; }

  public void setUnk10(float unk10) { this.unk10 = unk10; }

  public float getUnk11() { return unk11; }

  public void setUnk11(float unk11) { this.unk11 = unk11; }

  public float getUnk12() { return unk12; }

  public void setUnk12(float unk12) { this.unk12 = unk12; }

  public String[] getUnk13() { return unk13; }

  public void setUnk13(String[] unk13) { this.unk13 = unk13; }

  public boolean getUnk14() { return unk14; }

  public void setUnk14(boolean unk14) { this.unk14 = unk14; }


  public trinity_TerrainEntityT() {
    this.name = null;
    this.filePath = 0.0f;
    this.unk2 = false;
    this.unk3 = 0L;
    this.unk4 = 0.0f;
    this.materialLowFilePath = null;
    this.materialMidFilePath = null;
    this.materialFilePath = null;
    this.unk8 = null;
    this.unk9 = false;
    this.unk10 = 0.0f;
    this.unk11 = 0.0f;
    this.unk12 = 0.0f;
    this.unk13 = null;
    this.unk14 = true;
  }
  public static trinity_TerrainEntityT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_TerrainEntity.getRootAstrinity_TerrainEntity(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_TerrainEntity.finishtrinity_TerrainEntityBuffer(fbb, trinity_TerrainEntity.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

