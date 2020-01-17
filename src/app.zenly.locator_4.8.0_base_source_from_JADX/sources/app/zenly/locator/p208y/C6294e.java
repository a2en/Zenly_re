package app.zenly.locator.p208y;

import app.zenly.locator.p208y.C6288c.C6292d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.romutils.Resolution;

/* renamed from: app.zenly.locator.y.e */
public final class C6294e {
    /* renamed from: a */
    public static final C6292d m17353a(Resolution resolution) {
        C12932j.m33818b(resolution, "$this$toStepType");
        int i = C6293d.f15811a[resolution.getId().ordinal()];
        if (i == 1 || i == 2) {
            return C6292d.AUTO_STARTUP;
        }
        if (i == 3) {
            return C6292d.ENERGY_SAVING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
