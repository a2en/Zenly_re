package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.TrackingContextProto$TrackingContext;

/* renamed from: co.znly.models.services.BubbleProto$BubbleUserUpdateOrBuilder */
public interface BubbleProto$BubbleUserUpdateOrBuilder extends MessageLiteOrBuilder {
    TrackingContextProto$TrackingContext getTcs(int i);

    int getTcsCount();

    List<TrackingContextProto$TrackingContext> getTcsList();
}
