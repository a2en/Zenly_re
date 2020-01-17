package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.m0 */
final class C10357m0 extends C10389r<Double> implements zzcn<Double>, RandomAccess {

    /* renamed from: f */
    private double[] f27143f;

    /* renamed from: g */
    private int f27144g;

    static {
        new C10357m0().zzv();
    }

    C10357m0() {
        this(new double[10], 0);
    }

    private C10357m0(double[] dArr, int i) {
        this.f27143f = dArr;
        this.f27144g = i;
    }

    /* renamed from: a */
    private final void m26310a(int i) {
        if (i < 0 || i >= this.f27144g) {
            throw new IndexOutOfBoundsException(m26312b(i));
        }
    }

    /* renamed from: a */
    private final void m26311a(int i, double d) {
        mo28114a();
        if (i >= 0) {
            int i2 = this.f27144g;
            if (i <= i2) {
                double[] dArr = this.f27143f;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f27143f, i, dArr2, i + 1, this.f27144g - i);
                    this.f27143f = dArr2;
                }
                this.f27143f[i] = d;
                this.f27144g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m26312b(i));
    }

    /* renamed from: b */
    private final String m26312b(int i) {
        int i2 = this.f27144g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28054a(double d) {
        m26311a(this.f27144g, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26311a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo28114a();
        C10292d1.m26018a(collection);
        if (!(collection instanceof C10357m0)) {
            return super.addAll(collection);
        }
        C10357m0 m0Var = (C10357m0) collection;
        int i = m0Var.f27144g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27144g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f27143f;
            if (i3 > dArr.length) {
                this.f27143f = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(m0Var.f27143f, 0, this.f27143f, this.f27144g, m0Var.f27144g);
            this.f27144g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10357m0)) {
            return super.equals(obj);
        }
        C10357m0 m0Var = (C10357m0) obj;
        if (this.f27144g != m0Var.f27144g) {
            return false;
        }
        double[] dArr = m0Var.f27143f;
        for (int i = 0; i < this.f27144g; i++) {
            if (this.f27143f[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m26310a(i);
        return Double.valueOf(this.f27143f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27144g; i2++) {
            i = (i * 31) + C10292d1.m26015a(Double.doubleToLongBits(this.f27143f[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        m26310a(i);
        double[] dArr = this.f27143f;
        double d = dArr[i];
        int i2 = this.f27144g;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.f27144g--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo28114a();
        for (int i = 0; i < this.f27144g; i++) {
            if (obj.equals(Double.valueOf(this.f27143f[i]))) {
                double[] dArr = this.f27143f;
                System.arraycopy(dArr, i + 1, dArr, i, this.f27144g - i);
                this.f27144g--;
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
            double[] dArr = this.f27143f;
            System.arraycopy(dArr, i2, dArr, i, this.f27144g - i2);
            this.f27144g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo28114a();
        m26310a(i);
        double[] dArr = this.f27143f;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f27144g;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f27144g) {
            return new C10357m0(Arrays.copyOf(this.f27143f, i), this.f27144g);
        }
        throw new IllegalArgumentException();
    }
}
