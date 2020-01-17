package p213co.znly.models.services.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$LocalityAtRequestOrBuilder */
public interface FootstepsProto$LocalityAtRequestOrBuilder extends MessageLiteOrBuilder {
    boolean getIncludeShapes();

    String getLocale();

    ByteString getLocaleBytes();

    C6950b0 getPoint(int i);

    int getPointCount();

    List<C6950b0> getPointList();
}
