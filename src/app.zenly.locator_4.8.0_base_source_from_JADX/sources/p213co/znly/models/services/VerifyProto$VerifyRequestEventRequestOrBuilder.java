package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.verify.C8449b;

/* renamed from: co.znly.models.services.VerifyProto$VerifyRequestEventRequestOrBuilder */
public interface VerifyProto$VerifyRequestEventRequestOrBuilder extends MessageLiteOrBuilder {
    C8449b getType();

    int getTypeValue();

    String getUuid();

    ByteString getUuidBytes();
}
