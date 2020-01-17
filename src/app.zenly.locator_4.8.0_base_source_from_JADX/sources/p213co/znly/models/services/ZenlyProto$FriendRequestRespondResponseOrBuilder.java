package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestRespondResponseOrBuilder */
public interface ZenlyProto$FriendRequestRespondResponseOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    FriendRequestProto$FriendRequest getFriendRequest();

    UserProto$User getTarget();

    boolean hasAuthor();

    boolean hasFriendRequest();

    boolean hasTarget();
}
