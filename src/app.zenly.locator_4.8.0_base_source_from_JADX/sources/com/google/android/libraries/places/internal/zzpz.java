package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

final class zzpz extends zzqb {
    private int zza = 0;
    private final int zzb = this.zzc.zza();
    private final /* synthetic */ zzqa zzc;

    zzpz(zzqa zzqa) {
        this.zzc = zzqa;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    public final byte zza() {
        int i = this.zza;
        if (i < this.zzb) {
            this.zza = i + 1;
            return this.zzc.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
