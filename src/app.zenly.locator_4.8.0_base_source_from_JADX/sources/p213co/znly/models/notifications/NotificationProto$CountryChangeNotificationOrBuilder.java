package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$CountryChangeNotificationOrBuilder */
public interface NotificationProto$CountryChangeNotificationOrBuilder extends MessageLiteOrBuilder {
    String getDestination();

    ByteString getDestinationBytes();

    String getOrigin();

    ByteString getOriginBytes();

    TrackingContextProto$TrackingContext getTrackingContext();

    UserProto$User getUser();

    boolean hasTrackingContext();

    boolean hasUser();
}
