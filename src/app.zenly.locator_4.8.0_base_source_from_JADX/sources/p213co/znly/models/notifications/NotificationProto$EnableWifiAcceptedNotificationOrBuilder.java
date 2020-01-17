package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$EnableWifiAcceptedNotificationOrBuilder */
public interface NotificationProto$EnableWifiAcceptedNotificationOrBuilder extends MessageLiteOrBuilder {
    TrackingContextProto$TrackingContext getTrackingContext();

    UserProto$User getUser();

    boolean hasTrackingContext();

    boolean hasUser();
}
