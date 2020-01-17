package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Ping2.C6824b;

/* renamed from: co.znly.models.PingProto$Ping2OrBuilder */
public interface PingProto$Ping2OrBuilder extends MessageLiteOrBuilder {
    String getAuthorUuid();

    ByteString getAuthorUuidBytes();

    long getClientStatus();

    String getClientUuid();

    ByteString getClientUuidBytes();

    C6824b getContent(int i);

    int getContentCount();

    List<C6824b> getContentList();

    Timestamp getCreatedAt();

    boolean getOffChat();

    long getSeq();

    long getStatus();

    long getSystemState();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}
