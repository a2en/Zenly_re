package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7962b;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7964c;

/* renamed from: co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequestOrBuilder */
public interface ZenlyProto$TrackingContextSubscribeStreamRequestOrBuilder extends MessageLiteOrBuilder {
    C7962b getGroup();

    C7964c getMode();

    int getModeValue();

    String getSelected();

    ByteString getSelectedBytes();

    C7272d0 getViewport();

    boolean hasGroup();

    boolean hasViewport();
}
