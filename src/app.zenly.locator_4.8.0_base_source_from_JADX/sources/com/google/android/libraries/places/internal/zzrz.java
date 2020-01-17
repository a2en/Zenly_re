package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzrz extends zzpv<Long> implements zzrm<Long>, zzsv, RandomAccess {
    private static final zzrz zza;
    private long[] zzb;
    private int zzc;

    static {
        zzrz zzrz = new zzrz(new long[0], 0);
        zza = zzrz;
        zzrz.zzb();
    }

    zzrz() {
        this(new long[10], 0);
    }

    private final void zzc(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
    }

    public static zzrz zzd() {
        return zza;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzc();
        if (i >= 0) {
            int i2 = this.zzc;
            if (i <= i2) {
                long[] jArr = this.zzb;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.zzb, i, jArr2, i + 1, this.zzc - i);
                    this.zzb = jArr2;
                }
                this.zzb[i] = longValue;
                this.zzc++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzd(i));
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zzc();
        zzrd.zza(collection);
        if (!(collection instanceof zzrz)) {
            return super.addAll(collection);
        }
        zzrz zzrz = (zzrz) collection;
        int i = zzrz.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzb;
            if (i3 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzrz.zzb, 0, this.zzb, this.zzc, zzrz.zzc);
            this.zzc = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrz)) {
            return super.equals(obj);
        }
        zzrz zzrz = (zzrz) obj;
        if (this.zzc != zzrz.zzc) {
            return false;
        }
        long[] jArr = zzrz.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(zza(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + zzrd.zza(this.zzb[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(Long.valueOf(this.zzb[i]))) {
                long[] jArr = this.zzb;
                System.arraycopy(jArr, i + 1, jArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzc();
        if (i2 >= i) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzc();
        zzc(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.zzc;
    }

    public final long zza(int i) {
        zzc(i);
        return this.zzb[i];
    }

    public final /* synthetic */ zzrm zzb(int i) {
        if (i >= this.zzc) {
            return new zzrz(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzrz(long[] jArr, int i) {
        this.zzb = jArr;
        this.zzc = i;
    }

    private final String zzd(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object remove(int i) {
        zzc();
        zzc(i);
        long[] jArr = this.zzb;
        long j = jArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        zzc();
        int i = this.zzc;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }
}
