package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatGroupConversationAddResponseOrBuilder */
public interface ZenlyProto$ChatGroupConversationAddResponseOrBuilder extends MessageLiteOrBuilder {
    PingProto$Conversation getConversation();

    C8367x1 getError();

    boolean hasConversation();

    boolean hasError();
}
