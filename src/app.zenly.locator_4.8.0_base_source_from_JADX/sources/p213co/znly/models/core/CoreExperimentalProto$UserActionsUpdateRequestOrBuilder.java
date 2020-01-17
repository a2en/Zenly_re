package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.experimental.models.C7293c;

/* renamed from: co.znly.models.core.CoreExperimentalProto$UserActionsUpdateRequestOrBuilder */
public interface CoreExperimentalProto$UserActionsUpdateRequestOrBuilder extends MessageLiteOrBuilder {
    FieldMask getMask();

    C7293c getUserActions();

    boolean hasMask();

    boolean hasUserActions();
}
