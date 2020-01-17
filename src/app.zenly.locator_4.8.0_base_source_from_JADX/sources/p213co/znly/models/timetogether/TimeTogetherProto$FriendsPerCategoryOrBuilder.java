package p213co.znly.models.timetogether;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory.C8427b;

/* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategoryOrBuilder */
public interface TimeTogetherProto$FriendsPerCategoryOrBuilder extends MessageLiteOrBuilder {
    Timestamp getBestSince();

    C8433b getCategory();

    int getCategoryValue();

    C8427b getSortedFriends(int i);

    int getSortedFriendsCount();

    List<C8427b> getSortedFriendsList();

    boolean hasBestSince();
}
