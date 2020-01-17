package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatUpdateCursorRequestOrBuilder */
public interface ZenlyProto$ChatUpdateCursorRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getCursor();

    ByteString getCursorBytes();
}
