package p213co.znly.models.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.FootstepsProto$LocalityOrBuilder */
public interface FootstepsProto$LocalityOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getCentroid();

    String getCountryIsoCode();

    ByteString getCountryIsoCodeBytes();

    Timestamp getLastVisit();

    String getLocalityId();

    ByteString getLocalityIdBytes();

    String getLocalityName();

    ByteString getLocalityNameBytes();

    String getParentCountryIsoCode();

    ByteString getParentCountryIsoCodeBytes();

    C7917e getType();

    int getTypeValue();

    Duration getVisitTotalDuration();

    int getVisiteCount();

    boolean hasCentroid();

    boolean hasLastVisit();

    boolean hasVisitTotalDuration();
}
