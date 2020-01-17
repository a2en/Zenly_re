package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.SleepFeaturesProto$SleepFeaturesOrBuilder */
public interface SleepFeaturesProto$SleepFeaturesOrBuilder extends MessageLiteOrBuilder {
    int getHours(int i);

    int getHoursCount();

    List<Integer> getHoursList();

    SleepFeaturesProto$SleepPattern getSleepPatterns(int i);

    int getSleepPatternsCount();

    List<SleepFeaturesProto$SleepPattern> getSleepPatternsList();

    boolean getUseMagnetometer();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
