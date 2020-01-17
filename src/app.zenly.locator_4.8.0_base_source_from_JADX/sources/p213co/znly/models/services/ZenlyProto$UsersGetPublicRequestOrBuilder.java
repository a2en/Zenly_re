package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$UsersGetPublicRequestOrBuilder */
public interface ZenlyProto$UsersGetPublicRequestOrBuilder extends MessageLiteOrBuilder {
    String getUsernames(int i);

    ByteString getUsernamesBytes(int i);

    int getUsernamesCount();

    List<String> getUsernamesList();

    String getUuids(int i);

    ByteString getUuidsBytes(int i);

    int getUuidsCount();

    List<String> getUuidsList();
}
