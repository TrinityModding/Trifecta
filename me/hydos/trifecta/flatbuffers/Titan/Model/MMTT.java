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

public class MMTT {
  private String name;
  private String[] materialName;
  private me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitchesT[] materialSwitches;
  private me.hydos.trifecta.flatbuffers.Titan.Model.MaterialPropertiesT[] materialProperties;

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String[] getMaterialName() { return materialName; }

  public void setMaterialName(String[] materialName) { this.materialName = materialName; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitchesT[] getMaterialSwitches() { return materialSwitches; }

  public void setMaterialSwitches(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialSwitchesT[] materialSwitches) { this.materialSwitches = materialSwitches; }

  public me.hydos.trifecta.flatbuffers.Titan.Model.MaterialPropertiesT[] getMaterialProperties() { return materialProperties; }

  public void setMaterialProperties(me.hydos.trifecta.flatbuffers.Titan.Model.MaterialPropertiesT[] materialProperties) { this.materialProperties = materialProperties; }


  public MMTT() {
    this.name = null;
    this.materialName = null;
    this.materialSwitches = null;
    this.materialProperties = null;
  }
}

