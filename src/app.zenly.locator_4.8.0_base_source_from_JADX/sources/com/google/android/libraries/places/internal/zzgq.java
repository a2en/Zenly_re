package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.Comparable;

abstract class zzgq<C extends Comparable> implements Serializable, Comparable<zzgq<C>> {
    final C zza;

    zzgq(C c) {
        this.zza = c;
    }

    static <C extends Comparable> zzgq<C> zzb(C c) {
        return new zzgu(c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzgq) {
            try {
                if (compareTo((zzgq) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: zza */
    public int compareTo(zzgq<C> zzgq) {
        if (zzgq == zzgr.zzb) {
            return 1;
        }
        if (zzgq == zzgp.zzb) {
            return -1;
        }
        int zzc = zzhb.zzc(this.zza, zzgq.zza);
        if (zzc != 0) {
            return zzc;
        }
        boolean z = this instanceof zzgs;
        if (z == (zzgq instanceof zzgs)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public abstract void zza(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    public abstract boolean zza(C c);

    /* access modifiers changed from: 0000 */
    public abstract void zzb(StringBuilder sb);
}
