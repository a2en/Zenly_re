package app.zenly.locator;

import android.app.Activity;
import app.zenly.locator.onboarding.activity.SignupActivity;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.n */
public final class C4702n {

    /* renamed from: a */
    public static final C4702n f12470a = new C4702n();

    private C4702n() {
    }

    /* renamed from: a */
    public final void mo11890a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        if (!(ZenlyCore.lastSession(activity) != null)) {
            activity.startActivity(SignupActivity.m13874a(activity, activity.getIntent()));
            activity.finish();
        }
    }
}
