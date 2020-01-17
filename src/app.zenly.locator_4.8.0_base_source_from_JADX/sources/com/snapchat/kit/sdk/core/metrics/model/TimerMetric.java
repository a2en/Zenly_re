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

public final class TimerMetric extends Message<TimerMetric, Builder> {
    public static final ProtoAdapter<TimerMetric> ADAPTER = new ProtoAdapter_TimerMetric();
    public static final Long DEFAULT_LATENCY_MILLIS = Long.valueOf(0);
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long latency_millis;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    public static final class Builder extends com.squareup.wire.Message.Builder<TimerMetric, Builder> {
        public Long latency_millis;
        public String name;
        public Timestamp timestamp;

        public Builder latency_millis(Long l) {
            this.latency_millis = l;
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

        public TimerMetric build() {
            return new TimerMetric(this.name, this.timestamp, this.latency_millis, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_TimerMetric extends ProtoAdapter<TimerMetric> {
        public ProtoAdapter_TimerMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, TimerMetric.class);
        }

        public TimerMetric decode(ProtoReader protoReader) throws IOException {
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
                    builder.latency_millis((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, TimerMetric timerMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timerMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, timerMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, timerMetric.latency_millis);
            protoWriter.writeBytes(timerMetric.unknownFields());
        }

        public int encodedSize(TimerMetric timerMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, timerMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, timerMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, timerMetric.latency_millis) + timerMetric.unknownFields().mo38528g();
        }

        public TimerMetric redact(TimerMetric timerMetric) {
            Builder newBuilder = timerMetric.newBuilder();
            Timestamp timestamp = newBuilder.timestamp;
            if (timestamp != null) {
                newBuilder.timestamp = (Timestamp) Timestamp.ADAPTER.redact(timestamp);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimerMetric)) {
            return false;
        }
        TimerMetric timerMetric = (TimerMetric) obj;
        if (!unknownFields().equals(timerMetric.unknownFields()) || !Internal.equals(this.name, timerMetric.name) || !Internal.equals(this.timestamp, timerMetric.timestamp) || !Internal.equals(this.latency_millis, timerMetric.latency_millis)) {
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
        Long l = this.latency_millis;
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
        if (this.latency_millis != null) {
            sb.append(", latency_millis=");
            sb.append(this.latency_millis);
        }
        StringBuilder replace = sb.replace(0, 2, "TimerMetric{");
        replace.append('}');
        return replace.toString();
    }

    public TimerMetric(String str, Timestamp timestamp2, Long l, C13346d dVar) {
        super(ADAPTER, dVar);
        this.name = str;
        this.timestamp = timestamp2;
        this.latency_millis = l;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.latency_millis = this.latency_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
