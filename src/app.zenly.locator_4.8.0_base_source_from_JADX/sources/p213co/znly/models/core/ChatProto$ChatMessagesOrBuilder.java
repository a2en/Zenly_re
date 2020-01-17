package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.core.ChatProto$ChatMessagesOrBuilder */
public interface ChatProto$ChatMessagesOrBuilder extends MessageLiteOrBuilder {
    boolean getContainsUnread();

    boolean getEmptyCache();

    PingProto$Ping2 getMsgs(int i);

    int getMsgsCount();

    List<PingProto$Ping2> getMsgsList();

    boolean getZero();
}
