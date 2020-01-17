package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6952b1;
import p213co.znly.models.services.C8275s4.C8277b;

/* renamed from: co.znly.models.services.ZenlyProto$SessionVerifyErrorOrBuilder */
public interface ZenlyProto$SessionVerifyErrorOrBuilder extends MessageLiteOrBuilder {
    C8277b getCode();

    int getCodeValue();

    Timestamp getDeletionDate();

    C8026d2 getError();

    C6952b1 getPhoneNumberProbation();

    boolean hasDeletionDate();

    boolean hasError();

    boolean hasPhoneNumberProbation();
}
