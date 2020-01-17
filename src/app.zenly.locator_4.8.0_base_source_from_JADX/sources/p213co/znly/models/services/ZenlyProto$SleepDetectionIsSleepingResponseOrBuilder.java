package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.sleepdetection.C8282b;
import p213co.znly.models.sleepdetection.C8408b;

/* renamed from: co.znly.models.services.ZenlyProto$SleepDetectionIsSleepingResponseOrBuilder */
public interface ZenlyProto$SleepDetectionIsSleepingResponseOrBuilder extends MessageLiteOrBuilder {
    C8282b getError();

    C8408b getStates(int i);

    int getStatesCount();

    List<C8408b> getStatesList();

    boolean hasError();
}
