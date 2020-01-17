package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatGroupConversationAddRequestOrBuilder */
public interface ZenlyProto$ChatGroupConversationAddRequestOrBuilder extends MessageLiteOrBuilder {
    String getGroupChatUuid();

    ByteString getGroupChatUuidBytes();

    String getMemberUuids(int i);

    ByteString getMemberUuidsBytes(int i);

    int getMemberUuidsCount();

    List<String> getMemberUuidsList();
}
