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

public final class LevelMetric extends Message<LevelMetric, Builder> {
    public static final ProtoAdapter<LevelMetric> ADAPTER = new ProtoAdapter_LevelMetric();
    public static final Long DEFAULT_LEVEL = Long.valueOf(0);
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    public static final class Builder extends com.squareup.wire.Message.Builder<LevelMetric, Builder> {
        public Long level;
        public String name;
        public Timestamp timestamp;

        public Builder level(Long l) {
            this.level = l;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder timestamp(Timestamp timestamp2) {
            this.timestamp = timestamp2;
            return this;
        }

        public LevelMetric build() {
            return new LevelMetric(this.name, this.timestamp, this.level, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_LevelMetric extends ProtoAdapter<LevelMetric> {
        public ProtoAdapter_LevelMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, LevelMetric.class);
        }

        public LevelMetric decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.timestamp((Timestamp) Timestamp.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.level((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, LevelMetric levelMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, levelMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, levelMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, levelMetric.level);
            protoWriter.writeBytes(levelMetric.unknownFields());
        }

        public int encodedSize(LevelMetric levelMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, levelMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, levelMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, levelMetric.level) + levelMetric.unknownFields().mo38528g();
        }

        public LevelMetric redact(LevelMetric levelMetric) {
            Builder newBuilder = levelMetric.newBuilder();
            Timestamp timestamp = newBuilder.timestamp;
            if (timestamp != null) {
                newBuilder.timestamp = (Timestamp) Timestamp.ADAPTER.redact(timestamp);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public LevelMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LevelMetric)) {
            return false;
        }
        LevelMetric levelMetric = (LevelMetric) obj;
        if (!unknownFields().equals(levelMetric.unknownFields()) || !Internal.equals(this.name, levelMetric.name) || !Internal.equals(this.timestamp, levelMetric.timestamp) || !Internal.equals(this.level, levelMetric.level)) {
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
        String str = this.name;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Timestamp timestamp2 = this.timestamp;
        int hashCode3 = (hashCode2 + (timestamp2 != null ? timestamp2.hashCode() : 0)) * 37;
        Long l = this.level;
        if (l != null) {
            i2 = l.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.level != null) {
            sb.append(", level=");
            sb.append(this.level);
        }
        StringBuilder replace = sb.replace(0, 2, "LevelMetric{");
        replace.append('}');
        return replace.toString();
    }

    public LevelMetric(String str, Timestamp timestamp2, Long l, C13346d dVar) {
        super(ADAPTER, dVar);
        this.name = str;
        this.timestamp = timestamp2;
        this.level = l;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.level = this.level;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
