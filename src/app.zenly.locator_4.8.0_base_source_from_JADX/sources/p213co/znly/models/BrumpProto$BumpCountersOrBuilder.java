package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.BrumpProto$BumpCountersOrBuilder */
public interface BrumpProto$BumpCountersOrBuilder extends MessageLiteOrBuilder {
    int getBumpFriendMatchCount();

    int getBumpUnknownMatchCount();

    int getSingleBumpCount();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
