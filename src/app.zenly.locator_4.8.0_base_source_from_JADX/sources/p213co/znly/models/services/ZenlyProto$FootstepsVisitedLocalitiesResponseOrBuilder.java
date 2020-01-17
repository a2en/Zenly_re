package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7305b;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsVisitedLocalitiesResponseOrBuilder */
public interface ZenlyProto$FootstepsVisitedLocalitiesResponseOrBuilder extends MessageLiteOrBuilder {
    int getGeodataVersion();

    C7305b getLocalities(int i);

    int getLocalitiesCount();

    List<C7305b> getLocalitiesList();
}
