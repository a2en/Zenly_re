package app.zenly.locator.core.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface AppData$UserHistoryOrBuilder extends MessageLiteOrBuilder {
    double getAltitude();

    Timestamp getCreatedAt();

    String getFriendUuid();

    ByteString getFriendUuidBytes();

    String getGatheringMembers(int i);

    ByteString getGatheringMembersBytes(int i);

    int getGatheringMembersCount();

    List<String> getGatheringMembersList();

    double getHorizontalAccuracy();

    double getLatitude();

    double getLongitude();

    Timestamp getTimestamp();

    double getVerticalAccuracy();

    boolean hasCreatedAt();

    boolean hasTimestamp();
}
