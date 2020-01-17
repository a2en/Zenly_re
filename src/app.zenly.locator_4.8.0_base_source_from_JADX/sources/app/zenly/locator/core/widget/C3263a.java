package app.zenly.locator.core.widget;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;

/* renamed from: app.zenly.locator.core.widget.a */
/* compiled from: lambda */
public final /* synthetic */ class C3263a implements OnAnimationEndListener {

    /* renamed from: a */
    private final /* synthetic */ OneTouchZoomLayout f9114a;

    public /* synthetic */ C3263a(OneTouchZoomLayout oneTouchZoomLayout) {
        this.f9114a = oneTouchZoomLayout;
    }

    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.f9114a.mo9693b(dynamicAnimation, z, f, f2);
    }
}
