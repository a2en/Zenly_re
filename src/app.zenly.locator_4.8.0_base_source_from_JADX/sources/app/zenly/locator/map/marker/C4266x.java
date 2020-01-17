package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: app.zenly.locator.map.marker.x */
/* compiled from: lambda */
public final /* synthetic */ class C4266x implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ UserCompassMarkerView f11440a;

    public /* synthetic */ C4266x(UserCompassMarkerView userCompassMarkerView) {
        this.f11440a = userCompassMarkerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11440a.mo10992a(valueAnimator);
    }
}
