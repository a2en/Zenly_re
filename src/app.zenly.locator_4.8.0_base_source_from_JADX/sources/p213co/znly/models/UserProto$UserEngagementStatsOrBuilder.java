package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;
import p213co.znly.models.UserProto$UserEngagementStats.C6931c;

/* renamed from: co.znly.models.UserProto$UserEngagementStatsOrBuilder */
public interface UserProto$UserEngagementStatsOrBuilder extends MessageLiteOrBuilder {
    int getCurrentFriendsCount();

    C6931c getCurrentStreak();

    boolean getHasProfilePicture();

    C6929b getLevel();

    int getLevelValue();

    boolean hasCurrentStreak();
}
