package app.zenly.locator.p143s.p144i.p145e;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.p143s.p144i.C5427c;
import app.zenly.locator.p143s.p144i.C5428d;
import com.segment.analytics.Analytics;
import com.segment.analytics.Analytics.C11614k;
import com.segment.analytics.C11648i;
import com.segment.analytics.C11668l;
import com.segment.analytics.C11683q;
import com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration;
import com.segment.analytics.p323s.p324a.p325a.C11687a;
import java.util.Map.Entry;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.i.e.a */
public final class C5429a implements AnalyticsTracker {

    /* renamed from: a */
    private final Analytics f13982a;

    public C5429a(Context context, boolean z) {
        C12932j.m33818b(context, "context");
        C11614k kVar = new C11614k(context, context.getString(R.string.config_segment_token));
        kVar.mo34256b();
        kVar.mo34254a(C11687a.f30305l);
        kVar.mo34254a(AppsflyerIntegration.f30178i);
        if (z) {
            kVar.mo34252a(1);
        }
        Analytics.m30400a(kVar.mo34255a());
        Analytics b = Analytics.m30401b(context);
        C12932j.m33815a((Object) b, "Analytics.with(context)");
        this.f13982a = b;
    }

    /* renamed from: a */
    private final C11668l m15439a(C5427c cVar) {
        C11668l lVar = new C11668l();
        lVar.putAll(cVar.mo12999a());
        return lVar;
    }

    public void identify(String str, C5428d dVar) {
        C12932j.m33818b(str, "userId");
        C12932j.m33818b(dVar, "traits");
        this.f13982a.mo34223a(str, m15440a(dVar), (C11648i) null);
    }

    public void reset() {
        this.f13982a.mo34230d();
    }

    public void track(String str, C5427c cVar) {
        C12932j.m33818b(str, "event");
        this.f13982a.mo34221a(str, cVar != null ? m15439a(cVar) : null);
    }

    /* renamed from: a */
    private final C11683q m15440a(C5428d dVar) {
        C11683q qVar = new C11683q();
        for (Entry entry : dVar.mo13002a().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                value = ((Boolean) value).booleanValue() ? "True" : "False";
            }
            qVar.put(str, value);
        }
        return qVar;
    }
}
