package com.google.android.libraries.places.internal;

final class zzse implements zzsj {
    private zzsj[] zza;

    zzse(zzsj... zzsjArr) {
        this.zza = zzsjArr;
    }

    public final boolean zza(Class<?> cls) {
        for (zzsj zza2 : this.zza) {
            if (zza2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzsk zzb(Class<?> cls) {
        zzsj[] zzsjArr;
        for (zzsj zzsj : this.zza) {
            if (zzsj.zza(cls)) {
                return zzsj.zzb(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
