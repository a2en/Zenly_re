package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.core.C7105g2.C7107b;

/* renamed from: co.znly.models.core.TypesProto$LocationOrBuilder */
public interface TypesProto$LocationOrBuilder extends MessageLiteOrBuilder {
    double getAltitude();

    double getBearing();

    int getFloor();

    double getHorizontalPrecision();

    double getLatitude();

    double getLongitude();

    C7107b getProvider();

    int getProviderValue();

    double getSpeed();

    Timestamp getTimestamp();

    double getVerticalPrecision();

    boolean hasTimestamp();
}
