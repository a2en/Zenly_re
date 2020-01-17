package app.zenly.android.base.util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.base.util.b */
public final class C1297b {

    /* renamed from: a */
    public static final C1297b f4866a = new C1297b();

    /* renamed from: app.zenly.android.base.util.b$a */
    static final class C1298a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f4867e;

        C1298a(View view) {
            this.f4867e = view;
        }

        public final void run() {
            C1297b.m6241b(this.f4867e);
        }
    }

    private C1297b() {
    }

    /* renamed from: a */
    public static final void m6237a(View view) {
        m6240a(view, false, 2, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6240a(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        m6239a(view, z);
    }

    /* renamed from: b */
    public static final void m6241b(View view) {
        C12932j.m33818b(view, "view");
        view.requestFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(view, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public static final C12956q m6236a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            return null;
        }
        C12932j.m33815a((Object) currentFocus, "it");
        m6240a(currentFocus, false, 2, null);
        return C12956q.f33541a;
    }

    /* renamed from: a */
    public static final void m6238a(View view, long j) {
        C12932j.m33818b(view, "view");
        view.postDelayed(new C1298a(view), j);
    }

    /* renamed from: a */
    public static final void m6239a(View view, boolean z) {
        C12932j.m33818b(view, "view");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            if (z) {
                view.clearFocus();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
