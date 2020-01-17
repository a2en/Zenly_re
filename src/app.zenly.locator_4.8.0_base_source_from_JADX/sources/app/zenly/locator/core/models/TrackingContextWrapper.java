package app.zenly.locator.core.models;

import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7492v2;

public interface TrackingContextWrapper {
    int getBatteryLevel();

    Timestamp getCreatedAt();

    C7492v2 getGhostType();

    boolean getHasWifiEnabled();

    double getHeight();

    double getHorizontalPrecision();

    double getLatitude();

    double getLongitude();

    double getRawHorizontalPrecision();

    double getRawLatitude();

    double getRawLongitude();

    double getSpeed();

    String getUserUuid();

    boolean isCharging();

    boolean isInApp();

    boolean isInSubway();

    boolean isLive();
}
