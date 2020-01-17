package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.TimeTogetherProto$GatheringRequest$TimerangeOrBuilder */
public interface TimeTogetherProto$GatheringRequest$TimerangeOrBuilder extends MessageLiteOrBuilder {
    Timestamp getFromDate();

    Timestamp getToDate();

    boolean hasFromDate();

    boolean hasToDate();
}
