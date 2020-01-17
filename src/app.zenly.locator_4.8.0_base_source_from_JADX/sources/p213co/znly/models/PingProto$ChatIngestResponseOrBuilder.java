package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$ChatIngestResponseOrBuilder */
public interface PingProto$ChatIngestResponseOrBuilder extends MessageLiteOrBuilder {
    int getErrorCode();

    String getErrorMessage();

    ByteString getErrorMessageBytes();

    C7440p1 getMessage();

    boolean hasMessage();
}
