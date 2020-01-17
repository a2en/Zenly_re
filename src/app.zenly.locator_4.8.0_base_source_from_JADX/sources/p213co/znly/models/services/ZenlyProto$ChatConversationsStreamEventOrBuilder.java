package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7464s1;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationsStreamEventOrBuilder */
public interface ZenlyProto$ChatConversationsStreamEventOrBuilder extends MessageLiteOrBuilder {
    PingProto$Conversation getConversation();

    C7464s1 getConversationUpdate();

    C7280e getOp();

    int getOpValue();

    boolean hasConversation();

    boolean hasConversationUpdate();
}
