package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7456r2;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.models.notifications.NotificationProto$NotificationWithMetadataOrBuilder */
public interface NotificationProto$NotificationWithMetadataOrBuilder extends MessageLiteOrBuilder {
    C7456r2 getContext();

    int getCount();

    C7458s getDevice();

    C7857w getNotification();

    boolean hasContext();

    boolean hasDevice();

    boolean hasNotification();
}
