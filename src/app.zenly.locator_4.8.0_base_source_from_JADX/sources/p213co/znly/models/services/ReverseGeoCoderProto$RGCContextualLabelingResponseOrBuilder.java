package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.reversegeocoder.C7917e;
import p213co.znly.models.reversegeocoder.C7919f;
import p213co.znly.models.reversegeocoder.C7925i;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$RGCContextualLabelingResponseOrBuilder */
public interface ReverseGeoCoderProto$RGCContextualLabelingResponseOrBuilder extends MessageLiteOrBuilder {
    C7911b getAddress();

    C6950b0 getCentroid();

    long getId();

    String getLocalizedLabel();

    ByteString getLocalizedLabelBytes();

    C7925i getParentZones(int i);

    int getParentZonesCount();

    List<C7925i> getParentZonesList();

    C7919f getProvider();

    int getProviderValue();

    C7917e getType();

    int getTypeValue();

    boolean hasAddress();

    boolean hasCentroid();
}
