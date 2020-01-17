package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10278e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.e3 */
public final class C10301e3 {

    /* renamed from: f */
    private static final C10301e3 f26979f = new C10301e3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f26980a;

    /* renamed from: b */
    private int[] f26981b;

    /* renamed from: c */
    private Object[] f26982c;

    /* renamed from: d */
    private int f26983d;

    /* renamed from: e */
    private boolean f26984e;

    private C10301e3() {
        this(0, new int[8], new Object[8], true);
    }

    private C10301e3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26983d = -1;
        this.f26980a = i;
        this.f26981b = iArr;
        this.f26982c = objArr;
        this.f26984e = z;
    }

    /* renamed from: a */
    static C10301e3 m26059a(C10301e3 e3Var, C10301e3 e3Var2) {
        int i = e3Var.f26980a + e3Var2.f26980a;
        int[] copyOf = Arrays.copyOf(e3Var.f26981b, i);
        System.arraycopy(e3Var2.f26981b, 0, copyOf, e3Var.f26980a, e3Var2.f26980a);
        Object[] copyOf2 = Arrays.copyOf(e3Var.f26982c, i);
        System.arraycopy(e3Var2.f26982c, 0, copyOf2, e3Var.f26980a, e3Var2.f26980a);
        return new C10301e3(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m26060a(int i, Object obj, C10435y3 y3Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            y3Var.mo28019b(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            y3Var.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            y3Var.mo28013a(i2, (C10431y) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                y3Var.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzco.m26831c());
        } else if (y3Var.mo28009a() == C10278e.f26899k) {
            y3Var.mo28017b(i2);
            ((C10301e3) obj).mo27893b(y3Var);
            y3Var.mo28010a(i2);
        } else {
            y3Var.mo28010a(i2);
            ((C10301e3) obj).mo27893b(y3Var);
            y3Var.mo28017b(i2);
        }
    }

    /* renamed from: d */
    public static C10301e3 m26061d() {
        return f26979f;
    }

    /* renamed from: e */
    static C10301e3 m26062e() {
        return new C10301e3();
    }

    /* renamed from: a */
    public final int mo27888a() {
        int i;
        int i2 = this.f26983d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f26980a; i4++) {
            int i5 = this.f26981b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzbn.m26690e(i6, ((Long) this.f26982c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzbn.m26698g(i6, ((Long) this.f26982c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzbn.m26681c(i6, (C10431y) this.f26982c[i4]);
            } else if (i7 == 3) {
                i = (zzbn.m26689e(i6) << 1) + ((C10301e3) this.f26982c[i4]).mo27888a();
            } else if (i7 == 5) {
                i = zzbn.m26705i(i6, ((Integer) this.f26982c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzco.m26831c());
            }
            i3 += i;
        }
        this.f26983d = i3;
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27889a(int i, Object obj) {
        if (this.f26984e) {
            int i2 = this.f26980a;
            if (i2 == this.f26981b.length) {
                int i3 = this.f26980a + (i2 < 4 ? 8 : i2 >> 1);
                this.f26981b = Arrays.copyOf(this.f26981b, i3);
                this.f26982c = Arrays.copyOf(this.f26982c, i3);
            }
            int[] iArr = this.f26981b;
            int i4 = this.f26980a;
            iArr[i4] = i;
            this.f26982c[i4] = obj;
            this.f26980a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27890a(C10435y3 y3Var) throws IOException {
        if (y3Var.mo28009a() == C10278e.f26900l) {
            for (int i = this.f26980a - 1; i >= 0; i--) {
                y3Var.zza(this.f26981b[i] >>> 3, this.f26982c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f26980a; i2++) {
            y3Var.zza(this.f26981b[i2] >>> 3, this.f26982c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27891a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f26980a; i2++) {
            C10267a2.m25907a(sb, i, String.valueOf(this.f26981b[i2] >>> 3), this.f26982c[i2]);
        }
    }

    /* renamed from: b */
    public final int mo27892b() {
        int i = this.f26983d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26980a; i3++) {
            i2 += zzbn.m26686d(this.f26981b[i3] >>> 3, (C10431y) this.f26982c[i3]);
        }
        this.f26983d = i2;
        return i2;
    }

    /* renamed from: b */
    public final void mo27893b(C10435y3 y3Var) throws IOException {
        if (this.f26980a != 0) {
            if (y3Var.mo28009a() == C10278e.f26899k) {
                for (int i = 0; i < this.f26980a; i++) {
                    m26060a(this.f26981b[i], this.f26982c[i], y3Var);
                }
                return;
            }
            for (int i2 = this.f26980a - 1; i2 >= 0; i2--) {
                m26060a(this.f26981b[i2], this.f26982c[i2], y3Var);
            }
        }
    }

    /* renamed from: c */
    public final void mo27894c() {
        this.f26984e = false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10301e3)) {
            return false;
        }
        C10301e3 e3Var = (C10301e3) obj;
        int i = this.f26980a;
        if (i == e3Var.f26980a) {
            int[] iArr = this.f26981b;
            int[] iArr2 = e3Var.f26981b;
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
                Object[] objArr = this.f26982c;
                Object[] objArr2 = e3Var.f26982c;
                int i3 = this.f26980a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f26980a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f26981b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f26982c;
        for (int i7 = 0; i7 < this.f26980a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }
}
