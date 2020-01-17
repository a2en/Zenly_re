package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7354j0;

/* renamed from: co.znly.models.core.ChatProto$MediaReceivedOrBuilder */
public interface ChatProto$MediaReceivedOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    C7354j0 getMedia();

    String getMessageUuid();

    ByteString getMessageUuidBytes();

    boolean getRead();

    boolean getReplied();

    boolean hasCreatedAt();

    boolean hasMedia();
}
