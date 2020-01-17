package com.google.android.libraries.places.internal;

final /* synthetic */ class zzdx implements Runnable {
    private final zzdn zza;
    private final zzea zzb;

    zzdx(zzdn zzdn, zzea zzea) {
        this.zza = zzdn;
        this.zzb = zzea;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
