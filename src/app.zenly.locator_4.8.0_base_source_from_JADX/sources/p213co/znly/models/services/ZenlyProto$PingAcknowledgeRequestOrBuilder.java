package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$PingAcknowledgeRequestOrBuilder */
public interface ZenlyProto$PingAcknowledgeRequestOrBuilder extends MessageLiteOrBuilder {
    String getCursor();

    ByteString getCursorBytes();

    String getSenderUuid();

    ByteString getSenderUuidBytes();
}
