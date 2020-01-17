package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.s4 */
public final class C10400s4 extends C10269a4<C10400s4> implements Cloneable {

    /* renamed from: g */
    private String[] f27205g;

    /* renamed from: h */
    private String[] f27206h;

    /* renamed from: i */
    private int[] f27207i = C10329i4.f27019a;

    /* renamed from: j */
    private long[] f27208j;

    /* renamed from: k */
    private long[] f27209k;

    public C10400s4() {
        String[] strArr = C10329i4.f27021c;
        this.f27205g = strArr;
        this.f27206h = strArr;
        long[] jArr = C10329i4.f27020b;
        this.f27208j = jArr;
        this.f27209k = jArr;
        this.f26879f = null;
        this.f26991e = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C10400s4 clone() {
        try {
            C10400s4 s4Var = (C10400s4) super.clone();
            String[] strArr = this.f27205g;
            if (strArr != null && strArr.length > 0) {
                s4Var.f27205g = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f27206h;
            if (strArr2 != null && strArr2.length > 0) {
                s4Var.f27206h = (String[]) strArr2.clone();
            }
            int[] iArr = this.f27207i;
            if (iArr != null && iArr.length > 0) {
                s4Var.f27207i = (int[]) iArr.clone();
            }
            long[] jArr = this.f27208j;
            if (jArr != null && jArr.length > 0) {
                s4Var.f27208j = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f27209k;
            if (jArr2 != null && jArr2.length > 0) {
                s4Var.f27209k = (long[]) jArr2.clone();
            }
            return s4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo27792a(C10441z3 z3Var) throws IOException {
        String[] strArr = this.f27205g;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f27205g;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    z3Var.mo28215a(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.f27206h;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f27206h;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    z3Var.mo28215a(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.f27207i;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f27207i;
                if (i4 >= iArr2.length) {
                    break;
                }
                z3Var.mo28219b(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f27208j;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f27208j;
                if (i5 >= jArr2.length) {
                    break;
                }
                z3Var.mo28212a(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.f27209k;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f27209k;
                if (i >= jArr4.length) {
                    break;
                }
                z3Var.mo28212a(5, jArr4[i]);
                i++;
            }
        }
        super.mo27792a(z3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo27793b() {
        long[] jArr;
        int[] iArr;
        int b = super.mo27793b();
        String[] strArr = this.f27205g;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f27205g;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += C10441z3.m26631a(str);
                }
                i2++;
            }
            b = b + i3 + (i4 * 1);
        }
        String[] strArr3 = this.f27206h;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f27206h;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += C10441z3.m26631a(str2);
                }
                i5++;
            }
            b = b + i6 + (i7 * 1);
        }
        int[] iArr2 = this.f27207i;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.f27207i;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += C10441z3.m26645d(iArr[i8]);
                i8++;
            }
            b = b + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f27208j;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f27208j;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += C10441z3.m26644c(jArr[i10]);
                i10++;
            }
            b = b + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.f27209k;
        if (jArr3 == null || jArr3.length <= 0) {
            return b;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.f27209k;
            if (i >= jArr4.length) {
                return b + i12 + (jArr4.length * 1);
            }
            i12 += C10441z3.m26644c(jArr4[i]);
            i++;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C10309f4 mo27794c() throws CloneNotSupportedException {
        return (C10400s4) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ C10269a4 mo27796d() throws CloneNotSupportedException {
        return (C10400s4) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10400s4)) {
            return false;
        }
        C10400s4 s4Var = (C10400s4) obj;
        if (!C10302e4.m26077a((Object[]) this.f27205g, (Object[]) s4Var.f27205g) || !C10302e4.m26077a((Object[]) this.f27206h, (Object[]) s4Var.f27206h) || !C10302e4.m26075a(this.f27207i, s4Var.f27207i) || !C10302e4.m26076a(this.f27208j, s4Var.f27208j) || !C10302e4.m26076a(this.f27209k, s4Var.f27209k)) {
            return false;
        }
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            return this.f26879f.equals(s4Var.f26879f);
        }
        C10288c4 c4Var2 = s4Var.f26879f;
        return c4Var2 == null || c4Var2.mo27857a();
    }

    public final int hashCode() {
        int hashCode = (((((((((((C10400s4.class.getName().hashCode() + 527) * 31) + C10302e4.m26072a((Object[]) this.f27205g)) * 31) + C10302e4.m26072a((Object[]) this.f27206h)) * 31) + C10302e4.m26070a(this.f27207i)) * 31) + C10302e4.m26071a(this.f27208j)) * 31) + C10302e4.m26071a(this.f27209k)) * 31;
        C10288c4 c4Var = this.f26879f;
        return hashCode + ((c4Var == null || c4Var.mo27857a()) ? 0 : this.f26879f.hashCode());
    }
}
