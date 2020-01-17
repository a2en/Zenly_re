package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$ConversationUnreadCounterOrBuilder */
public interface ChatProto$ConversationUnreadCounterOrBuilder extends MessageLiteOrBuilder {
    String getChatCursor();

    ByteString getChatCursorBytes();

    String getEmojiCursor();

    ByteString getEmojiCursorBytes();

    String getInboxUuid();

    ByteString getInboxUuidBytes();

    long getRequestUnread();

    C7133k getType();

    int getTypeValue();

    long getUnreadEmojis();

    long getUnreadMessages();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
