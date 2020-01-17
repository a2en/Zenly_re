package p213co.znly.models.services.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$ContextualLabelingResponseOrBuilder */
public interface FootstepsProto$ContextualLabelingResponseOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getCentroid();

    String getCountryIso();

    ByteString getCountryIsoBytes();

    long getId();

    String getLocalizedLabel();

    ByteString getLocalizedLabelBytes();

    C7917e getType();

    int getTypeValue();

    boolean hasCentroid();
}
