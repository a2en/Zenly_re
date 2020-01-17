package androidx.core.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;
import androidx.core.util.C0602d;

/* renamed from: androidx.core.view.p */
public class C0666p {

    /* renamed from: a */
    private final Object f2841a;

    private C0666p(Object obj) {
        this.f2841a = obj;
    }

    /* renamed from: a */
    public int mo3442a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2841a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo3444b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2841a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo3445c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2841a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo3446d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2841a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo3447e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f2841a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0666p.class != obj.getClass()) {
            return false;
        }
        return C0602d.m2768a(this.f2841a, ((C0666p) obj).f2841a);
    }

    public int hashCode() {
        Object obj = this.f2841a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    public C0666p mo3443a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C0666p(((WindowInsets) this.f2841a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: a */
    static C0666p m3081a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0666p(obj);
    }

    /* renamed from: a */
    static Object m3082a(C0666p pVar) {
        if (pVar == null) {
            return null;
        }
        return pVar.f2841a;
    }
}
