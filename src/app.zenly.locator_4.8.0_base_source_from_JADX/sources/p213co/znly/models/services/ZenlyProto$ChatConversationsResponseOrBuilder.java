package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationsResponseOrBuilder */
public interface ZenlyProto$ChatConversationsResponseOrBuilder extends MessageLiteOrBuilder {
    PingProto$Conversation getConversations(int i);

    int getConversationsCount();

    List<PingProto$Conversation> getConversationsList();
}
