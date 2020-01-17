package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsContextualLabelingResponseOrBuilder */
public interface ZenlyProto$FootstepsContextualLabelingResponseOrBuilder extends MessageLiteOrBuilder {
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
