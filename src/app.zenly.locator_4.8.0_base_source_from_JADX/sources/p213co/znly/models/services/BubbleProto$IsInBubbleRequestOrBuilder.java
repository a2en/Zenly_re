package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.BubbleProto$IsInBubbleRequestOrBuilder */
public interface BubbleProto$IsInBubbleRequestOrBuilder extends MessageLiteOrBuilder {
    double getLatitude();

    double getLongitude();

    String getUserId();

    ByteString getUserIdBytes();
}
