package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatCursorResponseOrBuilder */
public interface ZenlyProto$ChatCursorResponseOrBuilder extends MessageLiteOrBuilder {
    String getCursor();

    ByteString getCursorBytes();

    long getSeq();
}
