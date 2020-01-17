package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$BestFriendsResponseOrBuilder */
public interface ZenlyProto$BestFriendsResponseOrBuilder extends MessageLiteOrBuilder {
    ZenlyProto$BestFriend getBestFriends(int i);

    int getBestFriendsCount();

    List<ZenlyProto$BestFriend> getBestFriendsList();
}
