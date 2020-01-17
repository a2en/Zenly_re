package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i.C7119b;

/* renamed from: co.znly.models.core.ChatProto$ConversationOrBuilder */
public interface ChatProto$ConversationOrBuilder extends MessageLiteOrBuilder {
    boolean getAsynCall();

    UserProto$User getAvatars(int i);

    int getAvatarsCount();

    List<UserProto$User> getAvatarsList();

    String getChatTip();

    ByteString getChatTipBytes();

    boolean getHasLeft();

    boolean getHidden();

    String getInboxUuid();

    ByteString getInboxUuidBytes();

    boolean getIsGroup();

    PingProto$Ping2 getLastMessage();

    C7119b getLastMsgState();

    int getLastMsgStateValue();

    Timestamp getLazyCreatedAt();

    C6818b getMe();

    Timestamp getModifiedAt();

    boolean getMuted();

    String getName();

    ByteString getNameBytes();

    int getNbChat();

    int getNbMediaFromReplyUnread();

    int getNbPing();

    C6818b getOthers(int i);

    int getOthersCount();

    List<C6818b> getOthersList();

    String getPingCursor();

    ByteString getPingCursorBytes();

    String getPingTip();

    ByteString getPingTipBytes();

    String getRequestMediaCursor();

    ByteString getRequestMediaCursorBytes();

    C7234v getRequestMediaReceived(int i);

    int getRequestMediaReceivedCount();

    List<C7234v> getRequestMediaReceivedList();

    boolean hasLastMessage();

    boolean hasLazyCreatedAt();

    boolean hasMe();

    boolean hasModifiedAt();
}
