package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.services.ZenlyProto$InboxPagingRequestOrBuilder */
public interface ZenlyProto$InboxPagingRequestOrBuilder extends MessageLiteOrBuilder {
    Timestamp getFrom();

    boolean getInitState();

    boolean getRestoreFrom();

    boolean hasFrom();
}
