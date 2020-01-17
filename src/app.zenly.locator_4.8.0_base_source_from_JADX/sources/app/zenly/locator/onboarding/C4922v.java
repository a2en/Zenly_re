package app.zenly.locator.onboarding;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: app.zenly.locator.onboarding.v */
/* compiled from: lambda */
public final /* synthetic */ class C4922v implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ float f12911a;

    /* renamed from: b */
    private final /* synthetic */ View f12912b;

    /* renamed from: c */
    private final /* synthetic */ View f12913c;

    public /* synthetic */ C4922v(float f, View view, View view2) {
        this.f12911a = f;
        this.f12912b = view;
        this.f12913c = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4766b3.m13902a(this.f12911a, this.f12912b, this.f12913c, valueAnimator);
    }
}
