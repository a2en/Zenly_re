package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$ConversationsSearchEventOrBuilder */
public interface ChatProto$ConversationsSearchEventOrBuilder extends MessageLiteOrBuilder {
    C7168n getConversations();

    int getLimit();

    int getOffset();

    int getTotal();

    boolean hasConversations();
}
