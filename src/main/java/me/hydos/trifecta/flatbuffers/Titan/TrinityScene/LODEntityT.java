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

public class LODEntityT {
  private String trmdlFilePath;
  private String tracnFilePath;
  private String hash;

  public String getTrmdlFilePath() { return trmdlFilePath; }

  public void setTrmdlFilePath(String trmdlFilePath) { this.trmdlFilePath = trmdlFilePath; }

  public String getTracnFilePath() { return tracnFilePath; }

  public void setTracnFilePath(String tracnFilePath) { this.tracnFilePath = tracnFilePath; }

  public String getHash() { return hash; }

  public void setHash(String hash) { this.hash = hash; }


  public LODEntityT() {
    this.trmdlFilePath = null;
    this.tracnFilePath = null;
    this.hash = null;
  }
}

