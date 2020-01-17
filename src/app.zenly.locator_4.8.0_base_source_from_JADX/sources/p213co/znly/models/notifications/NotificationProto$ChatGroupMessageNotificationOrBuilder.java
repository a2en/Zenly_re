package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.notifications.NotificationProto$ChatGroupMessageNotificationOrBuilder */
public interface NotificationProto$ChatGroupMessageNotificationOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    String getConversationName();

    ByteString getConversationNameBytes();

    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getCursor();

    ByteString getCursorBytes();

    PingProto$Ping2 getMessage();

    boolean hasAuthor();

    boolean hasMessage();
}
