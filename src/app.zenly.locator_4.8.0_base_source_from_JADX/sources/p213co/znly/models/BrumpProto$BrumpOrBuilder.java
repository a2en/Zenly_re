package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.BrumpProto$BrumpOrBuilder */
public interface BrumpProto$BrumpOrBuilder extends MessageLiteOrBuilder {
    Timestamp getDeviceTimestamp();

    double getLatitude();

    double getLongitude();

    double getPrecision();

    double getPressure();

    C6973c getSamples();

    Timestamp getTimestamp();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasDeviceTimestamp();

    boolean hasSamples();

    boolean hasTimestamp();
}
