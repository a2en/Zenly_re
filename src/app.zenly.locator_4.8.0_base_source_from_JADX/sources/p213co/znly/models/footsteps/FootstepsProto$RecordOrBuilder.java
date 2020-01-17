package p213co.znly.models.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.FootstepsProto$RecordOrBuilder */
public interface FootstepsProto$RecordOrBuilder extends MessageLiteOrBuilder {
    double getAreaUncovered();

    long getPlaceId();

    C7917e getType();

    int getTypeValue();

    String getUserId();

    ByteString getUserIdBytes();
}
