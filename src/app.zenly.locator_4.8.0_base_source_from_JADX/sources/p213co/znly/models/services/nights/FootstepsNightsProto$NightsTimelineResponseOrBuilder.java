package p213co.znly.models.services.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7425h;

/* renamed from: co.znly.models.services.nights.FootstepsNightsProto$NightsTimelineResponseOrBuilder */
public interface FootstepsNightsProto$NightsTimelineResponseOrBuilder extends MessageLiteOrBuilder {
    C8194b getError();

    int getNightsVersion();

    C7425h getStays(int i);

    int getStaysCount();

    List<C7425h> getStaysList();

    boolean hasError();
}
