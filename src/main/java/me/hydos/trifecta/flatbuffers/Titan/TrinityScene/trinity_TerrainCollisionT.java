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

public class trinity_TerrainCollisionT {
  private String filePath;
  private long unk1;
  private long unk2;

  public String getFilePath() { return filePath; }

  public void setFilePath(String filePath) { this.filePath = filePath; }

  public long getUnk1() { return unk1; }

  public void setUnk1(long unk1) { this.unk1 = unk1; }

  public long getUnk2() { return unk2; }

  public void setUnk2(long unk2) { this.unk2 = unk2; }


  public trinity_TerrainCollisionT() {
    this.filePath = null;
    this.unk1 = 0L;
    this.unk2 = 0L;
  }
  public static trinity_TerrainCollisionT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_TerrainCollision.getRootAstrinity_TerrainCollision(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_TerrainCollision.finishtrinity_TerrainCollisionBuffer(fbb, trinity_TerrainCollision.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

