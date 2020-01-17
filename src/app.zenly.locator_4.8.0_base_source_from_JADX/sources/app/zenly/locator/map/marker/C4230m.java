package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: app.zenly.locator.map.marker.m */
/* compiled from: lambda */
public final /* synthetic */ class C4230m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ FriendMarkerAdapter f11352a;

    public /* synthetic */ C4230m(FriendMarkerAdapter friendMarkerAdapter) {
        this.f11352a = friendMarkerAdapter;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11352a.mo10870a(valueAnimator);
    }
}
