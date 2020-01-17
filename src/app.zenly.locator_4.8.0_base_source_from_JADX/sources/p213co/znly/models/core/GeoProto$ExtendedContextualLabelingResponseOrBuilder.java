package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7309d;
import p213co.znly.models.reversegeocoder.C7915d;

/* renamed from: co.znly.models.core.GeoProto$ExtendedContextualLabelingResponseOrBuilder */
public interface GeoProto$ExtendedContextualLabelingResponseOrBuilder extends MessageLiteOrBuilder {
    C7309d getRecords();

    C7915d getViewportInformation();

    boolean hasRecords();

    boolean hasViewportInformation();
}
