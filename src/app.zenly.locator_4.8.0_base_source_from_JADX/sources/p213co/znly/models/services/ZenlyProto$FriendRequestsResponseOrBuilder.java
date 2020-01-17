package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$FriendRequestsResponseOrBuilder */
public interface ZenlyProto$FriendRequestsResponseOrBuilder extends MessageLiteOrBuilder {
    ZenlyProto$FriendRequestWithUser getFriendRequests(int i);

    int getFriendRequestsCount();

    List<ZenlyProto$FriendRequestWithUser> getFriendRequestsList();
}
