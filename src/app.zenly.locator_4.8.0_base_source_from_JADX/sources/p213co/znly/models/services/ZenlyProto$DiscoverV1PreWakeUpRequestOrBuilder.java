package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$DiscoverV1PreWakeUpRequestOrBuilder */
public interface ZenlyProto$DiscoverV1PreWakeUpRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriends(int i);

    ByteString getFriendsBytes(int i);

    int getFriendsCount();

    List<String> getFriendsList();
}