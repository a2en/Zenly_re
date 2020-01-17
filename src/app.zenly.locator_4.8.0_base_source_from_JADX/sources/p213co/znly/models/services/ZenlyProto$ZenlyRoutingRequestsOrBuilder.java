package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.services.ZenlyProto$ZenlyRoutingRequestsOrBuilder */
public interface ZenlyProto$ZenlyRoutingRequestsOrBuilder extends MessageLiteOrBuilder {
    C6950b0 getDestination();

    C7921g getModes(int i);

    int getModesCount();

    List<C7921g> getModesList();

    int getModesValue(int i);

    List<Integer> getModesValueList();

    C6950b0 getOrigin();

    boolean hasDestination();

    boolean hasOrigin();
}
