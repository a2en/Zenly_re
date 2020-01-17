package p213co.znly.models.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.nights.NightsProto$NightOrBuilder */
public interface NightsProto$NightOrBuilder extends MessageLiteOrBuilder {
    C7413c getBedTime();

    String getFriends(int i);

    ByteString getFriendsBytes(int i);

    int getFriendsCount();

    List<String> getFriendsList();

    C7411b getNightDate();

    C7413c getWakeupTime();

    boolean hasBedTime();

    boolean hasNightDate();

    boolean hasWakeupTime();
}
