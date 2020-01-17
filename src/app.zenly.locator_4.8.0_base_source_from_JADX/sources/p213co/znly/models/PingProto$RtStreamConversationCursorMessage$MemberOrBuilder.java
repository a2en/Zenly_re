package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$RtStreamConversationCursorMessage$MemberOrBuilder */
public interface PingProto$RtStreamConversationCursorMessage$MemberOrBuilder extends MessageLiteOrBuilder {
    String getChatCursor();

    ByteString getChatCursorBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
