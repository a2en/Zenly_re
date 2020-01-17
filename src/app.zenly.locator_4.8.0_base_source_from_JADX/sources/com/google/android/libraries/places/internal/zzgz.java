package com.google.android.libraries.places.internal;

import java.util.Arrays;

public final class zzgz<K, V> {
    private Object[] zza;
    private int zzb;
    private boolean zzc;

    public zzgz() {
        this(4);
    }

    public final zzgz<K, V> zza(K k, V v) {
        int i = (this.zzb + 1) << 1;
        Object[] objArr = this.zza;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.zza = Arrays.copyOf(objArr, i2);
                this.zzc = false;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        zzgn.zza(k, v);
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.zzb = i3 + 1;
        return this;
    }

    private zzgz(int i) {
        this.zza = new Object[8];
        this.zzb = 0;
        this.zzc = false;
    }

    public final zzha<K, V> zza() {
        this.zzc = true;
        return zzhg.zza(this.zzb, this.zza);
    }
}
