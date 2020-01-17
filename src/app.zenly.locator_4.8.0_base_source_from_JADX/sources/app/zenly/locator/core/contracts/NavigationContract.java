package app.zenly.locator.core.contracts;

import android.content.Context;
import android.view.MotionEvent;
import app.zenly.locator.core.contracts.MapControllerContract.C2459c;
import app.zenly.locator.core.contracts.MapControllerContract.C2460d;
import app.zenly.locator.core.contracts.MapControllerContract.C2463f;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.report.base.C5342k;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7208s;
import p213co.znly.models.core.C7234v;

public interface NavigationContract {

    /* renamed from: app.zenly.locator.core.contracts.NavigationContract$a */
    public enum C2467a {
        MARKER,
        MINI_AVATAR,
        OTHER,
        PROFILE
    }

    /* renamed from: app.zenly.locator.core.contracts.NavigationContract$b */
    public enum C2468b {
        ADD_FRIENDS,
        BEST_FRIENDS,
        BEST_FRIENDS_UNLOCKED,
        PRIVACY,
        RENAME,
        SETTINGS,
        SET_USERNAME
    }

    /* renamed from: app.zenly.locator.core.contracts.NavigationContract$c */
    public enum C2469c {
        PRIVACY,
        SETTINGS,
        CALL,
        REMIND_FRIENDSHIP,
        ADD_AS_FRIEND,
        CONTACTS,
        ADD_FRIENDS,
        MEET
    }

    void displayNoFriendController();

    void displaySupport();

    void displaySupport(String str);

    String getFogDisplayName();

    boolean handleBack();

    void handleFriendshipFactsPlaceholderActionClick(Context context);

    void moveMapOnUsers(C2879d0[] d0VarArr, float f, int i);

    void onChatClick(C2467a aVar, String str);

    void onChatDismissed(boolean z);

    void onChatHeightChanged(int i);

    void onChatMeetClick(String str);

    void onContactPickerContactSelected(C7339i iVar);

    void onContactPickerUserSelected(UserProto$User userProto$User);

    void onControllerOpacityChange(ZenlyController zenlyController);

    void onConversationCreated(C7117i iVar);

    void onDashboardContactClick(C7339i iVar);

    void onDashboardManageFriendsClick();

    void onDashboardUserClick(String str);

    void onDiscoverNext();

    void onFogDisplayFriend(String str);

    void onFogUserClickOutside();

    void onFootstepsClicked();

    void onGroupChatInfoClick(C7117i iVar);

    void onGroupChatMemberClick(String str);

    void onInboxAddFriends();

    void onInboxContactSelected(C7339i iVar);

    void onInboxConversationSelected(C7117i iVar);

    void onInboxCreateGroup();

    void onInboxMediaRequestClick(C7234v vVar);

    void onInboxUserSelected(UserProto$User userProto$User);

    void onLocationDisabledCalloutClick();

    void onMapFriendSelection(C2459c cVar);

    void onMapFriendsSelection(C2460d dVar);

    void onMapGatheringSelection(C2463f fVar);

    void onMapRequested();

    void onMapTouch(MotionEvent motionEvent);

    void onMediaSelected(C7208s sVar);

    void onMeetHeightChanged(int i);

    void onMyProfileClick(C2468b bVar);

    void onProfileClick(C2469c cVar, String str);

    void onProfileItemClick(String str);

    void onProfileUsernameClicked(String str, int i);

    void onSearchClosed();

    void setNavigationEnabled(boolean z);

    void showReport(C5342k kVar);
}
