package p213co.znly.models.services.sleepdetection;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.sleepdetection.SleepDetectionProto$IsSleepingRequestOrBuilder */
public interface SleepDetectionProto$IsSleepingRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriendsUuids(int i);

    ByteString getFriendsUuidsBytes(int i);

    int getFriendsUuidsCount();

    List<String> getFriendsUuidsList();
}
