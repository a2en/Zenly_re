package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PlaceProto$Place.C6842a;
import p213co.znly.models.PlaceProto$Place.C6845c;

/* renamed from: co.znly.models.PlaceProto$PlaceOrBuilder */
public interface PlaceProto$PlaceOrBuilder extends MessageLiteOrBuilder {
    C6842a getAttendance(int i);

    int getAttendanceCount();

    List<C6842a> getAttendanceList();

    C6943a0 getCircle();

    long getId();

    C6845c getLabel();

    C6845c getSharedLabels(int i);

    int getSharedLabelsCount();

    List<C6845c> getSharedLabelsList();

    boolean hasCircle();

    boolean hasLabel();
}
