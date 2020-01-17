package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$MeUpdateRequestOrBuilder */
public interface ZenlyProto$MeUpdateRequestOrBuilder extends MessageLiteOrBuilder {
    FieldMask getMask();

    UserProto$User getUser();

    boolean hasMask();

    boolean hasUser();
}
