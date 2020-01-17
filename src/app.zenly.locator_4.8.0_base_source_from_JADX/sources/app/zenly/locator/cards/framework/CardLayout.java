package app.zenly.locator.cards.framework;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import app.zenly.locator.cards.framework.CardFragment.CardHandler;
import app.zenly.locator.p143s.p153p.C5476b;
import kotlin.jvm.internal.C12932j;

public final class CardLayout extends ConstraintLayout implements Tiltable, Screenshotable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f5948A;

    /* renamed from: B */
    private float f5949B;

    /* renamed from: C */
    private float f5950C;

    /* renamed from: D */
    private CardHandler f5951D;

    /* renamed from: E */
    private final boolean f5952E;

    /* renamed from: F */
    private final boolean f5953F;

    /* renamed from: G */
    private float f5954G;

    /* renamed from: H */
    private float f5955H;

    /* renamed from: I */
    private float f5956I;

    /* renamed from: J */
    private float f5957J;

    /* renamed from: K */
    private float f5958K;

    /* renamed from: L */
    private int f5959L;

    /* renamed from: M */
    private int f5960M;

    /* renamed from: z */
    private final int f5961z;

    public static final class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {

        /* renamed from: o0 */
        private int f5962o0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            C12932j.m33818b(context, "context");
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.CardLayout_Layout);
            this.f5962o0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: c */
        public final int mo7430c() {
            return this.f5962o0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: app.zenly.locator.cards.framework.CardLayout$a */
    public static final class C1806a {
        private C1806a() {
        }

        public /* synthetic */ C1806a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.framework.CardLayout$b */
    static final class C1807b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f5963e;

        /* renamed from: f */
        final /* synthetic */ CardLayout f5964f;

        C1807b(View view, CardLayout cardLayout) {
            this.f5963e = view;
            this.f5964f = cardLayout;
        }

        public final void run() {
            CardHandler cardHandler = this.f5964f.getCardHandler();
            if (cardHandler != null) {
                cardHandler.onMeasured((int) (((float) this.f5963e.getMeasuredWidth()) * this.f5964f.f5948A));
            }
        }
    }

    static {
        new C1806a(null);
    }

    public CardLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardLayout(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = R.attr.cardLayoutStyle;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final void m7253b() {
        if (C5476b.f14086k.mo13108a()) {
            float f = this.f5954G;
            float f2 = this.f5957J;
            float f3 = (f * f2) + this.f5958K;
            float f4 = (this.f5955H * f2) + ((float) this.f5959L);
            float f5 = (this.f5956I * f2) + ((float) this.f5960M);
            setRotationX(7.0f * f3);
            setRotationY(10.0f * f4);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                String str = "child";
                if (!onInterceptTilt()) {
                    C12932j.m33815a((Object) childAt, str);
                    m7252a(childAt, f3, f4, f5);
                }
                C12932j.m33815a((Object) childAt, str);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                    childAt.setTranslationX(((float) layoutParams2.mo7430c()) * f4);
                    childAt.setTranslationY(((float) (-layoutParams2.mo7430c())) * f3);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m7254c() {
        super.setScaleX(this.f5949B * this.f5948A);
    }

    /* renamed from: d */
    private final void m7255d() {
        super.setScaleY(this.f5950C * this.f5948A);
    }

    private final void setTiltShiftX(float f) {
        this.f5958K = f;
        m7253b();
    }

    private final void setTiltShiftY(int i) {
        this.f5959L = i;
        m7253b();
    }

    private final void setTiltShiftZ(int i) {
        this.f5960M = i;
        m7253b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final CardHandler getCardHandler() {
        return this.f5951D;
    }

    public final float getTiltRatio() {
        return this.f5957J;
    }

    public boolean onInterceptTilt() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f5953F) {
            super.onMeasure(i, i2);
            return;
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f5952E) {
            int max = Math.max(size, getMinWidth());
            int max2 = Math.max(size2, getMinHeight());
            float f = 1.0f;
            float f2 = max > size ? ((float) size) / ((float) max) : 1.0f;
            if (max2 > size2) {
                f = ((float) size2) / ((float) max2);
            }
            this.f5948A = Math.min(f2, f);
            float f3 = 0.0f;
            setTranslationX(max > size ? ((float) (-(max - size))) / 2.0f : 0.0f);
            if (max2 > size2) {
                f3 = ((float) (-(max2 - size2))) / 2.0f;
            }
            setTranslationY(f3);
            size = max;
            size2 = max2;
        }
        m7254c();
        m7255d();
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, MeasureSpec.getMode(i)), MeasureSpec.makeMeasureSpec(size2, MeasureSpec.getMode(i2)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo2248a();
    }

    public final void setCardHandler(CardHandler cardHandler) {
        this.f5951D = cardHandler;
        mo2248a();
    }

    public void setScaleX(float f) {
        this.f5949B = f;
        m7254c();
    }

    public void setScaleY(float f) {
        this.f5950C = f;
        m7255d();
    }

    public void setTilt(float f, float f2, float f3) {
        if (f != this.f5954G || f2 != this.f5955H || f3 != this.f5956I) {
            this.f5954G = f;
            this.f5955H = f2;
            this.f5956I = f3;
            m7253b();
        }
    }

    public final void setTiltRatio(float f) {
        this.f5957J = f;
        m7253b();
    }

    public Bitmap takeScreenshot(Config config, Drawable drawable) {
        Bitmap bitmap;
        C12932j.m33818b(config, "config");
        C12932j.m33818b(drawable, "background");
        float f = this.f5954G;
        float f2 = this.f5955H;
        setTilt(0.0f, 0.0f, 0.0f);
        if (!this.f5952E || getMinWidth() <= 0 || getMinHeight() <= 0) {
            bitmap = Bitmap.createBitmap(getWidth() + (this.f5961z * 2), getHeight() + (this.f5961z * 2), config);
        } else {
            bitmap = Bitmap.createBitmap(getMinWidth() + (this.f5961z * 2), getMinHeight() + (this.f5961z * 2), config);
        }
        C12932j.m33815a((Object) bitmap, "bmp");
        measure(MeasureSpec.makeMeasureSpec(bitmap.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(bitmap.getHeight(), 1073741824));
        layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        draw(canvas);
        setTilt(f, f2, 0.0f);
        requestLayout();
        return bitmap;
    }

    public CardLayout(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5961z = context.getResources().getDimensionPixelSize(R.dimen.spacing_300);
        this.f5948A = 1.0f;
        this.f5949B = 0.9f;
        this.f5950C = 0.9f;
        this.f5957J = 1.0f;
        this.f5958K = 0.3f;
        setCameraDistance(getCameraDistance() * ((float) 2));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.CardLayout, i, 0);
        setMinWidth(obtainStyledAttributes.getDimensionPixelSize(0, getMinWidth()));
        setMinHeight(obtainStyledAttributes.getDimensionPixelSize(1, getMinHeight()));
        this.f5952E = obtainStyledAttributes.getBoolean(2, true);
        this.f5953F = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m7252a(View view, float f, float f2, float f3) {
        if (view instanceof Tiltable) {
            Tiltable tiltable = (Tiltable) view;
            tiltable.setTilt(f, f2, f3);
            if (!tiltable.onInterceptTilt() && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C12932j.m33815a((Object) childAt, "viewGroup.getChildAt(i)");
                    m7252a(childAt, f, f2, f3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C12932j.m33815a((Object) context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo2248a() {
        View findViewById = findViewById(R.id.card_background);
        if (findViewById != null && findViewById.getMeasuredWidth() > 0) {
            post(new C1807b(findViewById, this));
        }
    }
}
