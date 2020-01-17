package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$InboxCacheOrBuilder */
public interface ChatProto$InboxCacheOrBuilder extends MessageLiteOrBuilder {
    C7117i getConversations(int i);

    int getConversationsCount();

    List<C7117i> getConversationsList();

    boolean getDoAsyncCall();
}
