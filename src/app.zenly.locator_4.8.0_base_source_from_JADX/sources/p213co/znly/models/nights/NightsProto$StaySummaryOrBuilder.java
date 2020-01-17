package p213co.znly.models.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.nights.NightsProto$StaySummaryOrBuilder */
public interface NightsProto$StaySummaryOrBuilder extends MessageLiteOrBuilder {
    C7413c getFirstBedTime();

    String getFriends(int i);

    ByteString getFriendsBytes(int i);

    int getFriendsCount();

    List<String> getFriendsList();

    C7411b getFromDate();

    C7413c getLastWakeupTime();

    String getLocationId();

    ByteString getLocationIdBytes();

    int getNightsCount();

    String getStayId();

    ByteString getStayIdBytes();

    C7411b getToDate();

    boolean hasFirstBedTime();

    boolean hasFromDate();

    boolean hasLastWakeupTime();

    boolean hasToDate();
}
