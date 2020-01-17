package app.zenly.locator.decision.p082b;

import app.zenly.android.feature.base.decision.C1323b;
import app.zenly.locator.C4958p;
import app.zenly.locator.decision.p082b.p083u.C3491g;
import app.zenly.locator.decision.p082b.p083u.C3501q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.decision.b.i */
public final class C3461i extends C1323b {

    /* renamed from: app.zenly.locator.decision.b.i$a */
    public static final class C3462a {
        private C3462a() {
        }

        public /* synthetic */ C3462a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3462a(null);
    }

    public C3461i(ZenlyCore zenlyCore, C4958p pVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(pVar, "tweaksPreferences");
        C3501q qVar = new C3501q(pVar, "prefs:tweaks:noFriendDialogMultiple", false, 4, null);
        super("feature:noFriendDialogMultipleFeature", new C3491g(zenlyCore), qVar);
    }
}
