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

public class trinity_LayoutComponentT {
  private String filePath;
  private String layoutFileName;
  private long unk2;
  private boolean unk3;
  private String componentName;

  public String getFilePath() { return filePath; }

  public void setFilePath(String filePath) { this.filePath = filePath; }

  public String getLayoutFileName() { return layoutFileName; }

  public void setLayoutFileName(String layoutFileName) { this.layoutFileName = layoutFileName; }

  public long getUnk2() { return unk2; }

  public void setUnk2(long unk2) { this.unk2 = unk2; }

  public boolean getUnk3() { return unk3; }

  public void setUnk3(boolean unk3) { this.unk3 = unk3; }

  public String getComponentName() { return componentName; }

  public void setComponentName(String componentName) { this.componentName = componentName; }


  public trinity_LayoutComponentT() {
    this.filePath = null;
    this.layoutFileName = null;
    this.unk2 = 0L;
    this.unk3 = false;
    this.componentName = null;
  }
  public static trinity_LayoutComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_LayoutComponent.getRootAstrinity_LayoutComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_LayoutComponent.finishtrinity_LayoutComponentBuffer(fbb, trinity_LayoutComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

