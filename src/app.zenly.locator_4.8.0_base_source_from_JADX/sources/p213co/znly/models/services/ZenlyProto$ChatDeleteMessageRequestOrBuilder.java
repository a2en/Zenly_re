package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatDeleteMessageRequestOrBuilder */
public interface ZenlyProto$ChatDeleteMessageRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    String getMessageUuid();

    ByteString getMessageUuidBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
