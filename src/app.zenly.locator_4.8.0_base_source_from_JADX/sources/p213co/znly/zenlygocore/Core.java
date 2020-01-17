package p213co.znly.zenlygocore;

import java.util.Arrays;
import p386go.Seq;
import p386go.Seq.Proxy;

/* renamed from: co.znly.zenlygocore.Core */
public final class Core implements Proxy {
    private final int refnum;

    static {
        Zenlygocore.touch();
    }

    public Core(String str, String str2, String str3, boolean z, boolean z2) {
        this.refnum = __NewCore(str, str2, str3, z, z2);
        Seq.trackGoRef(this.refnum, this);
    }

    private static native int __NewCore(String str, String str2, String str3, boolean z, boolean z2);

    public native RxContext bestFriendsHidden(RxProtoObserver rxProtoObserver);

    public native RxContext bestFriendsHide(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext bestFriendsStream(RxProtoObserver rxProtoObserver);

    public native RxContext blockedUsers(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext brumpCountersState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext brumpStream(RxProtoObserver rxProtoObserver);

    public native RxContext bubblesStream(RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationActivityStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationMute(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationSyncStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationUnMute(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationUpdatesStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatConversationsSearch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatCreateGroup(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] chatCreateLazyGroup(byte[] bArr);

    public native RxContext chatCursorRealtimeStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatDeleteFailedMessage(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatDeleteMessage(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] chatGetConversationCache(String str);

    public native byte[] chatGetConversationDeeplink(byte[] bArr);

    public native RxContext chatGroupConversationAdd(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatGroupConversationKick(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatGroupConversationUpdate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] chatMessagesCache(String str);

    public native RxContext chatMessagesRealtime(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatMessagesStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatOldMessagesServer(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatReportMessage(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatResolveGroupConversation(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native void chatSendActivity(byte[] bArr);

    public native RxContext chatSendMessage(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatSyncMessagesServer(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatUnreadConversations(RxProtoObserver rxProtoObserver);

    public native RxContext chatUnreadCounters(RxProtoObserver rxProtoObserver);

    public native RxContext chatUpdateCursor(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext chatUserUnreadCounters(RxProtoObserver rxProtoObserver);

    public native boolean configurationOnboardingAllowAgeGatingRetry();

    public native RxContext contactsAlreadySearchBatch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext contactsAlreadyStateStream(RxProtoObserver rxProtoObserver);

    public native long contactsCount();

    public native RxContext contactsInvalidationTracker(RxProtoObserver rxProtoObserver);

    public native RxContext contactsPhoneNumberLookup(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] contactsRange(long j, long j2);

    public native RxContext contactsRaw(RxProtoObserver rxProtoObserver);

    public native RxContext contactsSearch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext contactsSearchBatch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext contactsSoonStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext contactsSuggestedDismissUser(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext contactsSuggestionsStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext coreUIStream(RxProtoObserver rxProtoObserver);

    public native RxContext debugUser(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext deprecatedDevicesGet(RxProtoObserver rxProtoObserver);

    public native RxContext deprecatedUserPlaces(RxProtoObserver rxProtoObserver);

    public native RxContext deprecatedUserPublicFriends(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext descendantUsers(RxProtoObserver rxProtoObserver);

    public native RxContext descendantWorldRank(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext deviceGet(RxProtoObserver rxProtoObserver);

    public native long deviceGetCountryCode();

    public native String deviceGetPhoneNumber();

    public native void deviceSetAppsflyerId(String str);

    public native void discoverV1Interest(byte[] bArr);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Core)) {
            return false;
        }
        Core core = (Core) obj;
        return true;
    }

    public native byte[] experimentFlags();

    public native RxContext extendedContextualLabeling(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] featureFlags();

    public native RxContext fogWarUpdate(RxProtoObserver rxProtoObserver);

    public native RxContext footstepsContextualLabeling(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext footstepsLinkViewsStream(RxProtoObserver rxProtoObserver);

    public native RxContext footstepsLocalitiesAt(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext footstepsRecordCacheGet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext footstepsRecordState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext footstepsUpdateHistorical(RxProtoObserver rxProtoObserver);

    public native byte[] footstepsVisitedLocalitiesRawCacheGet();

    public native RxContext footstepsVisitedLocalitiesState(RxProtoObserver rxProtoObserver);

    public native RxContext footstepsVisitedShapes(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext footstepsWebGet(RxProtoObserver rxProtoObserver);

    public native RxContext footstepsWebSet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendDelete(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendGhost(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendRequestCreate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendRequestRespond(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendRequestSearch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendRequestsStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext friendSearchStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendSubscribe(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext friendsStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext friendshipsStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext gatheringsStream(RxProtoObserver rxProtoObserver);

    public native RxContext geoReverseGeocode(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoReverseGeocodeAdminAreas(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoReverseGeocodeFormattedAddress(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoReverseGeocodeStreet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoRouteETA(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoRouteInfo(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoRoutePolyline(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext geoRouteUserETA(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext getAnnouncements(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] getFogOfWarTile(long j, long j2, long j3);

    public native boolean getFootstepsOnboardingDone();

    public native boolean getFootstepsStarted();

    public native void handleURLSessionBackgroundEvents(String str);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public native RxContext httpGet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] inboxCache();

    public native RxContext inboxHide(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext inboxNextPage(RxProtoObserver rxProtoObserver);

    public native RxContext inboxStream(RxProtoObserver rxProtoObserver);

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native void lock();

    public native void log(byte[] bArr) throws Exception;

    public native void logSetLevel(int i);

    public native RxContext mapSpinnersStream(RxProtoObservable rxProtoObservable, RxProtoObserver rxProtoObserver);

    public native RxContext mapViewportStream(RxProtoObserver rxProtoObserver);

    public native RxContext markAnnouncementRead(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext mustUpgrade(RxProtoObserver rxProtoObserver);

    public native RxContext networkState(RxProtoObserver rxProtoObserver);

    public native RxContext nightsHideLocation(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext nightsLocations(RxProtoObserver rxProtoObserver);

    public native RxContext nightsStay(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext nightsTimeline(RxProtoObserver rxProtoObserver);

    public native RxContext notificationsStream(RxProtoObserver rxProtoObserver);

    public native RxContext onboardingContactsAlready(RxProtoObserver rxProtoObserver);

    public native RxContext onboardingContactsSoon(RxProtoObserver rxProtoObserver);

    public native RxContext onboardingContactsSuggestions(RxProtoObserver rxProtoObserver);

    public native RxContext personalPlaces(RxProtoObserver rxProtoObserver);

    public native byte[] phoneNumberGetRegion(String str);

    public native boolean phoneNumberIsViable(String str);

    public native String phoneNumberNormalize(String str, long j);

    public native RxContext phoneNumberSupportedRegions(RxProtoObserver rxProtoObserver);

    public native RxContext pinContextSubscribe(RxProtoObserver rxProtoObserver);

    public native RxContext pingManifestEnhancedStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pingManifestStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pingMostSentEmojiStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pingRead(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pingSend(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pingStatsStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pushNotificationCreate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext pushNotifications(RxProtoObserver rxProtoObserver);

    public native byte[] rawContact(String str);

    public native byte[] rawDescendantsPreferences();

    public native byte[] rawUserMeCache();

    public native void recentItemInteract(byte[] bArr);

    public native RxContext recentlySearchedStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext recentlyViewedStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext recoAcknowledgePotentialMatch(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext recoAcknowledgeRecommendation(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext recoPotentialMatches(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext recoSendRecommendation(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext remoteAsset(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext requestMedia(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext requestMediaRead(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext resolveUserUsername(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext reverseGeoCodeViewports(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext serverState(RxProtoObserver rxProtoObserver);

    public native RxContext sessionCacheGet(RxProtoObserver rxProtoObserver);

    public native RxContext sessionCacheSet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext sessionCreate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext sessionGet(RxProtoObserver rxProtoObserver);

    public native void sessionLogout();

    public native RxContext sessionRelogin(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native void sessionReloginDrop();

    public native byte[] sessionReloginGet();

    public native RxContext sessionRequestCall(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext sessionVerify(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native void setDescendantsPreferences(byte[] bArr);

    public native void setFogOfWarGridDepthMax(long j);

    public native void setFogOfWarQueryLevelMax(long j);

    public native void setFootstepsOnboardingDone(boolean z);

    public native void setFootstepsStarted(boolean z);

    public native RxContext sleepingStateStream(RxProtoObserver rxProtoObserver);

    public native void startDebugServer();

    public native void stop();

    public native void tableCopySections(long j);

    public native RxContext tableDirtyState(RxProtoObserver rxProtoObserver);

    public native void tableSearch(long j, String str);

    public native byte[] tableSectionAt(long j, long j2, long j3);

    public native long tableSectionCount(long j, long j2);

    public native void tableState(long j, long j2, long j3, long j4);

    public native long timeCorrect(long j);

    public native long timeNow();

    public native long timeSince(long j);

    public native RxContext timeTogetherFriendState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext timeTogetherMutualLoveHidden(RxProtoObserver rxProtoObserver);

    public native RxContext timeTogetherMutualLoveHide(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native byte[] timeTogetherRawCacheGet();

    public native RxContext timeTogetherState(RxProtoObserver rxProtoObserver);

    public native String timeZoneAtLocation(double d, double d2);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Core");
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    public native RxContext topFriendsStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext trackingContextSubscribe(RxProtoObserver rxProtoObserver);

    public native RxContext trackingContextViewport(RxProtoObservable rxProtoObservable);

    public native RxContext tstResetMutualLove(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext uiCacheEmojiPackUnlockGet(RxProtoObserver rxProtoObserver);

    public native RxContext uiCacheEmojiPackUnlockSet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext uiCacheIconUnlockGet(RxProtoObserver rxProtoObserver);

    public native RxContext uiCacheIconUnlockSet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext universitiesCampaignsSignup(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext universitiesCampaignsSubscription(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native void unlock();

    public native RxContext userActionsFetchStream(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userActionsUpdate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userAnnotationState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userAnnotationStream(RxProtoObserver rxProtoObserver);

    public native RxContext userBlock(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userEngagementStats(RxProtoObserver rxProtoObserver);

    public native RxContext userGet(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userHeadingStream(RxProtoObserver rxProtoObserver);

    public native RxContext userLocationStream(RxProtoObserver rxProtoObserver);

    public native RxContext userMe(RxProtoObserver rxProtoObserver);

    public native RxContext userMeTraits(RxProtoObserver rxProtoObserver);

    public native RxContext userMonitoringDelete(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userMonitoringExist(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userMonitoringUpsert(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userPlace(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userPlacesState(RxProtoObserver rxProtoObserver);

    public native RxContext userPublicFriendsState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userPublicMutualFriendsState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userReport(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userRequest(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userShouldValidateToS(RxProtoObserver rxProtoObserver);

    public native RxContext userStartDeletionProcess(RxProtoObserver rxProtoObserver);

    public native RxContext userTodayWatchersStream(RxProtoObserver rxProtoObserver);

    public native RxContext userUnblock(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userUpdate(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userUpdateAvatar(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userUpdateDeprecated(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext userVisitPointsRealtimeStream(RxProtoObserver rxProtoObserver);

    public native RxContext userVisitPointsState(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext usernameGenerate(RxProtoObserver rxProtoObserver);

    public native String version();

    public native RxContext weather(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext weatherStream(RxProtoObserver rxProtoObserver);

    public native RxContext wifiStateStream(RxProtoObserver rxProtoObserver);

    public native RxContext zendeskCreateTicket(byte[] bArr, RxProtoObserver rxProtoObserver);

    public native RxContext zendeskGetFeedbackCategories(RxProtoObserver rxProtoObserver);

    public native String zendeskGetJWTToken();

    public native RxContext zendeskGetProblemCategories(RxProtoObserver rxProtoObserver);

    public native void zendeskSeenTickets();

    public native RxContext zendeskUnseenStatusRealtimeStream(RxProtoObserver rxProtoObserver);

    Core(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
