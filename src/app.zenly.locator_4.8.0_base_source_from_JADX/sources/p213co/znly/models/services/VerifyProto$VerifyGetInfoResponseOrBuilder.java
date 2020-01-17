package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;

/* renamed from: co.znly.models.services.VerifyProto$VerifyGetInfoResponseOrBuilder */
public interface VerifyProto$VerifyGetInfoResponseOrBuilder extends MessageLiteOrBuilder {
    C8328v getError();

    VerifyInfoProto$VerifyInfo getVerifyInfo();

    boolean hasError();

    boolean hasVerifyInfo();
}
