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

public final class BitmojiKitEventBase extends Message<BitmojiKitEventBase, Builder> {
    public static final ProtoAdapter<BitmojiKitEventBase> ADAPTER = new ProtoAdapter_BitmojiKitEventBase();
    public static final String DEFAULT_STICKER_PICKER_SESSION_ID = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sticker_picker_session_id;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitEventBase, Builder> {
        public KitEventBase kit_event_base;
        public String sticker_picker_session_id;

        public Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }

        public Builder sticker_picker_session_id(String str) {
            this.sticker_picker_session_id = str;
            return this;
        }

        public BitmojiKitEventBase build() {
            return new BitmojiKitEventBase(this.kit_event_base, this.sticker_picker_session_id, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_BitmojiKitEventBase extends ProtoAdapter<BitmojiKitEventBase> {
        public ProtoAdapter_BitmojiKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitEventBase.class);
        }

        public BitmojiKitEventBase decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.kit_event_base((KitEventBase) KitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.sticker_picker_session_id((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BitmojiKitEventBase bitmojiKitEventBase) throws IOException {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitEventBase.kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitEventBase.sticker_picker_session_id);
            protoWriter.writeBytes(bitmojiKitEventBase.unknownFields());
        }

        public int encodedSize(BitmojiKitEventBase bitmojiKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitEventBase.kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitEventBase.sticker_picker_session_id) + bitmojiKitEventBase.unknownFields().mo38528g();
        }

        public BitmojiKitEventBase redact(BitmojiKitEventBase bitmojiKitEventBase) {
            Builder newBuilder = bitmojiKitEventBase.newBuilder();
            KitEventBase kitEventBase = newBuilder.kit_event_base;
            if (kitEventBase != null) {
                newBuilder.kit_event_base = (KitEventBase) KitEventBase.ADAPTER.redact(kitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str) {
        this(kitEventBase, str, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitEventBase)) {
            return false;
        }
        BitmojiKitEventBase bitmojiKitEventBase = (BitmojiKitEventBase) obj;
        if (!unknownFields().equals(bitmojiKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, bitmojiKitEventBase.kit_event_base) || !Internal.equals(this.sticker_picker_session_id, bitmojiKitEventBase.sticker_picker_session_id)) {
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
        KitEventBase kitEventBase = this.kit_event_base;
        int i2 = 0;
        int hashCode2 = (hashCode + (kitEventBase != null ? kitEventBase.hashCode() : 0)) * 37;
        String str = this.sticker_picker_session_id;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=");
            sb.append(this.kit_event_base);
        }
        if (this.sticker_picker_session_id != null) {
            sb.append(", sticker_picker_session_id=");
            sb.append(this.sticker_picker_session_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitEventBase{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str, C13346d dVar) {
        super(ADAPTER, dVar);
        this.kit_event_base = kitEventBase;
        this.sticker_picker_session_id = str;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.sticker_picker_session_id = this.sticker_picker_session_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
