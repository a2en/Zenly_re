package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PlaceProto$PlaceAttendance.ContinuousHistogram;

/* renamed from: co.znly.models.PlaceProto$PlaceAttendanceOrBuilder */
public interface PlaceProto$PlaceAttendanceOrBuilder extends MessageLiteOrBuilder {
    ContinuousHistogram getHistogramFriday();

    ContinuousHistogram getHistogramMonday();

    ContinuousHistogram getHistogramSaturday();

    ContinuousHistogram getHistogramSunday();

    ContinuousHistogram getHistogramThursday();

    ContinuousHistogram getHistogramTuesday();

    ContinuousHistogram getHistogramWednesday();

    int getPlaceId();

    boolean hasHistogramFriday();

    boolean hasHistogramMonday();

    boolean hasHistogramSaturday();

    boolean hasHistogramSunday();

    boolean hasHistogramThursday();

    boolean hasHistogramTuesday();

    boolean hasHistogramWednesday();
}
