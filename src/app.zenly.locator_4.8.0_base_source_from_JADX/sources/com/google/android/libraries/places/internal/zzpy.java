package com.google.android.libraries.places.internal;

final class zzpy {
    private static final Class<?> zza = zza("libcore.io.Memory");
    private static final boolean zzb = (zza("org.robolectric.Robolectric") != null);

    static boolean zza() {
        return zza != null && !zzb;
    }

    static Class<?> zzb() {
        return zza;
    }

    private static <T> Class<T> zza(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
