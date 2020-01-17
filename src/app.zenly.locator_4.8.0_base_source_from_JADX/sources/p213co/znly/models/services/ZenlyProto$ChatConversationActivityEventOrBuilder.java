package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7391m1;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationActivityEventOrBuilder */
public interface ZenlyProto$ChatConversationActivityEventOrBuilder extends MessageLiteOrBuilder {
    C7391m1 getActivity();

    int getActivityValue();

    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUserUuids(int i);

    ByteString getUserUuidsBytes(int i);

    int getUserUuidsCount();

    List<String> getUserUuidsList();
}
