package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.models.services.ZenlyProto$DeviceStreamEventOrBuilder */
public interface ZenlyProto$DeviceStreamEventOrBuilder extends MessageLiteOrBuilder {
    C7458s getDevice();

    C7280e getOp();

    int getOpValue();

    boolean hasDevice();
}
