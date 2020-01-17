package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7434p;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$ContactsSuggestionsResponseOrBuilder */
public interface ZenlyProto$ContactsSuggestionsResponseOrBuilder extends MessageLiteOrBuilder {
    int getAlgoVersion();

    int getLimit();

    int getOffset();

    C7434p getSuggestedUsers(int i);

    int getSuggestedUsersCount();

    List<C7434p> getSuggestedUsersList();

    int getTotal();

    @Deprecated
    UserProto$User getUsers(int i);

    @Deprecated
    int getUsersCount();

    @Deprecated
    List<UserProto$User> getUsersList();
}
