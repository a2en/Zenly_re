package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7845r.C7847b;

/* renamed from: co.znly.models.notifications.NotificationProto$FriendIsBackNotificationOrBuilder */
public interface NotificationProto$FriendIsBackNotificationOrBuilder extends MessageLiteOrBuilder {
    C7847b getReason();

    int getReasonValue();

    TrackingContextProto$TrackingContext getTrackingContext();

    UserProto$User getUser();

    boolean hasTrackingContext();

    boolean hasUser();
}
