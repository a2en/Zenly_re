package p213co.znly.models;

import java.util.Map;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.ContactProto$ContactWithFriendsCountOrBuilder */
public interface ContactProto$ContactWithFriendsCountOrBuilder extends MessageLiteOrBuilder {
    boolean containsPotentialFriendsCounts(String str);

    C7339i getContact();

    int getPotentialFriendsCount();

    @Deprecated
    Map<String, Integer> getPotentialFriendsCounts();

    int getPotentialFriendsCountsCount();

    Map<String, Integer> getPotentialFriendsCountsMap();

    int getPotentialFriendsCountsOrDefault(String str, int i);

    int getPotentialFriendsCountsOrThrow(String str);

    boolean hasContact();
}
