package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7425h;
import p213co.znly.models.services.nights.C8194b;

/* renamed from: co.znly.models.services.ZenlyProto$NightsTimelineResponseOrBuilder */
public interface ZenlyProto$NightsTimelineResponseOrBuilder extends MessageLiteOrBuilder {
    C8194b getError();

    int getNightsVersion();

    C7425h getStays(int i);

    int getStaysCount();

    List<C7425h> getStaysList();

    boolean hasError();
}
