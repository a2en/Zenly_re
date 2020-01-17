package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PlaceProto$PlacesAttendanceOrBuilder */
public interface PlaceProto$PlacesAttendanceOrBuilder extends MessageLiteOrBuilder {
    PlaceProto$PlaceAttendance getPlaceAttendances(int i);

    int getPlaceAttendancesCount();

    List<PlaceProto$PlaceAttendance> getPlaceAttendancesList();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
