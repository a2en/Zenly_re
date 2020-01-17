package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$FriendRequestAcceptedNotificationOrBuilder */
public interface NotificationProto$FriendRequestAcceptedNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    FriendRequestProto$FriendRequest getFriendRequest();

    UserProto$User getTarget();

    TrackingContextProto$TrackingContext getTrackingContext();

    boolean hasAuthor();

    boolean hasFriendRequest();

    boolean hasTarget();

    boolean hasTrackingContext();
}
