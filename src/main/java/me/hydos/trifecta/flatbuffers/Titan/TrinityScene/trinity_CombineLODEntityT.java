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

public class trinity_CombineLODEntityT {
  private String unk0;
  private long unk1;
  private String[] unk2;
  private me.hydos.trifecta.flatbuffers.Vec3fT unk3;
  private float unk4;
  private float unk5;
  private long unk6;
  private long unk7;
  private me.hydos.trifecta.flatbuffers.Titan.TrinityScene.LODEntityT[] unk8;

  public String getUnk0() { return unk0; }

  public void setUnk0(String unk0) { this.unk0 = unk0; }

  public long getUnk1() { return unk1; }

  public void setUnk1(long unk1) { this.unk1 = unk1; }

  public String[] getUnk2() { return unk2; }

  public void setUnk2(String[] unk2) { this.unk2 = unk2; }

  public me.hydos.trifecta.flatbuffers.Vec3fT getUnk3() { return unk3; }

  public void setUnk3(me.hydos.trifecta.flatbuffers.Vec3fT unk3) { this.unk3 = unk3; }

  public float getUnk4() { return unk4; }

  public void setUnk4(float unk4) { this.unk4 = unk4; }

  public float getUnk5() { return unk5; }

  public void setUnk5(float unk5) { this.unk5 = unk5; }

  public long getUnk6() { return unk6; }

  public void setUnk6(long unk6) { this.unk6 = unk6; }

  public long getUnk7() { return unk7; }

  public void setUnk7(long unk7) { this.unk7 = unk7; }

  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.LODEntityT[] getUnk8() { return unk8; }

  public void setUnk8(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.LODEntityT[] unk8) { this.unk8 = unk8; }


  public trinity_CombineLODEntityT() {
    this.unk0 = null;
    this.unk1 = 0L;
    this.unk2 = null;
    this.unk3 = new me.hydos.trifecta.flatbuffers.Vec3fT();
    this.unk4 = 0.0f;
    this.unk5 = 0.0f;
    this.unk6 = 0L;
    this.unk7 = 0L;
    this.unk8 = null;
  }
  public static trinity_CombineLODEntityT deserializeFromBinary(byte[] fbBuffer) {
    return trinity_CombineLODEntity.getRootAstrinity_CombineLODEntity(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    trinity_CombineLODEntity.finishtrinity_CombineLODEntityBuffer(fbb, trinity_CombineLODEntity.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}

