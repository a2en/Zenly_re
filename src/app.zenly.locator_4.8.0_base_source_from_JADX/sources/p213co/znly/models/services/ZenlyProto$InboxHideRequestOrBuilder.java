package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$InboxHideRequestOrBuilder */
public interface ZenlyProto$InboxHideRequestOrBuilder extends MessageLiteOrBuilder {
    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getTip();

    ByteString getTipBytes();
}
