package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.usermonitor.C8316b;

/* renamed from: co.znly.models.core.CoreUserMonitorProto$UserMonitoringRequestOrBuilder */
public interface CoreUserMonitorProto$UserMonitoringRequestOrBuilder extends MessageLiteOrBuilder {
    C8316b getEventType();

    int getEventTypeValue();

    String getWatchedUserUuid();

    ByteString getWatchedUserUuidBytes();
}
