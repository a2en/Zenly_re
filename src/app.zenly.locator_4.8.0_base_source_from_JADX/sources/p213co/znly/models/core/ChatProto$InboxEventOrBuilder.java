package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.core.C7192q.C7194b;

/* renamed from: co.znly.models.core.ChatProto$InboxEventOrBuilder */
public interface ChatProto$InboxEventOrBuilder extends MessageLiteOrBuilder {
    C7168n getConversations();

    boolean getInitState();

    C7217t getMediaReceived();

    C7249x getRequestsReceived();

    C7194b getType();

    int getTypeValue();

    boolean hasConversations();

    boolean hasMediaReceived();

    boolean hasRequestsReceived();
}
