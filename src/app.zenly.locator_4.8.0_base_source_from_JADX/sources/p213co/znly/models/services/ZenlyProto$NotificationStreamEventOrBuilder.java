package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.notifications.C7857w;

/* renamed from: co.znly.models.services.ZenlyProto$NotificationStreamEventOrBuilder */
public interface ZenlyProto$NotificationStreamEventOrBuilder extends MessageLiteOrBuilder {
    C7857w getNotification();

    C7280e getOp();

    int getOpValue();

    boolean hasNotification();
}
