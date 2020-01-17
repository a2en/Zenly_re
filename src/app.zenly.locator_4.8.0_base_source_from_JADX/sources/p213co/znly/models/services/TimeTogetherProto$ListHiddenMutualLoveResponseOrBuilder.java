package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.TimeTogetherProto$ListHiddenMutualLoveResponseOrBuilder */
public interface TimeTogetherProto$ListHiddenMutualLoveResponseOrBuilder extends MessageLiteOrBuilder {
    String getUsers(int i);

    ByteString getUsersBytes(int i);

    int getUsersCount();

    List<String> getUsersList();
}
