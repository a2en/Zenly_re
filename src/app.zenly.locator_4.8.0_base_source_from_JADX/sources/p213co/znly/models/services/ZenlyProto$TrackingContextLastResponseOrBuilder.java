package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.TrackingContextProto$TrackingContext;

/* renamed from: co.znly.models.services.ZenlyProto$TrackingContextLastResponseOrBuilder */
public interface ZenlyProto$TrackingContextLastResponseOrBuilder extends MessageLiteOrBuilder {
    TrackingContextProto$TrackingContext getTrackingContexts(int i);

    int getTrackingContextsCount();

    List<TrackingContextProto$TrackingContext> getTrackingContextsList();
}
