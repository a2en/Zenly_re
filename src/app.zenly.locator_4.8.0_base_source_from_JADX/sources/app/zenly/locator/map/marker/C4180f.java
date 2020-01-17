package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: app.zenly.locator.map.marker.f */
/* compiled from: lambda */
public final /* synthetic */ class C4180f implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ AvatarMarkerView f11180a;

    public /* synthetic */ C4180f(AvatarMarkerView avatarMarkerView) {
        this.f11180a = avatarMarkerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11180a.mo10832b(valueAnimator);
    }
}
