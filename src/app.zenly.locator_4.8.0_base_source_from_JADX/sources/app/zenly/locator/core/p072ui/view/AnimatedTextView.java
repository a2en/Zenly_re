package app.zenly.locator.core.p072ui.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12944v;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7675b;

/* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView */
public final class AnimatedTextView extends FrameLayout implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final float[] f8591k = {0.0f, 3.0f, 1.0f};

    /* renamed from: e */
    private final ViewVisibilityAggregatedHelper<?> f8592e;

    /* renamed from: f */
    private final TextPaint f8593f;

    /* renamed from: g */
    private C3139c f8594g;

    /* renamed from: h */
    private StaticLayout f8595h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<ValueAnimator> f8596i;

    /* renamed from: j */
    private Function0<C12956q> f8597j;

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$a */
    public static final class C3107a {
        private C3107a() {
        }

        public /* synthetic */ C3107a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$b */
    static final /* synthetic */ class C3108b extends C12931i implements Function1<ValueAnimator, C12956q> {

        /* renamed from: i */
        public static final C3108b f8598i = new C3108b();

        C3108b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo9361a(ValueAnimator valueAnimator) {
            C12932j.m33818b(valueAnimator, "p1");
            valueAnimator.end();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(ValueAnimator.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "end()V";
        }

        public final String getName() {
            return "end";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9361a((ValueAnimator) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$c */
    static final class C3109c extends C12933k implements Function3<CharSequence, Boolean, Integer, C12956q> {

        /* renamed from: f */
        final /* synthetic */ AnimatedTextView f8599f;

        /* renamed from: g */
        final /* synthetic */ C12944v f8600g;

        C3109c(AnimatedTextView animatedTextView, C12944v vVar) {
            this.f8599f = animatedTextView;
            this.f8600g = vVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo9362a(CharSequence charSequence, boolean z, int i) {
            C12932j.m33818b(charSequence, "textToShow");
            if (!C12932j.m33817a((Object) charSequence.toString(), (Object) " ")) {
                View childAt = this.f8599f.getChildAt(this.f8600g.f33527e);
                C12932j.m33815a((Object) childAt, "view");
                childAt.setX(AnimatedTextView.m9771b(this.f8599f).getPrimaryHorizontal(i));
                childAt.setY((float) AnimatedTextView.m9771b(this.f8599f).getLineTop(AnimatedTextView.m9771b(this.f8599f).getLineForOffset(i)));
                this.f8600g.f33527e++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo9362a((CharSequence) obj, ((Boolean) obj2).booleanValue(), ((Number) obj3).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$d */
    static final /* synthetic */ class C3110d extends C12931i implements Function1<ValueAnimator, C12956q> {

        /* renamed from: i */
        public static final C3110d f8601i = new C3110d();

        C3110d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo9363a(ValueAnimator valueAnimator) {
            C12932j.m33818b(valueAnimator, "p1");
            valueAnimator.resume();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(ValueAnimator.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "resume()V";
        }

        public final String getName() {
            return "resume";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9363a((ValueAnimator) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$e */
    static final /* synthetic */ class C3111e extends C12931i implements Function1<ValueAnimator, C12956q> {

        /* renamed from: i */
        public static final C3111e f8602i = new C3111e();

        C3111e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo9364a(ValueAnimator valueAnimator) {
            C12932j.m33818b(valueAnimator, "p1");
            valueAnimator.pause();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(ValueAnimator.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "pause()V";
        }

        public final String getName() {
            return "pause";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9364a((ValueAnimator) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$f */
    static final class C3112f extends C12933k implements Function3<CharSequence, Boolean, Integer, C12956q> {

        /* renamed from: f */
        final /* synthetic */ AnimatedTextView f8603f;

        /* renamed from: g */
        final /* synthetic */ C12944v f8604g;

        /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$f$a */
        static final class C3113a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ TextView f8605a;

            C3113a(C3112f fVar, TextView textView, boolean z) {
                this.f8605a = textView;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12932j.m33815a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    this.f8605a.setScaleX(floatValue);
                    this.f8605a.setScaleY(floatValue);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$f$b */
        public static final class C3114b implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ TextView f8606a;

            public C3114b(C3112f fVar, TextView textView, boolean z) {
                this.f8606a = textView;
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
                this.f8606a.setVisibility(0);
            }
        }

        /* renamed from: app.zenly.locator.core.ui.view.AnimatedTextView$f$c */
        public static final class C3115c implements AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C3112f f8607a;

            public C3115c(C3112f fVar, TextView textView, boolean z) {
                this.f8607a = fVar;
            }

            public void onAnimationCancel(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationEnd(Animator animator) {
                C12932j.m33818b(animator, "animator");
                Function0 callback = this.f8607a.f8603f.getCallback();
                if (callback != null) {
                    C12956q qVar = (C12956q) callback.invoke();
                }
            }

            public void onAnimationRepeat(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }

            public void onAnimationStart(Animator animator) {
                C12932j.m33818b(animator, "animator");
            }
        }

        C3112f(AnimatedTextView animatedTextView, C12944v vVar) {
            this.f8603f = animatedTextView;
            this.f8604g = vVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo9365a(CharSequence charSequence, boolean z, int i) {
            C12932j.m33818b(charSequence, "textToShow");
            if (!C13028q.m34000a(charSequence.toString())) {
                TextView a = this.f8603f.m9767a(charSequence);
                this.f8603f.addView(a);
                float[] a2 = AnimatedTextView.f8591k;
                ValueAnimator duration = ValueAnimator.ofFloat(Arrays.copyOf(a2, a2.length)).setDuration(105);
                duration.setStartDelay(((long) this.f8604g.f33527e) * 50);
                duration.addUpdateListener(new C3113a(this, a, z));
                duration.addListener(new C3114b(this, a, z));
                if (z) {
                    duration.addListener(new C3115c(this, a, z));
                }
                List a3 = this.f8603f.f8596i;
                C12932j.m33815a((Object) duration, "this");
                a3.add(duration);
                duration.start();
                this.f8604g.f33527e++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo9365a((CharSequence) obj, ((Boolean) obj2).booleanValue(), ((Number) obj3).intValue());
            return C12956q.f33541a;
        }
    }

    static {
        new C3107a(null);
    }

    public AnimatedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnimatedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AnimatedTextView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    public static final /* synthetic */ StaticLayout m9771b(AnimatedTextView animatedTextView) {
        StaticLayout staticLayout = animatedTextView.f8595h;
        if (staticLayout != null) {
            return staticLayout;
        }
        C12932j.m33820c("staticLayout");
        throw null;
    }

    public final Function0<C12956q> getCallback() {
        return this.f8597j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8592e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8592e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f8594g.mo9464a().length() > 0) {
            C12944v vVar = new C12944v();
            vVar.f33527e = 0;
            this.f8594g.mo9465a(new C3109c(this, vVar));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        super.onMeasure(i, i2);
        Spanned a = this.f8594g.mo9464a();
        if (VERSION.SDK_INT >= 23) {
            staticLayout = Builder.obtain(a, 0, a.length(), this.f8593f, (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()).setAlignment(Alignment.ALIGN_CENTER).setIncludePad(true).build();
            C12932j.m33815a((Object) staticLayout, "StaticLayout.Builder.obt…\n                .build()");
        } else {
            staticLayout = new StaticLayout(a, this.f8593f, (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd(), Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        }
        this.f8595h = staticLayout;
        int measuredWidth = getMeasuredWidth();
        StaticLayout staticLayout2 = this.f8595h;
        if (staticLayout2 != null) {
            setMeasuredDimension(measuredWidth, staticLayout2.getHeight());
        } else {
            C12932j.m33820c("staticLayout");
            throw null;
        }
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8592e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        if (z) {
            m9769a((Function1<? super ValueAnimator, C12956q>) C3110d.f8601i);
        } else {
            m9769a((Function1<? super ValueAnimator, C12956q>) C3111e.f8602i);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8592e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8592e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public final void setCallback(Function0<C12956q> function0) {
        this.f8597j = function0;
    }

    public final void setText(String str) {
        C12932j.m33818b(str, "text");
        m9772b();
        removeAllViews();
        this.f8594g = new C3139c(str);
        C12944v vVar = new C12944v();
        vVar.f33527e = 0;
        this.f8594g.mo9465a(new C3112f(this, vVar));
        requestLayout();
    }

    public AnimatedTextView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f8592e = new ViewVisibilityAggregatedHelper<>(this);
        this.f8593f = new TextPaint(1);
        this.f8594g = new C3139c("");
        this.f8596i = new ArrayList();
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.AnimatedTextView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, C7674a.f19294a);
        if (C7674a.m18692a(resourceId)) {
            this.f8593f.setTypeface(new C7675b(context, resourceId).mo19815a());
        }
        this.f8593f.setColor(obtainStyledAttributes.getColor(1, C0540a.m2536a(context, (int) R.color.white)));
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        if (dimension > ((float) 0)) {
            this.f8593f.setTextSize(dimension);
        }
        this.f8593f.setFontFeatureSettings("liga 0");
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private final void m9772b() {
        m9769a((Function1<? super ValueAnimator, C12956q>) C3108b.f8598i);
        this.f8596i.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final TextView m9767a(CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setTypeface(this.f8593f.getTypeface());
        textView.setTextColor(this.f8593f.getColor());
        textView.setTextSize(0, this.f8593f.getTextSize());
        textView.setText(charSequence);
        textView.setVisibility(4);
        return textView;
    }

    /* renamed from: a */
    private final void m9769a(Function1<? super ValueAnimator, C12956q> function1) {
        for (Object invoke : this.f8596i) {
            function1.invoke(invoke);
        }
    }
}
