package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0676d;
import p214e.p215a.C7530j;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: androidx.appcompat.widget.g */
public class C0255g {

    /* renamed from: a */
    private final ImageView f1158a;

    /* renamed from: b */
    private C0289x f1159b;

    /* renamed from: c */
    private C0289x f1160c;

    /* renamed from: d */
    private C0289x f1161d;

    public C0255g(ImageView imageView) {
        this.f1158a = imageView;
    }

    /* renamed from: e */
    private boolean m995e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1159b == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1909a(AttributeSet attributeSet, int i) {
        C0291z a = C0291z.m1196a(this.f1158a.getContext(), attributeSet, C7530j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1158a.getDrawable();
            if (drawable == null) {
                int g = a.mo2115g(C7530j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C7531a.m18133c(this.f1158a.getContext(), g);
                    if (drawable != null) {
                        this.f1158a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0262m.m1080b(drawable);
            }
            if (a.mo2116g(C7530j.AppCompatImageView_tint)) {
                C0676d.m3164a(this.f1158a, a.mo2100a(C7530j.AppCompatImageView_tint));
            }
            if (a.mo2116g(C7530j.AppCompatImageView_tintMode)) {
                C0676d.m3165a(this.f1158a, C0262m.m1078a(a.mo2109d(C7530j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo2102a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1910b() {
        C0289x xVar = this.f1160c;
        if (xVar != null) {
            return xVar.f1308a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1911c() {
        C0289x xVar = this.f1160c;
        if (xVar != null) {
            return xVar.f1309b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1912d() {
        return VERSION.SDK_INT < 21 || !(this.f1158a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: a */
    public void mo1906a(int i) {
        if (i != 0) {
            Drawable c = C7531a.m18133c(this.f1158a.getContext(), i);
            if (c != null) {
                C0262m.m1080b(c);
            }
            this.f1158a.setImageDrawable(c);
        } else {
            this.f1158a.setImageDrawable(null);
        }
        mo1905a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1907a(ColorStateList colorStateList) {
        if (this.f1160c == null) {
            this.f1160c = new C0289x();
        }
        C0289x xVar = this.f1160c;
        xVar.f1308a = colorStateList;
        xVar.f1311d = true;
        mo1905a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1908a(Mode mode) {
        if (this.f1160c == null) {
            this.f1160c = new C0289x();
        }
        C0289x xVar = this.f1160c;
        xVar.f1309b = mode;
        xVar.f1310c = true;
        mo1905a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1905a() {
        Drawable drawable = this.f1158a.getDrawable();
        if (drawable != null) {
            C0262m.m1080b(drawable);
        }
        if (drawable != null && (!m995e() || !m994a(drawable))) {
            C0289x xVar = this.f1160c;
            if (xVar != null) {
                C0250e.m968a(drawable, xVar, this.f1158a.getDrawableState());
            } else {
                C0289x xVar2 = this.f1159b;
                if (xVar2 != null) {
                    C0250e.m968a(drawable, xVar2, this.f1158a.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m994a(Drawable drawable) {
        if (this.f1161d == null) {
            this.f1161d = new C0289x();
        }
        C0289x xVar = this.f1161d;
        xVar.mo2097a();
        ColorStateList a = C0676d.m3163a(this.f1158a);
        if (a != null) {
            xVar.f1311d = true;
            xVar.f1308a = a;
        }
        Mode b = C0676d.m3166b(this.f1158a);
        if (b != null) {
            xVar.f1310c = true;
            xVar.f1309b = b;
        }
        if (!xVar.f1311d && !xVar.f1310c) {
            return false;
        }
        C0250e.m968a(drawable, xVar, this.f1158a.getDrawableState());
        return true;
    }
}
