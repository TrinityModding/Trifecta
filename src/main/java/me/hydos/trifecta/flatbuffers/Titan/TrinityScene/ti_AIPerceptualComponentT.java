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

public class ti_AIPerceptualComponentT {
  private int value;

  public int getValue() { return value; }

  public void setValue(int value) { this.value = value; }


  public ti_AIPerceptualComponentT() {
    this.value = 0;
  }
  public static ti_AIPerceptualComponentT deserializeFromBinary(byte[] fbBuffer) {
    return ti_AIPerceptualComponent.getRootAsti_AIPerceptualComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    ti_AIPerceptualComponent.finishti_AIPerceptualComponentBuffer(fbb, ti_AIPerceptualComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

