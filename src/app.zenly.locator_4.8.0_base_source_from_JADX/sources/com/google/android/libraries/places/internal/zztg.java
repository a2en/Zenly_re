package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zztg implements Iterator<Entry<K, V>> {
    private int zza;
    private Iterator<Entry<K, V>> zzb;
    private final /* synthetic */ zzte zzc;

    private zztg(zzte zzte) {
        this.zzc = zzte;
        this.zza = this.zzc.zzb.size();
    }

    private final Iterator<Entry<K, V>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        int i = this.zza;
        return (i > 0 && i <= this.zzc.zzb.size()) || zza().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Entry) zza().next();
        }
        List zzb2 = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (Entry) zzb2.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ zztg(zzte zzte, zztd zztd) {
        this(zzte);
    }
}
