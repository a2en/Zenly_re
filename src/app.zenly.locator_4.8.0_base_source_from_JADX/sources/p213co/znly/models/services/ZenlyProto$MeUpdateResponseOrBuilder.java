package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$MeUpdateResponseOrBuilder */
public interface ZenlyProto$MeUpdateResponseOrBuilder extends MessageLiteOrBuilder {
    C8125j3 getError();

    UserProto$User getUser();

    boolean hasError();

    boolean hasUser();
}
