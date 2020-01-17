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

public final class CreativeKitShareComplete extends Message<CreativeKitShareComplete, Builder> {
    public static final ProtoAdapter<CreativeKitShareComplete> ADAPTER = new ProtoAdapter_CreativeKitShareComplete();
    public static final Boolean DEFAULT_IS_SUCCESS = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase#ADAPTER", tag = 1)
    public final CreativeKitEventBase creative_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_success;

    public static final class Builder extends com.squareup.wire.Message.Builder<CreativeKitShareComplete, Builder> {
        public CreativeKitEventBase creative_kit_event_base;
        public Boolean is_success;

        public Builder creative_kit_event_base(CreativeKitEventBase creativeKitEventBase) {
            this.creative_kit_event_base = creativeKitEventBase;
            return this;
        }

        public Builder is_success(Boolean bool) {
            this.is_success = bool;
            return this;
        }

        public CreativeKitShareComplete build() {
            return new CreativeKitShareComplete(this.creative_kit_event_base, this.is_success, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_CreativeKitShareComplete extends ProtoAdapter<CreativeKitShareComplete> {
        public ProtoAdapter_CreativeKitShareComplete() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitShareComplete.class);
        }

        public CreativeKitShareComplete decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.creative_kit_event_base((CreativeKitEventBase) CreativeKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_success((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CreativeKitShareComplete creativeKitShareComplete) throws IOException {
            CreativeKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitShareComplete.creative_kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, creativeKitShareComplete.is_success);
            protoWriter.writeBytes(creativeKitShareComplete.unknownFields());
        }

        public int encodedSize(CreativeKitShareComplete creativeKitShareComplete) {
            return CreativeKitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitShareComplete.creative_kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, creativeKitShareComplete.is_success) + creativeKitShareComplete.unknownFields().mo38528g();
        }

        public CreativeKitShareComplete redact(CreativeKitShareComplete creativeKitShareComplete) {
            Builder newBuilder = creativeKitShareComplete.newBuilder();
            CreativeKitEventBase creativeKitEventBase = newBuilder.creative_kit_event_base;
            if (creativeKitEventBase != null) {
                newBuilder.creative_kit_event_base = (CreativeKitEventBase) CreativeKitEventBase.ADAPTER.redact(creativeKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool) {
        this(creativeKitEventBase, bool, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitShareComplete)) {
            return false;
        }
        CreativeKitShareComplete creativeKitShareComplete = (CreativeKitShareComplete) obj;
        if (!unknownFields().equals(creativeKitShareComplete.unknownFields()) || !Internal.equals(this.creative_kit_event_base, creativeKitShareComplete.creative_kit_event_base) || !Internal.equals(this.is_success, creativeKitShareComplete.is_success)) {
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
        CreativeKitEventBase creativeKitEventBase = this.creative_kit_event_base;
        int i2 = 0;
        int hashCode2 = (hashCode + (creativeKitEventBase != null ? creativeKitEventBase.hashCode() : 0)) * 37;
        Boolean bool = this.is_success;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_event_base != null) {
            sb.append(", creative_kit_event_base=");
            sb.append(this.creative_kit_event_base);
        }
        if (this.is_success != null) {
            sb.append(", is_success=");
            sb.append(this.is_success);
        }
        StringBuilder replace = sb.replace(0, 2, "CreativeKitShareComplete{");
        replace.append('}');
        return replace.toString();
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool, C13346d dVar) {
        super(ADAPTER, dVar);
        this.creative_kit_event_base = creativeKitEventBase;
        this.is_success = bool;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_event_base = this.creative_kit_event_base;
        builder.is_success = this.is_success;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
