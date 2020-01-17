package com.google.android.libraries.places.internal;

import java.util.Locale;

public final class zzco implements zzcr, zzdd {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;

    public final synchronized void zza(String str, Locale locale, boolean z) {
        zzgg.zza(str, (Object) "API Key must not be null.");
        zzgg.zza(!str.isEmpty(), (Object) "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final synchronized String zzb() {
        zzgg.zzb(zza(), (Object) "ApiConfig must be initialized.");
        return this.zza;
    }

    public final synchronized Locale zzc() {
        zzgg.zzb(zza(), (Object) "ApiConfig must be initialized.");
        if (this.zzb == null) {
            return Locale.getDefault();
        }
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }
}
