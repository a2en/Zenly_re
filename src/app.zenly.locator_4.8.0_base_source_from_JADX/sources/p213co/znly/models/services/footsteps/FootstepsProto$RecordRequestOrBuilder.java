package p213co.znly.models.services.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7315g;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$RecordRequestOrBuilder */
public interface FootstepsProto$RecordRequestOrBuilder extends MessageLiteOrBuilder {
    boolean getIsCompact();

    C7315g getLimit();

    int getLimitValue();

    long getLocality(int i);

    int getLocalityCount();

    List<Long> getLocalityList();

    String getUserId();

    ByteString getUserIdBytes();
}
