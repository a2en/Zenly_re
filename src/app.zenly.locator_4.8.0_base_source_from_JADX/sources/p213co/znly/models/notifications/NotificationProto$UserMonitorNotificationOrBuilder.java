package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.usermonitor.C8316b;
import p213co.znly.models.services.usermonitor.C8322e;
import p213co.znly.models.sleepdetection.C8408b.C8414d;

/* renamed from: co.znly.models.notifications.NotificationProto$UserMonitorNotificationOrBuilder */
public interface NotificationProto$UserMonitorNotificationOrBuilder extends MessageLiteOrBuilder {
    Timestamp getArrivalTime();

    int getConfidenceLevelDepartureTime();

    Timestamp getCurrentEta();

    Timestamp getDepartureTime();

    C8316b getEventType();

    int getEventTypeValue();

    Timestamp getOriginalEta();

    C6847b getPlaceDestination();

    int getPlaceDestinationValue();

    C6847b getPlaceOrigin();

    int getPlaceOriginValue();

    C6847b getPlaceOriginalDestination();

    int getPlaceOriginalDestinationValue();

    C8322e getReasonOfCancel();

    int getReasonOfCancelValue();

    Duration getSleepDuration();

    Timestamp getUpdatedEta();

    UserProto$User getUser();

    Timestamp getValidUntil();

    C8414d getWakeUpType();

    int getWakeUpTypeValue();

    boolean hasArrivalTime();

    boolean hasCurrentEta();

    boolean hasDepartureTime();

    boolean hasOriginalEta();

    boolean hasSleepDuration();

    boolean hasUpdatedEta();

    boolean hasUser();

    boolean hasValidUntil();
}
