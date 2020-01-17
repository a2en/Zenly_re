package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7471t;
import p213co.znly.models.services.ZenlyProto$SessionCreateRequest.C7959b;

/* renamed from: co.znly.models.services.ZenlyProto$SessionCreateRequestOrBuilder */
public interface ZenlyProto$SessionCreateRequestOrBuilder extends MessageLiteOrBuilder {
    C7959b getCarrierInformations();

    C7471t getDevice();

    String getDeviceOsUuid();

    ByteString getDeviceOsUuidBytes();

    boolean getDomainErrorInResponse();

    String getPassword();

    ByteString getPasswordBytes();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    boolean hasCarrierInformations();

    boolean hasDevice();
}
