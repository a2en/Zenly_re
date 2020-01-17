package com.google.android.libraries.places.internal;

final class zzqi {
    private final zzqn zza;
    private final byte[] zzb;

    private zzqi(int i) {
        this.zzb = new byte[i];
        this.zza = zzqn.zza(this.zzb);
    }

    public final zzqa zza() {
        this.zza.zzb();
        return new zzqk(this.zzb);
    }

    public final zzqn zzb() {
        return this.zza;
    }

    /* synthetic */ zzqi(int i, zzpz zzpz) {
        this(i);
    }
}
