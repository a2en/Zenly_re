package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: app.zenly.locator.map.marker.a */
/* compiled from: lambda */
public final /* synthetic */ class C4161a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ AvatarMarkerView f11072a;

    public /* synthetic */ C4161a(AvatarMarkerView avatarMarkerView) {
        this.f11072a = avatarMarkerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11072a.mo10826a(valueAnimator);
    }
}
