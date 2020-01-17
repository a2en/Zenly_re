package p213co.znly.models.services.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$ShapeRequestOrBuilder */
public interface FootstepsProto$ShapeRequestOrBuilder extends MessageLiteOrBuilder {
    long getId(int i);

    int getIdCount();

    List<Long> getIdList();

    String getLocale();

    ByteString getLocaleBytes();

    boolean getSkipShape();
}
