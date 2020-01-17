package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.C11939f.C11941b;
import com.theartofdev.edmodo.cropper.CropImageView.C11924c;

/* renamed from: com.theartofdev.edmodo.cropper.e */
final class C11938e {

    /* renamed from: a */
    private final RectF f31094a = new RectF();

    /* renamed from: b */
    private final RectF f31095b = new RectF();

    /* renamed from: c */
    private float f31096c;

    /* renamed from: d */
    private float f31097d;

    /* renamed from: e */
    private float f31098e;

    /* renamed from: f */
    private float f31099f;

    /* renamed from: g */
    private float f31100g;

    /* renamed from: h */
    private float f31101h;

    /* renamed from: i */
    private float f31102i;

    /* renamed from: j */
    private float f31103j;

    /* renamed from: k */
    private float f31104k = 1.0f;

    /* renamed from: l */
    private float f31105l = 1.0f;

    C11938e() {
    }

    /* renamed from: a */
    private static boolean m31393a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: i */
    private boolean m31396i() {
        return !mo35449h();
    }

    /* renamed from: a */
    public float mo35437a() {
        return Math.min(this.f31099f, this.f31103j / this.f31105l);
    }

    /* renamed from: b */
    public float mo35443b() {
        return Math.min(this.f31098e, this.f31102i / this.f31104k);
    }

    /* renamed from: c */
    public float mo35444c() {
        return Math.max(this.f31097d, this.f31101h / this.f31105l);
    }

    /* renamed from: d */
    public float mo35445d() {
        return Math.max(this.f31096c, this.f31100g / this.f31104k);
    }

    /* renamed from: e */
    public RectF mo35446e() {
        this.f31095b.set(this.f31094a);
        return this.f31095b;
    }

    /* renamed from: f */
    public float mo35447f() {
        return this.f31105l;
    }

    /* renamed from: g */
    public float mo35448g() {
        return this.f31104k;
    }

    /* renamed from: h */
    public boolean mo35449h() {
        return this.f31094a.width() >= 100.0f && this.f31094a.height() >= 100.0f;
    }

    /* renamed from: b */
    private static boolean m31394b(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: c */
    private static boolean m31395c(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: a */
    public void mo35440a(int i, int i2) {
        this.f31102i = (float) i;
        this.f31103j = (float) i2;
    }

    /* renamed from: a */
    public void mo35439a(float f, float f2, float f3, float f4) {
        this.f31098e = f;
        this.f31099f = f2;
        this.f31104k = f3;
        this.f31105l = f4;
    }

    /* renamed from: a */
    public void mo35442a(CropImageOptions cropImageOptions) {
        this.f31096c = (float) cropImageOptions.f30897B;
        this.f31097d = (float) cropImageOptions.f30898C;
        this.f31100g = (float) cropImageOptions.f30899D;
        this.f31101h = (float) cropImageOptions.f30900E;
        this.f31102i = (float) cropImageOptions.f30901F;
        this.f31103j = (float) cropImageOptions.f30902G;
    }

    /* renamed from: a */
    public void mo35441a(RectF rectF) {
        this.f31094a.set(rectF);
    }

    /* renamed from: a */
    public C11939f mo35438a(float f, float f2, float f3, C11924c cVar) {
        C11941b bVar;
        if (cVar == C11924c.OVAL) {
            bVar = m31390a(f, f2);
        } else {
            bVar = m31391a(f, f2, f3);
        }
        if (bVar != null) {
            return new C11939f(bVar, this, f, f2);
        }
        return null;
    }

    /* renamed from: a */
    private C11941b m31391a(float f, float f2, float f3) {
        RectF rectF = this.f31094a;
        if (m31392a(f, f2, rectF.left, rectF.top, f3)) {
            return C11941b.TOP_LEFT;
        }
        RectF rectF2 = this.f31094a;
        if (m31392a(f, f2, rectF2.right, rectF2.top, f3)) {
            return C11941b.TOP_RIGHT;
        }
        RectF rectF3 = this.f31094a;
        if (m31392a(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return C11941b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f31094a;
        if (m31392a(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return C11941b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f31094a;
        if (m31393a(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m31396i()) {
            return C11941b.CENTER;
        }
        RectF rectF6 = this.f31094a;
        if (m31394b(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
            return C11941b.TOP;
        }
        RectF rectF7 = this.f31094a;
        if (m31394b(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
            return C11941b.BOTTOM;
        }
        RectF rectF8 = this.f31094a;
        if (m31395c(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
            return C11941b.LEFT;
        }
        RectF rectF9 = this.f31094a;
        if (m31395c(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
            return C11941b.RIGHT;
        }
        RectF rectF10 = this.f31094a;
        if (!m31393a(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || m31396i()) {
            return null;
        }
        return C11941b.CENTER;
    }

    /* renamed from: a */
    private C11941b m31390a(float f, float f2) {
        float width = this.f31094a.width() / 6.0f;
        RectF rectF = this.f31094a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.f31094a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        if (f < f4) {
            if (f2 < f7) {
                return C11941b.TOP_LEFT;
            }
            if (f2 < f8) {
                return C11941b.LEFT;
            }
            return C11941b.BOTTOM_LEFT;
        } else if (f < f5) {
            if (f2 < f7) {
                return C11941b.TOP;
            }
            if (f2 < f8) {
                return C11941b.CENTER;
            }
            return C11941b.BOTTOM;
        } else if (f2 < f7) {
            return C11941b.TOP_RIGHT;
        } else {
            if (f2 < f8) {
                return C11941b.RIGHT;
            }
            return C11941b.BOTTOM_RIGHT;
        }
    }

    /* renamed from: a */
    private static boolean m31392a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }
}
