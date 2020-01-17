package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$RGCFootstepsRequestOrBuilder */
public interface ReverseGeoCoderProto$RGCFootstepsRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    C7272d0 getRectangle();

    C8177n getScope();

    int getScopeValue();

    boolean hasRectangle();
}
