package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestCreateRequestOrBuilder */
public interface ZenlyProto$FriendRequestCreateRequestOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Origin getOrigin();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    C6810b getSource();

    int getSourceValue();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUsername();

    ByteString getUsernameBytes();

    boolean hasOrigin();
}
