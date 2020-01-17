package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.TrackingContextProto$ConnWithNoTCOrBuilder */
public interface TrackingContextProto$ConnWithNoTCOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    Duration getTimeOpened();

    boolean hasCreatedAt();

    boolean hasTimeOpened();
}
