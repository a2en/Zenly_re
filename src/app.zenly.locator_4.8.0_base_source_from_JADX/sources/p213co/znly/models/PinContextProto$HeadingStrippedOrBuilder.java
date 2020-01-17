package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PinContextProto$HeadingStripped.C6815b;

/* renamed from: co.znly.models.PinContextProto$HeadingStrippedOrBuilder */
public interface PinContextProto$HeadingStrippedOrBuilder extends MessageLiteOrBuilder {
    Timestamp getDepartureTime();

    C6815b getDestination();

    Timestamp getEta();

    C6815b getOrigin();

    boolean hasDepartureTime();

    boolean hasDestination();

    boolean hasEta();

    boolean hasOrigin();
}
