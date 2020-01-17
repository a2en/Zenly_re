package p213co.znly.models.services.nights;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.nights.C7415d;

/* renamed from: co.znly.models.services.nights.FootstepsNightsProto$NightsLocationsResponseOrBuilder */
public interface FootstepsNightsProto$NightsLocationsResponseOrBuilder extends MessageLiteOrBuilder {
    C8194b getError();

    C7415d getLocations(int i);

    int getLocationsCount();

    List<C7415d> getLocationsList();

    int getNightsVersion();

    boolean hasError();
}
