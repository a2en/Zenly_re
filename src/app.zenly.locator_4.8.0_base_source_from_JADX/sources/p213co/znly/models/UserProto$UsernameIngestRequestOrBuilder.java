package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.UserProto$UsernameIngestRequestOrBuilder */
public interface UserProto$UsernameIngestRequestOrBuilder extends MessageLiteOrBuilder {
    C7456r2 getContext();

    C7349i3 getOp();

    int getOpValue();

    String getReplyTo();

    ByteString getReplyToBytes();

    C7468s2 getSpanContext();

    long getTs();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUsername();

    ByteString getUsernameBytes();

    boolean hasContext();

    boolean hasSpanContext();
}
