package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.C9527d;

@C9527d
public class RealtimeSinceBootClock implements MonotonicClock {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f24753a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @C9527d
    public static RealtimeSinceBootClock get() {
        return f24753a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
