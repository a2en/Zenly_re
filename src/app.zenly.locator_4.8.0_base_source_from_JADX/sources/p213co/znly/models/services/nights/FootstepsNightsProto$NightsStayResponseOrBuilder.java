package p213co.znly.models.services.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7421f;

/* renamed from: co.znly.models.services.nights.FootstepsNightsProto$NightsStayResponseOrBuilder */
public interface FootstepsNightsProto$NightsStayResponseOrBuilder extends MessageLiteOrBuilder {
    C8194b getError();

    C7421f getNights(int i);

    int getNightsCount();

    List<C7421f> getNightsList();

    int getNightsVersion();

    boolean hasError();
}
