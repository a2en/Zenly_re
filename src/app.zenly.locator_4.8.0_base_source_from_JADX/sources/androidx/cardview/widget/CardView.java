package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import p214e.p227d.C7566a;
import p214e.p227d.C7567b;
import p214e.p227d.C7569d;
import p214e.p227d.C7570e;

public class CardView extends FrameLayout {

    /* renamed from: l */
    private static final int[] f1355l = {16842801};

    /* renamed from: m */
    private static final C0318e f1356m;

    /* renamed from: e */
    private boolean f1357e;

    /* renamed from: f */
    private boolean f1358f;

    /* renamed from: g */
    int f1359g;

    /* renamed from: h */
    int f1360h;

    /* renamed from: i */
    final Rect f1361i;

    /* renamed from: j */
    final Rect f1362j;

    /* renamed from: k */
    private final C0317d f1363k;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0311a implements C0317d {

        /* renamed from: a */
        private Drawable f1364a;

        C0311a() {
        }

        /* renamed from: a */
        public void mo2179a(Drawable drawable) {
            this.f1364a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public Drawable mo2181b() {
            return this.f1364a;
        }

        /* renamed from: c */
        public boolean mo2182c() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: d */
        public View mo2183d() {
            return CardView.this;
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.f1362j.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1361i;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public boolean mo2180a() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: a */
        public void mo2178a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1359g) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1360h) {
                CardView.super.setMinimumHeight(i2);
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f1356m = new C0314b();
        } else if (i >= 17) {
            f1356m = new C0312a();
        } else {
            f1356m = new C0315c();
        }
        f1356m.mo2185a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1356m.mo2193c(this.f1363k);
    }

    public float getCardElevation() {
        return f1356m.mo2197f(this.f1363k);
    }

    public int getContentPaddingBottom() {
        return this.f1361i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1361i.left;
    }

    public int getContentPaddingRight() {
        return this.f1361i.right;
    }

    public int getContentPaddingTop() {
        return this.f1361i.top;
    }

    public float getMaxCardElevation() {
        return f1356m.mo2191b(this.f1363k);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1358f;
    }

    public float getRadius() {
        return f1356m.mo2187a(this.f1363k);
    }

    public boolean getUseCompatPadding() {
        return this.f1357e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f1356m instanceof C0314b)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1356m.mo2199h(this.f1363k)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1356m.mo2195d(this.f1363k)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1356m.mo2190a(this.f1363k, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1356m.mo2192b(this.f1363k, f);
    }

    public void setMaxCardElevation(float f) {
        f1356m.mo2194c(this.f1363k, f);
    }

    public void setMinimumHeight(int i) {
        this.f1360h = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1359g = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1358f) {
            this.f1358f = z;
            f1356m.mo2196e(this.f1363k);
        }
    }

    public void setRadius(float f) {
        f1356m.mo2188a(this.f1363k, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1357e != z) {
            this.f1357e = z;
            f1356m.mo2198g(this.f1363k);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7566a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1356m.mo2190a(this.f1363k, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f1361i = new Rect();
        this.f1362j = new Rect();
        this.f1363k = new C0311a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7570e.CardView, i, C7569d.CardView);
        if (obtainStyledAttributes.hasValue(C7570e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C7570e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1355l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C7567b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C7567b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C7570e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C7570e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C7570e.CardView_cardMaxElevation, 0.0f);
        this.f1357e = obtainStyledAttributes.getBoolean(C7570e.CardView_cardUseCompatPadding, false);
        this.f1358f = obtainStyledAttributes.getBoolean(C7570e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_contentPadding, 0);
        this.f1361i.left = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1361i.top = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1361i.right = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1361i.bottom = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1359g = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_android_minWidth, 0);
        this.f1360h = obtainStyledAttributes.getDimensionPixelSize(C7570e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1356m.mo2189a(this.f1363k, context, colorStateList, dimension, dimension2, f);
    }
}
