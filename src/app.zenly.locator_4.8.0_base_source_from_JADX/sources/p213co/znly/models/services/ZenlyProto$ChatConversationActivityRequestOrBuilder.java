package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7391m1;

/* renamed from: co.znly.models.services.ZenlyProto$ChatConversationActivityRequestOrBuilder */
public interface ZenlyProto$ChatConversationActivityRequestOrBuilder extends MessageLiteOrBuilder {
    C7391m1 getActivity();

    int getActivityValue();

    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
