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

public class trinity_ObjectTemplateT {
  private String objectName;
  private String templateName;
  private String filePath;
  private boolean unk3;
  private String objectType;
  private int[] objectBytes;

  public String getObjectName() { return objectName; }

  public void setObjectName(String objectName) { this.objectName = objectName; }

  public String getTemplateName() { return templateName; }

  public void setTemplateName(String templateName) { this.templateName = templateName; }

  public String getFilePath() { return filePath; }

  public void setFilePath(String filePath) { this.filePath = filePath; }

  public boolean getUnk3() { return unk3; }

  public void setUnk3(boolean unk3) { this.unk3 = unk3; }

  public String getObjectType() { return objectType; }

  public void setObjectType(String objectType) { this.objectType = objectType; }

  public int[] getObjectBytes() { return objectBytes; }

  public void setObjectBytes(int[] objectBytes) { this.objectBytes = objectBytes; }


  public trinity_ObjectTemplateT() {
    this.objectName = null;
    this.templateName = null;
    this.filePath = null;
    this.unk3 = false;
    this.objectType = null;
    this.objectBytes = null;
  }
  public static trinity_ObjectTemplateT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_ObjectTemplate.getRootAstrinity_ObjectTemplate(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_ObjectTemplate.finishtrinity_ObjectTemplateBuffer(fbb, trinity_ObjectTemplate.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

