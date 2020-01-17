package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.f */
public class C10169f implements Clock {

    /* renamed from: a */
    private static final C10169f f26724a = new C10169f();

    private C10169f() {
    }

    /* renamed from: a */
    public static Clock m25664a() {
        return f26724a;
    }

    public long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long nanoTime() {
        return System.nanoTime();
    }
}
