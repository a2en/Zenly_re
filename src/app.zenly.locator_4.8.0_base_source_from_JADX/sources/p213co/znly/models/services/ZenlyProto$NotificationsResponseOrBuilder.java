package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.notifications.C7857w;

/* renamed from: co.znly.models.services.ZenlyProto$NotificationsResponseOrBuilder */
public interface ZenlyProto$NotificationsResponseOrBuilder extends MessageLiteOrBuilder {
    int getCount();

    C7857w getItems(int i);

    int getItemsCount();

    List<C7857w> getItemsList();

    String getNext();

    ByteString getNextBytes();
}
