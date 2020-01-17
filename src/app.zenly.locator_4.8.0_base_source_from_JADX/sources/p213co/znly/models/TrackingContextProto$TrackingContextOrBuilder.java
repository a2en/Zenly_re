package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6876a;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6878b;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6880c;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6885e;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6889f;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6893g;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6897h;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6899i;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6901j;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6903k;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6907l;
import p213co.znly.models.TrackingContextProto$TrackingContext.MusicPlayer;
import p213co.znly.models.TrackingContextProto$TrackingContext.WiFi;

/* renamed from: co.znly.models.TrackingContextProto$TrackingContextOrBuilder */
public interface TrackingContextProto$TrackingContextOrBuilder extends MessageLiteOrBuilder {
    int getActivity();

    C6876a getAlarmClock();

    double getAltitude();

    C6878b getBarometer();

    C6880c getBattery();

    int getBatteryLevel();

    double getBearing();

    String getCellularNetworkCountryCode();

    ByteString getCellularNetworkCountryCodeBytes();

    String getCellularNetworkName();

    ByteString getCellularNetworkNameBytes();

    int getCellularNetworkStrength();

    C7484u2 getCellularNetworkType();

    int getCellularNetworkTypeValue();

    Duration getClock();

    Timestamp getCreatedAt();

    Timestamp getDeviceTimestamp();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    C6889f getDnd();

    int getFloor();

    C7492v2 getGhostType();

    int getGhostTypeValue();

    double getHeading();

    double getHeadingPrecision();

    double getHorizontalPrecision();

    String getIp();

    ByteString getIpBytes();

    boolean getIsCharging();

    boolean getIsForeground();

    boolean getIsGhost();

    double getLatitude();

    C6893g getLocations(int i);

    int getLocationsCount();

    List<C6893g> getLocationsList();

    C6885e getLockState();

    double getLongitude();

    C6897h getMagnetometer();

    C6899i getMeta();

    MusicPlayer getMusicPlayer();

    C6901j getPedometer();

    C6903k getPhoneState();

    double getPressure();

    C6907l getRinger();

    int getSeq();

    double getSpeed();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    double getVerticalPrecision();

    WiFi getWifi();

    String getWifiNetworkBssid();

    ByteString getWifiNetworkBssidBytes();

    String getWifiNetworkName();

    ByteString getWifiNetworkNameBytes();

    boolean hasAlarmClock();

    boolean hasBarometer();

    boolean hasBattery();

    boolean hasClock();

    boolean hasCreatedAt();

    boolean hasDeviceTimestamp();

    boolean hasDnd();

    boolean hasLockState();

    boolean hasMagnetometer();

    boolean hasMeta();

    boolean hasMusicPlayer();

    boolean hasPedometer();

    boolean hasPhoneState();

    boolean hasRinger();

    boolean hasWifi();
}
