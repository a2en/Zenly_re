package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.widget.c */
class C0244c {

    /* renamed from: a */
    private final View f1114a;

    /* renamed from: b */
    private final C0250e f1115b;

    /* renamed from: c */
    private int f1116c = -1;

    /* renamed from: d */
    private C0289x f1117d;

    /* renamed from: e */
    private C0289x f1118e;

    /* renamed from: f */
    private C0289x f1119f;

    C0244c(View view) {
        this.f1114a = view;
        this.f1115b = C0250e.m969b();
    }

    /* renamed from: d */
    private boolean m935d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1117d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1871a(AttributeSet attributeSet, int i) {
        C0291z a = C0291z.m1196a(this.f1114a.getContext(), attributeSet, C7530j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo2116g(C7530j.ViewBackgroundHelper_android_background)) {
                this.f1116c = a.mo2115g(C7530j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1115b.mo1897b(this.f1114a.getContext(), this.f1116c);
                if (b != null) {
                    mo1868a(b);
                }
            }
            if (a.mo2116g(C7530j.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.m2819a(this.f1114a, a.mo2100a(C7530j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo2116g(C7530j.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.m2820a(this.f1114a, C0262m.m1078a(a.mo2109d(C7530j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo2102a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1873b(ColorStateList colorStateList) {
        if (this.f1118e == null) {
            this.f1118e = new C0289x();
        }
        C0289x xVar = this.f1118e;
        xVar.f1308a = colorStateList;
        xVar.f1311d = true;
        mo1866a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1874c() {
        C0289x xVar = this.f1118e;
        if (xVar != null) {
            return xVar.f1309b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1872b() {
        C0289x xVar = this.f1118e;
        if (xVar != null) {
            return xVar.f1308a;
        }
        return null;
    }

    /* renamed from: b */
    private boolean m934b(Drawable drawable) {
        if (this.f1119f == null) {
            this.f1119f = new C0289x();
        }
        C0289x xVar = this.f1119f;
        xVar.mo2097a();
        ColorStateList g = ViewCompat.m2851g(this.f1114a);
        if (g != null) {
            xVar.f1311d = true;
            xVar.f1308a = g;
        }
        Mode h = ViewCompat.m2853h(this.f1114a);
        if (h != null) {
            xVar.f1310c = true;
            xVar.f1309b = h;
        }
        if (!xVar.f1311d && !xVar.f1310c) {
            return false;
        }
        C0250e.m968a(drawable, xVar, this.f1114a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1867a(int i) {
        this.f1116c = i;
        C0250e eVar = this.f1115b;
        mo1868a(eVar != null ? eVar.mo1897b(this.f1114a.getContext(), i) : null);
        mo1866a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1870a(Drawable drawable) {
        this.f1116c = -1;
        mo1868a((ColorStateList) null);
        mo1866a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1869a(Mode mode) {
        if (this.f1118e == null) {
            this.f1118e = new C0289x();
        }
        C0289x xVar = this.f1118e;
        xVar.f1309b = mode;
        xVar.f1310c = true;
        mo1866a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1866a() {
        Drawable background = this.f1114a.getBackground();
        if (background != null && (!m935d() || !m934b(background))) {
            C0289x xVar = this.f1118e;
            if (xVar != null) {
                C0250e.m968a(background, xVar, this.f1114a.getDrawableState());
            } else {
                C0289x xVar2 = this.f1117d;
                if (xVar2 != null) {
                    C0250e.m968a(background, xVar2, this.f1114a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1868a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1117d == null) {
                this.f1117d = new C0289x();
            }
            C0289x xVar = this.f1117d;
            xVar.f1308a = colorStateList;
            xVar.f1311d = true;
        } else {
            this.f1117d = null;
        }
        mo1866a();
    }
}
