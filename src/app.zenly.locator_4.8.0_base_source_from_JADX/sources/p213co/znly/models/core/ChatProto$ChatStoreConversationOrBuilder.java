package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.ChatProto$ChatStoreConversationOrBuilder */
public interface ChatProto$ChatStoreConversationOrBuilder extends MessageLiteOrBuilder {
    C7084e getChatCursors();

    C7084e getEmojiCursors();

    C7092f getHidden();

    String getHighestPeerCursor();

    ByteString getHighestPeerCursorBytes();

    String getInactiveSince();

    ByteString getInactiveSinceBytes();

    Timestamp getJoinedAt();

    C7099g getLastMessage();

    String getLazyId();

    ByteString getLazyIdBytes();

    Timestamp getLeftAt();

    String getMe();

    ByteString getMeBytes();

    Timestamp getModifiedAt();

    boolean getMuted();

    String getName();

    ByteString getNameBytes();

    String getNickname();

    ByteString getNicknameBytes();

    C7109h getPeers(int i);

    int getPeersCount();

    List<C7109h> getPeersList();

    String getTarget();

    ByteString getTargetBytes();

    boolean hasChatCursors();

    boolean hasEmojiCursors();

    boolean hasHidden();

    boolean hasJoinedAt();

    boolean hasLastMessage();

    boolean hasLeftAt();

    boolean hasModifiedAt();
}
