package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

public abstract class zzhc<E> extends zzgw<E> implements Set<E> {
    private transient zzgv<E> zza;

    zzhc() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzhj.zza(this, obj);
    }

    public int hashCode() {
        return zzhj.zza(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: 0000 */
    public zzgv<E> zza() {
        return zzgv.zzb(toArray());
    }

    public zzgv<E> zzc() {
        zzgv<E> zzgv = this.zza;
        if (zzgv != null) {
            return zzgv;
        }
        zzgv<E> zza2 = zza();
        this.zza = zza2;
        return zza2;
    }
}
