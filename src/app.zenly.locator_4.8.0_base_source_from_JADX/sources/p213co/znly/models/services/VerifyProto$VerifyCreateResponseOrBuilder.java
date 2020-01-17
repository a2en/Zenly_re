package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;

/* renamed from: co.znly.models.services.VerifyProto$VerifyCreateResponseOrBuilder */
public interface VerifyProto$VerifyCreateResponseOrBuilder extends MessageLiteOrBuilder {
    C8328v getError();

    String getUuid();

    ByteString getUuidBytes();

    VerifyInfoProto$VerifyInfo getVerifyInfo();

    boolean hasError();

    boolean hasVerifyInfo();
}
