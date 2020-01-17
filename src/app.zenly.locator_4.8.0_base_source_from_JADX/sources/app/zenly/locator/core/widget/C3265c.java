package app.zenly.locator.core.widget;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;

/* renamed from: app.zenly.locator.core.widget.c */
/* compiled from: lambda */
public final /* synthetic */ class C3265c implements OnAnimationEndListener {

    /* renamed from: a */
    private final /* synthetic */ OneTouchZoomLayout f9116a;

    public /* synthetic */ C3265c(OneTouchZoomLayout oneTouchZoomLayout) {
        this.f9116a = oneTouchZoomLayout;
    }

    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.f9116a.mo9690a(dynamicAnimation, z, f, f2);
    }
}
