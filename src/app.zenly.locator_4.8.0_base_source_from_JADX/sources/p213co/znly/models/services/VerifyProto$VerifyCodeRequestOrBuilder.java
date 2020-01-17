package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.VerifyProto$VerifyCodeRequestOrBuilder */
public interface VerifyProto$VerifyCodeRequestOrBuilder extends MessageLiteOrBuilder {
    String getCode();

    ByteString getCodeBytes();

    String getUuid();

    ByteString getUuidBytes();
}
