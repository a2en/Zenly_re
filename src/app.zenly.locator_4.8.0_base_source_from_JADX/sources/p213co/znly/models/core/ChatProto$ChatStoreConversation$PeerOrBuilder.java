package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.ChatProto$ChatStoreConversation$PeerOrBuilder */
public interface ChatProto$ChatStoreConversation$PeerOrBuilder extends MessageLiteOrBuilder {
    Timestamp getJoinedAt();

    Timestamp getLeftAt();

    String getNickname();

    ByteString getNicknameBytes();

    String getRead();

    ByteString getReadBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasJoinedAt();

    boolean hasLeftAt();
}
