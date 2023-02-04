// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurnitureGalleryScoreNotify.proto

package emu.grasscutter.net.proto;

public final class HomeSeekFurnitureGalleryScoreNotifyOuterClass {
  private HomeSeekFurnitureGalleryScoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSeekFurnitureGalleryScoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurnitureGalleryScoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 galleryId = 2;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.GalleryStopReason reason = 9;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 9;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     * @return Whether the record field is set.
     */
    boolean hasRecord();
    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     * @return The record.
     */
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecord();
    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     */
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordOrBuilder();
  }
  /**
   * Protobuf type {@code HomeSeekFurnitureGalleryScoreNotify}
   */
  public static final class HomeSeekFurnitureGalleryScoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurnitureGalleryScoreNotify)
      HomeSeekFurnitureGalleryScoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSeekFurnitureGalleryScoreNotify.newBuilder() to construct.
    private HomeSeekFurnitureGalleryScoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurnitureGalleryScoreNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurnitureGalleryScoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSeekFurnitureGalleryScoreNotify(
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
            case 16: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder subBuilder = null;
              if (record_ != null) {
                subBuilder = record_.toBuilder();
              }
              record_ = input.readMessage(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(record_);
                record_ = subBuilder.buildPartial();
              }

              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.internal_static_HomeSeekFurnitureGalleryScoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.class, emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeSeekFurnitureGalleryScoreNotify.JJLGLAIDDAN}
     */
    public enum JJLGLAIDDAN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4612;</code>
       */
      PEPPOHPHJOJ(1, 4612),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JJLGLAIDDAN DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4612;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4612;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static JJLGLAIDDAN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JJLGLAIDDAN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4612: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JJLGLAIDDAN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JJLGLAIDDAN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JJLGLAIDDAN>() {
              public JJLGLAIDDAN findValueByNumber(int number) {
                return JJLGLAIDDAN.forNumber(number);
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
        return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final JJLGLAIDDAN[] VALUES = getStaticValuesArray();
      private static JJLGLAIDDAN[] getStaticValuesArray() {
        return new JJLGLAIDDAN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static JJLGLAIDDAN valueOf(
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

      private JJLGLAIDDAN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeSeekFurnitureGalleryScoreNotify.JJLGLAIDDAN)
    }

    public static final int GALLERYID_FIELD_NUMBER = 2;
    private int galleryId_;
    /**
     * <code>uint32 galleryId = 2;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int REASON_FIELD_NUMBER = 9;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 9;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 9;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int RECORD_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord record_;
    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     * @return Whether the record field is set.
     */
    @java.lang.Override
    public boolean hasRecord() {
      return record_ != null;
    }
    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     * @return The record.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecord() {
      return record_ == null ? emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance() : record_;
    }
    /**
     * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordOrBuilder() {
      return getRecord();
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
      if (galleryId_ != 0) {
        output.writeUInt32(2, galleryId_);
      }
      if (record_ != null) {
        output.writeMessage(7, getRecord());
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(9, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, galleryId_);
      }
      if (record_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getRecord());
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify other = (emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (reason_ != other.reason_) return false;
      if (hasRecord() != other.hasRecord()) return false;
      if (hasRecord()) {
        if (!getRecord()
            .equals(other.getRecord())) return false;
      }
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
      hash = (37 * hash) + GALLERYID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      if (hasRecord()) {
        hash = (37 * hash) + RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getRecord().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify prototype) {
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
     * Protobuf type {@code HomeSeekFurnitureGalleryScoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurnitureGalleryScoreNotify)
        emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.internal_static_HomeSeekFurnitureGalleryScoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.class, emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.newBuilder()
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
        galleryId_ = 0;

        reason_ = 0;

        if (recordBuilder_ == null) {
          record_ = null;
        } else {
          record_ = null;
          recordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify build() {
        emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify buildPartial() {
        emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify result = new emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify(this);
        result.galleryId_ = galleryId_;
        result.reason_ = reason_;
        if (recordBuilder_ == null) {
          result.record_ = record_;
        } else {
          result.record_ = recordBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify other) {
        if (other == emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.hasRecord()) {
          mergeRecord(other.getRecord());
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
        emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 galleryId = 2;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 galleryId = 2;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 galleryId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 9;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 9;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 9;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 9;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord record_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> recordBuilder_;
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       * @return Whether the record field is set.
       */
      public boolean hasRecord() {
        return recordBuilder_ != null || record_ != null;
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       * @return The record.
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecord() {
        if (recordBuilder_ == null) {
          return record_ == null ? emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance() : record_;
        } else {
          return recordBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public Builder setRecord(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          record_ = value;
          onChanged();
        } else {
          recordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public Builder setRecord(
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder builderForValue) {
        if (recordBuilder_ == null) {
          record_ = builderForValue.build();
          onChanged();
        } else {
          recordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public Builder mergeRecord(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordBuilder_ == null) {
          if (record_ != null) {
            record_ =
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.newBuilder(record_).mergeFrom(value).buildPartial();
          } else {
            record_ = value;
          }
          onChanged();
        } else {
          recordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public Builder clearRecord() {
        if (recordBuilder_ == null) {
          record_ = null;
          onChanged();
        } else {
          record_ = null;
          recordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder getRecordBuilder() {
        
        onChanged();
        return getRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordOrBuilder() {
        if (recordBuilder_ != null) {
          return recordBuilder_.getMessageOrBuilder();
        } else {
          return record_ == null ?
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance() : record_;
        }
      }
      /**
       * <code>.HomeSeekFurnitureOneRecord record = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
          getRecordFieldBuilder() {
        if (recordBuilder_ == null) {
          recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder>(
                  getRecord(),
                  getParentForChildren(),
                  isClean());
          record_ = null;
        }
        return recordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeSeekFurnitureGalleryScoreNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeSeekFurnitureGalleryScoreNotify)
    private static final emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify();
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSeekFurnitureGalleryScoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeSeekFurnitureGalleryScoreNotify>() {
      @java.lang.Override
      public HomeSeekFurnitureGalleryScoreNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSeekFurnitureGalleryScoreNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSeekFurnitureGalleryScoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSeekFurnitureGalleryScoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureGalleryScoreNotifyOuterClass.HomeSeekFurnitureGalleryScoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureGalleryScoreNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)HomeSeekFurnitureGalleryScoreNotify.pr" +
      "oto\032\027GalleryStopReason.proto\032 HomeSeekFu" +
      "rnitureOneRecord.proto\"\332\001\n#HomeSeekFurni" +
      "tureGalleryScoreNotify\022\021\n\tgalleryId\030\002 \001(" +
      "\r\022\"\n\006reason\030\t \001(\0162\022.GalleryStopReason\022+\n" +
      "\006record\030\007 \001(\0132\033.HomeSeekFurnitureOneReco" +
      "rd\"O\n\013JJLGLAIDDAN\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\204$\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032" +
      "\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.getDescriptor(),
        });
    internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSeekFurnitureGalleryScoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurnitureGalleryScoreNotify_descriptor,
        new java.lang.String[] { "GalleryId", "Reason", "Record", });
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor();
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
