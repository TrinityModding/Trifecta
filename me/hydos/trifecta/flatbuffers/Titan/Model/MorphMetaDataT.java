// automatically generated by the FlatBuffers compiler, do not modify

package me.hydos.trifecta.flatbuffers.Titan.Model;

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

public class MorphMetaDataT {
  private long morphIndex;
  private String morphName;
  private int morphType;

  public long getMorphIndex() { return morphIndex; }

  public void setMorphIndex(long morphIndex) { this.morphIndex = morphIndex; }

  public String getMorphName() { return morphName; }

  public void setMorphName(String morphName) { this.morphName = morphName; }

  public int getMorphType() { return morphType; }

  public void setMorphType(int morphType) { this.morphType = morphType; }


  public MorphMetaDataT() {
    this.morphIndex = 0L;
    this.morphName = null;
    this.morphType = 0;
  }
}

