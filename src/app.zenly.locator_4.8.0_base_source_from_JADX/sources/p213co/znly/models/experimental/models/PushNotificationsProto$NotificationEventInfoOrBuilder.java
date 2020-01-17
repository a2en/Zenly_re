package p213co.znly.models.experimental.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: co.znly.models.experimental.models.PushNotificationsProto$NotificationEventInfoOrBuilder */
public interface PushNotificationsProto$NotificationEventInfoOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    boolean getEligible();

    C6775d getFlag();

    int getFlagValue();

    int getNbSent();

    C7290a getNotificationType();

    int getNotificationTypeValue();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();
}
