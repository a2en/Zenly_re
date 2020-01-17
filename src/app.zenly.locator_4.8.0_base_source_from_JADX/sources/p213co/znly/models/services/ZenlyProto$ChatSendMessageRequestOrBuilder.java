package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageRequestOrBuilder */
public interface ZenlyProto$ChatSendMessageRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    PingProto$Ping2 getMessage();

    boolean hasMessage();
}
