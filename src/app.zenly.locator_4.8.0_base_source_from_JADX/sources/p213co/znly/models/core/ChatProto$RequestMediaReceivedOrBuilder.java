package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.ChatProto$RequestMediaReceivedOrBuilder */
public interface ChatProto$RequestMediaReceivedOrBuilder extends MessageLiteOrBuilder {
    String getAuthor();

    ByteString getAuthorBytes();

    Timestamp getCreatedAt();

    boolean getExpired();

    boolean getRead();

    String getUuid();

    ByteString getUuidBytes();

    Timestamp getValidUntil();

    boolean hasCreatedAt();

    boolean hasValidUntil();
}
