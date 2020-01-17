package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$UsersGetPublicResponseOrBuilder */
public interface ZenlyProto$UsersGetPublicResponseOrBuilder extends MessageLiteOrBuilder {
    C7985a6 getError();

    UserProto$User getUsers(int i);

    int getUsersCount();

    List<UserProto$User> getUsersList();

    boolean hasError();
}
