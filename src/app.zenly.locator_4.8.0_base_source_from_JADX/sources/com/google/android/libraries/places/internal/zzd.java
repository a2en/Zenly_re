package com.google.android.libraries.places.internal;

import android.os.Build.VERSION;
import android.os.SystemClock;

public final class zzd implements zzb {
    private static final boolean zza = zzb();

    private static boolean zzb() {
        try {
            if (VERSION.SDK_INT >= 17) {
                SystemClock.elapsedRealtimeNanos();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
