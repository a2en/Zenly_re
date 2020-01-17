package app.zenly.locator.core.invitations.p068g0;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.dashboard.p075w.C3327b.C3328a;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.C12953n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.g0.a */
public final class C2590a {

    /* renamed from: a */
    private final AnalyticsTracker f7677a;

    /* renamed from: app.zenly.locator.core.invitations.g0.a$a */
    public enum C2591a {
        ONBOARDING("onboarding"),
        BRUCE("banner"),
        DASHBOARD_FIRST_SECTION("dashboard_single_app"),
        DASHBOARD_SECOND_SECTION("dashboard_multiple_apps"),
        ADD_FRIEND("add_friend");
        

        /* renamed from: e */
        private final String f7684e;

        private C2591a(String str) {
            this.f7684e = str;
        }

        /* renamed from: a */
        public final String mo8697a() {
            return this.f7684e;
        }
    }

    public C2590a(AnalyticsTracker analyticsTracker) {
        C12932j.m33818b(analyticsTracker, "tracker");
        this.f7677a = analyticsTracker;
    }

    /* renamed from: a */
    public static /* synthetic */ void m8901a(C2590a aVar, C2591a aVar2, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        aVar.mo8695a(aVar2, str, i, z);
    }

    /* renamed from: b */
    private final String m8902b(C3328a aVar) {
        int i = C2592b.f7685a[aVar.ordinal()];
        if (i == 1) {
            return "broadcast_invite_single_app_dismiss_button";
        }
        if (i == 2) {
            return "broadcast_invite_multiple_apps_dismiss_button";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new Error("Can't dismiss NONE section");
    }

    /* renamed from: a */
    public final void mo8695a(C2591a aVar, String str, int i, boolean z) {
        C12953n nVar;
        String str2;
        C12932j.m33818b(aVar, "origin");
        if (z) {
            nVar = new C12953n("z_track1exp_invite_broadcast_channel", "z_track1exp_invite_broadcast_type", "z_track1exp_invite_broadcast_sent_from_suggested_app");
            str2 = "Z_Track1Exp Invite Broadcast Sent";
        } else {
            nVar = new C12953n("invite_broadcast_channel", "invite_broadcast_type", "invite_broadcast_sent_from_suggested_app");
            str2 = "Invite Broadcast Sent";
        }
        AnalyticsTracker analyticsTracker = this.f7677a;
        C5427c cVar = new C5427c();
        String str3 = (String) nVar.mo37312a();
        if (str == null) {
            str = "unknown";
        }
        cVar.mo12998a(str3, str);
        cVar.mo12998a((String) nVar.mo37313b(), aVar.mo8697a());
        cVar.mo12998a((String) nVar.mo37314c(), Boolean.valueOf(i == 0 && i != -1));
        analyticsTracker.track(str2, cVar);
    }

    /* renamed from: a */
    public final void mo8696a(C3328a aVar) {
        C12932j.m33818b(aVar, "section");
        AnalyticsTracker analyticsTracker = this.f7677a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("item_type", m8902b(aVar));
        analyticsTracker.track("Dashboard Item Tapped", cVar);
    }
}
