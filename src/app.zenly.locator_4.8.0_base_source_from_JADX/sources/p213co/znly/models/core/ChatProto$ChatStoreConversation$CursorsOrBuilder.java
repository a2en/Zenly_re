package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.ChatProto$ChatStoreConversation$CursorsOrBuilder */
public interface ChatProto$ChatStoreConversation$CursorsOrBuilder extends MessageLiteOrBuilder {
    String getOffChat(int i);

    ByteString getOffChatBytes(int i);

    int getOffChatCount();

    List<String> getOffChatList();

    String getRead();

    ByteString getReadBytes();

    String getTip();

    ByteString getTipBytes();
}
