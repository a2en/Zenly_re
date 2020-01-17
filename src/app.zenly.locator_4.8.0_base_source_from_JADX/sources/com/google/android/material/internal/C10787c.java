package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import androidx.appcompat.widget.C0291z;
import androidx.core.text.C0591e;
import androidx.core.view.C0641c;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7530j;
import p214e.p234h.p238g.C7631a;
import p333g.p357d.p358a.p361b.p362l.C12077a;

/* renamed from: com.google.android.material.internal.c */
public final class C10787c {

    /* renamed from: T */
    private static final boolean f28139T = (VERSION.SDK_INT < 18);

    /* renamed from: U */
    private static final Paint f28140U = null;

    /* renamed from: A */
    private Paint f28141A;

    /* renamed from: B */
    private float f28142B;

    /* renamed from: C */
    private float f28143C;

    /* renamed from: D */
    private float f28144D;

    /* renamed from: E */
    private float f28145E;

    /* renamed from: F */
    private int[] f28146F;

    /* renamed from: G */
    private boolean f28147G;

    /* renamed from: H */
    private final TextPaint f28148H;

    /* renamed from: I */
    private final TextPaint f28149I;

    /* renamed from: J */
    private TimeInterpolator f28150J;

    /* renamed from: K */
    private TimeInterpolator f28151K;

    /* renamed from: L */
    private float f28152L;

    /* renamed from: M */
    private float f28153M;

    /* renamed from: N */
    private float f28154N;

    /* renamed from: O */
    private int f28155O;

    /* renamed from: P */
    private float f28156P;

    /* renamed from: Q */
    private float f28157Q;

    /* renamed from: R */
    private float f28158R;

    /* renamed from: S */
    private int f28159S;

    /* renamed from: a */
    private final View f28160a;

    /* renamed from: b */
    private boolean f28161b;

    /* renamed from: c */
    private float f28162c;

    /* renamed from: d */
    private final Rect f28163d;

    /* renamed from: e */
    private final Rect f28164e;

    /* renamed from: f */
    private final RectF f28165f;

    /* renamed from: g */
    private int f28166g = 16;

    /* renamed from: h */
    private int f28167h = 16;

    /* renamed from: i */
    private float f28168i = 15.0f;

    /* renamed from: j */
    private float f28169j = 15.0f;

    /* renamed from: k */
    private ColorStateList f28170k;

    /* renamed from: l */
    private ColorStateList f28171l;

    /* renamed from: m */
    private float f28172m;

    /* renamed from: n */
    private float f28173n;

    /* renamed from: o */
    private float f28174o;

    /* renamed from: p */
    private float f28175p;

    /* renamed from: q */
    private float f28176q;

    /* renamed from: r */
    private float f28177r;

    /* renamed from: s */
    private Typeface f28178s;

    /* renamed from: t */
    private Typeface f28179t;

    /* renamed from: u */
    private Typeface f28180u;

    /* renamed from: v */
    private CharSequence f28181v;

    /* renamed from: w */
    private CharSequence f28182w;

    /* renamed from: x */
    private boolean f28183x;

    /* renamed from: y */
    private boolean f28184y;

    /* renamed from: z */
    private Bitmap f28185z;

    static {
        Paint paint = f28140U;
        if (paint != null) {
            paint.setAntiAlias(true);
            f28140U.setColor(-65281);
        }
    }

    public C10787c(View view) {
        this.f28160a = view;
        this.f28148H = new TextPaint(129);
        this.f28149I = new TextPaint(this.f28148H);
        this.f28164e = new Rect();
        this.f28163d = new Rect();
        this.f28165f = new RectF();
    }

    /* renamed from: d */
    private Typeface m27728d(int i) {
        TypedArray obtainStyledAttributes = this.f28160a.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    private void m27732i() {
        float f = this.f28145E;
        m27729d(this.f28169j);
        CharSequence charSequence = this.f28182w;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.f28148H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int a = C0641c.m3002a(this.f28167h, this.f28183x ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f28173n = ((float) this.f28164e.top) - this.f28148H.ascent();
        } else if (i != 80) {
            this.f28173n = ((float) this.f28164e.centerY()) + (((this.f28148H.descent() - this.f28148H.ascent()) / 2.0f) - this.f28148H.descent());
        } else {
            this.f28173n = (float) this.f28164e.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f28175p = ((float) this.f28164e.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f28175p = (float) this.f28164e.left;
        } else {
            this.f28175p = ((float) this.f28164e.right) - measureText;
        }
        m27729d(this.f28168i);
        CharSequence charSequence2 = this.f28182w;
        if (charSequence2 != null) {
            f2 = this.f28148H.measureText(charSequence2, 0, charSequence2.length());
        }
        int a2 = C0641c.m3002a(this.f28166g, this.f28183x ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f28172m = ((float) this.f28163d.top) - this.f28148H.ascent();
        } else if (i3 != 80) {
            this.f28172m = ((float) this.f28163d.centerY()) + (((this.f28148H.descent() - this.f28148H.ascent()) / 2.0f) - this.f28148H.descent());
        } else {
            this.f28172m = (float) this.f28163d.bottom;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f28174o = ((float) this.f28163d.centerX()) - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.f28174o = (float) this.f28163d.left;
        } else {
            this.f28174o = ((float) this.f28163d.right) - f2;
        }
        m27734k();
        m27731f(f);
    }

    /* renamed from: j */
    private void m27733j() {
        m27727c(this.f28162c);
    }

    /* renamed from: k */
    private void m27734k() {
        Bitmap bitmap = this.f28185z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f28185z = null;
        }
    }

    /* renamed from: l */
    private void m27735l() {
        if (this.f28185z == null && !this.f28163d.isEmpty() && !TextUtils.isEmpty(this.f28182w)) {
            m27727c(0.0f);
            this.f28142B = this.f28148H.ascent();
            this.f28143C = this.f28148H.descent();
            TextPaint textPaint = this.f28148H;
            CharSequence charSequence = this.f28182w;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f28143C - this.f28142B);
            if (round > 0 && round2 > 0) {
                this.f28185z = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f28185z);
                CharSequence charSequence2 = this.f28182w;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f28148H.descent(), this.f28148H);
                if (this.f28141A == null) {
                    this.f28141A = new Paint(3);
                }
            }
        }
    }

    /* renamed from: m */
    private int m27736m() {
        int[] iArr = this.f28146F;
        if (iArr != null) {
            return this.f28170k.getColorForState(iArr, 0);
        }
        return this.f28170k.getDefaultColor();
    }

    /* renamed from: a */
    public void mo31228a(TimeInterpolator timeInterpolator) {
        this.f28150J = timeInterpolator;
        mo31247h();
    }

    /* renamed from: b */
    public void mo31239b(TimeInterpolator timeInterpolator) {
        this.f28151K = timeInterpolator;
        mo31247h();
    }

    /* renamed from: c */
    public float mo31241c() {
        m27723a(this.f28149I);
        return -this.f28149I.ascent();
    }

    /* renamed from: e */
    public float mo31244e() {
        return this.f28162c;
    }

    /* renamed from: f */
    public final boolean mo31245f() {
        ColorStateList colorStateList = this.f28171l;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f28170k;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo31246g() {
        this.f28161b = this.f28164e.width() > 0 && this.f28164e.height() > 0 && this.f28163d.width() > 0 && this.f28163d.height() > 0;
    }

    /* renamed from: h */
    public void mo31247h() {
        if (this.f28160a.getHeight() > 0 && this.f28160a.getWidth() > 0) {
            m27732i();
            m27733j();
        }
    }

    /* renamed from: e */
    private void m27730e(float f) {
        this.f28165f.left = m27721a((float) this.f28163d.left, (float) this.f28164e.left, f, this.f28150J);
        this.f28165f.top = m27721a(this.f28172m, this.f28173n, f, this.f28150J);
        this.f28165f.right = m27721a((float) this.f28163d.right, (float) this.f28164e.right, f, this.f28150J);
        this.f28165f.bottom = m27721a((float) this.f28163d.bottom, (float) this.f28164e.bottom, f, this.f28150J);
    }

    /* renamed from: f */
    private void m27731f(float f) {
        m27729d(f);
        this.f28184y = f28139T && this.f28144D != 1.0f;
        if (this.f28184y) {
            m27735l();
        }
        ViewCompat.m2808H(this.f28160a);
    }

    /* renamed from: a */
    public void mo31225a(float f) {
        if (this.f28168i != f) {
            this.f28168i = f;
            mo31247h();
        }
    }

    /* renamed from: b */
    public void mo31240b(ColorStateList colorStateList) {
        if (this.f28170k != colorStateList) {
            this.f28170k = colorStateList;
            mo31247h();
        }
    }

    /* renamed from: c */
    public void mo31242c(int i) {
        if (this.f28166g != i) {
            this.f28166g = i;
            mo31247h();
        }
    }

    /* renamed from: c */
    private void m27727c(float f) {
        m27730e(f);
        this.f28176q = m27721a(this.f28174o, this.f28175p, f, this.f28150J);
        this.f28177r = m27721a(this.f28172m, this.f28173n, f, this.f28150J);
        m27731f(m27721a(this.f28168i, this.f28169j, f, this.f28151K));
        if (this.f28171l != this.f28170k) {
            this.f28148H.setColor(m27722a(m27736m(), mo31243d(), f));
        } else {
            this.f28148H.setColor(mo31243d());
        }
        this.f28148H.setShadowLayer(m27721a(this.f28156P, this.f28152L, f, (TimeInterpolator) null), m27721a(this.f28157Q, this.f28153M, f, (TimeInterpolator) null), m27721a(this.f28158R, this.f28154N, f, (TimeInterpolator) null), m27722a(this.f28159S, this.f28155O, f));
        ViewCompat.m2808H(this.f28160a);
    }

    /* renamed from: a */
    public void mo31229a(ColorStateList colorStateList) {
        if (this.f28171l != colorStateList) {
            this.f28171l = colorStateList;
            mo31247h();
        }
    }

    /* renamed from: b */
    public void mo31238b(int i, int i2, int i3, int i4) {
        if (!m27725a(this.f28163d, i, i2, i3, i4)) {
            this.f28163d.set(i, i2, i3, i4);
            this.f28147G = true;
            mo31246g();
        }
    }

    /* renamed from: d */
    public int mo31243d() {
        int[] iArr = this.f28146F;
        if (iArr != null) {
            return this.f28171l.getColorForState(iArr, 0);
        }
        return this.f28171l.getDefaultColor();
    }

    /* renamed from: d */
    private void m27729d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f28181v != null) {
            float width = (float) this.f28164e.width();
            float width2 = (float) this.f28163d.width();
            boolean z3 = true;
            if (m27724a(f, this.f28169j)) {
                float f3 = this.f28169j;
                this.f28144D = 1.0f;
                Typeface typeface = this.f28180u;
                Typeface typeface2 = this.f28178s;
                if (typeface != typeface2) {
                    this.f28180u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f28168i;
                Typeface typeface3 = this.f28180u;
                Typeface typeface4 = this.f28179t;
                if (typeface3 != typeface4) {
                    this.f28180u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (m27724a(f, this.f28168i)) {
                    this.f28144D = 1.0f;
                } else {
                    this.f28144D = f / this.f28168i;
                }
                float f4 = this.f28169j / this.f28168i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f28145E != f2 || this.f28147G || z;
                this.f28145E = f2;
                this.f28147G = false;
            }
            if (this.f28182w == null || z) {
                this.f28148H.setTextSize(this.f28145E);
                this.f28148H.setTypeface(this.f28180u);
                TextPaint textPaint = this.f28148H;
                if (this.f28144D == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f28181v, this.f28148H, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f28182w)) {
                    this.f28182w = ellipsize;
                    this.f28183x = m27726b(this.f28182w);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo31227a(int i, int i2, int i3, int i4) {
        if (!m27725a(this.f28164e, i, i2, i3, i4)) {
            this.f28164e.set(i, i2, i3, i4);
            this.f28147G = true;
            mo31246g();
        }
    }

    /* renamed from: b */
    public void mo31237b(int i) {
        if (this.f28167h != i) {
            this.f28167h = i;
            mo31247h();
        }
    }

    /* renamed from: a */
    public float mo31224a() {
        if (this.f28181v == null) {
            return 0.0f;
        }
        m27723a(this.f28149I);
        TextPaint textPaint = this.f28149I;
        CharSequence charSequence = this.f28181v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public void mo31236b(float f) {
        float a = C7631a.m18584a(f, 0.0f, 1.0f);
        if (a != this.f28162c) {
            this.f28162c = a;
            m27733j();
        }
    }

    /* renamed from: a */
    public void mo31231a(RectF rectF) {
        float f;
        boolean b = m27726b(this.f28181v);
        Rect rect = this.f28164e;
        if (!b) {
            f = (float) rect.left;
        } else {
            f = ((float) rect.right) - mo31224a();
        }
        rectF.left = f;
        Rect rect2 = this.f28164e;
        rectF.top = (float) rect2.top;
        rectF.right = !b ? rectF.left + mo31224a() : (float) rect2.right;
        rectF.bottom = ((float) this.f28164e.top) + mo31241c();
    }

    /* renamed from: b */
    private boolean m27726b(CharSequence charSequence) {
        boolean z = true;
        if (ViewCompat.m2862o(this.f28160a) != 1) {
            z = false;
        }
        return (z ? C0591e.f2717d : C0591e.f2716c).isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public ColorStateList mo31235b() {
        return this.f28171l;
    }

    /* renamed from: a */
    private void m27723a(TextPaint textPaint) {
        textPaint.setTextSize(this.f28169j);
        textPaint.setTypeface(this.f28178s);
    }

    /* renamed from: a */
    public void mo31226a(int i) {
        C0291z a = C0291z.m1194a(this.f28160a.getContext(), i, C7530j.TextAppearance);
        if (a.mo2116g(C7530j.TextAppearance_android_textColor)) {
            this.f28171l = a.mo2100a(C7530j.TextAppearance_android_textColor);
        }
        if (a.mo2116g(C7530j.TextAppearance_android_textSize)) {
            this.f28169j = (float) a.mo2107c(C7530j.TextAppearance_android_textSize, (int) this.f28169j);
        }
        this.f28155O = a.mo2109d(C7530j.TextAppearance_android_shadowColor, 0);
        this.f28153M = a.mo2104b(C7530j.TextAppearance_android_shadowDx, 0.0f);
        this.f28154N = a.mo2104b(C7530j.TextAppearance_android_shadowDy, 0.0f);
        this.f28152L = a.mo2104b(C7530j.TextAppearance_android_shadowRadius, 0.0f);
        a.mo2102a();
        if (VERSION.SDK_INT >= 16) {
            this.f28178s = m27728d(i);
        }
        mo31247h();
    }

    /* renamed from: a */
    public void mo31232a(Typeface typeface) {
        this.f28179t = typeface;
        this.f28178s = typeface;
        mo31247h();
    }

    /* renamed from: a */
    public final boolean mo31234a(int[] iArr) {
        this.f28146F = iArr;
        if (!mo31245f()) {
            return false;
        }
        mo31247h();
        return true;
    }

    /* renamed from: a */
    public void mo31230a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f28182w != null && this.f28161b) {
            float f2 = this.f28176q;
            float f3 = this.f28177r;
            boolean z = this.f28184y && this.f28185z != null;
            if (z) {
                f = this.f28142B * this.f28144D;
            } else {
                f = this.f28148H.ascent() * this.f28144D;
                this.f28148H.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f28144D;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f28185z, f2, f4, this.f28141A);
            } else {
                CharSequence charSequence = this.f28182w;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f28148H);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void mo31233a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f28181v)) {
            this.f28181v = charSequence;
            this.f28182w = null;
            m27734k();
            mo31247h();
        }
    }

    /* renamed from: a */
    private static boolean m27724a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static int m27722a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m27721a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C12077a.m31872a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m27725a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
