package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser.C7947a;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestWithUserOrBuilder */
public interface ZenlyProto$FriendRequestWithUserOrBuilder extends MessageLiteOrBuilder {
    C7947a getAuthorInformations();

    FriendRequestProto$FriendRequest getFriendRequest();

    UserProto$User getUser();

    boolean hasAuthorInformations();

    boolean hasFriendRequest();

    boolean hasUser();
}
