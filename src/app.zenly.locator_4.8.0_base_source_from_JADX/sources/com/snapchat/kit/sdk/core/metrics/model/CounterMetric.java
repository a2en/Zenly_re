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

public final class CounterMetric extends Message<CounterMetric, Builder> {
    public static final ProtoAdapter<CounterMetric> ADAPTER = new ProtoAdapter_CounterMetric();
    public static final Long DEFAULT_COUNT = Long.valueOf(0);
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    public static final class Builder extends com.squareup.wire.Message.Builder<CounterMetric, Builder> {
        public Long count;
        public String name;
        public Timestamp timestamp;

        public Builder count(Long l) {
            this.count = l;
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

        public CounterMetric build() {
            return new CounterMetric(this.name, this.timestamp, this.count, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_CounterMetric extends ProtoAdapter<CounterMetric> {
        public ProtoAdapter_CounterMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, CounterMetric.class);
        }

        public CounterMetric decode(ProtoReader protoReader) throws IOException {
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
                    builder.count((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CounterMetric counterMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, counterMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, counterMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, counterMetric.count);
            protoWriter.writeBytes(counterMetric.unknownFields());
        }

        public int encodedSize(CounterMetric counterMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, counterMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, counterMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, counterMetric.count) + counterMetric.unknownFields().mo38528g();
        }

        public CounterMetric redact(CounterMetric counterMetric) {
            Builder newBuilder = counterMetric.newBuilder();
            Timestamp timestamp = newBuilder.timestamp;
            if (timestamp != null) {
                newBuilder.timestamp = (Timestamp) Timestamp.ADAPTER.redact(timestamp);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public CounterMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterMetric)) {
            return false;
        }
        CounterMetric counterMetric = (CounterMetric) obj;
        if (!unknownFields().equals(counterMetric.unknownFields()) || !Internal.equals(this.name, counterMetric.name) || !Internal.equals(this.timestamp, counterMetric.timestamp) || !Internal.equals(this.count, counterMetric.count)) {
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
        Long l = this.count;
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
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "CounterMetric{");
        replace.append('}');
        return replace.toString();
    }

    public CounterMetric(String str, Timestamp timestamp2, Long l, C13346d dVar) {
        super(ADAPTER, dVar);
        this.name = str;
        this.timestamp = timestamp2;
        this.count = l;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.count = this.count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
