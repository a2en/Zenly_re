package p213co.znly.models.nights;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.nights.C7415d.C7417b;

/* renamed from: co.znly.models.nights.NightsProto$LocationOrBuilder */
public interface NightsProto$LocationOrBuilder extends MessageLiteOrBuilder {
    String getId();

    ByteString getIdBytes();

    String getLabel();

    ByteString getLabelBytes();

    C6950b0 getPoint();

    C7417b getType();

    int getTypeValue();

    boolean hasPoint();
}
