package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.p1 */
final class C10376p1 extends C10389r<Long> implements zzcn<Long>, RandomAccess {

    /* renamed from: f */
    private long[] f27160f;

    /* renamed from: g */
    private int f27161g;

    static {
        new C10376p1().zzv();
    }

    C10376p1() {
        this(new long[10], 0);
    }

    private C10376p1(long[] jArr, int i) {
        this.f27160f = jArr;
        this.f27161g = i;
    }

    /* renamed from: a */
    private final void m26431a(int i) {
        if (i < 0 || i >= this.f27161g) {
            throw new IndexOutOfBoundsException(m26433b(i));
        }
    }

    /* renamed from: a */
    private final void m26432a(int i, long j) {
        mo28114a();
        if (i >= 0) {
            int i2 = this.f27161g;
            if (i <= i2) {
                long[] jArr = this.f27160f;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f27160f, i, jArr2, i + 1, this.f27161g - i);
                    this.f27160f = jArr2;
                }
                this.f27160f[i] = j;
                this.f27161g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m26433b(i));
    }

    /* renamed from: b */
    private final String m26433b(int i) {
        int i2 = this.f27161g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28080a(long j) {
        m26432a(this.f27161g, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26432a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo28114a();
        C10292d1.m26018a(collection);
        if (!(collection instanceof C10376p1)) {
            return super.addAll(collection);
        }
        C10376p1 p1Var = (C10376p1) collection;
        int i = p1Var.f27161g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27161g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f27160f;
            if (i3 > jArr.length) {
                this.f27160f = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(p1Var.f27160f, 0, this.f27160f, this.f27161g, p1Var.f27161g);
            this.f27161g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10376p1)) {
            return super.equals(obj);
        }
        C10376p1 p1Var = (C10376p1) obj;
        if (this.f27161g != p1Var.f27161g) {
            return false;
        }
        long[] jArr = p1Var.f27160f;
        for (int i = 0; i < this.f27161g; i++) {
            if (this.f27160f[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m26431a(i);
        return this.f27160f[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27161g; i2++) {
            i = (i * 31) + C10292d1.m26015a(this.f27160f[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        m26431a(i);
        long[] jArr = this.f27160f;
        long j = jArr[i];
        int i2 = this.f27161g;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f27161g--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo28114a();
        for (int i = 0; i < this.f27161g; i++) {
            if (obj.equals(Long.valueOf(this.f27160f[i]))) {
                long[] jArr = this.f27160f;
                System.arraycopy(jArr, i + 1, jArr, i, this.f27161g - i);
                this.f27161g--;
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
            long[] jArr = this.f27160f;
            System.arraycopy(jArr, i2, jArr, i, this.f27161g - i2);
            this.f27161g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo28114a();
        m26431a(i);
        long[] jArr = this.f27160f;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f27161g;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f27161g) {
            return new C10376p1(Arrays.copyOf(this.f27160f, i), this.f27161g);
        }
        throw new IllegalArgumentException();
    }
}
