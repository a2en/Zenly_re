package app.zenly.locator;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.p */
public final class C4958p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C4958p f12963a = new C4958p();

    /* renamed from: b */
    public static final C4959a f12964b = new C4959a(null);

    /* renamed from: app.zenly.locator.p$a */
    public static final class C4959a {
        private C4959a() {
        }

        /* renamed from: a */
        public final C4958p mo12157a(Context context) {
            C12932j.m33818b(context, "context");
            return C4958p.f12963a;
        }

        public /* synthetic */ C4959a(C12928f fVar) {
            this();
        }
    }

    private C4958p() {
    }

    /* renamed from: a */
    public static final C4958p m14306a(Context context) {
        return f12964b.mo12157a(context);
    }

    /* renamed from: a */
    public final void mo12154a(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        C12932j.m33818b(onSharedPreferenceChangeListener, "listener");
    }

    /* renamed from: a */
    public final boolean mo12155a(String str, boolean z) {
        C12932j.m33818b(str, "key");
        return z;
    }

    /* renamed from: b */
    public final void mo12156b(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        C12932j.m33818b(onSharedPreferenceChangeListener, "listener");
    }
}
