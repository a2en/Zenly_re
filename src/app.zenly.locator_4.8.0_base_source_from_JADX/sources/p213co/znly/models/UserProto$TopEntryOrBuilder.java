package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.UserProto$TopEntryOrBuilder */
public interface UserProto$TopEntryOrBuilder extends MessageLiteOrBuilder {
    String getFriendUserUuid();

    ByteString getFriendUserUuidBytes();

    int getRank();

    double getScore();

    double getStableScore();
}
