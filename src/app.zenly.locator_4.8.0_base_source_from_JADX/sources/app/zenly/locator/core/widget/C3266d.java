package app.zenly.locator.core.widget;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener;

/* renamed from: app.zenly.locator.core.widget.d */
/* compiled from: lambda */
public final /* synthetic */ class C3266d implements OnAnimationUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ OneTouchZoomLayout f9117a;

    public /* synthetic */ C3266d(OneTouchZoomLayout oneTouchZoomLayout) {
        this.f9117a = oneTouchZoomLayout;
    }

    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f9117a.mo9689a(dynamicAnimation, f, f2);
    }
}
