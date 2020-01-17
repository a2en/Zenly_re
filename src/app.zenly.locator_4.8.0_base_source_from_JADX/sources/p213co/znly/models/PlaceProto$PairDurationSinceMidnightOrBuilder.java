package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PlaceProto$PairDurationSinceMidnightOrBuilder */
public interface PlaceProto$PairDurationSinceMidnightOrBuilder extends MessageLiteOrBuilder {
    Duration getHighBoundSecondsFromMidnight();

    Duration getLowBoundSecondsFromMidnight();

    boolean hasHighBoundSecondsFromMidnight();

    boolean hasLowBoundSecondsFromMidnight();
}
