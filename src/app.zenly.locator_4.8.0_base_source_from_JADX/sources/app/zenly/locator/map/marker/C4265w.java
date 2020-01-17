package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: app.zenly.locator.map.marker.w */
/* compiled from: lambda */
public final /* synthetic */ class C4265w implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ UserCollapsedMarkerView f11439a;

    public /* synthetic */ C4265w(UserCollapsedMarkerView userCollapsedMarkerView) {
        this.f11439a = userCollapsedMarkerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11439a.mo10988a(valueAnimator);
    }
}
