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

public class trinity_TextureBufferComponentT {
  private long unk0;

  public long getUnk0() { return unk0; }

  public void setUnk0(long unk0) { this.unk0 = unk0; }


  public trinity_TextureBufferComponentT() {
    this.unk0 = 0L;
  }
  public static trinity_TextureBufferComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_TextureBufferComponent.getRootAstrinity_TextureBufferComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_TextureBufferComponent.finishtrinity_TextureBufferComponentBuffer(fbb, trinity_TextureBufferComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

