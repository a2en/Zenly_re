package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6947a3;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$PingSendResponseOrBuilder */
public interface ZenlyProto$PingSendResponseOrBuilder extends MessageLiteOrBuilder {
    C6947a3 getBlockRelationship();

    int getBlockRelationshipValue();

    C8371x3 getError();

    PingProto$Ping2 getPing();

    boolean hasError();

    boolean hasPing();
}
