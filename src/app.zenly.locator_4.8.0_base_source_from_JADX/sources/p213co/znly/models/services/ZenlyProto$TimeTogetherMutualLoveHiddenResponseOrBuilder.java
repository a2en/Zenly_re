package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$TimeTogetherMutualLoveHiddenResponseOrBuilder */
public interface ZenlyProto$TimeTogetherMutualLoveHiddenResponseOrBuilder extends MessageLiteOrBuilder {
    String getUsers(int i);

    ByteString getUsersBytes(int i);

    int getUsersCount();

    List<String> getUsersList();
}
