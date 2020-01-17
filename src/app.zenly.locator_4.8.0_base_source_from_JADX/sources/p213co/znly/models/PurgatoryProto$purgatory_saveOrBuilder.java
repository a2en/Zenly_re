package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PurgatoryProto$purgatory_saveOrBuilder */
public interface PurgatoryProto$purgatory_saveOrBuilder extends MessageLiteOrBuilder {
    String getActiveFriendRequestUuids(int i);

    ByteString getActiveFriendRequestUuidsBytes(int i);

    int getActiveFriendRequestUuidsCount();

    List<String> getActiveFriendRequestUuidsList();

    C7335h2 getFriendsFriendShips(int i);

    int getFriendsFriendShipsCount();

    List<C7335h2> getFriendsFriendShipsList();

    C7347i2 getReason();

    int getReasonValue();

    C7366j2 getUser();

    C7335h2 getUserFriendShips(int i);

    int getUserFriendShipsCount();

    List<C7335h2> getUserFriendShipsList();

    boolean hasUser();
}
