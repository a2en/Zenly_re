package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;

/* renamed from: co.znly.models.PingProto$ConversationOrBuilder */
public interface PingProto$ConversationOrBuilder extends MessageLiteOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    boolean getIsGroup();

    Timestamp getLastEventAt();

    PingProto$Ping2 getLastMessage();

    PingProto$Ping2 getLastPage(int i);

    int getLastPageCount();

    List<PingProto$Ping2> getLastPageList();

    boolean getLeft();

    C6818b getMembers(int i);

    int getMembersCount();

    List<C6818b> getMembersList();

    Timestamp getMuteUntil();

    String getName();

    ByteString getNameBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasLastEventAt();

    boolean hasLastMessage();

    boolean hasMuteUntil();
}
