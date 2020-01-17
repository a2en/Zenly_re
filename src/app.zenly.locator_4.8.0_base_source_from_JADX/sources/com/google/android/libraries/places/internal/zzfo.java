package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzfo<T> implements Iterator<T> {
    private int zza = zzfq.zzb;
    private T zzb;

    protected zzfo() {
    }

    public final boolean hasNext() {
        if (this.zza != zzfq.zzd) {
            int i = zzfr.zza[this.zza - 1];
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                this.zza = zzfq.zzd;
                this.zzb = zza();
                if (this.zza != zzfq.zzc) {
                    this.zza = zzfq.zza;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.zza = zzfq.zzb;
            T t = this.zzb;
            this.zzb = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract T zza();

    /* access modifiers changed from: protected */
    public final T zzb() {
        this.zza = zzfq.zzc;
        return null;
    }
}
