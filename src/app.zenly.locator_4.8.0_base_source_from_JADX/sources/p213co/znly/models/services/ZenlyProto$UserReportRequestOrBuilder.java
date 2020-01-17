package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$UserReportRequestOrBuilder */
public interface ZenlyProto$UserReportRequestOrBuilder extends MessageLiteOrBuilder {
    boolean getIsTargetBlocked();

    String getReason();

    ByteString getReasonBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUserReason();

    ByteString getUserReasonBytes();
}
