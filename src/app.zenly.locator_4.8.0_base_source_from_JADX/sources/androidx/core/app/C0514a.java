package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.util.C0603e;

/* renamed from: androidx.core.app.a */
public class C0514a {

    /* renamed from: androidx.core.app.a$a */
    private static class C0515a extends C0514a {

        /* renamed from: a */
        private final ActivityOptions f2494a;

        C0515a(ActivityOptions activityOptions) {
            this.f2494a = activityOptions;
        }

        /* renamed from: a */
        public Bundle mo3028a() {
            return this.f2494a.toBundle();
        }
    }

    protected C0514a() {
    }

    /* renamed from: a */
    public static C0514a m2451a(Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return new C0515a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0514a();
    }

    /* renamed from: a */
    public Bundle mo3028a() {
        return null;
    }

    /* renamed from: a */
    public static C0514a m2450a(Activity activity, C0603e<View, String>... eVarArr) {
        if (VERSION.SDK_INT < 21) {
            return new C0514a();
        }
        Pair[] pairArr = null;
        if (eVarArr != null) {
            pairArr = new Pair[eVarArr.length];
            for (int i = 0; i < eVarArr.length; i++) {
                pairArr[i] = Pair.create(eVarArr[i].f2729a, eVarArr[i].f2730b);
            }
        }
        return new C0515a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }
}
