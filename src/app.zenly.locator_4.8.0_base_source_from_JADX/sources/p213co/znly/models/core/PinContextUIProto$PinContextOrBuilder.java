package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7492v2;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6990b;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6992c;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6994d;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6996e;
import p213co.znly.models.core.PinContextUIProto$PinContext.C6998f;
import p213co.znly.models.core.PinContextUIProto$PinContext.C7000g;

/* renamed from: co.znly.models.core.PinContextUIProto$PinContextOrBuilder */
public interface PinContextUIProto$PinContextOrBuilder extends MessageLiteOrBuilder {
    int getBatteryLevel();

    Timestamp getCreatedAt();

    C6990b getElevation();

    C7492v2 getGhostType();

    int getGhostTypeValue();

    C6994d getHeading();

    int getHpRaw();

    boolean getIsCharging();

    boolean getIsDeleted();

    boolean getIsInApp();

    boolean getIsLive();

    boolean getIsMe();

    boolean getIsWifiActive();

    double getLatRaw();

    double getLngRaw();

    C6996e getLocExtra();

    C6992c getMyGpsPosition();

    C6998f getPersonalPlace();

    UserProto$User getUser();

    String getUserUuid();

    ByteString getUserUuidBytes();

    C7000g getWeather();

    boolean hasCreatedAt();

    boolean hasElevation();

    boolean hasHeading();

    boolean hasLocExtra();

    boolean hasMyGpsPosition();

    boolean hasPersonalPlace();

    boolean hasUser();

    boolean hasWeather();
}
