package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$ChatIngestRequestOrBuilder */
public interface PingProto$ChatIngestRequestOrBuilder extends MessageLiteOrBuilder {
    C7456r2 getContext();

    C7400n1 getCursorUpdate();

    String getHash();

    ByteString getHashBytes();

    C7447q1 getLeaveGroup();

    C7440p1 getMsg();

    C7431o1 getOp();

    int getOpValue();

    String getReplyTo();

    ByteString getReplyToBytes();

    C7498w1 getRequestMedia();

    C7468s2 getSpanContext();

    boolean hasContext();

    boolean hasCursorUpdate();

    boolean hasLeaveGroup();

    boolean hasMsg();

    boolean hasRequestMedia();

    boolean hasSpanContext();
}
