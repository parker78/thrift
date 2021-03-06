/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.iflytek.tts;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField STR_FIELD_DESC = new org.apache.thrift.protocol.TField("str", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_FILE_FIELD_DESC = new org.apache.thrift.protocol.TField("isFile", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField OUTPUT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("outputPath", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  public String str; // required
  public boolean isFile; // required
  public String outputPath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STR((short)2, "str"),
    IS_FILE((short)1, "isFile"),
    OUTPUT_PATH((short)3, "outputPath");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // STR
          return STR;
        case 1: // IS_FILE
          return IS_FILE;
        case 3: // OUTPUT_PATH
          return OUTPUT_PATH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISFILE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STR, new org.apache.thrift.meta_data.FieldMetaData("str", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_FILE, new org.apache.thrift.meta_data.FieldMetaData("isFile", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.OUTPUT_PATH, new org.apache.thrift.meta_data.FieldMetaData("outputPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    String str,
    boolean isFile,
    String outputPath)
  {
    this();
    this.str = str;
    this.isFile = isFile;
    setIsFileIsSet(true);
    this.outputPath = outputPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStr()) {
      this.str = other.str;
    }
    this.isFile = other.isFile;
    if (other.isSetOutputPath()) {
      this.outputPath = other.outputPath;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    this.str = null;
    setIsFileIsSet(false);
    this.isFile = false;
    this.outputPath = null;
  }

  public String getStr() {
    return this.str;
  }

  public Request setStr(String str) {
    this.str = str;
    return this;
  }

  public void unsetStr() {
    this.str = null;
  }

  /** Returns true if field str is set (has been assigned a value) and false otherwise */
  public boolean isSetStr() {
    return this.str != null;
  }

  public void setStrIsSet(boolean value) {
    if (!value) {
      this.str = null;
    }
  }

  public boolean isIsFile() {
    return this.isFile;
  }

  public Request setIsFile(boolean isFile) {
    this.isFile = isFile;
    setIsFileIsSet(true);
    return this;
  }

  public void unsetIsFile() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISFILE_ISSET_ID);
  }

  /** Returns true if field isFile is set (has been assigned a value) and false otherwise */
  public boolean isSetIsFile() {
    return EncodingUtils.testBit(__isset_bitfield, __ISFILE_ISSET_ID);
  }

  public void setIsFileIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISFILE_ISSET_ID, value);
  }

  public String getOutputPath() {
    return this.outputPath;
  }

  public Request setOutputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

  public void unsetOutputPath() {
    this.outputPath = null;
  }

  /** Returns true if field outputPath is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputPath() {
    return this.outputPath != null;
  }

  public void setOutputPathIsSet(boolean value) {
    if (!value) {
      this.outputPath = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STR:
      if (value == null) {
        unsetStr();
      } else {
        setStr((String)value);
      }
      break;

    case IS_FILE:
      if (value == null) {
        unsetIsFile();
      } else {
        setIsFile((Boolean)value);
      }
      break;

    case OUTPUT_PATH:
      if (value == null) {
        unsetOutputPath();
      } else {
        setOutputPath((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STR:
      return getStr();

    case IS_FILE:
      return Boolean.valueOf(isIsFile());

    case OUTPUT_PATH:
      return getOutputPath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STR:
      return isSetStr();
    case IS_FILE:
      return isSetIsFile();
    case OUTPUT_PATH:
      return isSetOutputPath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;

    boolean this_present_str = true && this.isSetStr();
    boolean that_present_str = true && that.isSetStr();
    if (this_present_str || that_present_str) {
      if (!(this_present_str && that_present_str))
        return false;
      if (!this.str.equals(that.str))
        return false;
    }

    boolean this_present_isFile = true;
    boolean that_present_isFile = true;
    if (this_present_isFile || that_present_isFile) {
      if (!(this_present_isFile && that_present_isFile))
        return false;
      if (this.isFile != that.isFile)
        return false;
    }

    boolean this_present_outputPath = true && this.isSetOutputPath();
    boolean that_present_outputPath = true && that.isSetOutputPath();
    if (this_present_outputPath || that_present_outputPath) {
      if (!(this_present_outputPath && that_present_outputPath))
        return false;
      if (!this.outputPath.equals(that.outputPath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Request typedOther = (Request)other;

    lastComparison = Boolean.valueOf(isSetStr()).compareTo(typedOther.isSetStr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str, typedOther.str);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsFile()).compareTo(typedOther.isSetIsFile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsFile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isFile, typedOther.isFile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutputPath()).compareTo(typedOther.isSetOutputPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputPath, typedOther.outputPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;

    sb.append("str:");
    if (this.str == null) {
      sb.append("null");
    } else {
      sb.append(this.str);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isFile:");
    sb.append(this.isFile);
    first = false;
    if (!first) sb.append(", ");
    sb.append("outputPath:");
    if (this.outputPath == null) {
      sb.append("null");
    } else {
      sb.append(this.outputPath);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (str == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'str' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'isFile' because it's a primitive and you chose the non-beans generator.
    if (outputPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'outputPath' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestStandardSchemeFactory implements SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // STR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str = iprot.readString();
              struct.setStrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 1: // IS_FILE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isFile = iprot.readBool();
              struct.setIsFileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTPUT_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.outputPath = iprot.readString();
              struct.setOutputPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIsFile()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isFile' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_FILE_FIELD_DESC);
      oprot.writeBool(struct.isFile);
      oprot.writeFieldEnd();
      if (struct.str != null) {
        oprot.writeFieldBegin(STR_FIELD_DESC);
        oprot.writeString(struct.str);
        oprot.writeFieldEnd();
      }
      if (struct.outputPath != null) {
        oprot.writeFieldBegin(OUTPUT_PATH_FIELD_DESC);
        oprot.writeString(struct.outputPath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.str);
      oprot.writeBool(struct.isFile);
      oprot.writeString(struct.outputPath);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.str = iprot.readString();
      struct.setStrIsSet(true);
      struct.isFile = iprot.readBool();
      struct.setIsFileIsSet(true);
      struct.outputPath = iprot.readString();
      struct.setOutputPathIsSet(true);
    }
  }

}

