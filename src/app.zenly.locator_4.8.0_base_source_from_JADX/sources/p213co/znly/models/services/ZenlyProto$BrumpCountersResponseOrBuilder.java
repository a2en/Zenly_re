package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.ZenlyProto$BrumpCountersResponse.C7941b;

/* renamed from: co.znly.models.services.ZenlyProto$BrumpCountersResponseOrBuilder */
public interface ZenlyProto$BrumpCountersResponseOrBuilder extends MessageLiteOrBuilder {
    C7941b getCounters(int i);

    int getCountersCount();

    List<C7941b> getCountersList();

    C8239q0 getError();

    boolean hasError();
}
