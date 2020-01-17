package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.widget.i */
class C0257i extends C0256h {

    /* renamed from: d */
    private final SeekBar f1165d;

    /* renamed from: e */
    private Drawable f1166e;

    /* renamed from: f */
    private ColorStateList f1167f = null;

    /* renamed from: g */
    private Mode f1168g = null;

    /* renamed from: h */
    private boolean f1169h = false;

    /* renamed from: i */
    private boolean f1170i = false;

    C0257i(SeekBar seekBar) {
        super(seekBar);
        this.f1165d = seekBar;
    }

    /* renamed from: d */
    private void m1009d() {
        if (this.f1166e == null) {
            return;
        }
        if (this.f1169h || this.f1170i) {
            this.f1166e = C0559a.m2657i(this.f1166e.mutate());
            if (this.f1169h) {
                C0559a.m2642a(this.f1166e, this.f1167f);
            }
            if (this.f1170i) {
                C0559a.m2645a(this.f1166e, this.f1168g);
            }
            if (this.f1166e.isStateful()) {
                this.f1166e.setState(this.f1165d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1914a(AttributeSet attributeSet, int i) {
        super.mo1914a(attributeSet, i);
        C0291z a = C0291z.m1196a(this.f1165d.getContext(), attributeSet, C7530j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo2108c(C7530j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1165d.setThumb(c);
        }
        mo1916a(a.mo2106b(C7530j.AppCompatSeekBar_tickMark));
        if (a.mo2116g(C7530j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1168g = C0262m.m1078a(a.mo2109d(C7530j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1168g);
            this.f1170i = true;
        }
        if (a.mo2116g(C7530j.AppCompatSeekBar_tickMarkTint)) {
            this.f1167f = a.mo2100a(C7530j.AppCompatSeekBar_tickMarkTint);
            this.f1169h = true;
        }
        a.mo2102a();
        m1009d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1917b() {
        Drawable drawable = this.f1166e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1165d.getDrawableState())) {
            this.f1165d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1918c() {
        Drawable drawable = this.f1166e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1916a(Drawable drawable) {
        Drawable drawable2 = this.f1166e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1166e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1165d);
            C0559a.m2648a(drawable, ViewCompat.m2862o(this.f1165d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1165d.getDrawableState());
            }
            m1009d();
        }
        this.f1165d.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1915a(Canvas canvas) {
        if (this.f1166e != null) {
            int max = this.f1165d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1166e.getIntrinsicWidth();
                int intrinsicHeight = this.f1166e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1166e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1165d.getWidth() - this.f1165d.getPaddingLeft()) - this.f1165d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1165d.getPaddingLeft(), (float) (this.f1165d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1166e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
