package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7471t;

/* renamed from: co.znly.models.services.VerifyProto$VerifyCreateRequestOrBuilder */
public interface VerifyProto$VerifyCreateRequestOrBuilder extends MessageLiteOrBuilder {
    C7471t getDevice();

    String getMCC();

    ByteString getMCCBytes();

    String getMNC();

    ByteString getMNCBytes();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    boolean hasDevice();
}
