package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationCreateResponseOrBuilder */
public interface ZenlyProto$ChatConversationCreateResponseOrBuilder extends MessageLiteOrBuilder {
    PingProto$Conversation getConversation();

    C8334v1 getError();

    boolean hasConversation();

    boolean hasError();
}
