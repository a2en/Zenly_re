package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PingProto$PingOrBuilder */
public interface PingProto$PingOrBuilder extends MessageLiteOrBuilder {
    String getAuthorUuid();

    ByteString getAuthorUuidBytes();

    C6947a3 getBlockRelationship();

    int getBlockRelationshipValue();

    Timestamp getCreatedAt();

    String getEmojiUuid();

    ByteString getEmojiUuidBytes();

    String getMessage();

    ByteString getMessageBytes();

    Timestamp getReadAt();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    float getWeight();

    boolean hasCreatedAt();

    boolean hasReadAt();
}
