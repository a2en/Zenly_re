package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzre extends zzpv<Integer> implements zzrm<Integer>, zzsv, RandomAccess {
    private static final zzre zza;
    private int[] zzb;
    private int zzc;

    static {
        zzre zzre = new zzre(new int[0], 0);
        zza = zzre;
        zzre.zzb();
    }

    zzre() {
        this(new int[10], 0);
    }

    private final void zzc(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i));
        }
    }

    public static zzre zzd() {
        return zza;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzc();
        if (i >= 0) {
            int i2 = this.zzc;
            if (i <= i2) {
                int[] iArr = this.zzb;
                if (i2 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                } else {
                    int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
                    this.zzb = iArr2;
                }
                this.zzb[i] = intValue;
                this.zzc++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(zzd(i));
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzc();
        zzrd.zza(collection);
        if (!(collection instanceof zzre)) {
            return super.addAll(collection);
        }
        zzre zzre = (zzre) collection;
        int i = zzre.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzb;
            if (i3 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzre.zzb, 0, this.zzb, this.zzc, zzre.zzc);
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
        if (!(obj instanceof zzre)) {
            return super.equals(obj);
        }
        zzre zzre = (zzre) obj;
        if (this.zzc != zzre.zzc) {
            return false;
        }
        int[] iArr = zzre.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(zza(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(Integer.valueOf(this.zzb[i]))) {
                int[] iArr = this.zzb;
                System.arraycopy(iArr, i + 1, iArr, i, (this.zzc - i) - 1);
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
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzc();
        zzc(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(int i) {
        zzc(i);
        return this.zzb[i];
    }

    public final /* synthetic */ zzrm zzb(int i) {
        if (i >= this.zzc) {
            return new zzre(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzre(int[] iArr, int i) {
        this.zzb = iArr;
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
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        int i3 = this.zzc;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzc();
        int i = this.zzc;
        int[] iArr = this.zzb;
        if (i == iArr.length) {
            int[] iArr2 = new int[(((i * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        iArr3[i2] = intValue;
        return true;
    }
}
