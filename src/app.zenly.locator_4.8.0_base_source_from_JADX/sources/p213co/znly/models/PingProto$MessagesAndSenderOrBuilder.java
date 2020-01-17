package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$MessagesAndSenderOrBuilder */
public interface PingProto$MessagesAndSenderOrBuilder extends MessageLiteOrBuilder {
    String getCursor();

    ByteString getCursorBytes();

    PingProto$Ping2 getMessages(int i);

    int getMessagesCount();

    List<PingProto$Ping2> getMessagesList();

    String getSenderUuid();

    ByteString getSenderUuidBytes();

    String getTip();

    ByteString getTipBytes();
}
