package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$ContactJoinedNotificationOrBuilder */
public interface NotificationProto$ContactJoinedNotificationOrBuilder extends MessageLiteOrBuilder {
    C7339i getContact();

    UserProto$User getUser();

    boolean hasContact();

    boolean hasUser();
}
