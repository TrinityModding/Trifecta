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

public class trinity_TerrainStreamingSettingT {
  private float unk0;
  private float unk1;
  private float unk2;
  private float unk3;
  private float unk4;

  public float getUnk0() { return unk0; }

  public void setUnk0(float unk0) { this.unk0 = unk0; }

  public float getUnk1() { return unk1; }

  public void setUnk1(float unk1) { this.unk1 = unk1; }

  public float getUnk2() { return unk2; }

  public void setUnk2(float unk2) { this.unk2 = unk2; }

  public float getUnk3() { return unk3; }

  public void setUnk3(float unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }


  public trinity_TerrainStreamingSettingT() {
    this.unk0 = 0.0f;
    this.unk1 = 0.0f;
    this.unk2 = 0.0f;
    this.unk3 = 0.0f;
    this.unk4 = 0.0f;
  }
  public static trinity_TerrainStreamingSettingT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_TerrainStreamingSetting.getRootAstrinity_TerrainStreamingSetting(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_TerrainStreamingSetting.finishtrinity_TerrainStreamingSettingBuffer(fbb, trinity_TerrainStreamingSetting.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}
