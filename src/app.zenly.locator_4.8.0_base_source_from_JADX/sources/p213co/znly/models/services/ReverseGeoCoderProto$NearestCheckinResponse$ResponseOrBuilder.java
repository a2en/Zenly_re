package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$Response.C7928b;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinResponse$ResponseOrBuilder */
public interface ReverseGeoCoderProto$NearestCheckinResponse$ResponseOrBuilder extends MessageLiteOrBuilder {
    C7928b getCheckinStats(int i);

    int getCheckinStatsCount();

    List<C7928b> getCheckinStatsList();
}
