package app.zenly.locator.onboarding;

import android.animation.TimeInterpolator;

/* renamed from: app.zenly.locator.onboarding.q */
/* compiled from: lambda */
public final /* synthetic */ class C4882q implements TimeInterpolator {

    /* renamed from: a */
    public static final /* synthetic */ C4882q f12848a = new C4882q();

    private /* synthetic */ C4882q() {
    }

    public final float getInterpolation(float f) {
        return Math.min(f * f * 1.2f, 1.0f);
    }
}
