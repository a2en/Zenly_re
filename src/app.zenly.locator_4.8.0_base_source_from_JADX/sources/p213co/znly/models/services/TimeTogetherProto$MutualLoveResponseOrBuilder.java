package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory;

/* renamed from: co.znly.models.services.TimeTogetherProto$MutualLoveResponseOrBuilder */
public interface TimeTogetherProto$MutualLoveResponseOrBuilder extends MessageLiteOrBuilder {
    TimeTogetherProto$FriendsPerCategory getFriends(int i);

    int getFriendsCount();

    List<TimeTogetherProto$FriendsPerCategory> getFriendsList();
}
