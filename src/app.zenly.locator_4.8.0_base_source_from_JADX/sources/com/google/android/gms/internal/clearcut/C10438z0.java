package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.z0 */
final class C10438z0 extends C10389r<Float> implements zzcn<Float>, RandomAccess {

    /* renamed from: f */
    private float[] f27340f;

    /* renamed from: g */
    private int f27341g;

    static {
        new C10438z0().zzv();
    }

    C10438z0() {
        this(new float[10], 0);
    }

    private C10438z0(float[] fArr, int i) {
        this.f27340f = fArr;
        this.f27341g = i;
    }

    /* renamed from: a */
    private final void m26623a(int i) {
        if (i < 0 || i >= this.f27341g) {
            throw new IndexOutOfBoundsException(m26625b(i));
        }
    }

    /* renamed from: a */
    private final void m26624a(int i, float f) {
        mo28114a();
        if (i >= 0) {
            int i2 = this.f27341g;
            if (i <= i2) {
                float[] fArr = this.f27340f;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f27340f, i, fArr2, i + 1, this.f27341g - i);
                    this.f27340f = fArr2;
                }
                this.f27340f[i] = f;
                this.f27341g++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m26625b(i));
    }

    /* renamed from: b */
    private final String m26625b(int i) {
        int i2 = this.f27341g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28203a(float f) {
        m26624a(this.f27341g, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26624a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo28114a();
        C10292d1.m26018a(collection);
        if (!(collection instanceof C10438z0)) {
            return super.addAll(collection);
        }
        C10438z0 z0Var = (C10438z0) collection;
        int i = z0Var.f27341g;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27341g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f27340f;
            if (i3 > fArr.length) {
                this.f27340f = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(z0Var.f27340f, 0, this.f27340f, this.f27341g, z0Var.f27341g);
            this.f27341g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10438z0)) {
            return super.equals(obj);
        }
        C10438z0 z0Var = (C10438z0) obj;
        if (this.f27341g != z0Var.f27341g) {
            return false;
        }
        float[] fArr = z0Var.f27340f;
        for (int i = 0; i < this.f27341g; i++) {
            if (this.f27340f[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m26623a(i);
        return Float.valueOf(this.f27340f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27341g; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f27340f[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        m26623a(i);
        float[] fArr = this.f27340f;
        float f = fArr[i];
        int i2 = this.f27341g;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.f27341g--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo28114a();
        for (int i = 0; i < this.f27341g; i++) {
            if (obj.equals(Float.valueOf(this.f27340f[i]))) {
                float[] fArr = this.f27340f;
                System.arraycopy(fArr, i + 1, fArr, i, this.f27341g - i);
                this.f27341g--;
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
            float[] fArr = this.f27340f;
            System.arraycopy(fArr, i2, fArr, i, this.f27341g - i2);
            this.f27341g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo28114a();
        m26623a(i);
        float[] fArr = this.f27340f;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f27341g;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f27341g) {
            return new C10438z0(Arrays.copyOf(this.f27340f, i), this.f27341g);
        }
        throw new IllegalArgumentException();
    }
}
