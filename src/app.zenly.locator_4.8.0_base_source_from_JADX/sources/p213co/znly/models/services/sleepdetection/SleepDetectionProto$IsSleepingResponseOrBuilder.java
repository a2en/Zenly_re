package p213co.znly.models.services.sleepdetection;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.sleepdetection.C8408b;

/* renamed from: co.znly.models.services.sleepdetection.SleepDetectionProto$IsSleepingResponseOrBuilder */
public interface SleepDetectionProto$IsSleepingResponseOrBuilder extends MessageLiteOrBuilder {
    C8282b getError();

    C8408b getStates(int i);

    int getStatesCount();

    List<C8408b> getStatesList();

    boolean hasError();
}
