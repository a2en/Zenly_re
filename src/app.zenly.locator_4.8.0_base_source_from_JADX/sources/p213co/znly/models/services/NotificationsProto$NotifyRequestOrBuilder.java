package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.notifications.C7857w;

/* renamed from: co.znly.models.services.NotificationsProto$NotifyRequestOrBuilder */
public interface NotificationsProto$NotifyRequestOrBuilder extends MessageLiteOrBuilder {
    C7857w getNotification();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasNotification();
}
