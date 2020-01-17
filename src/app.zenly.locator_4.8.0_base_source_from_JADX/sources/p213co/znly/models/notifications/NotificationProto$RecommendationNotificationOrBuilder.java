package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$RecommendationNotificationOrBuilder */
public interface NotificationProto$RecommendationNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getMatchMaker();

    UserProto$User getPotentialMatch();

    String getRecommendationUuid();

    ByteString getRecommendationUuidBytes();

    UserProto$User getRecommendedTo();

    boolean hasMatchMaker();

    boolean hasPotentialMatch();

    boolean hasRecommendedTo();
}
