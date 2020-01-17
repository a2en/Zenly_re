package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7464s1.C7466b;
import p213co.znly.models.PingProto$Conversation.C6818b;

/* renamed from: co.znly.models.PingProto$ConversationUpdateOrBuilder */
public interface PingProto$ConversationUpdateOrBuilder extends MessageLiteOrBuilder {
    int getBolt();

    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getGroupName();

    ByteString getGroupNameBytes();

    C6818b getMembers(int i);

    int getMembersCount();

    List<C6818b> getMembersList();

    Timestamp getUntil();

    C7466b getWhat();

    int getWhatValue();

    boolean hasUntil();
}
