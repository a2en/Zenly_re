package app.zenly.locator.userprofile.p198me.appicons;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.appicons.d */
public final class C6050d {

    /* renamed from: b */
    public static final C6051a f15238b = new C6051a(null);

    /* renamed from: a */
    private final AnalyticsTracker f15239a;

    /* renamed from: app.zenly.locator.userprofile.me.appicons.d$a */
    public static final class C6051a {
        private C6051a() {
        }

        /* renamed from: a */
        public final String mo13862a(C6042a aVar) {
            C12932j.m33818b(aVar, "appIcons");
            int i = C6049c.f15237a[aVar.ordinal()];
            if (i == 1) {
                return "B";
            }
            if (i == 2) {
                return "C";
            }
            if (i == 3) {
                return "D";
            }
            if (i == 4) {
                return "A";
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ C6051a(C12928f fVar) {
            this();
        }
    }

    public C6050d(AnalyticsTracker analyticsTracker) {
        C12932j.m33818b(analyticsTracker, "tracker");
        this.f15239a = analyticsTracker;
    }

    /* renamed from: a */
    public final void mo13859a(C6042a aVar) {
        C12932j.m33818b(aVar, "appIcons");
        AnalyticsTracker analyticsTracker = this.f15239a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("app_icon_type", f15238b.mo13862a(aVar));
        analyticsTracker.track("App Icon Unlock Changed", cVar);
    }

    /* renamed from: a */
    public final void mo13861a(C6042a aVar, boolean z) {
        C12932j.m33818b(aVar, "appIcons");
        AnalyticsTracker analyticsTracker = this.f15239a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("app_icon_type", f15238b.mo13862a(aVar));
        cVar.mo12998a("is_locked", Boolean.valueOf(z));
        analyticsTracker.track("App Icon Unlock Tapped", cVar);
    }

    /* renamed from: a */
    public final void mo13860a(C6042a aVar, String str) {
        C12932j.m33818b(aVar, "appIcons");
        C12932j.m33818b(str, "analyticsKey");
        AnalyticsTracker analyticsTracker = this.f15239a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("app_icon_type", f15238b.mo13862a(aVar));
        cVar.mo12998a("app_icon_share_type", str);
        analyticsTracker.track("App Icon Unlock Shared", cVar);
    }
}
