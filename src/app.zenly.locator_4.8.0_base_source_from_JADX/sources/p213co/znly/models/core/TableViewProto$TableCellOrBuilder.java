package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.C7464s1;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.PingProto$Conversation;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.TableViewProto$TableCell.C7041b;

/* renamed from: co.znly.models.core.TableViewProto$TableCellOrBuilder */
public interface TableViewProto$TableCellOrBuilder extends MessageLiteOrBuilder {
    int getChatUnreadCount();

    C7339i getContacts(int i);

    int getContactsCount();

    List<C7339i> getContactsList();

    PingProto$Conversation getConversation();

    C7464s1 getConversationUpdate();

    FriendRequestProto$FriendRequest getFriendRequests(int i);

    int getFriendRequestsCount();

    List<FriendRequestProto$FriendRequest> getFriendRequestsList();

    C6980c3 getFriendships(int i);

    int getFriendshipsCount();

    List<C6980c3> getFriendshipsList();

    int getPageRank();

    int getPingUnreadCount();

    int getPotentialFriendsCount();

    C7213s1 getState();

    int getStateValue();

    C7434p getSuggestedUsers(int i);

    int getSuggestedUsersCount();

    List<C7434p> getSuggestedUsersList();

    C7041b getTopScoring(int i);

    int getTopScoringCount();

    List<C7041b> getTopScoringList();

    UserProto$User getUsers(int i);

    int getUsersCount();

    List<UserProto$User> getUsersList();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasConversation();

    boolean hasConversationUpdate();
}
