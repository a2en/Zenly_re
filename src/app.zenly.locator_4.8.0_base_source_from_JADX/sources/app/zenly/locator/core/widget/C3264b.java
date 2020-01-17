package app.zenly.locator.core.widget;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener;

/* renamed from: app.zenly.locator.core.widget.b */
/* compiled from: lambda */
public final /* synthetic */ class C3264b implements OnAnimationUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ OneTouchZoomLayout f9115a;

    public /* synthetic */ C3264b(OneTouchZoomLayout oneTouchZoomLayout) {
        this.f9115a = oneTouchZoomLayout;
    }

    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f9115a.mo9692b(dynamicAnimation, f, f2);
    }
}
