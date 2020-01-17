package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ChatReportMessageRequestOrBuilder */
public interface ZenlyProto$ChatReportMessageRequestOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    boolean getIsTargetBlocked();

    String getMessageData();

    ByteString getMessageDataBytes();

    String getMessageUuid();

    ByteString getMessageUuidBytes();

    String getReason();

    ByteString getReasonBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUserReason();

    ByteString getUserReasonBytes();
}
