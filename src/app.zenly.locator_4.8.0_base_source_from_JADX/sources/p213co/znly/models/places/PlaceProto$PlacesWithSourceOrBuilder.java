package p213co.znly.models.places;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.places.PlaceProto$PlacesWithSourceOrBuilder */
public interface PlaceProto$PlacesWithSourceOrBuilder extends MessageLiteOrBuilder {
    C7873c getPlaces(int i);

    int getPlacesCount();

    List<C7873c> getPlacesList();

    String getSource();

    ByteString getSourceBytes();
}
