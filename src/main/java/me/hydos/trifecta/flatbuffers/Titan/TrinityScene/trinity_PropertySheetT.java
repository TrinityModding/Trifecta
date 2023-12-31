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

public class trinity_PropertySheetT {
  private String name;
  private String template;
  private me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT[] entries;

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getTemplate() { return template; }

  public void setTemplate(String template) { this.template = template; }

  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT[] getEntries() { return entries; }

  public void setEntries(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.EntryT[] entries) { this.entries = entries; }


  public trinity_PropertySheetT() {
    this.name = null;
    this.template = null;
    this.entries = null;
  }
  public static trinity_PropertySheetT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_PropertySheet.getRootAstrinity_PropertySheet(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_PropertySheet.finishtrinity_PropertySheetBuffer(fbb, trinity_PropertySheet.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

