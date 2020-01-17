package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PinContextProto$PinContextOrBuilder */
public interface PinContextProto$PinContextOrBuilder extends MessageLiteOrBuilder {
    C7364j1 getActivityResult();

    int getActivityResultValue();

    C7274d1 getActivityStripped();

    C7364j1 getBatteryResult();

    int getBatteryResultValue();

    C7284e1 getBatteryStripped();

    Timestamp getCreatedAt();

    C7364j1 getElevationResult();

    int getElevationResultValue();

    C7299f1 getElevationStripped();

    C7492v2 getGhostType();

    int getGhostTypeValue();

    C7364j1 getHeadingResult();

    int getHeadingResultValue();

    PinContextProto$HeadingStripped getHeadingStripped();

    int getHpRaw();

    double getLatRaw();

    double getLngRaw();

    C7364j1 getLocExtraResult();

    int getLocExtraResultValue();

    C7320g1 getLocExtraStripped();

    C7364j1 getPersonalPlaceResult();

    int getPersonalPlaceResultValue();

    C7333h1 getPersonalPlaceStripped();

    String getUserUuid();

    ByteString getUserUuidBytes();

    C7364j1 getWeatherResult();

    int getWeatherResultValue();

    C7373k1 getWeatherStripped();

    boolean hasActivityStripped();

    boolean hasBatteryStripped();

    boolean hasCreatedAt();

    boolean hasElevationStripped();

    boolean hasHeadingStripped();

    boolean hasLocExtraStripped();

    boolean hasPersonalPlaceStripped();

    boolean hasWeatherStripped();
}
