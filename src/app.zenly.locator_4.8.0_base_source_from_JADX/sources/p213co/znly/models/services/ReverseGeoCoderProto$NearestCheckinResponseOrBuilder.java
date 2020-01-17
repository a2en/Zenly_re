package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponseOrBuilder */
public interface ReverseGeoCoderProto$NearestCheckinResponseOrBuilder extends MessageLiteOrBuilder {
    ReverseGeoCoderProto$NearestCheckinResponse$Response getResponses(int i);

    int getResponsesCount();

    List<ReverseGeoCoderProto$NearestCheckinResponse$Response> getResponsesList();
}
