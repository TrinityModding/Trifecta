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

public class trinity_NavmeshComponentT {
  private String navmeshFilePath;
  private String name;
  private boolean unk2;
  private float unk3;

  public String getNavmeshFilePath() { return navmeshFilePath; }

  public void setNavmeshFilePath(String navmeshFilePath) { this.navmeshFilePath = navmeshFilePath; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public boolean getUnk2() { return unk2; }

  public void setUnk2(boolean unk2) { this.unk2 = unk2; }

  public float getUnk3() { return unk3; }

  public void setUnk3(float unk3) { this.unk3 = unk3; }


  public trinity_NavmeshComponentT() {
    this.navmeshFilePath = null;
    this.name = null;
    this.unk2 = false;
    this.unk3 = 0.0f;
  }
  public static trinity_NavmeshComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_NavmeshComponent.getRootAstrinity_NavmeshComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_NavmeshComponent.finishtrinity_NavmeshComponentBuffer(fbb, trinity_NavmeshComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

