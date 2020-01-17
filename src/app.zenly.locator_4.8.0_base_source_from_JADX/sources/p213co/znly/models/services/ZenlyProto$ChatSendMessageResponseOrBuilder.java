package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6947a3;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageResponseOrBuilder */
public interface ZenlyProto$ChatSendMessageResponseOrBuilder extends MessageLiteOrBuilder {
    C6947a3 getBlockRelationship();

    int getBlockRelationshipValue();

    String getConversationUuid();

    ByteString getConversationUuidBytes();

    PingProto$Ping2 getMessage();

    boolean hasMessage();
}
