package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationGetResponseLazyOrBuilder */
public interface ZenlyProto$ChatConversationGetResponseLazyOrBuilder extends MessageLiteOrBuilder {
    PingProto$Conversation getConversation();

    boolean getNotFound();

    boolean hasConversation();
}