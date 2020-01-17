package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C10794h;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p364n.C12088a;
import p333g.p357d.p358a.p361b.p365o.C12090a;

/* renamed from: com.google.android.material.button.b */
class C10752b {

    /* renamed from: w */
    private static final boolean f27970w = (VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f27971a;

    /* renamed from: b */
    private int f27972b;

    /* renamed from: c */
    private int f27973c;

    /* renamed from: d */
    private int f27974d;

    /* renamed from: e */
    private int f27975e;

    /* renamed from: f */
    private int f27976f;

    /* renamed from: g */
    private int f27977g;

    /* renamed from: h */
    private Mode f27978h;

    /* renamed from: i */
    private ColorStateList f27979i;

    /* renamed from: j */
    private ColorStateList f27980j;

    /* renamed from: k */
    private ColorStateList f27981k;

    /* renamed from: l */
    private final Paint f27982l = new Paint(1);

    /* renamed from: m */
    private final Rect f27983m = new Rect();

    /* renamed from: n */
    private final RectF f27984n = new RectF();

    /* renamed from: o */
    private GradientDrawable f27985o;

    /* renamed from: p */
    private Drawable f27986p;

    /* renamed from: q */
    private GradientDrawable f27987q;

    /* renamed from: r */
    private Drawable f27988r;

    /* renamed from: s */
    private GradientDrawable f27989s;

    /* renamed from: t */
    private GradientDrawable f27990t;

    /* renamed from: u */
    private GradientDrawable f27991u;

    /* renamed from: v */
    private boolean f27992v = false;

    public C10752b(MaterialButton materialButton) {
        this.f27971a = materialButton;
    }

    /* renamed from: i */
    private Drawable m27454i() {
        this.f27985o = new GradientDrawable();
        this.f27985o.setCornerRadius(((float) this.f27976f) + 1.0E-5f);
        this.f27985o.setColor(-1);
        this.f27986p = C0559a.m2657i(this.f27985o);
        C0559a.m2642a(this.f27986p, this.f27979i);
        Mode mode = this.f27978h;
        if (mode != null) {
            C0559a.m2645a(this.f27986p, mode);
        }
        this.f27987q = new GradientDrawable();
        this.f27987q.setCornerRadius(((float) this.f27976f) + 1.0E-5f);
        this.f27987q.setColor(-1);
        this.f27988r = C0559a.m2657i(this.f27987q);
        C0559a.m2642a(this.f27988r, this.f27981k);
        return m27453a((Drawable) new LayerDrawable(new Drawable[]{this.f27986p, this.f27988r}));
    }

    @TargetApi(21)
    /* renamed from: j */
    private Drawable m27455j() {
        this.f27989s = new GradientDrawable();
        this.f27989s.setCornerRadius(((float) this.f27976f) + 1.0E-5f);
        this.f27989s.setColor(-1);
        m27459n();
        this.f27990t = new GradientDrawable();
        this.f27990t.setCornerRadius(((float) this.f27976f) + 1.0E-5f);
        this.f27990t.setColor(0);
        this.f27990t.setStroke(this.f27977g, this.f27980j);
        InsetDrawable a = m27453a((Drawable) new LayerDrawable(new Drawable[]{this.f27989s, this.f27990t}));
        this.f27991u = new GradientDrawable();
        this.f27991u.setCornerRadius(((float) this.f27976f) + 1.0E-5f);
        this.f27991u.setColor(-1);
        return new C10751a(C12090a.m31908a(this.f27981k), a, this.f27991u);
    }

    /* renamed from: k */
    private GradientDrawable m27456k() {
        if (!f27970w || this.f27971a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f27971a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    /* renamed from: l */
    private GradientDrawable m27457l() {
        if (!f27970w || this.f27971a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f27971a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: m */
    private void m27458m() {
        if (f27970w && this.f27990t != null) {
            this.f27971a.setInternalBackground(m27455j());
        } else if (!f27970w) {
            this.f27971a.invalidate();
        }
    }

    /* renamed from: n */
    private void m27459n() {
        GradientDrawable gradientDrawable = this.f27989s;
        if (gradientDrawable != null) {
            C0559a.m2642a((Drawable) gradientDrawable, this.f27979i);
            Mode mode = this.f27978h;
            if (mode != null) {
                C0559a.m2645a((Drawable) this.f27989s, mode);
            }
        }
    }

    /* renamed from: a */
    public void mo30745a(TypedArray typedArray) {
        int i = 0;
        this.f27972b = typedArray.getDimensionPixelOffset(C12076k.MaterialButton_android_insetLeft, 0);
        this.f27973c = typedArray.getDimensionPixelOffset(C12076k.MaterialButton_android_insetRight, 0);
        this.f27974d = typedArray.getDimensionPixelOffset(C12076k.MaterialButton_android_insetTop, 0);
        this.f27975e = typedArray.getDimensionPixelOffset(C12076k.MaterialButton_android_insetBottom, 0);
        this.f27976f = typedArray.getDimensionPixelSize(C12076k.MaterialButton_cornerRadius, 0);
        this.f27977g = typedArray.getDimensionPixelSize(C12076k.MaterialButton_strokeWidth, 0);
        this.f27978h = C10794h.m27780a(typedArray.getInt(C12076k.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.f27979i = C12088a.m31903a(this.f27971a.getContext(), typedArray, C12076k.MaterialButton_backgroundTint);
        this.f27980j = C12088a.m31903a(this.f27971a.getContext(), typedArray, C12076k.MaterialButton_strokeColor);
        this.f27981k = C12088a.m31903a(this.f27971a.getContext(), typedArray, C12076k.MaterialButton_rippleColor);
        this.f27982l.setStyle(Style.STROKE);
        this.f27982l.setStrokeWidth((float) this.f27977g);
        Paint paint = this.f27982l;
        ColorStateList colorStateList = this.f27980j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.f27971a.getDrawableState(), 0);
        }
        paint.setColor(i);
        int s = ViewCompat.m2866s(this.f27971a);
        int paddingTop = this.f27971a.getPaddingTop();
        int r = ViewCompat.m2865r(this.f27971a);
        int paddingBottom = this.f27971a.getPaddingBottom();
        this.f27971a.setInternalBackground(f27970w ? m27455j() : m27454i());
        ViewCompat.m2818a(this.f27971a, s + this.f27972b, paddingTop + this.f27974d, r + this.f27973c, paddingBottom + this.f27975e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo30748b() {
        return this.f27981k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30753c(ColorStateList colorStateList) {
        if (this.f27979i != colorStateList) {
            this.f27979i = colorStateList;
            if (f27970w) {
                m27459n();
                return;
            }
            Drawable drawable = this.f27986p;
            if (drawable != null) {
                C0559a.m2642a(drawable, this.f27979i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo30754d() {
        return this.f27977g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ColorStateList mo30755e() {
        return this.f27979i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Mode mo30756f() {
        return this.f27978h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo30757g() {
        return this.f27992v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo30758h() {
        this.f27992v = true;
        this.f27971a.setSupportBackgroundTintList(this.f27979i);
        this.f27971a.setSupportBackgroundTintMode(this.f27978h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30750b(ColorStateList colorStateList) {
        if (this.f27980j != colorStateList) {
            this.f27980j = colorStateList;
            Paint paint = this.f27982l;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.f27971a.getDrawableState(), 0);
            }
            paint.setColor(i);
            m27458m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo30751c() {
        return this.f27980j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30749b(int i) {
        if (this.f27976f != i) {
            this.f27976f = i;
            if (f27970w && this.f27989s != null && this.f27990t != null && this.f27991u != null) {
                if (VERSION.SDK_INT == 21) {
                    float f = ((float) i) + 1.0E-5f;
                    m27456k().setCornerRadius(f);
                    m27457l().setCornerRadius(f);
                }
                float f2 = ((float) i) + 1.0E-5f;
                this.f27989s.setCornerRadius(f2);
                this.f27990t.setCornerRadius(f2);
                this.f27991u.setCornerRadius(f2);
            } else if (!f27970w) {
                GradientDrawable gradientDrawable = this.f27985o;
                if (gradientDrawable != null && this.f27987q != null) {
                    float f3 = ((float) i) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f3);
                    this.f27987q.setCornerRadius(f3);
                    this.f27971a.invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30752c(int i) {
        if (this.f27977g != i) {
            this.f27977g = i;
            this.f27982l.setStrokeWidth((float) i);
            m27458m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30746a(Canvas canvas) {
        if (canvas != null && this.f27980j != null && this.f27977g > 0) {
            this.f27983m.set(this.f27971a.getBackground().getBounds());
            RectF rectF = this.f27984n;
            Rect rect = this.f27983m;
            float f = (float) rect.left;
            int i = this.f27977g;
            rectF.set(f + (((float) i) / 2.0f) + ((float) this.f27972b), ((float) rect.top) + (((float) i) / 2.0f) + ((float) this.f27974d), (((float) rect.right) - (((float) i) / 2.0f)) - ((float) this.f27973c), (((float) rect.bottom) - (((float) i) / 2.0f)) - ((float) this.f27975e));
            float f2 = ((float) this.f27976f) - (((float) this.f27977g) / 2.0f);
            canvas.drawRoundRect(this.f27984n, f2, f2, this.f27982l);
        }
    }

    /* renamed from: a */
    private InsetDrawable m27453a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f27972b, this.f27974d, this.f27973c, this.f27975e);
        return insetDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30747a(Mode mode) {
        if (this.f27978h != mode) {
            this.f27978h = mode;
            if (f27970w) {
                m27459n();
                return;
            }
            Drawable drawable = this.f27986p;
            if (drawable != null) {
                Mode mode2 = this.f27978h;
                if (mode2 != null) {
                    C0559a.m2645a(drawable, mode2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30743a(int i, int i2) {
        GradientDrawable gradientDrawable = this.f27991u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f27972b, this.f27974d, i2 - this.f27973c, i - this.f27975e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30742a(int i) {
        if (f27970w) {
            GradientDrawable gradientDrawable = this.f27989s;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return;
            }
        }
        if (!f27970w) {
            GradientDrawable gradientDrawable2 = this.f27985o;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30744a(ColorStateList colorStateList) {
        if (this.f27981k != colorStateList) {
            this.f27981k = colorStateList;
            if (f27970w && (this.f27971a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f27971a.getBackground()).setColor(colorStateList);
            } else if (!f27970w) {
                Drawable drawable = this.f27988r;
                if (drawable != null) {
                    C0559a.m2642a(drawable, colorStateList);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo30741a() {
        return this.f27976f;
    }
}
