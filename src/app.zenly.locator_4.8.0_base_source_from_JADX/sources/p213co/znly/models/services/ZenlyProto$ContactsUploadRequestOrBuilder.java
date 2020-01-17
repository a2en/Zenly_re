package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7339i;

/* renamed from: co.znly.models.services.ZenlyProto$ContactsUploadRequestOrBuilder */
public interface ZenlyProto$ContactsUploadRequestOrBuilder extends MessageLiteOrBuilder {
    C7339i getContacts(int i);

    int getContactsCount();

    List<C7339i> getContactsList();

    int getTotal();
}
