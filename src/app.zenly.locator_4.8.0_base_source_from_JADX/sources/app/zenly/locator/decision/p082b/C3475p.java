package app.zenly.locator.decision.p082b;

import app.zenly.android.feature.base.decision.C1323b;
import app.zenly.locator.C4958p;
import app.zenly.locator.decision.p082b.p083u.C3497m;
import app.zenly.locator.decision.p082b.p083u.C3501q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.decision.b.p */
public final class C3475p extends C1323b {

    /* renamed from: app.zenly.locator.decision.b.p$a */
    public static final class C3476a {
        private C3476a() {
        }

        public /* synthetic */ C3476a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3476a(null);
    }

    public C3475p(ZenlyCore zenlyCore, C4958p pVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(pVar, "tweaksPreferences");
        C3501q qVar = new C3501q(pVar, "prefs:tweaks:socialNetworkOnboarding", false, 4, null);
        super("feature:SocialNetworkInOnboarding", new C3497m(zenlyCore), qVar);
    }
}
