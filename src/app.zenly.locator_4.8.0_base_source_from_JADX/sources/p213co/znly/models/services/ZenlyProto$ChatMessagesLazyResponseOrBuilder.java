package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$ChatMessagesLazyResponseOrBuilder */
public interface ZenlyProto$ChatMessagesLazyResponseOrBuilder extends MessageLiteOrBuilder {
    PingProto$Ping2 getMessages(int i);

    int getMessagesCount();

    List<PingProto$Ping2> getMessagesList();

    boolean getNotFound();
}