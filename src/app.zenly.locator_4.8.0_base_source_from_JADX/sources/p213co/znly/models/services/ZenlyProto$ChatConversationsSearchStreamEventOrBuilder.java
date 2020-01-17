package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Conversation;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationsSearchStreamEventOrBuilder */
public interface ZenlyProto$ChatConversationsSearchStreamEventOrBuilder extends MessageLiteOrBuilder {
    int getLimit();

    int getOffset();

    PingProto$Conversation getResults(int i);

    int getResultsCount();

    List<PingProto$Conversation> getResultsList();

    int getTotal();
}
