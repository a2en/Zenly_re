package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.notifications.NotificationProto$SYNNotificationOrBuilder */
public interface NotificationProto$SYNNotificationOrBuilder extends MessageLiteOrBuilder {
    String getId();

    ByteString getIdBytes();

    Timestamp getTimestamp();

    boolean hasTimestamp();
}
