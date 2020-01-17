package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7286e2;
import p213co.znly.models.PlaceProto$Place;

/* renamed from: co.znly.models.services.ZenlyProto$UserPlacesResponseOrBuilder */
public interface ZenlyProto$UserPlacesResponseOrBuilder extends MessageLiteOrBuilder {
    @Deprecated
    PlaceProto$Place getPlace(int i);

    @Deprecated
    int getPlaceCount();

    @Deprecated
    List<PlaceProto$Place> getPlaceList();

    C7286e2 getPlaces(int i);

    int getPlacesCount();

    List<C7286e2> getPlacesList();
}
