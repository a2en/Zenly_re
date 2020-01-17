package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7490v1;

/* renamed from: co.znly.models.services.ZenlyProto$PingStatsResponseOrBuilder */
public interface ZenlyProto$PingStatsResponseOrBuilder extends MessageLiteOrBuilder {
    C7981a4 getError();

    C7490v1 getReceived();

    C7490v1 getSent();

    boolean hasError();

    boolean hasReceived();

    boolean hasSent();
}
