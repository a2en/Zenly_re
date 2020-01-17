package app.zenly.android.feature.map.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.base.view.C1309a;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.android.feature.map.widget.p013a.C1421a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p274b.C7718a;
import p250f.p251a.p252a.p263b.p274b.C7719b;
import p250f.p251a.p252a.p263b.p274b.C7720c;
import p250f.p251a.p252a.p263b.p274b.C7721d;
import p250f.p251a.p252a.p263b.p274b.C7722e;
import p250f.p251a.p252a.p263b.p274b.C7723f;

public final class BatteryView extends ConstraintLayout implements Callback {

    /* renamed from: T */
    private static final Integer[] f5082T = {Integer.valueOf(C7719b.ic_battery_capsule_unplugged_0_size_16), Integer.valueOf(C7719b.ic_battery_capsule_unplugged_1_size_16), Integer.valueOf(C7719b.ic_battery_capsule_unplugged_2_size_16), Integer.valueOf(C7719b.ic_battery_capsule_unplugged_3_size_16), Integer.valueOf(C7719b.ic_battery_capsule_unplugged_4_size_16), Integer.valueOf(C7719b.ic_battery_capsule_unplugged_5_size_16)};

    /* renamed from: A */
    private int f5083A;

    /* renamed from: B */
    private boolean f5084B;

    /* renamed from: C */
    private boolean f5085C;

    /* renamed from: D */
    private int f5086D;

    /* renamed from: E */
    private int f5087E;

    /* renamed from: F */
    private final ViewVisibilityAggregatedHelper<?> f5088F;

    /* renamed from: G */
    private final C1421a f5089G;

    /* renamed from: H */
    private final ImageView f5090H;

    /* renamed from: I */
    private final ImageView f5091I;

    /* renamed from: J */
    private final TextView f5092J;

    /* renamed from: K */
    private final ValueAnimator f5093K;

    /* renamed from: L */
    private final C1418e f5094L;

    /* renamed from: M */
    private int f5095M;

    /* renamed from: N */
    private final ObjectAnimator f5096N;

    /* renamed from: O */
    private final AnimatorSet f5097O;

    /* renamed from: P */
    private final AnimatorSet f5098P;

    /* renamed from: Q */
    private final AttributeSet f5099Q;

    /* renamed from: R */
    private final int f5100R;

    /* renamed from: S */
    private final int f5101S;

    /* renamed from: z */
    private Integer[] f5102z;

    /* renamed from: app.zenly.android.feature.map.widget.BatteryView$a */
    public static final class C1414a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BatteryView f5103a;

        public C1414a(BatteryView batteryView) {
            this.f5103a = batteryView;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f5103a.m6469a(true);
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.android.feature.map.widget.BatteryView$b */
    public static final class C1415b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BatteryView f5104a;

        public C1415b(BatteryView batteryView) {
            this.f5104a = batteryView;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f5104a.m6469a(false);
        }
    }

    /* renamed from: app.zenly.android.feature.map.widget.BatteryView$c */
    static final class C1416c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BatteryView f5105a;

        C1416c(BatteryView batteryView) {
            this.f5105a = batteryView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BatteryView batteryView = this.f5105a;
            C12932j.m33815a((Object) valueAnimator, "v");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                batteryView.setCurrentBatteryLevel(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: app.zenly.android.feature.map.widget.BatteryView$d */
    public static final class C1417d {
        private C1417d() {
        }

        public /* synthetic */ C1417d(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.map.widget.BatteryView$e */
    private static final class C1418e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f5106a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f5107b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f5108c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f5109d;

        /* renamed from: e */
        private final C1420b f5110e = new C1420b(this);

        /* renamed from: f */
        private final C1419a f5111f = new C1419a(this);

        /* renamed from: g */
        private final View f5112g;

        /* renamed from: app.zenly.android.feature.map.widget.BatteryView$e$a */
        public static final class C1419a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C1418e f5113a;

            C1419a(C1418e eVar) {
                this.f5113a = eVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f5113a.f5108c = false;
            }
        }

        /* renamed from: app.zenly.android.feature.map.widget.BatteryView$e$b */
        public static final class C1420b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C1418e f5114a;

            C1420b(C1418e eVar) {
                this.f5114a = eVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f5114a.f5106a = false;
                this.f5114a.f5107b = true;
                if (!this.f5114a.f5109d) {
                    this.f5114a.mo6710a();
                }
            }
        }

        public C1418e(View view) {
            C12932j.m33818b(view, "target");
            this.f5112g = view;
        }

        /* renamed from: b */
        public final void mo6711b() {
            this.f5109d = true;
            if (!this.f5106a) {
                if (this.f5108c) {
                    this.f5112g.animate().cancel();
                }
                if (!this.f5107b) {
                    this.f5106a = true;
                    this.f5112g.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200).setListener(this.f5110e).start();
                }
            }
        }

        /* renamed from: a */
        public final void mo6710a() {
            this.f5109d = false;
            if (!this.f5108c && !this.f5106a) {
                this.f5107b = false;
                this.f5108c = true;
                this.f5112g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setListener(this.f5111f).start();
            }
        }
    }

    static {
        new C1417d(null);
    }

    public BatteryView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ BatteryView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C12928f fVar) {
        if ((i3 & 2) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = C7718a.batteryViewStyle;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        this(context, attributeSet, i, i2);
    }

    /* renamed from: b */
    private final long m6470b(int i, int i2) {
        return Math.round(((double) Math.abs(i - i2)) * 6.0d);
    }

    /* renamed from: c */
    private final void m6473c(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f5099Q, C7723f.BatteryView, i, i2);
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_minWidth)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(C7723f.BatteryView_minWidth, 0));
        }
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_minHeight)) {
            setMinHeight(obtainStyledAttributes.getDimensionPixelSize(C7723f.BatteryView_minHeight, 0));
        }
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_capsuleBackgroundColor)) {
            setCapsuleBackgroundColor(obtainStyledAttributes.getColor(C7723f.BatteryView_capsuleBackgroundColor, 0));
        }
        String str = "resources.obtainTypedArray(resId)";
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_capsuleProgressColors)) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(C7723f.BatteryView_capsuleProgressColors, 0));
            C12932j.m33815a((Object) obtainTypedArray, str);
            int length = obtainTypedArray.length();
            Integer[] numArr = new Integer[length];
            for (int i3 = 0; i3 < length; i3++) {
                numArr[i3] = Integer.valueOf(obtainTypedArray.getColor(i3, 0));
            }
            setCapsuleProgressColors(numArr);
            obtainTypedArray.recycle();
        }
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_foregroundColors)) {
            TypedArray obtainTypedArray2 = getResources().obtainTypedArray(obtainStyledAttributes.getResourceId(C7723f.BatteryView_foregroundColors, 0));
            C12932j.m33815a((Object) obtainTypedArray2, str);
            int length2 = obtainTypedArray2.length();
            Integer[] numArr2 = new Integer[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                numArr2[i4] = Integer.valueOf(obtainTypedArray2.getColor(i4, 0));
            }
            setForegroundColors(numArr2);
            obtainTypedArray2.recycle();
        }
        if (obtainStyledAttributes.hasValue(C7723f.BatteryView_capsuleCornerRadius)) {
            setCapsuleCornerRadius(obtainStyledAttributes.getDimensionPixelSize(C7723f.BatteryView_capsuleCornerRadius, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private final void m6474d() {
        int i = this.f5087E;
        if (i == 0) {
            this.f5090H.setImageResource(((Number) C12840k.m33577c((Object[]) f5082T)).intValue());
        } else if (i != 100) {
            int length = f5082T.length - 2;
            this.f5090H.setImageResource(f5082T[C12973l.m33890b((int) ((((float) (i * length)) / 100.0f) + ((float) 1)), length + 1)].intValue());
        } else {
            this.f5090H.setImageResource(((Number) C12840k.m33580e(f5082T)).intValue());
        }
    }

    /* renamed from: e */
    private final void m6475e() {
        this.f5092J.setText(getResources().getString(C7722e.map_callout_battery_percentage, new Object[]{Integer.valueOf(this.f5087E)}));
    }

    /* renamed from: f */
    private final void m6476f() {
        int i = this.f5086D;
        int i2 = C7674a.f19294a;
        if (i != i2) {
            m6473c(i2, i);
        } else {
            m6473c(this.f5100R, this.f5101S);
        }
        invalidate();
    }

    /* access modifiers changed from: private */
    public final void setCurrentBatteryLevel(int i) {
        if (this.f5085C && this.f5083A < 25) {
            this.f5094L.mo6711b();
        }
        this.f5087E = i;
        this.f5089G.mo6715a(((float) i) / 100.0f);
        m6472c();
        m6474d();
        m6475e();
        m6469a(false);
        this.f5094L.mo6710a();
    }

    public final int getBatteryLevel() {
        return this.f5083A;
    }

    public final int getCapsuleBackgroundColor() {
        return this.f5089G.mo6714a();
    }

    public final int getCapsuleCornerRadius() {
        return this.f5089G.mo6720c();
    }

    public final Integer[] getCapsuleProgressColors() {
        return this.f5089G.mo6719b();
    }

    public final Integer[] getForegroundColors() {
        return this.f5102z;
    }

    public final int getStyleOverride() {
        return this.f5086D;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        m6469a(false);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public final void setAnimated(boolean z) {
        if (this.f5085C != z) {
            this.f5085C = z;
            if (this.f5087E == 0 && z) {
                this.f5094L.mo6711b();
                this.f5094L.mo6710a();
            }
            m6469a(false);
        }
    }

    public final void setBatteryLevel(int i) {
        int b = C12973l.m33890b(C12973l.m33885a(i, 0), 100);
        if (this.f5083A != b) {
            this.f5083A = b;
            m6465a();
        }
    }

    public final void setCapsuleBackgroundColor(int i) {
        this.f5089G.mo6716a(i);
    }

    public final void setCapsuleCornerRadius(int i) {
        this.f5089G.mo6718b(i);
    }

    public final void setCapsuleProgressColors(Integer[] numArr) {
        C12932j.m33818b(numArr, "value");
        this.f5089G.mo6717a(numArr);
    }

    public final void setForegroundColors(Integer[] numArr) {
        C12932j.m33818b(numArr, "value");
        this.f5102z = numArr;
        m6472c();
    }

    public final void setPlugged(boolean z) {
        if (this.f5084B != z) {
            this.f5084B = z;
            if (this.f5085C) {
                this.f5094L.mo6711b();
            }
            m6471b();
            this.f5094L.mo6710a();
        }
    }

    public final void setStyleOverride(int i) {
        if (this.f5086D != i) {
            this.f5086D = i;
            m6476f();
        }
    }

    /* renamed from: b */
    private final void m6471b() {
        if (!this.f5085C) {
            this.f5098P.cancel();
            this.f5097O.cancel();
            if (this.f5084B) {
                this.f5090H.setAlpha(0.0f);
                this.f5090H.setScaleX(0.5f);
                this.f5090H.setScaleY(0.5f);
                this.f5091I.setAlpha(1.0f);
                this.f5091I.setScaleX(1.0f);
                this.f5091I.setScaleY(1.0f);
                return;
            }
            this.f5091I.setAlpha(0.0f);
            this.f5091I.setScaleX(0.5f);
            this.f5091I.setScaleY(0.5f);
            this.f5090H.setAlpha(1.0f);
            this.f5090H.setScaleX(1.0f);
            this.f5090H.setScaleY(1.0f);
        } else if (this.f5084B) {
            this.f5098P.cancel();
            this.f5097O.start();
        } else {
            this.f5097O.cancel();
            this.f5098P.start();
        }
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i, int i2) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i, i2);
        this.f5099Q = attributeSet;
        this.f5100R = i;
        this.f5101S = i2;
        this.f5102z = new Integer[]{Integer.valueOf(-1)};
        this.f5085C = true;
        this.f5086D = C7674a.f19294a;
        this.f5087E = this.f5083A;
        this.f5088F = new ViewVisibilityAggregatedHelper<>(this);
        this.f5089G = new C1421a();
        this.f5094L = new C1418e(this);
        this.f5097O = new AnimatorSet();
        this.f5098P = new AnimatorSet();
        View.inflate(context, C7721d.view_battery, this);
        setBackground(this.f5089G);
        View findViewById = findViewById(C7720c.battery_icon);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.battery_icon)");
        this.f5090H = (ImageView) findViewById;
        View findViewById2 = findViewById(C7720c.plug_icon);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.plug_icon)");
        this.f5091I = (ImageView) findViewById2;
        View findViewById3 = findViewById(C7720c.percent);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.percent)");
        this.f5092J = (TextView) findViewById3;
        m6476f();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        C12932j.m33815a((Object) ofInt, "ValueAnimator.ofInt(0, 100)");
        this.f5093K = ofInt;
        this.f5093K.addUpdateListener(new C1416c(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5090H, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(800);
        C12932j.m33815a((Object) ofFloat, "ObjectAnimator.ofFloat(b…SE_DURATION / 2\n        }");
        this.f5096N = ofFloat;
        m6466a(this.f5097O, this.f5090H, this.f5091I);
        m6466a(this.f5098P, this.f5091I, this.f5090H);
        this.f5097O.addListener(new C1415b(this));
        this.f5098P.addListener(new C1414a(this));
        setCurrentBatteryLevel(this.f5083A);
    }

    /* renamed from: a */
    private final void m6465a() {
        int i = this.f5083A;
        int i2 = this.f5087E;
        if (i != i2) {
            if (Math.abs(i - i2) < 2 || !this.f5085C) {
                this.f5093K.cancel();
                setCurrentBatteryLevel(this.f5083A);
            } else {
                if (this.f5093K.isStarted() && m6470b(this.f5095M, this.f5083A) > 200) {
                    this.f5093K.cancel();
                }
                int i3 = this.f5083A;
                this.f5095M = i3;
                this.f5093K.setIntValues(new int[]{this.f5087E, i3});
                if (!this.f5093K.isStarted()) {
                    this.f5093K.setDuration(C12973l.m33887a(m6470b(this.f5083A, this.f5087E), 200));
                    this.f5093K.start();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6469a(boolean z) {
        if (this.f5087E == 0 && !this.f5084B && (z || !this.f5098P.isRunning())) {
            ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f5088F;
            if (viewVisibilityAggregatedHelper != null && viewVisibilityAggregatedHelper.mo6426a() && this.f5085C) {
                this.f5096N.start();
                return;
            }
        }
        if (this.f5096N.isRunning()) {
            this.f5096N.cancel();
            this.f5090H.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    private final void m6466a(AnimatorSet animatorSet, View view, View view2) {
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, C1309a.f4895a, new float[]{1.0f, 0.5f}), ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view2, C1309a.f4895a, new float[]{0.5f, 1.0f})});
        animatorSet.setDuration(300);
    }

    /* renamed from: c */
    private final void m6472c() {
        int length = this.f5102z.length;
        int intValue = this.f5102z[C12973l.m33890b((int) (((float) (this.f5087E * length)) / 100.0f), length - 1)].intValue();
        ColorStateList imageTintList = this.f5090H.getImageTintList();
        if (imageTintList == null || imageTintList.getDefaultColor() != intValue) {
            this.f5090H.setImageTintList(ColorStateList.valueOf(intValue));
        }
        ColorStateList imageTintList2 = this.f5091I.getImageTintList();
        if (imageTintList2 == null || imageTintList2.getDefaultColor() != intValue) {
            this.f5091I.setImageTintList(ColorStateList.valueOf(intValue));
        }
        if (intValue != this.f5092J.getCurrentTextColor()) {
            this.f5092J.setTextColor(intValue);
        }
    }
}
