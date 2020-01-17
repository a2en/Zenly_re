package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$Response.C7931b;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponse$ResponseOrBuilder */
public interface ReverseGeoCoderProto$NearestVenueResponse$ResponseOrBuilder extends MessageLiteOrBuilder {
    C7931b getVenue(int i);

    int getVenueCount();

    List<C7931b> getVenueList();
}
