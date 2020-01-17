package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7337h3;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.TypesProto$ConsolidatedTrackingContextOrBuilder */
public interface TypesProto$ConsolidatedTrackingContextOrBuilder extends MessageLiteOrBuilder {
    C7337h3 getTopEntry();

    TrackingContextProto$TrackingContext getTrackingContext();

    UserProto$User getUser();

    boolean hasTopEntry();

    boolean hasTrackingContext();

    boolean hasUser();
}
