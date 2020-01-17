package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.TimeTogetherProto$GatheringRequestOrBuilder */
public interface TimeTogetherProto$GatheringRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriends(int i);

    ByteString getFriendsBytes(int i);

    int getFriendsCount();

    List<String> getFriendsList();

    C8264s getRanges(int i);

    int getRangesCount();

    List<C8264s> getRangesList();

    String getUserId();

    ByteString getUserIdBytes();
}
