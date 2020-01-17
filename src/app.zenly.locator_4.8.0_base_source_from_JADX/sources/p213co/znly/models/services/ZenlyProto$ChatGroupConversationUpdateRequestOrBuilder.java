package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatGroupConversationUpdateRequestOrBuilder */
public interface ZenlyProto$ChatGroupConversationUpdateRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getName();

    ByteString getNameBytes();
}
