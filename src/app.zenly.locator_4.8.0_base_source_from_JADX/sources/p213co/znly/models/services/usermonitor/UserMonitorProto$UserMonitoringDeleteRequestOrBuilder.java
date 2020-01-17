package p213co.znly.models.services.usermonitor;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.usermonitor.UserMonitorProto$UserMonitoringDeleteRequestOrBuilder */
public interface UserMonitorProto$UserMonitoringDeleteRequestOrBuilder extends MessageLiteOrBuilder {
    C8316b getEventType();

    int getEventTypeValue();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getWatchedUserUuid();

    ByteString getWatchedUserUuidBytes();
}
