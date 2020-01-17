package app.zenly.locator.core.helper;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.transition.Transition;
import android.view.View;
import androidx.core.app.C0514a;
import androidx.core.util.C0603e;
import app.zenly.android.base.view.C1312c;
import app.zenly.locator.core.transition.C3065c;

/* renamed from: app.zenly.locator.core.helper.f */
public final class C2515f {

    /* renamed from: app.zenly.locator.core.helper.f$a */
    static class C2516a extends C3065c {

        /* renamed from: a */
        final /* synthetic */ Activity f7530a;

        /* renamed from: b */
        final /* synthetic */ int f7531b;

        /* renamed from: c */
        final /* synthetic */ int f7532c;

        /* renamed from: d */
        final /* synthetic */ int f7533d;

        /* renamed from: e */
        final /* synthetic */ int f7534e;

        C2516a(Activity activity, int i, int i2, int i3, int i4) {
            this.f7530a = activity;
            this.f7531b = i;
            this.f7532c = i2;
            this.f7533d = i3;
            this.f7534e = i4;
        }

        public void onTransitionStart(Transition transition) {
            ObjectAnimator.ofArgb(this.f7530a.getWindow(), C1312c.f4898a, new int[]{this.f7531b, this.f7532c}).start();
            ObjectAnimator.ofArgb(this.f7530a.getWindow(), C1312c.f4899b, new int[]{this.f7533d, this.f7534e}).start();
        }
    }

    /* renamed from: app.zenly.locator.core.helper.f$b */
    static class C2517b extends C3065c {

        /* renamed from: a */
        final /* synthetic */ Activity f7535a;

        /* renamed from: b */
        final /* synthetic */ int f7536b;

        /* renamed from: c */
        final /* synthetic */ int f7537c;

        /* renamed from: d */
        final /* synthetic */ int f7538d;

        /* renamed from: e */
        final /* synthetic */ int f7539e;

        C2517b(Activity activity, int i, int i2, int i3, int i4) {
            this.f7535a = activity;
            this.f7536b = i;
            this.f7537c = i2;
            this.f7538d = i3;
            this.f7539e = i4;
        }

        public void onTransitionStart(Transition transition) {
            ObjectAnimator.ofArgb(this.f7535a.getWindow(), C1312c.f4898a, new int[]{this.f7536b, this.f7537c}).start();
            ObjectAnimator.ofArgb(this.f7535a.getWindow(), C1312c.f4899b, new int[]{this.f7538d, this.f7539e}).start();
        }
    }

    /* renamed from: a */
    public static void m8774a(Activity activity, Intent intent) {
        intent.putExtra("app.zenly.locator.extra.STATUS_BAR_COLOR", activity.getWindow().getStatusBarColor());
        intent.putExtra("app.zenly.locator.extra.NAVIGATION_BAR_COLOR", activity.getWindow().getNavigationBarColor());
    }

    /* renamed from: a */
    public static C0514a m8772a(Activity activity, View view, String str) {
        return C0514a.m2450a(activity, C0603e.m2769a(view, str));
    }

    /* renamed from: a */
    public static void m8773a(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            String str = "app.zenly.locator.extra.STATUS_BAR_COLOR";
            if (intent.hasExtra(str)) {
                String str2 = "app.zenly.locator.extra.NAVIGATION_BAR_COLOR";
                if (intent.hasExtra(str2)) {
                    int statusBarColor = activity.getWindow().getStatusBarColor();
                    int intExtra = intent.getIntExtra(str, 0);
                    int navigationBarColor = activity.getWindow().getNavigationBarColor();
                    int intExtra2 = intent.getIntExtra(str2, 0);
                    Transition sharedElementEnterTransition = activity.getWindow().getSharedElementEnterTransition();
                    if (sharedElementEnterTransition != null) {
                        C2516a aVar = new C2516a(activity, intExtra, statusBarColor, intExtra2, navigationBarColor);
                        sharedElementEnterTransition.addListener(aVar);
                    }
                    Transition sharedElementReturnTransition = activity.getWindow().getSharedElementReturnTransition();
                    if (sharedElementReturnTransition != null) {
                        C2517b bVar = new C2517b(activity, statusBarColor, intExtra, navigationBarColor, intExtra2);
                        sharedElementReturnTransition.addListener(bVar);
                    }
                }
            }
        }
    }
}
