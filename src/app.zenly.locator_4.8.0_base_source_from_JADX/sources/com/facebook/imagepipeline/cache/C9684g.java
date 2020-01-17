package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.Supplier;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.cache.g */
public class C9684g implements Supplier<C9692m> {

    /* renamed from: b */
    private static final long f25313b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    private final ActivityManager f25314a;

    public C9684g(ActivityManager activityManager) {
        this.f25314a = activityManager;
    }

    /* renamed from: a */
    private int m23822a() {
        int min = Math.min(this.f25314a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    public C9692m get() {
        C9692m mVar = new C9692m(m23822a(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f25313b);
        return mVar;
    }
}
