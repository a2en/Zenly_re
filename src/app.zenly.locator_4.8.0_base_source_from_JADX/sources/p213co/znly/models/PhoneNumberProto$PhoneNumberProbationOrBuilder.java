package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6952b1.C6954b;
import p213co.znly.models.C6952b1.C6956c;

/* renamed from: co.znly.models.PhoneNumberProto$PhoneNumberProbationOrBuilder */
public interface PhoneNumberProto$PhoneNumberProbationOrBuilder extends MessageLiteOrBuilder {
    String getHashedPhoneNumber();

    ByteString getHashedPhoneNumberBytes();

    C6954b getReason();

    String getReasonText();

    ByteString getReasonTextBytes();

    int getReasonValue();

    C6956c getType();

    int getTypeValue();

    Timestamp getUntil();

    Timestamp getUpdatedAt();

    boolean hasUntil();

    boolean hasUpdatedAt();
}
