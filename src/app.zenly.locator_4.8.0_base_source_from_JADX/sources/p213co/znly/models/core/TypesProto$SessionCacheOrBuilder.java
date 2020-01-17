package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7402n2;
import p213co.znly.models.verify.C8454e;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;

/* renamed from: co.znly.models.core.TypesProto$SessionCacheOrBuilder */
public interface TypesProto$SessionCacheOrBuilder extends MessageLiteOrBuilder {
    Timestamp getBirthdate();

    int getChallengeSize();

    C8454e getChallengeType();

    int getChallengeTypeValue();

    int getContactPickerDone();

    VerifyInfoProto$VerifyInfo getEventInfo();

    boolean getForcedOnboardingEnabled();

    boolean getIntroSeen();

    Timestamp getLastPushAuthAskedTime();

    String getName();

    ByteString getNameBytes();

    boolean getOnboardingNotCompleted();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    C7123i2 getPhoneRegion();

    C7402n2 getSession();

    boolean hasBirthdate();

    boolean hasEventInfo();

    boolean hasLastPushAuthAskedTime();

    boolean hasPhoneRegion();

    boolean hasSession();
}
