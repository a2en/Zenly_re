package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$UnreadConversationOrBuilder */
public interface PingProto$UnreadConversationOrBuilder extends MessageLiteOrBuilder {
    String getChatCursor();

    ByteString getChatCursorBytes();

    String getChatTip();

    ByteString getChatTipBytes();

    String getPingCursor();

    ByteString getPingCursorBytes();

    String getPingTip();

    ByteString getPingTipBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
