package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.C9536j;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.e */
public class C9613e extends C9609a {

    /* renamed from: k */
    private final Drawable[] f24971k;

    /* renamed from: l */
    private final boolean f24972l;

    /* renamed from: m */
    private final int f24973m;

    /* renamed from: n */
    int f24974n;

    /* renamed from: o */
    int f24975o;

    /* renamed from: p */
    long f24976p;

    /* renamed from: q */
    int[] f24977q;

    /* renamed from: r */
    int[] f24978r;

    /* renamed from: s */
    int f24979s;

    /* renamed from: t */
    boolean[] f24980t;

    /* renamed from: u */
    int f24981u;

    public C9613e(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    /* renamed from: a */
    private boolean m23597a(float f) {
        boolean z = true;
        for (int i = 0; i < this.f24971k.length; i++) {
            int i2 = this.f24980t[i] ? 1 : -1;
            int[] iArr = this.f24978r;
            iArr[i] = (int) (((float) this.f24977q[i]) + (((float) (i2 * 255)) * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.f24978r;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.f24980t[i] && this.f24978r[i] < 255) {
                z = false;
            }
            if (!this.f24980t[i] && this.f24978r[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    private void m23598g() {
        this.f24974n = 2;
        Arrays.fill(this.f24977q, this.f24973m);
        this.f24977q[0] = 255;
        Arrays.fill(this.f24978r, this.f24973m);
        this.f24978r[0] = 255;
        Arrays.fill(this.f24980t, this.f24972l);
        this.f24980t[0] = true;
    }

    /* renamed from: b */
    public void mo25969b() {
        this.f24981u++;
    }

    /* renamed from: c */
    public void mo25971c() {
        this.f24981u--;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo25974d(int i) {
        this.f24975o = i;
        if (this.f24974n == 1) {
            this.f24974n = 0;
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i = this.f24974n;
        int i2 = 2;
        int i3 = 0;
        if (i == 0) {
            System.arraycopy(this.f24978r, 0, this.f24977q, 0, this.f24971k.length);
            this.f24976p = mo25976f();
            z = m23597a(this.f24975o == 0 ? 1.0f : 0.0f);
            if (!z) {
                i2 = 1;
            }
            this.f24974n = i2;
        } else if (i != 1) {
            z = true;
        } else {
            C9536j.m23279b(this.f24975o > 0);
            z = m23597a(((float) (mo25976f() - this.f24976p)) / ((float) this.f24975o));
            if (!z) {
                i2 = 1;
            }
            this.f24974n = i2;
        }
        while (true) {
            Drawable[] drawableArr = this.f24971k;
            if (i3 >= drawableArr.length) {
                break;
            }
            m23596a(canvas, drawableArr[i3], (this.f24978r[i3] * this.f24979s) / 255);
            i3++;
        }
        if (!z) {
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public void mo25975e() {
        this.f24974n = 2;
        for (int i = 0; i < this.f24971k.length; i++) {
            this.f24978r[i] = this.f24980t[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo25976f() {
        return SystemClock.uptimeMillis();
    }

    public int getAlpha() {
        return this.f24979s;
    }

    public void invalidateSelf() {
        if (this.f24981u == 0) {
            super.invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        if (this.f24979s != i) {
            this.f24979s = i;
            invalidateSelf();
        }
    }

    public C9613e(Drawable[] drawableArr, boolean z) {
        super(drawableArr);
        boolean z2 = true;
        if (drawableArr.length < 1) {
            z2 = false;
        }
        C9536j.m23280b(z2, "At least one layer required!");
        this.f24971k = drawableArr;
        this.f24977q = new int[drawableArr.length];
        this.f24978r = new int[drawableArr.length];
        int i = 255;
        this.f24979s = 255;
        this.f24980t = new boolean[drawableArr.length];
        this.f24981u = 0;
        this.f24972l = z;
        if (!this.f24972l) {
            i = 0;
        }
        this.f24973m = i;
        m23598g();
    }

    /* renamed from: b */
    public void mo25970b(int i) {
        this.f24974n = 0;
        this.f24980t[i] = true;
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo25972c(int i) {
        this.f24974n = 0;
        this.f24980t[i] = false;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo25973d() {
        this.f24974n = 0;
        Arrays.fill(this.f24980t, true);
        invalidateSelf();
    }

    /* renamed from: a */
    private void m23596a(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f24981u++;
            drawable.mutate().setAlpha(i);
            this.f24981u--;
            drawable.draw(canvas);
        }
    }
}
