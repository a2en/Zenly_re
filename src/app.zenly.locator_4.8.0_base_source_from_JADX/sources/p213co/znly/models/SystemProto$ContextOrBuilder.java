package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.SystemProto$ContextOrBuilder */
public interface SystemProto$ContextOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreated();

    Timestamp getDeadline();

    boolean hasCreated();

    boolean hasDeadline();
}
