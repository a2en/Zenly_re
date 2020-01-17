package p213co.znly.models.reversegeocoder;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder */
public interface ReverseGeoCoderProto$ReverseGeoCodeInformationOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getCentroid();

    long getId();

    String getLabel();

    ByteString getLabelBytes();

    C7925i getParentZones(int i);

    int getParentZonesCount();

    List<C7925i> getParentZonesList();

    C7917e getType();

    int getTypeValue();

    boolean hasCentroid();
}
