package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$FriendSubscribeRequestOrBuilder */
public interface ZenlyProto$FriendSubscribeRequestOrBuilder extends MessageLiteOrBuilder {
    String getUuids(int i);

    ByteString getUuidsBytes(int i);

    int getUuidsCount();

    List<String> getUuidsList();
}
