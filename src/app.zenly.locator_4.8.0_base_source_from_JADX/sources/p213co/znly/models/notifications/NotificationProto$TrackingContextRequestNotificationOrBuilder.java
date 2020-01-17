package p213co.znly.models.notifications;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7468s2;
import p213co.znly.wakeup.C8457b;

/* renamed from: co.znly.models.notifications.NotificationProto$TrackingContextRequestNotificationOrBuilder */
public interface NotificationProto$TrackingContextRequestNotificationOrBuilder extends MessageLiteOrBuilder {
    C8457b getAction();

    int getActionValue();

    String getPushId();

    ByteString getPushIdBytes();

    C7468s2 getSpanContext();

    String getWatcherUuids(int i);

    ByteString getWatcherUuidsBytes(int i);

    int getWatcherUuidsCount();

    List<String> getWatcherUuidsList();

    boolean hasSpanContext();
}
