package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$ChatLeaveGroupOrBuilder */
public interface PingProto$ChatLeaveGroupOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getLocale();

    ByteString getLocaleBytes();

    UserProto$User getMembers(int i);

    int getMembersCount();

    List<UserProto$User> getMembersList();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
