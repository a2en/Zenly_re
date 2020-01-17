package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.notifications.NotificationProto$FailedMessageNotificationOrBuilder */
public interface NotificationProto$FailedMessageNotificationOrBuilder extends MessageLiteOrBuilder {
    boolean getIsGroup();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
