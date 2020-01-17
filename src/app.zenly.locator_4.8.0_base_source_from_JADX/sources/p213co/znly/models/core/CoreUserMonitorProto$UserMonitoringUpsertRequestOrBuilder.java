package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.services.usermonitor.C8316b;

/* renamed from: co.znly.models.core.CoreUserMonitorProto$UserMonitoringUpsertRequestOrBuilder */
public interface CoreUserMonitorProto$UserMonitoringUpsertRequestOrBuilder extends MessageLiteOrBuilder {
    C8316b getEventType();

    int getEventTypeValue();

    Timestamp getExpectedWakeup();

    double getLatitude();

    double getLongitude();

    Timestamp getOriginalEta();

    C6847b getPlaceOriginalDestination();

    int getPlaceOriginalDestinationValue();

    long getPlaceOriginalId();

    double getRadius();

    String getWatchedUserUuid();

    ByteString getWatchedUserUuidBytes();

    boolean hasExpectedWakeup();

    boolean hasOriginalEta();
}
