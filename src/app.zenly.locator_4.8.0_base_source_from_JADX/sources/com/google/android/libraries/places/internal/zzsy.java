package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzsy {
    private static final zzsy zza = new zzsy();
    private final zztc zzb = new zzsc();
    private final ConcurrentMap<Class<?>, zzsz<?>> zzc = new ConcurrentHashMap();

    private zzsy() {
    }

    public static zzsy zza() {
        return zza;
    }

    public final <T> zzsz<T> zza(Class<T> cls) {
        String str = "messageType";
        zzrd.zza(cls, str);
        zzsz<T> zzsz = (zzsz) this.zzc.get(cls);
        if (zzsz != null) {
            return zzsz;
        }
        zzsz<T> zza2 = this.zzb.zza(cls);
        zzrd.zza(cls, str);
        zzrd.zza(zza2, "schema");
        zzsz zzsz2 = (zzsz) this.zzc.putIfAbsent(cls, zza2);
        return zzsz2 != null ? zzsz2 : zza2;
    }

    public final <T> zzsz<T> zza(T t) {
        return zza(t.getClass());
    }
}
