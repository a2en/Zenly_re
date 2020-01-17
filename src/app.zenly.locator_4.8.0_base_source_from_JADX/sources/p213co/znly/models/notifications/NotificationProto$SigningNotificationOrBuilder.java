package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.notifications.NotificationProto$SigningNotificationOrBuilder */
public interface NotificationProto$SigningNotificationOrBuilder extends MessageLiteOrBuilder {
    ByteString getBoxPublicKey();

    ByteString getKeys();
}
