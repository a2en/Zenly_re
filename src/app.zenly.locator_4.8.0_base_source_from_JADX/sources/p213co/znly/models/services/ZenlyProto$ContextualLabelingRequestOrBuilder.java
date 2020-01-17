package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;
import p213co.znly.models.reversegeocoder.C7917e;
import p213co.znly.models.reversegeocoder.C7923h;

/* renamed from: co.znly.models.services.ZenlyProto$ContextualLabelingRequestOrBuilder */
public interface ZenlyProto$ContextualLabelingRequestOrBuilder extends MessageLiteOrBuilder {
    C7917e getParentZones(int i);

    int getParentZonesCount();

    List<C7917e> getParentZonesList();

    int getParentZonesValue(int i);

    List<Integer> getParentZonesValueList();

    C8303u1 getType();

    int getTypeValue();

    C7923h getViewport(int i);

    int getViewportCount();

    List<C7923h> getViewportList();

    C7272d0 getViewportObsolete(int i);

    int getViewportObsoleteCount();

    List<C7272d0> getViewportObsoleteList();
}
