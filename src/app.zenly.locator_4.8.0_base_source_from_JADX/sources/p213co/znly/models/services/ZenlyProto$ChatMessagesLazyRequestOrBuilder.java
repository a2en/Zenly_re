package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatMessagesLazyRequestOrBuilder */
public interface ZenlyProto$ChatMessagesLazyRequestOrBuilder extends MessageLiteOrBuilder {
    int getLimit();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getToCursor();

    ByteString getToCursorBytes();
}
