package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6978c2;

/* renamed from: co.znly.models.services.ZenlyProto$PersonalPlacesResponseOrBuilder */
public interface ZenlyProto$PersonalPlacesResponseOrBuilder extends MessageLiteOrBuilder {
    C6978c2 getPlaces(int i);

    int getPlacesCount();

    List<C6978c2> getPlacesList();
}
