package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$RequestMediaInsertOrBuilder */
public interface PingProto$RequestMediaInsertOrBuilder extends MessageLiteOrBuilder {
    String getConversationUuid();

    ByteString getConversationUuidBytes();

    PingProto$Ping2 getMessage();

    String getTargetUuid(int i);

    ByteString getTargetUuidBytes(int i);

    int getTargetUuidCount();

    List<String> getTargetUuidList();

    boolean hasMessage();
}
