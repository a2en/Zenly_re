package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6980c3;

/* renamed from: co.znly.models.services.ZenlyProto$FriendshipsResponseOrBuilder */
public interface ZenlyProto$FriendshipsResponseOrBuilder extends MessageLiteOrBuilder {
    C6980c3 getFriendships(int i);

    int getFriendshipsCount();

    List<C6980c3> getFriendshipsList();
}
