package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7370k;

/* renamed from: co.znly.models.services.ZenlyProto$ContactsAlreadyOnZenlyResponseOrBuilder */
public interface ZenlyProto$ContactsAlreadyOnZenlyResponseOrBuilder extends MessageLiteOrBuilder {
    C7370k getContacts(int i);

    int getContactsCount();

    List<C7370k> getContactsList();

    int getLimit();

    int getOffset();

    int getTotal();
}
