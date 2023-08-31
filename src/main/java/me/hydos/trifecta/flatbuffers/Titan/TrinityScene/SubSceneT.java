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

public class SubSceneT {
  private String filePath;
  private String res1;

  public String getFilePath() { return filePath; }

  public void setFilePath(String filePath) { this.filePath = filePath; }

  public String getRes1() { return res1; }

  public void setRes1(String res1) { this.res1 = res1; }


  public SubSceneT() {
    this.filePath = null;
    this.res1 = null;
  }
  public static SubSceneT deserializeFromBinary(byte[] fbBuffer) {
    return SubScene.getRootAsSubScene(ByteBuffer.wrap(fbBuffer)).unpack();
  }
  public byte[] serializeToBinary() {
    FlatBufferBuilder fbb = new FlatBufferBuilder();
    SubScene.finishSubSceneBuffer(fbb, SubScene.pack(fbb, this));
    return fbb.sizedByteArray();
  }
}
