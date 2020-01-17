package app.zenly.locator.decision.p082b;

import app.zenly.android.feature.base.decision.C1323b;
import app.zenly.locator.C4958p;
import app.zenly.locator.decision.p082b.p083u.C3490f;
import app.zenly.locator.decision.p082b.p083u.C3501q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.decision.b.h */
public final class C3459h extends C1323b {

    /* renamed from: app.zenly.locator.decision.b.h$a */
    public static final class C3460a {
        private C3460a() {
        }

        public /* synthetic */ C3460a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3460a(null);
    }

    public C3459h(ZenlyCore zenlyCore, C4958p pVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(pVar, "tweaksPreferences");
        C3501q qVar = new C3501q(pVar, "prefs:tweaks:noFriendDialogCarousel", false, 4, null);
        super("feature:noFriendDialogCarouselFeature", new C3490f(zenlyCore), qVar);
    }
}
