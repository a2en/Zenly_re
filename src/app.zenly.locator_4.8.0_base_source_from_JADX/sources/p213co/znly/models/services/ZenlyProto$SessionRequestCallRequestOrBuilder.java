package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7471t;
import p213co.znly.models.verify.C8449b;

/* renamed from: co.znly.models.services.ZenlyProto$SessionRequestCallRequestOrBuilder */
public interface ZenlyProto$SessionRequestCallRequestOrBuilder extends MessageLiteOrBuilder {
    C7471t getDevice();

    String getSessionUuid();

    ByteString getSessionUuidBytes();

    C8449b getType();

    int getTypeValue();

    boolean hasDevice();
}
