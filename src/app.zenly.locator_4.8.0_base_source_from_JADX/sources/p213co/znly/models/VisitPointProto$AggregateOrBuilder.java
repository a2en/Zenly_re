package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.VisitPointProto$AggregateOrBuilder */
public interface VisitPointProto$AggregateOrBuilder extends MessageLiteOrBuilder {
    double getProbability();

    VisitPointProto$VisitPoint getVisitPoint();

    double getWeight();

    boolean hasVisitPoint();
}
