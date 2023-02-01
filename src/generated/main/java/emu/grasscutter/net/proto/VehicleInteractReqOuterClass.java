// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleInteractReq.proto

package emu.grasscutter.net.proto;

public final class VehicleInteractReqOuterClass {
  private VehicleInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VehicleInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VehicleInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pos = 14;</code>
     * @return The pos.
     */
    int getPos();

    /**
     * <code>.VehicleInteractType interactType = 11;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    int getInteractTypeValue();
    /**
     * <code>.VehicleInteractType interactType = 11;</code>
     * @return The interactType.
     */
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType();

    /**
     * <code>uint32 entityId = 13;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code VehicleInteractReq}
   */
  public static final class VehicleInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VehicleInteractReq)
      VehicleInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VehicleInteractReq.newBuilder() to construct.
    private VehicleInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VehicleInteractReq() {
      interactType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VehicleInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.class, emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.Builder.class);
    }

    /**
     * Protobuf enum {@code VehicleInteractReq.HFFFNNLCHDH}
     */
    public enum HFFFNNLCHDH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 888;</code>
       */
      PEPPOHPHJOJ(1, 888),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HFFFNNLCHDH DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final HFFFNNLCHDH EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 888;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 888;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static HFFFNNLCHDH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HFFFNNLCHDH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 888: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HFFFNNLCHDH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HFFFNNLCHDH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HFFFNNLCHDH>() {
              public HFFFNNLCHDH findValueByNumber(int number) {
                return HFFFNNLCHDH.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final HFFFNNLCHDH[] VALUES = getStaticValuesArray();
      private static HFFFNNLCHDH[] getStaticValuesArray() {
        return new HFFFNNLCHDH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static HFFFNNLCHDH valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private HFFFNNLCHDH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:VehicleInteractReq.HFFFNNLCHDH)
    }

    public static final int POS_FIELD_NUMBER = 14;
    private int pos_ = 0;
    /**
     * <code>uint32 pos = 14;</code>
     * @return The pos.
     */
    @java.lang.Override
    public int getPos() {
      return pos_;
    }

    public static final int INTERACTTYPE_FIELD_NUMBER = 11;
    private int interactType_ = 0;
    /**
     * <code>.VehicleInteractType interactType = 11;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.VehicleInteractType interactType = 11;</code>
     * @return The interactType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
      emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.forNumber(interactType_);
      return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
    }

    public static final int ENTITYID_FIELD_NUMBER = 13;
    private int entityId_ = 0;
    /**
     * <code>uint32 entityId = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        output.writeEnum(11, interactType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      if (pos_ != 0) {
        output.writeUInt32(14, pos_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, interactType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
      }
      if (pos_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, pos_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq other = (emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq) obj;

      if (getPos()
          != other.getPos()) return false;
      if (interactType_ != other.interactType_) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos();
      hash = (37 * hash) + INTERACTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + interactType_;
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code VehicleInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VehicleInteractReq)
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.class, emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        pos_ = 0;
        interactType_ = 0;
        entityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.internal_static_VehicleInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq build() {
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq buildPartial() {
        emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq result = new emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pos_ = pos_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.interactType_ = interactType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entityId_ = entityId_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq) {
          return mergeFrom((emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq other) {
        if (other == emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq.getDefaultInstance()) return this;
        if (other.getPos() != 0) {
          setPos(other.getPos());
        }
        if (other.interactType_ != 0) {
          setInteractTypeValue(other.getInteractTypeValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 88: {
                interactType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 104: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
              case 112: {
                pos_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int pos_ ;
      /**
       * <code>uint32 pos = 14;</code>
       * @return The pos.
       */
      @java.lang.Override
      public int getPos() {
        return pos_;
      }
      /**
       * <code>uint32 pos = 14;</code>
       * @param value The pos to set.
       * @return This builder for chaining.
       */
      public Builder setPos(int value) {
        
        pos_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pos_ = 0;
        onChanged();
        return this;
      }

      private int interactType_ = 0;
      /**
       * <code>.VehicleInteractType interactType = 11;</code>
       * @return The enum numeric value on the wire for interactType.
       */
      @java.lang.Override public int getInteractTypeValue() {
        return interactType_;
      }
      /**
       * <code>.VehicleInteractType interactType = 11;</code>
       * @param value The enum numeric value on the wire for interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractTypeValue(int value) {
        interactType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interactType = 11;</code>
       * @return The interactType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
        emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.forNumber(interactType_);
        return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VehicleInteractType interactType = 11;</code>
       * @param value The interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractType(emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        interactType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interactType = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearInteractType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        interactType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VehicleInteractReq)
    }

    // @@protoc_insertion_point(class_scope:VehicleInteractReq)
    private static final emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq();
    }

    public static emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<VehicleInteractReq>() {
      @java.lang.Override
      public VehicleInteractReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<VehicleInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleInteractReqOuterClass.VehicleInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VehicleInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030VehicleInteractReq.proto\032\031VehicleInter" +
      "actType.proto\"\301\001\n\022VehicleInteractReq\022\013\n\003" +
      "pos\030\016 \001(\r\022*\n\014interactType\030\013 \001(\0162\024.Vehicl" +
      "eInteractType\022\020\n\010entityId\030\r \001(\r\"`\n\013HFFFN" +
      "NLCHDH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\370\006\022\017\n\013DC" +
      "DNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGA" +
      "OCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor(),
        });
    internal_static_VehicleInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VehicleInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VehicleInteractReq_descriptor,
        new java.lang.String[] { "Pos", "InteractType", "EntityId", });
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}