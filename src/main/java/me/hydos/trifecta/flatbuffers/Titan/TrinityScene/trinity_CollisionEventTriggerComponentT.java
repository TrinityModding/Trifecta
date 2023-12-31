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

public class trinity_CollisionEventTriggerComponentT {
  private String unk0;
  private String unk1;
  private long unk2;
  private String unk3;
  private String unk4;
  private long unk5;

  public String getUnk0() { return unk0; }

  public void setUnk0(String unk0) { this.unk0 = unk0; }

  public String getUnk1() { return unk1; }

  public void setUnk1(String unk1) { this.unk1 = unk1; }

  public long getUnk2() { return unk2; }

  public void setUnk2(long unk2) { this.unk2 = unk2; }

  public String getUnk3() { return unk3; }

  public void setUnk3(String unk3) { this.unk3 = unk3; }

  public String getUnk4() { return unk4; }

  public void setUnk4(String unk4) { this.unk4 = unk4; }

  public long getUnk5() { return unk5; }

  public void setUnk5(long unk5) { this.unk5 = unk5; }


  public trinity_CollisionEventTriggerComponentT() {
    this.unk0 = null;
    this.unk1 = null;
    this.unk2 = 0L;
    this.unk3 = null;
    this.unk4 = null;
    this.unk5 = 0L;
  }
  public static trinity_CollisionEventTriggerComponentT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_CollisionEventTriggerComponent.getRootAstrinity_CollisionEventTriggerComponent(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_CollisionEventTriggerComponent.finishtrinity_CollisionEventTriggerComponentBuffer(fbb, trinity_CollisionEventTriggerComponent.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

