package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7492v2;

/* renamed from: co.znly.models.services.ZenlyProto$FriendGhostRequestOrBuilder */
public interface ZenlyProto$FriendGhostRequestOrBuilder extends MessageLiteOrBuilder {
    C7492v2 getType();

    int getTypeValue();

    Timestamp getUntil();

    String getUuids(int i);

    ByteString getUuidsBytes(int i);

    int getUuidsCount();

    List<String> getUuidsList();

    boolean hasUntil();
}
