package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;
import p213co.znly.models.reversegeocoder.C7917e;
import p213co.znly.models.reversegeocoder.C7919f;
import p213co.znly.models.reversegeocoder.C7923h;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$RGCContextualLabelingRequestOrBuilder */
public interface ReverseGeoCoderProto$RGCContextualLabelingRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C7917e getParentZones(int i);

    int getParentZonesCount();

    List<C7917e> getParentZonesList();

    int getParentZonesValue(int i);

    List<Integer> getParentZonesValueList();

    C7919f getPreferredProvider();

    int getPreferredProviderValue();

    C7272d0 getRectangleObsolete();

    boolean getReturnFullAddress();

    boolean getReturnStreet();

    C7923h getViewport();

    boolean hasRectangleObsolete();

    boolean hasViewport();
}
