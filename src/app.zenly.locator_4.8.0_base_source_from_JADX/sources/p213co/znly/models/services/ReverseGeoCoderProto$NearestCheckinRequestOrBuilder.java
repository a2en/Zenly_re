package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$NearestCheckinRequestOrBuilder */
public interface ReverseGeoCoderProto$NearestCheckinRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C8133k getRequests(int i);

    int getRequestsCount();

    List<C8133k> getRequestsList();
}
