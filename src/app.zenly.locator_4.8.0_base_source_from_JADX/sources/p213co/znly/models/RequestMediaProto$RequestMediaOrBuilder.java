package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.RequestMediaProto$RequestMediaOrBuilder */
public interface RequestMediaProto$RequestMediaOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    Timestamp getCreatedAt();

    boolean getRead();

    String getSenderUuid();

    ByteString getSenderUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    Timestamp getValidUntil();

    boolean hasCreatedAt();

    boolean hasValidUntil();
}
