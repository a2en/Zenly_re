package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.UICacheProto$UiCacheSmsSchedulerOrBuilder */
public interface UICacheProto$UiCacheSmsSchedulerOrBuilder extends MessageLiteOrBuilder {
    int getFailed();

    Timestamp getLastSentAt();

    C7247w2 getPending(int i);

    int getPendingCount();

    List<C7247w2> getPendingList();

    int getSent();

    int getTotal();

    boolean hasLastSentAt();
}
