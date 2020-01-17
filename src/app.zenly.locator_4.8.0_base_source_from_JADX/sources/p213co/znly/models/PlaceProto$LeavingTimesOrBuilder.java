package p213co.znly.models;

import java.util.Map;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PlaceProto$LeavingTimes.C6832e;
import p213co.znly.models.PlaceProto$LeavingTimes.C6835f;
import p213co.znly.models.PlaceProto$LeavingTimes.C6838g;

/* renamed from: co.znly.models.PlaceProto$LeavingTimesOrBuilder */
public interface PlaceProto$LeavingTimesOrBuilder extends MessageLiteOrBuilder {
    boolean containsDictDaysInOut(int i);

    boolean containsDictDaysTimes(int i);

    boolean containsDictTimeInOut(int i);

    @Deprecated
    Map<Integer, C6835f> getDictDaysInOut();

    int getDictDaysInOutCount();

    Map<Integer, C6835f> getDictDaysInOutMap();

    C6835f getDictDaysInOutOrDefault(int i, C6835f fVar);

    C6835f getDictDaysInOutOrThrow(int i);

    @Deprecated
    Map<Integer, C6832e> getDictDaysTimes();

    int getDictDaysTimesCount();

    Map<Integer, C6832e> getDictDaysTimesMap();

    C6832e getDictDaysTimesOrDefault(int i, C6832e eVar);

    C6832e getDictDaysTimesOrThrow(int i);

    @Deprecated
    Map<Integer, C6838g> getDictTimeInOut();

    int getDictTimeInOutCount();

    Map<Integer, C6838g> getDictTimeInOutMap();

    C6838g getDictTimeInOutOrDefault(int i, C6838g gVar);

    C6838g getDictTimeInOutOrThrow(int i);

    int getPlaceId();
}
