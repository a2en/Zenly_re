package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6973c;

/* renamed from: co.znly.models.services.ZenlyProto$BrumpStreamUpEventOrBuilder */
public interface ZenlyProto$BrumpStreamUpEventOrBuilder extends MessageLiteOrBuilder {
    int getAccelerationThreshold();

    Timestamp getDeviceTimestamp();

    int getEstimatedFrequency();

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
