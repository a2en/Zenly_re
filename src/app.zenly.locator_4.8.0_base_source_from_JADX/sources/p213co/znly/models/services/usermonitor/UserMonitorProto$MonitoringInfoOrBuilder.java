package p213co.znly.models.services.usermonitor;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;

/* renamed from: co.znly.models.services.usermonitor.UserMonitorProto$MonitoringInfoOrBuilder */
public interface UserMonitorProto$MonitoringInfoOrBuilder extends MessageLiteOrBuilder {
    int getConfidenceLevelDepartureTime();

    String getCorrelationId();

    ByteString getCorrelationIdBytes();

    Timestamp getDepartureTime();

    C8316b getEventType();

    int getEventTypeValue();

    Timestamp getExpectedWakeup();

    Timestamp getExpireAt();

    boolean getIsOffline();

    double getLatitude();

    double getLongitude();

    Timestamp getNoHeadingSince();

    Timestamp getOriginalEta();

    C6847b getPlaceOriginalDestination();

    int getPlaceOriginalDestinationValue();

    long getPlaceOriginalId();

    double getRadius();

    C8320d getScheduleType();

    int getScheduleTypeValue();

    Timestamp getUpdatedEta();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getWatchedUserUuid();

    ByteString getWatchedUserUuidBytes();

    boolean hasDepartureTime();

    boolean hasExpectedWakeup();

    boolean hasExpireAt();

    boolean hasNoHeadingSince();

    boolean hasOriginalEta();

    boolean hasUpdatedEta();
}
