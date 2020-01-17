package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$RecommendationRewardNotificationOrBuilder */
public interface NotificationProto$RecommendationRewardNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getMatch();

    UserProto$User getRecommendedTo();

    boolean hasMatch();

    boolean hasRecommendedTo();
}
