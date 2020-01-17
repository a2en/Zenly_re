package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ZenlyRoutingResponseOrBuilder */
public interface ZenlyProto$ZenlyRoutingResponseOrBuilder extends MessageLiteOrBuilder {
    int getDistance();

    C8084g6 getError();

    double getHigh(int i);

    int getHighCount();

    List<Double> getHighList();

    double getLow(int i);

    int getLowCount();

    List<Double> getLowList();

    Duration getTravelTime();

    boolean hasError();

    boolean hasTravelTime();
}
