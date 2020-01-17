package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.C13346d;

public final class BitmojiKitCreateAvatarTap extends Message<BitmojiKitCreateAvatarTap, Builder> {
    public static final ProtoAdapter<BitmojiKitCreateAvatarTap> ADAPTER = new ProtoAdapter_BitmojiKitCreateAvatarTap();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitCreateAvatarTap, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;

        public Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public BitmojiKitCreateAvatarTap build() {
            return new BitmojiKitCreateAvatarTap(this.bitmoji_kit_event_base, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_BitmojiKitCreateAvatarTap extends ProtoAdapter<BitmojiKitCreateAvatarTap> {
        public ProtoAdapter_BitmojiKitCreateAvatarTap() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitCreateAvatarTap.class);
        }

        public BitmojiKitCreateAvatarTap decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.bitmoji_kit_event_base((BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base);
            protoWriter.writeBytes(bitmojiKitCreateAvatarTap.unknownFields());
        }

        public int encodedSize(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base) + bitmojiKitCreateAvatarTap.unknownFields().mo38528g();
        }

        public BitmojiKitCreateAvatarTap redact(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            Builder newBuilder = bitmojiKitCreateAvatarTap.newBuilder();
            BitmojiKitEventBase bitmojiKitEventBase = newBuilder.bitmoji_kit_event_base;
            if (bitmojiKitEventBase != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(bitmojiKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public BitmojiKitCreateAvatarTap(BitmojiKitEventBase bitmojiKitEventBase) {
        this(bitmojiKitEventBase, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitCreateAvatarTap)) {
            return false;
        }
        BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = (BitmojiKitCreateAvatarTap) obj;
        if (!unknownFields().equals(bitmojiKitCreateAvatarTap.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base)) {
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
        int hashCode2 = hashCode + (bitmojiKitEventBase != null ? bitmojiKitEventBase.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitCreateAvatarTap{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitCreateAvatarTap(BitmojiKitEventBase bitmojiKitEventBase, C13346d dVar) {
        super(ADAPTER, dVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
