package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.services.C8181n1;
import p213co.znly.models.services.C8334v1;

/* renamed from: co.znly.models.core.ChatProto$MessageSentWithErrorOrBuilder */
public interface ChatProto$MessageSentWithErrorOrBuilder extends MessageLiteOrBuilder {
    int getBolt();

    C8334v1 getConversationCreateError();

    boolean getConversationCreated();

    C8181n1 getMessageSentError();

    int getMessageSentErrorValue();

    PingProto$Ping2 getMsg();

    boolean hasConversationCreateError();

    boolean hasMsg();
}
