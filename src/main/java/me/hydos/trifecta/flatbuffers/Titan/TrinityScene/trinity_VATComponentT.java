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

public class trinity_VATComponentT {
  private String filePath;

  public String getFilePath() { return filePath; }

  public void setFilePath(String filePath) { this.filePath = filePath; }


  public trinity_VATComponentT() {
    this.filePath = null;
  }
  public static trinity_VATComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_VATComponent.getRootAstrinity_VATComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_VATComponent.finishtrinity_VATComponentBuffer(fbb, trinity_VATComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}
