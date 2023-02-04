// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestCreateEntityReq.proto

package emu.grasscutter.net.proto;

public final class QuestCreateEntityReqOuterClass {
  private QuestCreateEntityReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestCreateEntityReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestCreateEntityReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_id = 14;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     * @return The entity.
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();

    /**
     * <code>uint32 quest_id = 5;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>bool is_rewind = 11;</code>
     * @return The isRewind.
     */
    boolean getIsRewind();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 457;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QuestCreateEntityReq}
   */
  public static final class QuestCreateEntityReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestCreateEntityReq)
      QuestCreateEntityReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestCreateEntityReq.newBuilder() to construct.
    private QuestCreateEntityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestCreateEntityReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestCreateEntityReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestCreateEntityReq(
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
            case 26: {
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ = input.readMessage(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              questId_ = input.readUInt32();
              break;
            }
            case 88: {

              isRewind_ = input.readBool();
              break;
            }
            case 112: {

              parentQuestId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 14;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 14;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int ENTITY_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     * @return The entity.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return getEntity();
    }

    public static final int QUEST_ID_FIELD_NUMBER = 5;
    private int questId_;
    /**
     * <code>uint32 quest_id = 5;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int IS_REWIND_FIELD_NUMBER = 11;
    private boolean isRewind_;
    /**
     * <code>bool is_rewind = 11;</code>
     * @return The isRewind.
     */
    @java.lang.Override
    public boolean getIsRewind() {
      return isRewind_;
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
      if (entity_ != null) {
        output.writeMessage(3, getEntity());
      }
      if (questId_ != 0) {
        output.writeUInt32(5, questId_);
      }
      if (isRewind_ != false) {
        output.writeBool(11, isRewind_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(14, parentQuestId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getEntity());
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, questId_);
      }
      if (isRewind_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isRewind_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other = (emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
      }
      if (getQuestId()
          != other.getQuestId()) return false;
      if (getIsRewind()
          != other.getIsRewind()) return false;
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
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + IS_REWIND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRewind());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 457;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QuestCreateEntityReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestCreateEntityReq)
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.newBuilder()
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
        parentQuestId_ = 0;

        if (entityBuilder_ == null) {
          entity_ = null;
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }
        questId_ = 0;

        isRewind_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq build() {
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq buildPartial() {
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = new emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq(this);
        result.parentQuestId_ = parentQuestId_;
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        result.questId_ = questId_;
        result.isRewind_ = isRewind_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other) {
        if (other == emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getIsRewind() != false) {
          setIsRewind(other.getIsRewind());
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
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 14;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 14;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return entityBuilder_ != null || entity_ != null;
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       * @return The entity.
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public Builder setEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
          onChanged();
        } else {
          entityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public Builder setEntity(
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
          onChanged();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public Builder mergeEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (entity_ != null) {
            entity_ =
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.newBuilder(entity_).mergeFrom(value).buildPartial();
          } else {
            entity_ = value;
          }
          onChanged();
        } else {
          entityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = null;
          onChanged();
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 5;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 5;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRewind_ ;
      /**
       * <code>bool is_rewind = 11;</code>
       * @return The isRewind.
       */
      @java.lang.Override
      public boolean getIsRewind() {
        return isRewind_;
      }
      /**
       * <code>bool is_rewind = 11;</code>
       * @param value The isRewind to set.
       * @return This builder for chaining.
       */
      public Builder setIsRewind(boolean value) {
        
        isRewind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_rewind = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRewind() {
        
        isRewind_ = false;
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


      // @@protoc_insertion_point(builder_scope:QuestCreateEntityReq)
    }

    // @@protoc_insertion_point(class_scope:QuestCreateEntityReq)
    private static final emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq();
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestCreateEntityReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestCreateEntityReq>() {
      @java.lang.Override
      public QuestCreateEntityReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestCreateEntityReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestCreateEntityReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestCreateEntityReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestCreateEntityReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestCreateEntityReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestCreateEntityReq.proto\032\026CreateEnti" +
      "tyInfo.proto\"w\n\024QuestCreateEntityReq\022\027\n\017" +
      "parent_quest_id\030\016 \001(\r\022!\n\006entity\030\003 \001(\0132\021." +
      "CreateEntityInfo\022\020\n\010quest_id\030\005 \001(\r\022\021\n\tis" +
      "_rewind\030\013 \001(\010B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_QuestCreateEntityReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestCreateEntityReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestCreateEntityReq_descriptor,
        new java.lang.String[] { "ParentQuestId", "Entity", "QuestId", "IsRewind", });
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
