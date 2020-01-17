package p213co.znly.models.services.sleepdetection;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.sleepdetection.SleepDetectionProto$SchedulePushNotifRequestOrBuilder */
public interface SleepDetectionProto$SchedulePushNotifRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriendUuids(int i);

    ByteString getFriendUuidsBytes(int i);

    int getFriendUuidsCount();

    List<String> getFriendUuidsList();

    String getSubscriberUuid();

    ByteString getSubscriberUuidBytes();
}
