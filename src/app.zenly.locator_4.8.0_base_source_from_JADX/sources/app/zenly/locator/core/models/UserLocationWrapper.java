package app.zenly.locator.core.models;

import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface UserLocationWrapper {
    Timestamp getCreatedAt();

    double getRawHorizontalPrecision();

    double getRawLatitude();

    double getRawLongitude();

    double getSpeed();

    boolean isLive();
}
