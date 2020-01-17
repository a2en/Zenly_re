package p213co.znly.models.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.footsteps.FootstepsProto$LocalityRecordsOrBuilder */
public interface FootstepsProto$LocalityRecordsOrBuilder extends MessageLiteOrBuilder {
    C7307c getFriendRecords(int i);

    int getFriendRecordsCount();

    List<C7307c> getFriendRecordsList();

    double getMyAreaUncovered();

    int getMyRank();

    long getPlaceId();

    C7917e getType();

    int getTypeValue();
}
