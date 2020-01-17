package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7421f;
import p213co.znly.models.services.nights.C8194b;

/* renamed from: co.znly.models.services.ZenlyProto$NightsStayResponseOrBuilder */
public interface ZenlyProto$NightsStayResponseOrBuilder extends MessageLiteOrBuilder {
    C8194b getError();

    C7421f getNights(int i);

    int getNightsCount();

    List<C7421f> getNightsList();

    int getNightsVersion();

    boolean hasError();
}
