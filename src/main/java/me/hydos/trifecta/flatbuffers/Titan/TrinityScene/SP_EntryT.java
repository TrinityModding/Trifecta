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

public class SP_EntryT {
  private me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_PointT point;
  private me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_ObjectT[] objects;

  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_PointT getPoint() { return point; }

  public void setPoint(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_PointT point) { this.point = point; }

  public me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_ObjectT[] getObjects() { return objects; }

  public void setObjects(me.hydos.trifecta.flatbuffers.Titan.TrinityScene.SP_ObjectT[] objects) { this.objects = objects; }


  public SP_EntryT() {
    this.point = null;
    this.objects = null;
  }
}

