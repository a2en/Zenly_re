package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$RequestMediaReceivedEventOrBuilder */
public interface ChatProto$RequestMediaReceivedEventOrBuilder extends MessageLiteOrBuilder {
    C7234v getReceived(int i);

    int getReceivedCount();

    List<C7234v> getReceivedList();

    String getTargetUuid();

    ByteString getTargetUuidBytes();
}
