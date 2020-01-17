package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7402n2;
import p213co.znly.models.verify.C8454e;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;

/* renamed from: co.znly.models.services.ZenlyProto$SessionCreateResponseOrBuilder */
public interface ZenlyProto$SessionCreateResponseOrBuilder extends MessageLiteOrBuilder {
    int getDeprecatedChallengeSize();

    C8454e getDeprecatedChallengeType();

    int getDeprecatedChallengeTypeValue();

    C8210o4 getError();

    C7402n2 getSession();

    VerifyInfoProto$VerifyInfo getVerifyInfo();

    boolean hasError();

    boolean hasSession();

    boolean hasVerifyInfo();
}
