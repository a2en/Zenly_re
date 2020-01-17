package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7919f;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$ExternalRoutingResponseOrBuilder */
public interface ReverseGeoCoderProto$ExternalRoutingResponseOrBuilder extends MessageLiteOrBuilder {
    int getDistance();

    C8070g getError();

    double getHigh(int i);

    int getHighCount();

    List<Double> getHighList();

    double getLow(int i);

    int getLowCount();

    List<Double> getLowList();

    C7919f getProvider();

    int getProviderValue();

    Duration getTravelTime();

    boolean hasError();

    boolean hasTravelTime();
}
