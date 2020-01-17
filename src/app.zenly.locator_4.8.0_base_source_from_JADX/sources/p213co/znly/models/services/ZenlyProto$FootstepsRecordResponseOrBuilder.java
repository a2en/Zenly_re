package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.footsteps.C7309d;
import p213co.znly.models.footsteps.C7313f;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsRecordResponseOrBuilder */
public interface ZenlyProto$FootstepsRecordResponseOrBuilder extends MessageLiteOrBuilder {
    int getGeodataVersion();

    boolean getIsCompact();

    C7313f getMyRecords(int i);

    int getMyRecordsCount();

    List<C7313f> getMyRecordsList();

    C7313f getRecords(int i);

    int getRecordsCount();

    List<C7313f> getRecordsList();

    C7309d getRecordsPerLocality(int i);

    int getRecordsPerLocalityCount();

    List<C7309d> getRecordsPerLocalityList();
}
