package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7351j;

/* renamed from: co.znly.models.services.ZenlyProto$ContactsResponseOrBuilder */
public interface ZenlyProto$ContactsResponseOrBuilder extends MessageLiteOrBuilder {
    C7351j getContacts(int i);

    int getContactsCount();

    List<C7351j> getContactsList();

    int getLimit();

    int getOffset();

    int getTotal();
}
