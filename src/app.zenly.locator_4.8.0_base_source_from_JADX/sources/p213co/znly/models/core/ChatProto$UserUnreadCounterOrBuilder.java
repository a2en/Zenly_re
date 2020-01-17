package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$UserUnreadCounterOrBuilder */
public interface ChatProto$UserUnreadCounterOrBuilder extends MessageLiteOrBuilder {
    long getRequestUnread();

    long getUnread();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
