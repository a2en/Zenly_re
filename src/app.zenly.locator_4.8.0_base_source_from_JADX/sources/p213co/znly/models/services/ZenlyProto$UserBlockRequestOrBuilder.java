package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.C8189n5.C8191b;

/* renamed from: co.znly.models.services.ZenlyProto$UserBlockRequestOrBuilder */
public interface ZenlyProto$UserBlockRequestOrBuilder extends MessageLiteOrBuilder {
    C8191b getReason();

    int getReasonValue();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
