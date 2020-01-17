package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.C9527d;

@C9527d
public class AwakeTimeSinceBootClock implements MonotonicClock {
    @C9527d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @C9527d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @C9527d
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
