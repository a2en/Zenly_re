package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.notifications.C7815g0.C7817b;

/* renamed from: co.znly.models.notifications.NotificationProto$SleepDetectionNotificationOrBuilder */
public interface NotificationProto$SleepDetectionNotificationOrBuilder extends MessageLiteOrBuilder {
    C7817b getCase();

    int getCaseValue();

    Timestamp getPredictedWakeupTime();

    UserProto$User getUser();

    boolean hasPredictedWakeupTime();

    boolean hasUser();
}
