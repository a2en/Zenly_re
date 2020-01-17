package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationCreateRequestOrBuilder */
public interface ZenlyProto$ChatConversationCreateRequestOrBuilder extends MessageLiteOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    String getMemberUuids(int i);

    ByteString getMemberUuidsBytes(int i);

    int getMemberUuidsCount();

    List<String> getMemberUuidsList();

    String getName();

    ByteString getNameBytes();

    boolean getPaging();
}
