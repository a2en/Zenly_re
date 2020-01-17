package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.c1 */
final class C10285c1 extends C10389r<Integer> implements zzcn<Integer>, RandomAccess {

    /* renamed from: f */
    private int[] f26930f;

    /* renamed from: g */
    private int f26931g;

    static {
        new C10285c1().zzv();
    }

    C10285c1() {
        this(new int[10], 0);
    }

    private C10285c1(int[] iArr, int i) {
        this.f26930f = iArr;
        this.f26931g = i;
    }

    /* renamed from: a */
    private final void m25990a(int i, int i2) {
        mo28114a();
        if (i >= 0) {
            int i3 = this.f26931g;
            if (i <= i3) {
                int[] iArr = this.f26930f;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f26930f, i, iArr2, i + 1, this.f26931g - i);
                    this.f26930f = iArr2;
                }
                this.f26930f[i] = i2;
                this.f26931g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m25992c(i));
    }

    /* renamed from: b */
    private final void m25991b(int i) {
        if (i < 0 || i >= this.f26931g) {
            throw new IndexOutOfBoundsException(m25992c(i));
        }
    }

    /* renamed from: c */
    private final String m25992c(int i) {
        int i2 = this.f26931g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo27843a(int i) {
        m25990a(this.f26931g, i);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m25990a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo28114a();
        C10292d1.m26018a(collection);
        if (!(collection instanceof C10285c1)) {
            return super.addAll(collection);
        }
        C10285c1 c1Var = (C10285c1) collection;
        int i = c1Var.f26931g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26931g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f26930f;
            if (i3 > iArr.length) {
                this.f26930f = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c1Var.f26930f, 0, this.f26930f, this.f26931g, c1Var.f26931g);
            this.f26931g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10285c1)) {
            return super.equals(obj);
        }
        C10285c1 c1Var = (C10285c1) obj;
        if (this.f26931g != c1Var.f26931g) {
            return false;
        }
        int[] iArr = c1Var.f26930f;
        for (int i = 0; i < this.f26931g; i++) {
            if (this.f26930f[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m25991b(i);
        return this.f26930f[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26931g; i2++) {
            i = (i * 31) + this.f26930f[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        m25991b(i);
        int[] iArr = this.f26930f;
        int i2 = iArr[i];
        int i3 = this.f26931g;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f26931g--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo28114a();
        for (int i = 0; i < this.f26931g; i++) {
            if (obj.equals(Integer.valueOf(this.f26930f[i]))) {
                int[] iArr = this.f26930f;
                System.arraycopy(iArr, i + 1, iArr, i, this.f26931g - i);
                this.f26931g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo28114a();
        if (i2 >= i) {
            int[] iArr = this.f26930f;
            System.arraycopy(iArr, i2, iArr, i, this.f26931g - i2);
            this.f26931g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo28114a();
        m25991b(i);
        int[] iArr = this.f26930f;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f26931g;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f26931g) {
            return new C10285c1(Arrays.copyOf(this.f26930f, i), this.f26931g);
        }
        throw new IllegalArgumentException();
    }
}
