package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7468s2;
import p213co.znly.models.TrackingContextProto$TrackingContext;

/* renamed from: co.znly.models.services.ZenlyProto$TrackingContextPublishStreamRequestOrBuilder */
public interface ZenlyProto$TrackingContextPublishStreamRequestOrBuilder extends MessageLiteOrBuilder {
    FieldMask getMask();

    String getPushId();

    ByteString getPushIdBytes();

    long getSeq();

    C7468s2 getSpanContext();

    TrackingContextProto$TrackingContext getTrackingContext();

    boolean hasMask();

    boolean hasSpanContext();

    boolean hasTrackingContext();
}
