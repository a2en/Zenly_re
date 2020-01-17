package p213co.znly.models.services.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7423g;

/* renamed from: co.znly.models.services.nights.FootstepsNightsProto$NightsStayRequestOrBuilder */
public interface FootstepsNightsProto$NightsStayRequestOrBuilder extends MessageLiteOrBuilder {
    C7423g getOptions(int i);

    int getOptionsCount();

    List<C7423g> getOptionsList();

    String getUserId();

    ByteString getUserIdBytes();
}
