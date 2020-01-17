package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$ConversationTimelineOrBuilder */
public interface PingProto$ConversationTimelineOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    boolean getIsGroup();

    int getKind();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getTimelineUuid();

    ByteString getTimelineUuidBytes();
}
