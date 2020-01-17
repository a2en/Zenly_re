package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$BlockedUsersResponseOrBuilder */
public interface ZenlyProto$BlockedUsersResponseOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getBlockedUsers(int i);

    int getBlockedUsersCount();

    List<UserProto$User> getBlockedUsersList();

    C8179n0 getError();

    boolean hasError();
}
