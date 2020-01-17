package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$RGCLocationResponseOrBuilder */
public interface ReverseGeoCoderProto$RGCLocationResponseOrBuilder extends MessageLiteOrBuilder {
    String getBorough();

    ByteString getBoroughBytes();

    long getBoroughId();

    String getCountry();

    ByteString getCountryBytes();

    long getCountryDependencyId();

    long getCountryId();

    String getIsoCountryCode();

    ByteString getIsoCountryCodeBytes();

    String getIsoCountryDependencyCode();

    ByteString getIsoCountryDependencyCodeBytes();

    String getLocality();

    ByteString getLocalityBytes();

    long getLocalityId();

    String getMacroregion();

    ByteString getMacroregionBytes();

    long getMacroregionId();

    C6950b0 getPoint();

    String getRegion();

    ByteString getRegionBytes();

    long getRegionId();

    boolean hasPoint();
}
