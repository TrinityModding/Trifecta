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

public class ti_EnvSoundComponentT {
  private String name;

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }


  public ti_EnvSoundComponentT() {
    this.name = null;
  }
  public static ti_EnvSoundComponentT deserializeFromBinary(byte[] fbBuffer) {
    return ti_EnvSoundComponent.getRootAsti_EnvSoundComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    ti_EnvSoundComponent.finishti_EnvSoundComponentBuffer(fbb, ti_EnvSoundComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}
