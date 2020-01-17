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

public final class CreativeKitEventBase extends Message<CreativeKitEventBase, Builder> {
    public static final ProtoAdapter<CreativeKitEventBase> ADAPTER = new ProtoAdapter_CreativeKitEventBase();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<CreativeKitEventBase, Builder> {
        public KitEventBase kit_event_base;

        public Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }

        public CreativeKitEventBase build() {
            return new CreativeKitEventBase(this.kit_event_base, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_CreativeKitEventBase extends ProtoAdapter<CreativeKitEventBase> {
        public ProtoAdapter_CreativeKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitEventBase.class);
        }

        public CreativeKitEventBase decode(ProtoReader protoReader) throws IOException {
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
                    builder.kit_event_base((KitEventBase) KitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CreativeKitEventBase creativeKitEventBase) throws IOException {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitEventBase.kit_event_base);
            protoWriter.writeBytes(creativeKitEventBase.unknownFields());
        }

        public int encodedSize(CreativeKitEventBase creativeKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitEventBase.kit_event_base) + creativeKitEventBase.unknownFields().mo38528g();
        }

        public CreativeKitEventBase redact(CreativeKitEventBase creativeKitEventBase) {
            Builder newBuilder = creativeKitEventBase.newBuilder();
            KitEventBase kitEventBase = newBuilder.kit_event_base;
            if (kitEventBase != null) {
                newBuilder.kit_event_base = (KitEventBase) KitEventBase.ADAPTER.redact(kitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public CreativeKitEventBase(KitEventBase kitEventBase) {
        this(kitEventBase, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitEventBase)) {
            return false;
        }
        CreativeKitEventBase creativeKitEventBase = (CreativeKitEventBase) obj;
        if (!unknownFields().equals(creativeKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, creativeKitEventBase.kit_event_base)) {
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
        int hashCode2 = hashCode + (kitEventBase != null ? kitEventBase.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=");
            sb.append(this.kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "CreativeKitEventBase{");
        replace.append('}');
        return replace.toString();
    }

    public CreativeKitEventBase(KitEventBase kitEventBase, C13346d dVar) {
        super(ADAPTER, dVar);
        this.kit_event_base = kitEventBase;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
