package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.GeofenceProto$GeofenceOrBuilder */
public interface GeofenceProto$GeofenceOrBuilder extends MessageLiteOrBuilder {
    double getLatitude();

    double getLongitude();

    double getRadius();

    String getUuid();

    ByteString getUuidBytes();
}
