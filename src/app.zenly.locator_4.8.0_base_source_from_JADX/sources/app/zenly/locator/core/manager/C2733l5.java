package app.zenly.locator.core.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.core.manager.l5 */
public final class C2733l5 implements IGoogleSignInManager<Object> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C2733l5 f7950a;

    /* renamed from: b */
    public static final C2734a f7951b = new C2734a(null);

    /* renamed from: app.zenly.locator.core.manager.l5$a */
    public static final class C2734a {
        private C2734a() {
        }

        /* renamed from: a */
        public final void mo8803a(Context context) {
            C12932j.m33818b(context, "context");
            C2733l5.f7950a = new C2733l5();
        }

        public /* synthetic */ C2734a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final C2733l5 mo8802a() {
            C2733l5 a = C2733l5.f7950a;
            if (a != null) {
                return a;
            }
            C12932j.m33820c("sInstance");
            throw null;
        }
    }

    public C12279e<Object> getGoogleSignInStateObservable() {
        C12279e<Object> q = C12279e.m32633q();
        if (q != null) {
            return q;
        }
        C12932j.m33814a();
        throw null;
    }

    public Intent getSignInIntent() {
        return null;
    }

    public boolean isSignIn() {
        return false;
    }

    public void parseSignInResult(Intent intent) {
        C12932j.m33818b(intent, "data");
    }

    public void signOut(Activity activity) {
        C12932j.m33818b(activity, "activity");
    }
}
