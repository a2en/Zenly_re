package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$DescendantUsersResponseOrBuilder */
public interface ZenlyProto$DescendantUsersResponseOrBuilder extends MessageLiteOrBuilder {
    Timestamp getDescendantSince(int i);

    int getDescendantSinceCount();

    List<Timestamp> getDescendantSinceList();

    UserProto$User getUsers(int i);

    int getUsersCount();

    List<UserProto$User> getUsersList();
}
