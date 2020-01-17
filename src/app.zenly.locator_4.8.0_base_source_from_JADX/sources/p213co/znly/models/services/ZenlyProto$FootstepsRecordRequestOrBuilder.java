package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7315g;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsRecordRequestOrBuilder */
public interface ZenlyProto$FootstepsRecordRequestOrBuilder extends MessageLiteOrBuilder {
    boolean getIsCompact();

    C7315g getLimit();

    int getLimitValue();

    long getLocality(int i);

    int getLocalityCount();

    List<Long> getLocalityList();
}
