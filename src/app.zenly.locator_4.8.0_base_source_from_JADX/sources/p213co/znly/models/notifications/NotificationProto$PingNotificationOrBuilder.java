package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$PingNotificationOrBuilder */
public interface NotificationProto$PingNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    String getConversationName();

    ByteString getConversationNameBytes();

    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getCursor();

    ByteString getCursorBytes();

    boolean getIsGroup();

    PingProto$Ping2 getPing();

    boolean hasAuthor();

    boolean hasPing();
}
