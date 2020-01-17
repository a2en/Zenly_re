package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.TypesProto$HeadingOrBuilder */
public interface TypesProto$HeadingOrBuilder extends MessageLiteOrBuilder {
    double getAccuracy();

    Timestamp getCreatedAt();

    double getHeading();

    double getMagneticHeading();

    boolean hasCreatedAt();
}
