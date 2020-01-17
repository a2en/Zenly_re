package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$ChatInsertOrBuilder */
public interface PingProto$ChatInsertOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    String getHash();

    ByteString getHashBytes();

    PingProto$Ping2 getMessage();

    C7511y1 getMetadata();

    boolean hasMessage();

    boolean hasMetadata();
}
