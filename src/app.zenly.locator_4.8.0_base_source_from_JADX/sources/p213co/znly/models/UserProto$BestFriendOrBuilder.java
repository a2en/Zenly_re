package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$BestFriend.C6920c;

/* renamed from: co.znly.models.UserProto$BestFriendOrBuilder */
public interface UserProto$BestFriendOrBuilder extends MessageLiteOrBuilder {
    C6918b getFacts();

    String getFriendUserUuid();

    ByteString getFriendUserUuidBytes();

    C6920c getLevel();

    int getLevelValue();

    Timestamp getValidUntil();

    boolean hasFacts();

    boolean hasValidUntil();
}
