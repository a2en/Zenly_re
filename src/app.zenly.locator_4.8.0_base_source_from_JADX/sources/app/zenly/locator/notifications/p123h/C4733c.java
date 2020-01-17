package app.zenly.locator.notifications.p123h;

import app.zenly.locator.R;
import app.zenly.locator.notifications.C4718c;
import app.zenly.locator.notifications.C4719d;
import app.zenly.locator.notifications.NotificationManagerWrapper;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.notifications.h.c */
public final class C4733c extends C4732b {
    public C4733c(NotificationManagerWrapper notificationManagerWrapper) {
        C12932j.m33818b(notificationManagerWrapper, "notificationManager");
        super(notificationManagerWrapper);
    }

    /* renamed from: c */
    private final C4719d m13731c() {
        return new C4719d("0100-community", R.string.notificationChannels_community_title);
    }

    /* renamed from: d */
    private final C4718c m13732d() {
        C4718c cVar = new C4718c("0100-community:0103-message", R.string.notificationChannels_community_newMessage_title, 0, Integer.valueOf(R.string.notificationChannels_community_newMessage_description), "0100-community", true, true, 4, null);
        return cVar;
    }

    /* renamed from: e */
    private final C4718c m13733e() {
        C4718c cVar = new C4718c("0400-core:0203-friend_request", R.string.notificationChannels_core_friendRequest_title, 0, Integer.valueOf(R.string.notificationChannels_core_friendRequest_description), "0400-core", true, true, 4, null);
        return cVar;
    }

    /* renamed from: f */
    private final C4718c m13734f() {
        C4718c cVar = new C4718c("0400-core:0101-geolocation", R.string.notificationChannels_core_geolocation_title, 2, Integer.valueOf(R.string.notificationChannels_core_geolocation_description), "0400-core", false, false, 64, null);
        return cVar;
    }

    /* renamed from: g */
    private final C4719d m13735g() {
        return new C4719d("0400-core", R.string.notificationChannels_core_title);
    }

    /* renamed from: h */
    private final C4718c m13736h() {
        C4718c cVar = new C4718c("0200-features:0102-bump", R.string.notificationChannels_features_bump_title, 0, Integer.valueOf(R.string.notificationChannels_features_bump_description), "0200-features", false, true, 4, null);
        return cVar;
    }

    /* renamed from: i */
    private final C4718c m13737i() {
        C4718c cVar = new C4718c("0200-features:0203-emojis", R.string.notificationChannels_features_emojis_title, 0, Integer.valueOf(R.string.notificationChannels_features_emojis_description), "0200-features", true, true, 4, null);
        return cVar;
    }

    /* renamed from: j */
    private final C4719d m13738j() {
        return new C4719d("0200-features", R.string.notificationChannels_features_title);
    }

    /* renamed from: k */
    private final C4718c m13739k() {
        C4718c cVar = new C4718c("0300-messaging:0103-chat", R.string.notificationChannels_messaging_chat_title, 0, Integer.valueOf(R.string.notificationChannels_messaging_chat_description), "0300-messaging", true, true, 4, null);
        return cVar;
    }

    /* renamed from: l */
    private final C4719d m13740l() {
        return new C4719d("0300-messaging", R.string.notificationChannels_messaging_title);
    }

    /* renamed from: m */
    private final C4718c m13741m() {
        C4718c cVar = new C4718c("0300-messaging:0203-media", R.string.notificationChannels_messaging_media_title, 0, Integer.valueOf(R.string.notificationChannels_messaging_media_description), "0300-messaging", true, true, 4, null);
        return cVar;
    }

    /* renamed from: n */
    private final C4718c m13742n() {
        C4718c cVar = new C4718c("9000-misc:0202-back_live", R.string.notificationChannels_misc_backLive_title, 0, Integer.valueOf(R.string.notificationChannels_misc_backLive_description), null, false, true, 20, null);
        return cVar;
    }

    /* renamed from: o */
    private final C4718c m13743o() {
        C4718c cVar = new C4718c("9000-misc:0403-blur_out", R.string.notificationChannels_misc_blurredOut_title, 0, Integer.valueOf(R.string.notificationChannels_misc_blurredOut_description), null, true, true, 20, null);
        return cVar;
    }

    /* renamed from: p */
    private final C4718c m13744p() {
        C4718c cVar = new C4718c("9000-misc:0603-contact_joined", R.string.notificationChannels_misc_contactJoined_title, 0, Integer.valueOf(R.string.notificationChannels_misc_contactJoined_description), null, true, true, 20, null);
        return cVar;
    }

    /* renamed from: q */
    private final C4718c m13745q() {
        C4718c cVar = new C4718c("9000-misc:0303-frozen_out", R.string.notificationChannels_misc_frozenOut_title, 0, Integer.valueOf(R.string.notificationChannels_misc_frozenOut_description), null, true, true, 20, null);
        return cVar;
    }

    /* renamed from: r */
    private final C4718c m13746r() {
        C4718c cVar = new C4718c("9000-misc:9002-others", R.string.notificationChannels_misc_others_title, 0, null, null, false, true, 28, null);
        return cVar;
    }

    /* renamed from: s */
    private final C4718c m13747s() {
        C4718c cVar = new C4718c("9000-misc:0802-profile_pic", R.string.notificationChannels_misc_profilePic_title, 0, Integer.valueOf(R.string.notificationChannels_misc_profilePic_description), null, false, true, 20, null);
        return cVar;
    }

    /* renamed from: t */
    private final C4718c m13748t() {
        C4718c cVar = new C4718c("9000-misc:0702-travel", R.string.notificationChannels_misc_travel_title, 0, Integer.valueOf(R.string.notificationChannels_misc_travel_description), null, false, true, 20, null);
        return cVar;
    }

    /* renamed from: u */
    private final C4718c m13749u() {
        C4718c cVar = new C4718c("9000-misc:0503-wifi_on", R.string.notificationChannels_misc_wifiOn_title, 0, Integer.valueOf(R.string.notificationChannels_misc_wifiOn_description), null, true, true, 20, null);
        return cVar;
    }

    /* renamed from: b */
    public void mo11924b() {
        for (String deleteNotificationChannel : mo11923a().getNotificationChannelIds()) {
            mo11923a().deleteNotificationChannel(deleteNotificationChannel);
        }
        for (String deleteNotificationChannelGroup : mo11923a().getNotificationChannelGroupIds()) {
            mo11923a().deleteNotificationChannelGroup(deleteNotificationChannelGroup);
        }
        mo11923a().createNotificationChannelGroups(C12848o.m33643b((Object[]) new C4719d[]{m13731c(), m13738j(), m13740l(), m13735g()}));
        mo11923a().createNotificationChannels(C12848o.m33643b((Object[]) new C4718c[]{m13732d(), m13736h(), m13737i(), m13739k(), m13741m(), m13734f(), m13733e(), m13742n(), m13745q(), m13743o(), m13749u(), m13744p(), m13748t(), m13747s(), m13746r()}));
    }
}
