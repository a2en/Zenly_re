package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.RandomAccess;

final class zzsx<E> extends zzpv<E> implements RandomAccess {
    private static final zzsx<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzsx<Object> zzsx = new zzsx<>(new Object[0], 0);
        zza = zzsx;
        zzsx.zzb();
    }

    zzsx() {
        this(new Object[10], 0);
    }

    private final void zza(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    private final String zzc(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> zzsx<E> zzd() {
        return zza;
    }

    public final boolean add(E e) {
        zzc();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        zza(i);
        return this.zzb[i];
    }

    public final E remove(int i) {
        zzc();
        zza(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        zzc();
        zza(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzrm zzb(int i) {
        if (i >= this.zzc) {
            return new zzsx(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzsx(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    public final void add(int i, E e) {
        zzc();
        if (i >= 0) {
            int i2 = this.zzc;
            if (i <= i2) {
                E[] eArr = this.zzb;
                if (i2 < eArr.length) {
                    System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
                } else {
                    E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(eArr, 0, eArr2, 0, i);
                    System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
                    this.zzb = eArr2;
                }
                this.zzb[i] = e;
                this.zzc++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }
}
