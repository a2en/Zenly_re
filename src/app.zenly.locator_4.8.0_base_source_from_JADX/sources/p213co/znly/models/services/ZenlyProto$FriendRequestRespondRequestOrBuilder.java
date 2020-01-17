package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestRespondRequestOrBuilder */
public interface ZenlyProto$FriendRequestRespondRequestOrBuilder extends MessageLiteOrBuilder {
    C6812c getStatus();

    int getStatusValue();

    String getUuid();

    ByteString getUuidBytes();
}
