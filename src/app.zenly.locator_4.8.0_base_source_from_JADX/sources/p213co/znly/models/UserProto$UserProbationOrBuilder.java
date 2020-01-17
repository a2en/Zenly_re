package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.UserProto$UserProbationOrBuilder */
public interface UserProto$UserProbationOrBuilder extends MessageLiteOrBuilder {
    boolean getDeleted();

    Timestamp getDeletedSince();

    boolean getHasChurned();

    boolean getSuspended();

    Timestamp getSuspendedSince();

    Timestamp getSuspendedUntil();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasDeletedSince();

    boolean hasSuspendedSince();

    boolean hasSuspendedUntil();
}
