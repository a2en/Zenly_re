package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$RtStreamConversationCursorMessageOrBuilder */
public interface PingProto$RtStreamConversationCursorMessageOrBuilder extends MessageLiteOrBuilder {
    C7506x1 getMember();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasMember();
}
