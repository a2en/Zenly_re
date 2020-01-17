package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.reversegeocoder.C7919f;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$ExternalReverseGeoCodeResponseOrBuilder */
public interface ReverseGeoCoderProto$ExternalReverseGeoCodeResponseOrBuilder extends MessageLiteOrBuilder {
    C7911b getAddress();

    C8054f getError();

    C7919f getProvider();

    int getProviderValue();

    boolean hasAddress();

    boolean hasError();
}
