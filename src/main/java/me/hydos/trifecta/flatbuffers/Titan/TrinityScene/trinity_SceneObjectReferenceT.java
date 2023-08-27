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

public class trinity_SceneObjectReferenceT {
  private String referencedObject;
  private me.hydos.trifecta.flatbuffers.SRTT srt;

  public String getReferencedObject() { return referencedObject; }

  public void setReferencedObject(String referencedObject) { this.referencedObject = referencedObject; }

  public me.hydos.trifecta.flatbuffers.SRTT getSrt() { return srt; }

  public void setSrt(me.hydos.trifecta.flatbuffers.SRTT srt) { this.srt = srt; }


  public trinity_SceneObjectReferenceT() {
    this.referencedObject = null;
    this.srt = null;
  }
  public static trinity_SceneObjectReferenceT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_SceneObjectReference.getRootAstrinity_SceneObjectReference(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_SceneObjectReference.finishtrinity_SceneObjectReferenceBuffer(fbb, trinity_SceneObjectReference.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

