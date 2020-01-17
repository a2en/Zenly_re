package app.zenly.locator.core.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.core.content.C0540a;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p151o.p152c.C5470b;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

public final class RainbowTransitionView extends LinearLayout {

    /* renamed from: w */
    private static final List<Float> f8452w;

    /* renamed from: x */
    private static final int[] f8453x = {R.color.emerald_green, R.color.blue, R.color.candy_dark, R.color.pink, R.color.orange, R.color.yellow, R.color.emerald_green, R.color.blue, R.color.candy_dark, R.color.pink};

    /* renamed from: v */
    private Runnable f8454v;

    /* renamed from: app.zenly.locator.core.transition.RainbowTransitionView$a */
    public static final class C3056a {
        private C3056a() {
        }

        public /* synthetic */ C3056a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.transition.RainbowTransitionView$b */
    static final class C3057b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RainbowTransitionView f8455a;

        /* renamed from: b */
        final /* synthetic */ View f8456b;

        /* renamed from: c */
        final /* synthetic */ double f8457c;

        /* renamed from: d */
        final /* synthetic */ int f8458d;

        C3057b(RainbowTransitionView rainbowTransitionView, View view, TimeInterpolator timeInterpolator, double d, int i) {
            this.f8455a = rainbowTransitionView;
            this.f8456b = view;
            this.f8457c = d;
            this.f8458d = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12932j.m33815a((Object) valueAnimator, "anim");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f8455a.mo9242a(this.f8456b, this.f8457c, this.f8458d, ((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: app.zenly.locator.core.transition.RainbowTransitionView$c */
    public static final class C3058c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ View f8459a;

        /* renamed from: b */
        final /* synthetic */ float f8460b;

        /* renamed from: c */
        final /* synthetic */ RainbowTransitionView f8461c;

        /* renamed from: d */
        final /* synthetic */ int f8462d;

        /* renamed from: e */
        final /* synthetic */ double f8463e;

        public C3058c(View view, float f, RainbowTransitionView rainbowTransitionView, int i, double d) {
            this.f8459a = view;
            this.f8460b = f;
            this.f8461c = rainbowTransitionView;
            this.f8462d = i;
            this.f8463e = d;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            Runnable onRainbowHalfwayListener = this.f8461c.getOnRainbowHalfwayListener();
            if (onRainbowHalfwayListener != null) {
                onRainbowHalfwayListener.run();
            }
            this.f8461c.m9584a(this.f8459a, 0.0f, 2.0f, C7657c.m18644b(this.f8460b), this.f8463e, this.f8462d).start();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    static {
        new C3056a(null);
        Float valueOf = Float.valueOf(1.5f);
        Float valueOf2 = Float.valueOf(1.0f);
        f8452w = C12848o.m33643b((Object[]) new Float[]{valueOf, Float.valueOf(1.6f), Float.valueOf(0.8f), valueOf2, Float.valueOf(0.6f), Float.valueOf(2.0f), valueOf, Float.valueOf(0.5f), valueOf2, valueOf});
    }

    public /* synthetic */ RainbowTransitionView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    private final double m9586c(int i, int i2) {
        return Math.asin(((double) i) / ((double) i2));
    }

    /* renamed from: d */
    private final View m9588d(int i) {
        View view = new View(getContext());
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "context");
        view.setBackground(C5470b.m15559a(context, R.drawable.round_rect_blue_cr100, C0540a.m2536a(view.getContext(), i)));
        return view;
    }

    public final Runnable getOnRainbowHalfwayListener() {
        return this.f8454v;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int d = m9587d(measuredWidth, measuredHeight);
        double c = m9586c(measuredWidth, d);
        setTranslationX(((float) (measuredWidth - d)) / 2.0f);
        setTranslationY(((float) (measuredHeight - d)) / 2.0f);
        setPivotX(((float) d) / 2.0f);
        setPivotY(getPivotX());
        setRotation(-((float) Math.toDegrees(c)));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            childAt.measure(MeasureSpec.makeMeasureSpec(d, 1073741824), MeasureSpec.makeMeasureSpec(d / f8453x.length, 1073741824));
            float floatValue = ((Number) f8452w.get(indexOfChild(childAt))).floatValue();
            View view = childAt;
            ValueAnimator a = m9584a(view, -2.0f, 0.0f, C7657c.m18642a(floatValue), c, d);
            C3058c cVar = r0;
            C3058c cVar2 = new C3058c(view, floatValue, this, d, c);
            a.addListener(cVar);
            a.start();
        }
    }

    public final void setOnRainbowHalfwayListener(Runnable runnable) {
        this.f8454v = runnable;
    }

    public RainbowTransitionView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        setClipChildren(false);
        setOrientation(1);
        for (int d : f8453x) {
            addView(m9588d(d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ValueAnimator m9584a(View view, float f, float f2, TimeInterpolator timeInterpolator, double d, int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        C12932j.m33815a((Object) ofFloat, "this");
        ofFloat.setDuration(250);
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        ofFloat.setInterpolator(timeInterpolator);
        C3057b bVar = new C3057b(this, view, timeInterpolator, d, i);
        ofFloat.addUpdateListener(bVar);
        C12932j.m33815a((Object) ofFloat, "ValueAnimator.ofFloat(st…)\n            }\n        }");
        return ofFloat;
    }

    /* renamed from: d */
    private final int m9587d(int i, int i2) {
        double d = (double) (i * i);
        double d2 = (double) i2;
        return (int) Math.sqrt(d + (d2 * d2));
    }

    /* renamed from: a */
    public final void mo9242a(View view, double d, int i, float f) {
        C12932j.m33818b(view, "$this$translate");
        view.setTranslationX((float) (Math.cos(Math.toRadians(90.0d) - d) * ((double) i) * ((double) f)));
    }
}
