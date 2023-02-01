// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDeckSaveReq.proto

package emu.grasscutter.net.proto;

public final class GCGDSDeckSaveReqOuterClass {
  private GCGDSDeckSaveReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeckSaveReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeckSaveReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isValid = 7;</code>
     * @return The isValid.
     */
    boolean getIsValid();

    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    java.lang.String getCreateTime();
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    com.google.protobuf.ByteString
        getCreateTimeBytes();

    /**
     * <code>uint32 rewardIndex = 5;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();
  }
  /**
   * <pre>
   *enum IOLDDAGKLEA {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7769;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGDSDeckSaveReq}
   */
  public static final class GCGDSDeckSaveReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDeckSaveReq)
      GCGDSDeckSaveReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDeckSaveReq.newBuilder() to construct.
    private GCGDSDeckSaveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDeckSaveReq() {
      createTime_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDeckSaveReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDeckSaveReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              createTime_ = s;
              break;
            }
            case 40: {

              rewardIndex_ = input.readUInt32();
              break;
            }
            case 56: {

              isValid_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.class, emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.Builder.class);
    }

    public static final int ISVALID_FIELD_NUMBER = 7;
    private boolean isValid_;
    /**
     * <code>bool isValid = 7;</code>
     * @return The isValid.
     */
    @java.lang.Override
    public boolean getIsValid() {
      return isValid_;
    }

    public static final int CREATETIME_FIELD_NUMBER = 1;
    private volatile java.lang.Object createTime_;
    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      }
    }
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REWARDINDEX_FIELD_NUMBER = 5;
    private int rewardIndex_;
    /**
     * <code>uint32 rewardIndex = 5;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      return rewardIndex_;
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
      if (!getCreateTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, createTime_);
      }
      if (rewardIndex_ != 0) {
        output.writeUInt32(5, rewardIndex_);
      }
      if (isValid_ != false) {
        output.writeBool(7, isValid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getCreateTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, createTime_);
      }
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, rewardIndex_);
      }
      if (isValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isValid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq other = (emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq) obj;

      if (getIsValid()
          != other.getIsValid()) return false;
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
      if (getRewardIndex()
          != other.getRewardIndex()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ISVALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsValid());
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      hash = (37 * hash) + REWARDINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq prototype) {
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
     * <pre>
     *enum IOLDDAGKLEA {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7769;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGDSDeckSaveReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeckSaveReq)
        emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.class, emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isValid_ = false;

        createTime_ = "";

        rewardIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq build() {
        emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq buildPartial() {
        emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq result = new emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq(this);
        result.isValid_ = isValid_;
        result.createTime_ = createTime_;
        result.rewardIndex_ = rewardIndex_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq other) {
        if (other == emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.getDefaultInstance()) return this;
        if (other.getIsValid() != false) {
          setIsValid(other.getIsValid());
        }
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
          onChanged();
        }
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isValid_ ;
      /**
       * <code>bool isValid = 7;</code>
       * @return The isValid.
       */
      @java.lang.Override
      public boolean getIsValid() {
        return isValid_;
      }
      /**
       * <code>bool isValid = 7;</code>
       * @param value The isValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsValid(boolean value) {
        
        isValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isValid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsValid() {
        
        isValid_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object createTime_ = "";
      /**
       * <code>string createTime = 1;</code>
       * @return The createTime.
       */
      public java.lang.String getCreateTime() {
        java.lang.Object ref = createTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          createTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @return The bytes for createTime.
       */
      public com.google.protobuf.ByteString
          getCreateTimeBytes() {
        java.lang.Object ref = createTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          createTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = getDefaultInstance().getCreateTime();
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The bytes for createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        createTime_ = value;
        onChanged();
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 rewardIndex = 5;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
      public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 rewardIndex = 5;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rewardIndex = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSDeckSaveReq)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeckSaveReq)
    private static final emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq();
    }

    public static emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeckSaveReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDeckSaveReq>() {
      @java.lang.Override
      public GCGDSDeckSaveReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSDeckSaveReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSDeckSaveReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDeckSaveReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDeckSaveReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeckSaveReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGDSDeckSaveReq.proto\"L\n\020GCGDSDeckSav" +
      "eReq\022\017\n\007isValid\030\007 \001(\010\022\022\n\ncreateTime\030\001 \001(" +
      "\t\022\023\n\013rewardIndex\030\005 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSDeckSaveReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDeckSaveReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeckSaveReq_descriptor,
        new java.lang.String[] { "IsValid", "CreateTime", "RewardIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}