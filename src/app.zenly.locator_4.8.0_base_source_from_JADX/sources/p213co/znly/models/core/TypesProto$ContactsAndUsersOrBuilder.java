package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.TypesProto$ContactsAndUsersOrBuilder */
public interface TypesProto$ContactsAndUsersOrBuilder extends MessageLiteOrBuilder {
    C7339i getContacts(int i);

    int getContactsCount();

    List<C7339i> getContactsList();

    UserProto$User getUsers(int i);

    int getUsersCount();

    List<UserProto$User> getUsersList();
}
