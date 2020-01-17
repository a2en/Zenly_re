package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7384l2;
import p213co.znly.models.C7475t1;
import p213co.znly.models.C7517z1;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$InboxPagingResponseOrBuilder */
public interface ZenlyProto$InboxPagingResponseOrBuilder extends MessageLiteOrBuilder {
    Timestamp getAskedAt();

    PingProto$Conversation getConversations(int i);

    int getConversationsCount();

    List<PingProto$Conversation> getConversationsList();

    C7475t1 getMediaReceived(int i);

    int getMediaReceivedCount();

    List<C7475t1> getMediaReceivedList();

    Timestamp getNext();

    C7384l2 getRequestMedia(int i);

    int getRequestMediaCount();

    List<C7384l2> getRequestMediaList();

    C7517z1 getUnreadConversations(int i);

    int getUnreadConversationsCount();

    List<C7517z1> getUnreadConversationsList();

    boolean hasAskedAt();

    boolean hasNext();
}
