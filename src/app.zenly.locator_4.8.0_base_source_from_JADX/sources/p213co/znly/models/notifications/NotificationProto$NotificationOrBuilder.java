package p213co.znly.models.notifications;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.notifications.C7857w.C7859b;

/* renamed from: co.znly.models.notifications.NotificationProto$NotificationOrBuilder */
public interface NotificationProto$NotificationOrBuilder extends MessageLiteOrBuilder {
    C7793b getBrump();

    C7809f getChatGroupMessage();

    C7813g getChatMessage();

    C7797c getCmdDumpReport();

    C7805e getCmdHarakiri();

    C7801d getCmdHttpServer();

    C7819h getContactJoined();

    C7823i getCountryChange();

    Timestamp getCreatedAt();

    C7831k getDisableGhost();

    C7827j getDisableGhostAccepted();

    C7835m getEnableAlwaysOnLocation();

    C7839o getEnableWifi();

    C7837n getEnableWifiAccepted();

    C7841p getFailedMsg();

    C7843q getFootstepsViews();

    C7845r getFriendIsBack();

    C7849s getFriendRequestAccepted();

    C7851t getFriendRequestSent();

    C7853u getLocationRequest();

    String getMessage();

    ByteString getMessageBytes();

    C7855v getNoFriends();

    C7859b getNotificationCase();

    C7833l getPackUnlocked();

    C7862y getPing();

    C7864z getProfilePic();

    C7791a0 getPublicShare();

    C7795b0 getRaw();

    Timestamp getReadAt();

    C7799c0 getRecommendation();

    C7803d0 getRecommendationReward();

    C7807e0 getRequestMedia();

    NotificationProto$SigningNotification getSigning();

    C7815g0 getSleepDetection();

    C7811f0 getSynNotification();

    String getTitle();

    ByteString getTitleBytes();

    C7821h0 getTrackingContextRequest();

    C7825i0 getUserMonitor();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    C7829j0 getZendesk();

    boolean hasCreatedAt();

    boolean hasReadAt();
}
