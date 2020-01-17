package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.c4 */
public final class C10288c4 implements Cloneable {

    /* renamed from: e */
    private int[] f26936e;

    /* renamed from: f */
    private C10295d4[] f26937f;

    /* renamed from: g */
    private int f26938g;

    static {
        new C10295d4();
    }

    C10288c4() {
        this(10);
    }

    private C10288c4(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f26936e = new int[i5];
        this.f26937f = new C10295d4[i5];
        this.f26938g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10295d4 mo27856a(int i) {
        return this.f26937f[i];
    }

    /* renamed from: a */
    public final boolean mo27857a() {
        return this.f26938g == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo27858b() {
        return this.f26938g;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f26938g;
        C10288c4 c4Var = new C10288c4(i);
        System.arraycopy(this.f26936e, 0, c4Var.f26936e, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C10295d4[] d4VarArr = this.f26937f;
            if (d4VarArr[i2] != null) {
                c4Var.f26937f[i2] = (C10295d4) d4VarArr[i2].clone();
            }
        }
        c4Var.f26938g = i;
        return c4Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10288c4)) {
            return false;
        }
        C10288c4 c4Var = (C10288c4) obj;
        int i = this.f26938g;
        if (i != c4Var.f26938g) {
            return false;
        }
        int[] iArr = this.f26936e;
        int[] iArr2 = c4Var.f26936e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C10295d4[] d4VarArr = this.f26937f;
            C10295d4[] d4VarArr2 = c4Var.f26937f;
            int i3 = this.f26938g;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!d4VarArr[i4].equals(d4VarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f26938g; i2++) {
            i = (((i * 31) + this.f26936e[i2]) * 31) + this.f26937f[i2].hashCode();
        }
        return i;
    }
}
