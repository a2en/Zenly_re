package app.zenly.locator.decision.p082b;

import app.zenly.android.feature.base.decision.C1323b;
import app.zenly.locator.C4958p;
import app.zenly.locator.decision.p082b.p083u.C3492h;
import app.zenly.locator.decision.p082b.p083u.C3501q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.decision.b.j */
public final class C3463j extends C1323b {

    /* renamed from: app.zenly.locator.decision.b.j$a */
    public static final class C3464a {
        private C3464a() {
        }

        public /* synthetic */ C3464a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3464a(null);
    }

    public C3463j(ZenlyCore zenlyCore, C4958p pVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(pVar, "tweaksPreferences");
        C3501q qVar = new C3501q(pVar, "prefs:tweaks:noFriendDialogSingle", false, 4, null);
        super("feature:noFriendDialogSingleFeature", new C3492h(zenlyCore), qVar);
    }
}
