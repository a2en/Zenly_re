package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.WeatherProto$WeatherRegionCacheEntryOrBuilder */
public interface WeatherProto$WeatherRegionCacheEntryOrBuilder extends MessageLiteOrBuilder {
    Timestamp getExpiresAt();

    C7394m3 getRegion();

    boolean hasExpiresAt();

    boolean hasRegion();
}
