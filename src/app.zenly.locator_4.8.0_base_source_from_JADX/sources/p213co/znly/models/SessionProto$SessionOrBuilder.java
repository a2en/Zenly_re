package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7402n2.C7404b;
import p213co.znly.models.C7402n2.C7406c;

/* renamed from: co.znly.models.SessionProto$SessionOrBuilder */
public interface SessionProto$SessionOrBuilder extends MessageLiteOrBuilder {
    String getAuthUuid();

    ByteString getAuthUuidBytes();

    Timestamp getClosedAt();

    Timestamp getCreatedAt();

    String getDeviceType();

    ByteString getDeviceTypeBytes();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    boolean getIsNewDevice();

    boolean getIsNewUser();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    C7404b getStatus();

    @Deprecated
    C7406c getStatusBeforeScyllaMigration();

    @Deprecated
    int getStatusBeforeScyllaMigrationValue();

    int getStatusValue();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    Timestamp getVerifiedAt();

    boolean hasClosedAt();

    boolean hasCreatedAt();

    boolean hasVerifiedAt();
}
