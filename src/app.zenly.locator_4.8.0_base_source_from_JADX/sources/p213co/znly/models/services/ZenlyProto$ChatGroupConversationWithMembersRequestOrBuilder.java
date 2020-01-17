package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatGroupConversationWithMembersRequestOrBuilder */
public interface ZenlyProto$ChatGroupConversationWithMembersRequestOrBuilder extends MessageLiteOrBuilder {
    String getMemberUuids(int i);

    ByteString getMemberUuidsBytes(int i);

    int getMemberUuidsCount();

    List<String> getMemberUuidsList();
}
