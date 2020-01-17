package p213co.znly.models.services.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$ContextualLabelingRequestOrBuilder */
public interface FootstepsProto$ContextualLabelingRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C7272d0 getRectangle();

    int getZoomLevel();

    boolean hasRectangle();
}
