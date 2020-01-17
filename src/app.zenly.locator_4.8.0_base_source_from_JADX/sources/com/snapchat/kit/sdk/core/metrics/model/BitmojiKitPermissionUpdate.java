package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.C13346d;

public final class BitmojiKitPermissionUpdate extends Message<BitmojiKitPermissionUpdate, Builder> {
    public static final ProtoAdapter<BitmojiKitPermissionUpdate> ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdate();
    public static final BitmojiKitPermissionUpdateStatus DEFAULT_STATUS = BitmojiKitPermissionUpdateStatus.UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdateStatus#ADAPTER", tag = 2)
    public final BitmojiKitPermissionUpdateStatus status;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitPermissionUpdate, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitPermissionUpdateStatus status;

        public Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public Builder status(BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
            this.status = bitmojiKitPermissionUpdateStatus;
            return this;
        }

        public BitmojiKitPermissionUpdate build() {
            return new BitmojiKitPermissionUpdate(this.bitmoji_kit_event_base, this.status, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_BitmojiKitPermissionUpdate extends ProtoAdapter<BitmojiKitPermissionUpdate> {
        public ProtoAdapter_BitmojiKitPermissionUpdate() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitPermissionUpdate.class);
        }

        public BitmojiKitPermissionUpdate decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base((BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.status((BitmojiKitPermissionUpdateStatus) BitmojiKitPermissionUpdateStatus.ADAPTER.decode(protoReader));
                    } catch (EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base);
            BitmojiKitPermissionUpdateStatus.ADAPTER.encodeWithTag(protoWriter, 2, bitmojiKitPermissionUpdate.status);
            protoWriter.writeBytes(bitmojiKitPermissionUpdate.unknownFields());
        }

        public int encodedSize(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) + BitmojiKitPermissionUpdateStatus.ADAPTER.encodedSizeWithTag(2, bitmojiKitPermissionUpdate.status) + bitmojiKitPermissionUpdate.unknownFields().mo38528g();
        }

        public BitmojiKitPermissionUpdate redact(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            Builder newBuilder = bitmojiKitPermissionUpdate.newBuilder();
            BitmojiKitEventBase bitmojiKitEventBase = newBuilder.bitmoji_kit_event_base;
            if (bitmojiKitEventBase != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(bitmojiKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
        this(bitmojiKitEventBase, bitmojiKitPermissionUpdateStatus, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitPermissionUpdate)) {
            return false;
        }
        BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = (BitmojiKitPermissionUpdate) obj;
        if (!unknownFields().equals(bitmojiKitPermissionUpdate.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) || !Internal.equals(this.status, bitmojiKitPermissionUpdate.status)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        int i2 = 0;
        int hashCode2 = (hashCode + (bitmojiKitEventBase != null ? bitmojiKitEventBase.hashCode() : 0)) * 37;
        BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus = this.status;
        if (bitmojiKitPermissionUpdateStatus != null) {
            i2 = bitmojiKitPermissionUpdateStatus.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitPermissionUpdate{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus, C13346d dVar) {
        super(ADAPTER, dVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.status = bitmojiKitPermissionUpdateStatus;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
