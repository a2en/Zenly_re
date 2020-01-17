package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MotionProto$TrajectoryOrBuilder */
public interface MotionProto$TrajectoryOrBuilder extends MessageLiteOrBuilder {
    Duration getAverageDuration();

    C6950b0 getDestination();

    Duration getMedianDuration();

    C6950b0 getOrigin();

    boolean hasAverageDuration();

    boolean hasDestination();

    boolean hasMedianDuration();

    boolean hasOrigin();
}
