package p213co.znly.models.reversegeocoder;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C7272d0;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$ViewportOrBuilder */
public interface ReverseGeoCoderProto$ViewportOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getCenter();

    double getHeading();

    int getHeight();

    double getTilt();

    C7272d0 getViewport();

    int getWidth();

    boolean hasCenter();

    boolean hasViewport();
}
