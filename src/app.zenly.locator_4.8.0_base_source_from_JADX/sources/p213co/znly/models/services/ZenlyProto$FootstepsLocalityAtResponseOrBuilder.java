package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsLocalityAtResponseOrBuilder */
public interface ZenlyProto$FootstepsLocalityAtResponseOrBuilder extends MessageLiteOrBuilder {
    ReverseGeoCoderProto$Shape getLocalities(int i);

    int getLocalitiesCount();

    List<ReverseGeoCoderProto$Shape> getLocalitiesList();
}
