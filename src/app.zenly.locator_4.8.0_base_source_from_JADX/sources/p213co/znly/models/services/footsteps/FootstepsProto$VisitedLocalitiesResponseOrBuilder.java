package p213co.znly.models.services.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7305b;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$VisitedLocalitiesResponseOrBuilder */
public interface FootstepsProto$VisitedLocalitiesResponseOrBuilder extends MessageLiteOrBuilder {
    int getGeodataVersion();

    C7305b getLocalities(int i);

    int getLocalitiesCount();

    List<C7305b> getLocalitiesList();
}
