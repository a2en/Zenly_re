package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;

/* renamed from: co.znly.models.services.ZenlyProto$ChatCursorStreamEventOrBuilder */
public interface ZenlyProto$ChatCursorStreamEventOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getCursor();

    ByteString getCursorBytes();

    C7280e getOp();

    int getOpValue();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
