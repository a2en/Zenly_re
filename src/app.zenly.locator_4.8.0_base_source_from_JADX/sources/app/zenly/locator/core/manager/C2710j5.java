package app.zenly.locator.core.manager;

import android.content.Context;
import app.zenly.locator.core.models.C2879d0;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.core.manager.j5 */
public final class C2710j5 implements IDsApiManager {

    /* renamed from: a */
    public static final C2711a f7884a = new C2711a(null);

    /* renamed from: app.zenly.locator.core.manager.j5$a */
    public static final class C2711a {
        private C2711a() {
        }

        /* renamed from: a */
        public final void mo8775a(Context context, C2733l5 l5Var) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(l5Var, "googleSignInManager");
            C2710j5.m9098a(new C2710j5());
        }

        public /* synthetic */ C2711a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m9098a(C2710j5 j5Var) {
    }

    public C12279e<String> getDebugState(C2879d0 d0Var) {
        C12932j.m33818b(d0Var, "user");
        C12279e<String> q = C12279e.m32633q();
        if (q != null) {
            return q;
        }
        C12932j.m33814a();
        throw null;
    }

    public C12279e<Boolean> isAvailable() {
        C12279e<Boolean> e = C12279e.m32626e(Boolean.valueOf(false));
        if (e != null) {
            C12932j.m33815a((Object) e, "Observable.just(false)!!");
            return e;
        }
        C12932j.m33814a();
        throw null;
    }
}
