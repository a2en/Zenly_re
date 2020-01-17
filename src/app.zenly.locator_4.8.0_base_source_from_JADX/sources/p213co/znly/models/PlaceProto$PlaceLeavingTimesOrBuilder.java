package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PlaceProto$PlaceLeavingTimesOrBuilder */
public interface PlaceProto$PlaceLeavingTimesOrBuilder extends MessageLiteOrBuilder {
    PlaceProto$LeavingTimes getPlaceLeavingTimes(int i);

    int getPlaceLeavingTimesCount();

    List<PlaceProto$LeavingTimes> getPlaceLeavingTimesList();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
