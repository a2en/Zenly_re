package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.TypesProto$MagneticFieldOrBuilder */
public interface TypesProto$MagneticFieldOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    double getX();

    double getY();

    double getZ();

    boolean hasCreatedAt();
}
