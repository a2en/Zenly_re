package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7919f;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$ExternalReverseGeoCodeRequestOrBuilder */
public interface ReverseGeoCoderProto$ExternalReverseGeoCodeRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C6950b0 getLocation();

    C7919f getPreferredProvider();

    int getPreferredProviderValue();

    boolean hasLocation();
}
