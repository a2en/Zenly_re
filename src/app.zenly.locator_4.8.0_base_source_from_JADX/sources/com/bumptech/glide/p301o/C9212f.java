package com.bumptech.glide.p301o;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.o.f */
public final class C9212f {

    /* renamed from: a */
    private static final double f23878a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f23878a = d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m22072a() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static double m22071a(long j) {
        return ((double) (m22072a() - j)) * f23878a;
    }
}
