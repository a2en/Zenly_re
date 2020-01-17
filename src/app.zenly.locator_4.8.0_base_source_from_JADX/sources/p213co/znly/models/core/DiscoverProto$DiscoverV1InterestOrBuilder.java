package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.DiscoverProto$DiscoverV1InterestOrBuilder */
public interface DiscoverProto$DiscoverV1InterestOrBuilder extends MessageLiteOrBuilder {
    String getFriends(int i);

    ByteString getFriendsBytes(int i);

    int getFriendsCount();

    List<String> getFriendsList();
}
