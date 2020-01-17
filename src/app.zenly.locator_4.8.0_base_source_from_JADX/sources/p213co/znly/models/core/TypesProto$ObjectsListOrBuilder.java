package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6980c3;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;

/* renamed from: co.znly.models.core.TypesProto$ObjectsListOrBuilder */
public interface TypesProto$ObjectsListOrBuilder extends MessageLiteOrBuilder {
    ZenlyProto$FriendRequestWithUser getFriendRequests(int i);

    int getFriendRequestsCount();

    List<ZenlyProto$FriendRequestWithUser> getFriendRequestsList();

    UserProto$User getFriends(int i);

    int getFriendsCount();

    List<UserProto$User> getFriendsList();

    C6980c3 getFriendships(int i);

    int getFriendshipsCount();

    List<C6980c3> getFriendshipsList();
}
