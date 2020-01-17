package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestVenueResponseOrBuilder */
public interface ReverseGeoCoderProto$NearestVenueResponseOrBuilder extends MessageLiteOrBuilder {
    ReverseGeoCoderProto$NearestVenueResponse$Response getResponses(int i);

    int getResponsesCount();

    List<ReverseGeoCoderProto$NearestVenueResponse$Response> getResponsesList();
}
