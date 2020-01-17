package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7919f;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$ExternalRoutingRequestOrBuilder */
public interface ReverseGeoCoderProto$ExternalRoutingRequestOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getDestination();

    C7921g getMode();

    int getModeValue();

    C6950b0 getOrigin();

    C7919f getPreferredProvider();

    int getPreferredProviderValue();

    boolean hasDestination();

    boolean hasOrigin();
}
