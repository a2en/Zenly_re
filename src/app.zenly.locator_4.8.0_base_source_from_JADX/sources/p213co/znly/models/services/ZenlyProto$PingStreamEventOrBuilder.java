package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$PingStreamEventOrBuilder */
public interface ZenlyProto$PingStreamEventOrBuilder extends MessageLiteOrBuilder {
    String getCursor();

    ByteString getCursorBytes();

    PingProto$Ping2 getMessage();

    C7280e getOp();

    int getOpValue();

    boolean hasMessage();
}