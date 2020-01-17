package app.zenly.locator.chat;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker.C2442a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.p4 */
public final class C2196p4 {

    /* renamed from: a */
    private final AnalyticsTracker f6737a;

    public C2196p4(AnalyticsTracker analyticsTracker) {
        C12932j.m33818b(analyticsTracker, "tracker");
        this.f6737a = analyticsTracker;
    }

    /* renamed from: a */
    public final void mo8020a() {
        C2442a.m8540a(this.f6737a, "Permission Request Location Always Allow Dialog Displayed", null, 2, null);
    }

    /* renamed from: b */
    public final void mo8021b() {
        C2442a.m8540a(this.f6737a, "Permission Request Location Always Allow Sent", null, 2, null);
    }
}
