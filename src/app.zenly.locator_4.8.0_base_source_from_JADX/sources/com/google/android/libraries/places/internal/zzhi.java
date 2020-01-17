package com.google.android.libraries.places.internal;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

final class zzhi extends zzgv<Entry<K, V>> {
    private final /* synthetic */ zzhf zza;

    zzhi(zzhf zzhf) {
        this.zza = zzhf;
    }

    public final /* synthetic */ Object get(int i) {
        zzgg.zza(i, this.zza.zzd);
        int i2 = i * 2;
        return new SimpleImmutableEntry(this.zza.zzb[i2], this.zza.zzb[i2 + 1]);
    }

    public final int size() {
        return this.zza.zzd;
    }

    public final boolean zzg() {
        return true;
    }
}
