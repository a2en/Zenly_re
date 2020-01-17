package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;

/* renamed from: co.znly.models.PingProto$ChatCursorUpdateOrBuilder */
public interface PingProto$ChatCursorUpdateOrBuilder extends MessageLiteOrBuilder {
    C6826b getContentTypeDeprecated();

    int getContentTypeDeprecatedValue();

    String getConversationUuidDeprecated();

    ByteString getConversationUuidDeprecatedBytes();

    String getCursorUuid();

    ByteString getCursorUuidBytes();

    C7454r1 getCvtm();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCvtm();
}
