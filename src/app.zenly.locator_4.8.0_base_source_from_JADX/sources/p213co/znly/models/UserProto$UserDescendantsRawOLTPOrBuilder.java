package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.UserProto$UserDescendantsRawOLTPOrBuilder */
public interface UserProto$UserDescendantsRawOLTPOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getFriendRequestUuid();

    ByteString getFriendRequestUuidBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();
}
