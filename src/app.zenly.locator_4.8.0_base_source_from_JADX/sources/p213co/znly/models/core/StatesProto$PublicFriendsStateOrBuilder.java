package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.StatesProto$PublicFriendsStateOrBuilder */
public interface StatesProto$PublicFriendsStateOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getFriends(int i);

    int getFriendsCount();

    List<UserProto$User> getFriendsList();
}
