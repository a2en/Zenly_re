package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6947a3;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestCreateResponseOrBuilder */
public interface ZenlyProto$FriendRequestCreateResponseOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getAuthor();

    C6947a3 getBlockRelationship();

    int getBlockRelationshipValue();

    C8351w2 getError();

    FriendRequestProto$FriendRequest getFriendRequest();

    UserProto$User getTarget();

    boolean hasAuthor();

    boolean hasError();

    boolean hasFriendRequest();

    boolean hasTarget();
}
