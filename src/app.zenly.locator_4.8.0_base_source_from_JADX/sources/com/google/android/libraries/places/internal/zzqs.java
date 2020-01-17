package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzqs {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static final Class<?> zzc = zzb();
    private static volatile zzqs zzd;
    private static final zzqs zze = new zzqs(true);
    private final Map<Object, Object> zzf;

    zzqs() {
        this.zzf = new HashMap();
    }

    public static zzqs zza() {
        zzqs zzqs = zzd;
        if (zzqs == null) {
            synchronized (zzqs.class) {
                zzqs = zzd;
                if (zzqs == null) {
                    zzqs = zze;
                    zzd = zzqs;
                }
            }
        }
        return zzqs;
    }

    private static Class<?> zzb() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private zzqs(boolean z) {
        this.zzf = Collections.emptyMap();
    }
}
