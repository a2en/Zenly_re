package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7471t;

/* renamed from: co.znly.models.services.ZenlyProto$SessionVerifyRequestOrBuilder */
public interface ZenlyProto$SessionVerifyRequestOrBuilder extends MessageLiteOrBuilder {
    Timestamp getBirthdate();

    String getCode();

    ByteString getCodeBytes();

    C7471t getDevice();

    String getDeviceOsUuid();

    ByteString getDeviceOsUuidBytes();

    boolean getDomainErrorInResponse();

    boolean getErrorIfSuspended();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    String getSessionUuid();

    ByteString getSessionUuidBytes();

    String getUserName();

    ByteString getUserNameBytes();

    boolean hasBirthdate();

    boolean hasDevice();
}
