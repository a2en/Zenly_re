package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$PingNextRequestOrBuilder */
public interface ZenlyProto$PingNextRequestOrBuilder extends MessageLiteOrBuilder {
    String getAuthorUuid();

    ByteString getAuthorUuidBytes();

    String getCursor();

    ByteString getCursorBytes();

    int getLimit();
}
