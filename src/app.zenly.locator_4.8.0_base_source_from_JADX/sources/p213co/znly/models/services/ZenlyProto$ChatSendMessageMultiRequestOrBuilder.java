package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7944b;

/* renamed from: co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequestOrBuilder */
public interface ZenlyProto$ChatSendMessageMultiRequestOrBuilder extends MessageLiteOrBuilder {
    PingProto$Ping2 getMessage();

    C7944b getTargetWithClientUuid(int i);

    int getTargetWithClientUuidCount();

    List<C7944b> getTargetWithClientUuidList();

    boolean hasMessage();
}
