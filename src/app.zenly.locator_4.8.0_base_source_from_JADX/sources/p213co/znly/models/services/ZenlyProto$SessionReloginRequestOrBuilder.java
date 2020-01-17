package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7471t;

/* renamed from: co.znly.models.services.ZenlyProto$SessionReloginRequestOrBuilder */
public interface ZenlyProto$SessionReloginRequestOrBuilder extends MessageLiteOrBuilder {
    C7471t getDevice();

    String getDeviceOsUuid();

    ByteString getDeviceOsUuidBytes();

    String getSessionUuid();

    ByteString getSessionUuidBytes();

    boolean hasDevice();
}
