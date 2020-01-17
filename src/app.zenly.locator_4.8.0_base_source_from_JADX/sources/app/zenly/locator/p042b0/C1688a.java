package app.zenly.locator.p042b0;

import app.zenly.android.feature.spam.prevention.model.C1468a;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.b0.a */
public final class C1688a {

    /* renamed from: a */
    private final AnalyticsTracker f5735a;

    /* renamed from: app.zenly.locator.b0.a$a */
    public static final class C1689a {
        private C1689a() {
        }

        public /* synthetic */ C1689a(C12928f fVar) {
            this();
        }
    }

    static {
        new C1689a(null);
    }

    public C1688a(AnalyticsTracker analyticsTracker) {
        C12932j.m33818b(analyticsTracker, "tracker");
        this.f5735a = analyticsTracker;
    }

    /* renamed from: a */
    public final void mo7303a(C1468a aVar) {
        String str;
        C12932j.m33818b(aVar, "spamType");
        int i = C1690b.f5736a[aVar.ordinal()];
        if (i == 1) {
            str = "friend_requests_spam_prevention_20";
        } else if (i == 2) {
            str = "friend_requests_spam_prevention_5";
        } else {
            throw new IllegalStateException("Trying to log no spam");
        }
        AnalyticsTracker analyticsTracker = this.f5735a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("warning_type", str);
        analyticsTracker.track("Warning Displayed", cVar);
    }
}
