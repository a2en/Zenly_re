package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$EnableAlwaysOnLocationNotificationOrBuilder */
public interface NotificationProto$EnableAlwaysOnLocationNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    UserProto$User getTarget();

    boolean hasAuthor();

    boolean hasTarget();
}
