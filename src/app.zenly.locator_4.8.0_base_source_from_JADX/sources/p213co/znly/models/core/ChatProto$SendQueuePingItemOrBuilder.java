package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.core.ChatProto$SendQueuePingItemOrBuilder */
public interface ChatProto$SendQueuePingItemOrBuilder extends MessageLiteOrBuilder {
    String getClientsUuid(int i);

    ByteString getClientsUuidBytes(int i);

    int getClientsUuidCount();

    List<String> getClientsUuidList();

    PingProto$Ping2 getPing();

    String getTargetsUuid(int i);

    ByteString getTargetsUuidBytes(int i);

    int getTargetsUuidCount();

    List<String> getTargetsUuidList();

    String getUploadsUuid(int i);

    ByteString getUploadsUuidBytes(int i);

    int getUploadsUuidCount();

    List<String> getUploadsUuidList();

    boolean hasPing();
}
