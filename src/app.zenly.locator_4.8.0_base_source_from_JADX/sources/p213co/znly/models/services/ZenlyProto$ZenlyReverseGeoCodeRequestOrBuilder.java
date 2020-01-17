package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;

/* renamed from: co.znly.models.services.ZenlyProto$ZenlyReverseGeoCodeRequestOrBuilder */
public interface ZenlyProto$ZenlyReverseGeoCodeRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C6950b0 getLocation();

    boolean hasLocation();
}
