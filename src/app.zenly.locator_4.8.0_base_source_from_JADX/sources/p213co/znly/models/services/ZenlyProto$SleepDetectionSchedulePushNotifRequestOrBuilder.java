package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$SleepDetectionSchedulePushNotifRequestOrBuilder */
public interface ZenlyProto$SleepDetectionSchedulePushNotifRequestOrBuilder extends MessageLiteOrBuilder {
    String getFriendsUuids(int i);

    ByteString getFriendsUuidsBytes(int i);

    int getFriendsUuidsCount();

    List<String> getFriendsUuidsList();
}
