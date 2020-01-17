package p213co.znly.models.sleepdetection;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.sleepdetection.C8408b.C8409a;
import p213co.znly.models.sleepdetection.C8408b.C8412c;
import p213co.znly.models.sleepdetection.C8408b.C8414d;

/* renamed from: co.znly.models.sleepdetection.SleepDetectionProto$SleepStateOrBuilder */
public interface SleepDetectionProto$SleepStateOrBuilder extends MessageLiteOrBuilder {
    C8409a getBedTimeType();

    int getBedTimeTypeValue();

    Timestamp getBedTimestamp();

    Timestamp getEstimatedWakeUpTimestamp();

    boolean getIsInSleepPeriod();

    boolean getIsSleeping();

    String getNightId();

    ByteString getNightIdBytes();

    Timestamp getOversleepingTimestamp();

    PlaceProto$Place getPlace();

    C8412c getSleepState();

    int getSleepStateValue();

    String getUserId();

    ByteString getUserIdBytes();

    Timestamp getWakeUpTimestamp();

    C8414d getWakeUpType();

    int getWakeUpTypeValue();

    boolean hasBedTimestamp();

    boolean hasEstimatedWakeUpTimestamp();

    boolean hasOversleepingTimestamp();

    boolean hasPlace();

    boolean hasWakeUpTimestamp();
}
