package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.ContactProto$ContactWithUserOrBuilder */
public interface ContactProto$ContactWithUserOrBuilder extends MessageLiteOrBuilder {
    C7339i getContact();

    UserProto$User getUser();

    UserProto$User getUsers(int i);

    int getUsersCount();

    List<UserProto$User> getUsersList();

    boolean hasContact();

    boolean hasUser();
}
