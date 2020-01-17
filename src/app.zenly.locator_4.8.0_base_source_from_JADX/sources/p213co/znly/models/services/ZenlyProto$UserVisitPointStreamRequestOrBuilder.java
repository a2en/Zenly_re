package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointStreamRequestOrBuilder */
public interface ZenlyProto$UserVisitPointStreamRequestOrBuilder extends MessageLiteOrBuilder {
    String getUserUuids(int i);

    ByteString getUserUuidsBytes(int i);

    int getUserUuidsCount();

    List<String> getUserUuidsList();
}
