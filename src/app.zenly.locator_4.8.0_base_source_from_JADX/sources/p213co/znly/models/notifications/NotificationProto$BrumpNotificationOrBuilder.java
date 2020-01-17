package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7270d;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$BrumpNotificationOrBuilder */
public interface NotificationProto$BrumpNotificationOrBuilder extends MessageLiteOrBuilder {
    C7270d getBrumpInfo();

    UserProto$User getUser1();

    UserProto$User getUser2();

    Timestamp getValidUntil();

    boolean hasBrumpInfo();

    boolean hasUser1();

    boolean hasUser2();

    boolean hasValidUntil();
}
