package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.models.services.ZenlyProto$DeviceUpdateRequestOrBuilder */
public interface ZenlyProto$DeviceUpdateRequestOrBuilder extends MessageLiteOrBuilder {
    C7458s getDevice();

    FieldMask getMask();

    boolean hasDevice();

    boolean hasMask();
}
