package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$MediaReceivedEventOrBuilder */
public interface ChatProto$MediaReceivedEventOrBuilder extends MessageLiteOrBuilder {
    boolean getNeedToOpenChat();

    C7201r getReceived(int i);

    int getReceivedCount();

    List<C7201r> getReceivedList();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
