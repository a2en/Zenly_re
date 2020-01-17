package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.SubscribersProto$SubscriberOrBuilder */
public interface SubscribersProto$SubscriberOrBuilder extends MessageLiteOrBuilder {
    Timestamp getExpireAt();

    String getSubscriberUuid();

    ByteString getSubscriberUuidBytes();

    C7442p2 getSubscriptionType();

    int getSubscriptionTypeValue();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasExpireAt();
}
