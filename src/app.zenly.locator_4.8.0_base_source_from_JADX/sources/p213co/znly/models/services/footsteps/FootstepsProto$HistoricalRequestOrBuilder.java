package p213co.znly.models.services.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7311e;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$HistoricalRequestOrBuilder */
public interface FootstepsProto$HistoricalRequestOrBuilder extends MessageLiteOrBuilder {
    C7311e getExpectedFormat();

    int getExpectedFormatValue();

    String getUserId();

    ByteString getUserIdBytes();
}
