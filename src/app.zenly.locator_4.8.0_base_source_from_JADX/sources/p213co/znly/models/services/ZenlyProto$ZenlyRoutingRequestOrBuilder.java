package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.services.ZenlyProto$ZenlyRoutingRequestOrBuilder */
public interface ZenlyProto$ZenlyRoutingRequestOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getDestination();

    C7921g getMode();

    int getModeValue();

    C6950b0 getOrigin();

    boolean hasDestination();

    boolean hasOrigin();
}
