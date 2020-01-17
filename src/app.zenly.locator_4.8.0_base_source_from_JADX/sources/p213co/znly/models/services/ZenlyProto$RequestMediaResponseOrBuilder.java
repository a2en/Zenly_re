package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.ZenlyProto$RequestMediaResponseOrBuilder */
public interface ZenlyProto$RequestMediaResponseOrBuilder extends MessageLiteOrBuilder {
    C8129j4 getError();

    Timestamp getValidUntil();

    boolean hasError();

    boolean hasValidUntil();
}
