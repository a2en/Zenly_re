package app.zenly.locator.core.analytics.tracker;

import app.zenly.locator.p143s.p144i.C5427c;
import app.zenly.locator.p143s.p144i.C5428d;

public interface AnalyticsTracker {

    /* renamed from: app.zenly.locator.core.analytics.tracker.AnalyticsTracker$a */
    public static final class C2442a {
        /* renamed from: a */
        public static /* synthetic */ void m8540a(AnalyticsTracker analyticsTracker, String str, C5427c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    cVar = null;
                }
                analyticsTracker.track(str, cVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
    }

    void identify(String str, C5428d dVar);

    void reset();

    void track(String str, C5427c cVar);
}
