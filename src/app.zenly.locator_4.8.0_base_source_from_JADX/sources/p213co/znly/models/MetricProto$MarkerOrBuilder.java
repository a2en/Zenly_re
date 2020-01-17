package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.MetricProto$MarkerOrBuilder */
public interface MetricProto$MarkerOrBuilder extends MessageLiteOrBuilder {
    long getCorrelationId();

    Timestamp getCreatedAt();

    C7452r0 getKind();

    int getKindValue();

    long getValue();

    boolean hasCreatedAt();
}
