package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$BestFriendsHideRequestOrBuilder */
public interface ZenlyProto$BestFriendsHideRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriendUuid();

    ByteString getFriendUuidBytes();

    boolean getHide();
}
