package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PlaceProto$PersonalPlaceOrBuilder */
public interface PlaceProto$PersonalPlaceOrBuilder extends MessageLiteOrBuilder {
    long getId();

    boolean getIsMain();

    C7276d2 getLabel();

    int getLabelValue();

    Timestamp getLastVisitedAt();

    double getLatitude();

    double getLongitude();

    double getRadius();

    boolean hasLastVisitedAt();
}
