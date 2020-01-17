package p213co.znly.models.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.nights.NightsProto$NightsAtOrBuilder */
public interface NightsProto$NightsAtOrBuilder extends MessageLiteOrBuilder {
    String getLocationId();

    ByteString getLocationIdBytes();

    C7419e getNights(int i);

    int getNightsCount();

    List<C7419e> getNightsList();

    String getStayId();

    ByteString getStayIdBytes();
}
