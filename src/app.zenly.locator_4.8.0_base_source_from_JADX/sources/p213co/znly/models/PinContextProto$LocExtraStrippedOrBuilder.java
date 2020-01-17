package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7320g1.C7322b;

/* renamed from: co.znly.models.PinContextProto$LocExtraStrippedOrBuilder */
public interface PinContextProto$LocExtraStrippedOrBuilder extends MessageLiteOrBuilder {
    C7322b getDynamic();

    int getDynamicValue();

    Timestamp getHereSince();

    double getLatitude();

    double getLongitude();

    float getPrecision();

    float getSpeed();

    boolean hasHereSince();
}
