package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationRequestOrBuilder */
public interface ZenlyProto$ChatConversationRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getFromCursor();

    ByteString getFromCursorBytes();

    int getLimit();

    String getToCursor();

    ByteString getToCursorBytes();
}
