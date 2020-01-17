package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6975c0;

/* renamed from: co.znly.models.core.GeoProto$RouteInfoOrBuilder */
public interface GeoProto$RouteInfoOrBuilder extends MessageLiteOrBuilder {
    long getDistance();

    Duration getDuration();

    C6975c0 getHigh();

    C6975c0 getLow();

    boolean hasDuration();

    boolean hasHigh();

    boolean hasLow();
}
