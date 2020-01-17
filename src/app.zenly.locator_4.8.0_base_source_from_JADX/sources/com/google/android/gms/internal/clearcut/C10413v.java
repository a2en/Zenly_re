package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.v */
final class C10413v extends C10389r<Boolean> implements zzcn<Boolean>, RandomAccess {

    /* renamed from: f */
    private boolean[] f27227f;

    /* renamed from: g */
    private int f27228g;

    static {
        new C10413v().zzv();
    }

    C10413v() {
        this(new boolean[10], 0);
    }

    private C10413v(boolean[] zArr, int i) {
        this.f27227f = zArr;
        this.f27228g = i;
    }

    /* renamed from: a */
    private final void m26553a(int i) {
        if (i < 0 || i >= this.f27228g) {
            throw new IndexOutOfBoundsException(m26555b(i));
        }
    }

    /* renamed from: a */
    private final void m26554a(int i, boolean z) {
        mo28114a();
        if (i >= 0) {
            int i2 = this.f27228g;
            if (i <= i2) {
                boolean[] zArr = this.f27227f;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f27227f, i, zArr2, i + 1, this.f27228g - i);
                    this.f27227f = zArr2;
                }
                this.f27227f[i] = z;
                this.f27228g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m26555b(i));
    }

    /* renamed from: b */
    private final String m26555b(int i) {
        int i2 = this.f27228g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26554a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo28114a();
        C10292d1.m26018a(collection);
        if (!(collection instanceof C10413v)) {
            return super.addAll(collection);
        }
        C10413v vVar = (C10413v) collection;
        int i = vVar.f27228g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27228g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f27227f;
            if (i3 > zArr.length) {
                this.f27227f = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(vVar.f27227f, 0, this.f27227f, this.f27228g, vVar.f27228g);
            this.f27228g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addBoolean(boolean z) {
        m26554a(this.f27228g, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10413v)) {
            return super.equals(obj);
        }
        C10413v vVar = (C10413v) obj;
        if (this.f27228g != vVar.f27228g) {
            return false;
        }
        boolean[] zArr = vVar.f27227f;
        for (int i = 0; i < this.f27228g; i++) {
            if (this.f27227f[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m26553a(i);
        return Boolean.valueOf(this.f27227f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27228g; i2++) {
            i = (i * 31) + C10292d1.m26016a(this.f27227f[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        m26553a(i);
        boolean[] zArr = this.f27227f;
        boolean z = zArr[i];
        int i2 = this.f27228g;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.f27228g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo28114a();
        for (int i = 0; i < this.f27228g; i++) {
            if (obj.equals(Boolean.valueOf(this.f27227f[i]))) {
                boolean[] zArr = this.f27227f;
                System.arraycopy(zArr, i + 1, zArr, i, this.f27228g - i);
                this.f27228g--;
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
            boolean[] zArr = this.f27227f;
            System.arraycopy(zArr, i2, zArr, i, this.f27228g - i2);
            this.f27228g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo28114a();
        m26553a(i);
        boolean[] zArr = this.f27227f;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f27228g;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f27228g) {
            return new C10413v(Arrays.copyOf(this.f27227f, i), this.f27228g);
        }
        throw new IllegalArgumentException();
    }
}
