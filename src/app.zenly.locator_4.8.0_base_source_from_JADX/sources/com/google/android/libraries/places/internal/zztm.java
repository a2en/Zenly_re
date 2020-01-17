package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zztm implements Iterator<Entry<K, V>> {
    private int zza;
    private boolean zzb;
    private Iterator<Entry<K, V>> zzc;
    private final /* synthetic */ zzte zzd;

    private zztm(zzte zzte) {
        this.zzd = zzte;
        this.zza = -1;
    }

    private final Iterator<Entry<K, V>> zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        if (this.zza + 1 < this.zzd.zzb.size() || (!this.zzd.zzc.isEmpty() && zza().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        if (i < this.zzd.zzb.size()) {
            return (Entry) this.zzd.zzb.get(this.zza);
        }
        return (Entry) zza().next();
    }

    public final void remove() {
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzf();
            if (this.zza < this.zzd.zzb.size()) {
                zzte zzte = this.zzd;
                int i = this.zza;
                this.zza = i - 1;
                zzte.zzc(i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ zztm(zzte zzte, zztd zztd) {
        this(zzte);
    }
}
