package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.VisitPointProto$VisitPoint.C6934b;
import p213co.znly.models.VisitPointProto$VisitPoint.C6936c;

/* renamed from: co.znly.models.VisitPointProto$VisitPointOrBuilder */
public interface VisitPointProto$VisitPointOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    C6934b getHeading();

    double getHorizontalPrecision();

    double getLatitude();

    double getLongitude();

    C6847b getPlaceTag();

    int getPlaceTagValue();

    C6936c getStatus();

    int getStatusValue();

    Timestamp getTimeIn();

    Timestamp getTimeOut();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();

    boolean hasHeading();

    boolean hasTimeIn();

    boolean hasTimeOut();
}
