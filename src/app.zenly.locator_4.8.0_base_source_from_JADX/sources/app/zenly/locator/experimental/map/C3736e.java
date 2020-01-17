package app.zenly.locator.experimental.map;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.p196u.C5942a;
import app.zenly.locator.p196u.p197b.C5943a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.experimental.map.e */
public final class C3736e {
    static {
        new C3736e();
    }

    private C3736e() {
    }

    /* renamed from: a */
    public static final NextUnlockController m11156a(ZenlyCore zenlyCore, C5943a aVar) {
        C12932j.m33818b(zenlyCore, "zenlyCore");
        C12932j.m33818b(aVar, "experimentalAnalytics");
        C6770e experimentFlags = zenlyCore.experimentFlags();
        boolean z = (experimentFlags != null ? experimentFlags.getWatchersLocked() : null) == C6775d.GROUP_IN_EXPERIMENT;
        ZenlySchedulers a = C1351e.m6372a(C5942a.f14960b.mo19916a("nextUnlock"));
        if (z) {
            return new C3723a(zenlyCore, aVar, a);
        }
        return new C3734d(zenlyCore, a);
    }
}
