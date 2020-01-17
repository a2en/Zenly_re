package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PlaceProto$PlacesOrBuilder */
public interface PlaceProto$PlacesOrBuilder extends MessageLiteOrBuilder {
    PlaceProto$Place getPlace(int i);

    int getPlaceCount();

    List<PlaceProto$Place> getPlaceList();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
