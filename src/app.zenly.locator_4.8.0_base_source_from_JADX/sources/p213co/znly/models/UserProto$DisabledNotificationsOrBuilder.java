package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$DisabledNotifications.C6923b;

/* renamed from: co.znly.models.UserProto$DisabledNotificationsOrBuilder */
public interface UserProto$DisabledNotificationsOrBuilder extends MessageLiteOrBuilder {
    int getGlobally();

    C6923b getPerUser(int i);

    int getPerUserCount();

    List<C6923b> getPerUserList();
}
