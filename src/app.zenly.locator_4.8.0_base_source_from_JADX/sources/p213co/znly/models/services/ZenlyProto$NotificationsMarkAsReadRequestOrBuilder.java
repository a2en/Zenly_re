package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.ZenlyProto$NotificationsMarkAsReadRequestOrBuilder */
public interface ZenlyProto$NotificationsMarkAsReadRequestOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}
