package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzc;

final class zzrc implements zzsj {
    private static final zzrc zza = new zzrc();

    private zzrc() {
    }

    public static zzrc zza() {
        return zza;
    }

    public final zzsk zzb(Class<?> cls) {
        Class<zzrb> cls2 = zzrb.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (zzsk) zzrb.zza(cls.asSubclass(cls2)).zza(zzc.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }

    public final boolean zza(Class<?> cls) {
        return zzrb.class.isAssignableFrom(cls);
    }
}
