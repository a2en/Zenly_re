package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.v4 */
public final class C10418v4 extends C10269a4<C10418v4> implements Cloneable {

    /* renamed from: g */
    public long f27229g = 0;

    /* renamed from: h */
    public long f27230h = 0;

    /* renamed from: i */
    private String f27231i;

    /* renamed from: j */
    public int f27232j;

    /* renamed from: k */
    private String f27233k;

    /* renamed from: l */
    private C10424w4[] f27234l;

    /* renamed from: m */
    private byte[] f27235m;

    /* renamed from: n */
    private C10335j4 f27236n;

    /* renamed from: o */
    public byte[] f27237o;

    /* renamed from: p */
    private String f27238p;

    /* renamed from: q */
    private String f27239q;

    /* renamed from: r */
    private C10400s4 f27240r;

    /* renamed from: s */
    private String f27241s;

    /* renamed from: t */
    public long f27242t;

    /* renamed from: u */
    private C10406t4 f27243u;

    /* renamed from: v */
    public byte[] f27244v;

    /* renamed from: w */
    private String f27245w;

    /* renamed from: x */
    private int[] f27246x;

    /* renamed from: y */
    private C10346k4 f27247y;

    /* renamed from: z */
    public boolean f27248z;

    public C10418v4() {
        String str = "";
        this.f27231i = str;
        this.f27232j = 0;
        this.f27233k = str;
        this.f27234l = C10424w4.m26581e();
        byte[] bArr = C10329i4.f27023e;
        this.f27235m = bArr;
        this.f27236n = null;
        this.f27237o = bArr;
        this.f27238p = str;
        this.f27239q = str;
        this.f27240r = null;
        this.f27241s = str;
        this.f27242t = 180000;
        this.f27243u = null;
        this.f27244v = bArr;
        this.f27245w = str;
        this.f27246x = C10329i4.f27019a;
        this.f27247y = null;
        this.f27248z = false;
        this.f26879f = null;
        this.f26991e = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C10418v4 clone() {
        try {
            C10418v4 v4Var = (C10418v4) super.clone();
            C10424w4[] w4VarArr = this.f27234l;
            if (w4VarArr != null && w4VarArr.length > 0) {
                v4Var.f27234l = new C10424w4[w4VarArr.length];
                int i = 0;
                while (true) {
                    C10424w4[] w4VarArr2 = this.f27234l;
                    if (i >= w4VarArr2.length) {
                        break;
                    }
                    if (w4VarArr2[i] != null) {
                        v4Var.f27234l[i] = (C10424w4) w4VarArr2[i].clone();
                    }
                    i++;
                }
            }
            C10335j4 j4Var = this.f27236n;
            if (j4Var != null) {
                v4Var.f27236n = j4Var;
            }
            C10400s4 s4Var = this.f27240r;
            if (s4Var != null) {
                v4Var.f27240r = (C10400s4) s4Var.clone();
            }
            C10406t4 t4Var = this.f27243u;
            if (t4Var != null) {
                v4Var.f27243u = (C10406t4) t4Var.clone();
            }
            int[] iArr = this.f27246x;
            if (iArr != null && iArr.length > 0) {
                v4Var.f27246x = (int[]) iArr.clone();
            }
            C10346k4 k4Var = this.f27247y;
            if (k4Var != null) {
                v4Var.f27247y = k4Var;
            }
            return v4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo27792a(C10441z3 z3Var) throws IOException {
        long j = this.f27229g;
        if (j != 0) {
            z3Var.mo28212a(1, j);
        }
        String str = this.f27231i;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            z3Var.mo28215a(2, this.f27231i);
        }
        C10424w4[] w4VarArr = this.f27234l;
        int i = 0;
        if (w4VarArr != null && w4VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C10424w4[] w4VarArr2 = this.f27234l;
                if (i2 >= w4VarArr2.length) {
                    break;
                }
                C10424w4 w4Var = w4VarArr2[i2];
                if (w4Var != null) {
                    z3Var.mo28213a(3, (C10309f4) w4Var);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.f27235m, C10329i4.f27023e)) {
            z3Var.mo28217a(4, this.f27235m);
        }
        if (!Arrays.equals(this.f27237o, C10329i4.f27023e)) {
            z3Var.mo28217a(6, this.f27237o);
        }
        C10400s4 s4Var = this.f27240r;
        if (s4Var != null) {
            z3Var.mo28213a(7, (C10309f4) s4Var);
        }
        String str3 = this.f27238p;
        if (str3 != null && !str3.equals(str2)) {
            z3Var.mo28215a(8, this.f27238p);
        }
        C10335j4 j4Var = this.f27236n;
        if (j4Var != null) {
            z3Var.mo28214a(9, (zzdo) j4Var);
        }
        int i3 = this.f27232j;
        if (i3 != 0) {
            z3Var.mo28219b(11, i3);
        }
        String str4 = this.f27239q;
        if (str4 != null && !str4.equals(str2)) {
            z3Var.mo28215a(13, this.f27239q);
        }
        String str5 = this.f27241s;
        if (str5 != null && !str5.equals(str2)) {
            z3Var.mo28215a(14, this.f27241s);
        }
        long j2 = this.f27242t;
        if (j2 != 180000) {
            z3Var.mo28211a(15, 0);
            z3Var.mo28218a(C10441z3.m26641b(j2));
        }
        C10406t4 t4Var = this.f27243u;
        if (t4Var != null) {
            z3Var.mo28213a(16, (C10309f4) t4Var);
        }
        long j3 = this.f27230h;
        if (j3 != 0) {
            z3Var.mo28212a(17, j3);
        }
        if (!Arrays.equals(this.f27244v, C10329i4.f27023e)) {
            z3Var.mo28217a(18, this.f27244v);
        }
        int[] iArr = this.f27246x;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f27246x;
                if (i >= iArr2.length) {
                    break;
                }
                z3Var.mo28219b(20, iArr2[i]);
                i++;
            }
        }
        C10346k4 k4Var = this.f27247y;
        if (k4Var != null) {
            z3Var.mo28214a(23, (zzdo) k4Var);
        }
        String str6 = this.f27245w;
        if (str6 != null && !str6.equals(str2)) {
            z3Var.mo28215a(24, this.f27245w);
        }
        boolean z = this.f27248z;
        if (z) {
            z3Var.mo28216a(25, z);
        }
        String str7 = this.f27233k;
        if (str7 != null && !str7.equals(str2)) {
            z3Var.mo28215a(26, this.f27233k);
        }
        super.mo27792a(z3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo27793b() {
        int[] iArr;
        int b = super.mo27793b();
        long j = this.f27229g;
        if (j != 0) {
            b += C10441z3.m26636b(1, j);
        }
        String str = this.f27231i;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            b += C10441z3.m26638b(2, this.f27231i);
        }
        C10424w4[] w4VarArr = this.f27234l;
        int i = 0;
        if (w4VarArr != null && w4VarArr.length > 0) {
            int i2 = b;
            int i3 = 0;
            while (true) {
                C10424w4[] w4VarArr2 = this.f27234l;
                if (i3 >= w4VarArr2.length) {
                    break;
                }
                C10424w4 w4Var = w4VarArr2[i3];
                if (w4Var != null) {
                    i2 += C10441z3.m26637b(3, (C10309f4) w4Var);
                }
                i3++;
            }
            b = i2;
        }
        if (!Arrays.equals(this.f27235m, C10329i4.f27023e)) {
            b += C10441z3.m26639b(4, this.f27235m);
        }
        if (!Arrays.equals(this.f27237o, C10329i4.f27023e)) {
            b += C10441z3.m26639b(6, this.f27237o);
        }
        C10400s4 s4Var = this.f27240r;
        if (s4Var != null) {
            b += C10441z3.m26637b(7, (C10309f4) s4Var);
        }
        String str3 = this.f27238p;
        if (str3 != null && !str3.equals(str2)) {
            b += C10441z3.m26638b(8, this.f27238p);
        }
        C10335j4 j4Var = this.f27236n;
        if (j4Var != null) {
            b += zzbn.m26682c(9, (zzdo) j4Var);
        }
        int i4 = this.f27232j;
        if (i4 != 0) {
            b += C10441z3.m26643c(11) + C10441z3.m26645d(i4);
        }
        String str4 = this.f27239q;
        if (str4 != null && !str4.equals(str2)) {
            b += C10441z3.m26638b(13, this.f27239q);
        }
        String str5 = this.f27241s;
        if (str5 != null && !str5.equals(str2)) {
            b += C10441z3.m26638b(14, this.f27241s);
        }
        long j2 = this.f27242t;
        if (j2 != 180000) {
            b += C10441z3.m26643c(15) + C10441z3.m26644c(C10441z3.m26641b(j2));
        }
        C10406t4 t4Var = this.f27243u;
        if (t4Var != null) {
            b += C10441z3.m26637b(16, (C10309f4) t4Var);
        }
        long j3 = this.f27230h;
        if (j3 != 0) {
            b += C10441z3.m26636b(17, j3);
        }
        if (!Arrays.equals(this.f27244v, C10329i4.f27023e)) {
            b += C10441z3.m26639b(18, this.f27244v);
        }
        int[] iArr2 = this.f27246x;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.f27246x;
                if (i >= iArr.length) {
                    break;
                }
                i5 += C10441z3.m26645d(iArr[i]);
                i++;
            }
            b = b + i5 + (iArr.length * 2);
        }
        C10346k4 k4Var = this.f27247y;
        if (k4Var != null) {
            b += zzbn.m26682c(23, (zzdo) k4Var);
        }
        String str6 = this.f27245w;
        if (str6 != null && !str6.equals(str2)) {
            b += C10441z3.m26638b(24, this.f27245w);
        }
        if (this.f27248z) {
            b += C10441z3.m26643c(25) + 1;
        }
        String str7 = this.f27233k;
        return (str7 == null || str7.equals(str2)) ? b : b + C10441z3.m26638b(26, this.f27233k);
    }

    /* renamed from: c */
    public final /* synthetic */ C10309f4 mo27794c() throws CloneNotSupportedException {
        return (C10418v4) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ C10269a4 mo27796d() throws CloneNotSupportedException {
        return (C10418v4) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10418v4)) {
            return false;
        }
        C10418v4 v4Var = (C10418v4) obj;
        if (this.f27229g != v4Var.f27229g || this.f27230h != v4Var.f27230h) {
            return false;
        }
        String str = this.f27231i;
        if (str == null) {
            if (v4Var.f27231i != null) {
                return false;
            }
        } else if (!str.equals(v4Var.f27231i)) {
            return false;
        }
        if (this.f27232j != v4Var.f27232j) {
            return false;
        }
        String str2 = this.f27233k;
        if (str2 == null) {
            if (v4Var.f27233k != null) {
                return false;
            }
        } else if (!str2.equals(v4Var.f27233k)) {
            return false;
        }
        if (!C10302e4.m26077a((Object[]) this.f27234l, (Object[]) v4Var.f27234l) || !Arrays.equals(this.f27235m, v4Var.f27235m)) {
            return false;
        }
        C10335j4 j4Var = this.f27236n;
        if (j4Var == null) {
            if (v4Var.f27236n != null) {
                return false;
            }
        } else if (!j4Var.equals(v4Var.f27236n)) {
            return false;
        }
        if (!Arrays.equals(this.f27237o, v4Var.f27237o)) {
            return false;
        }
        String str3 = this.f27238p;
        if (str3 == null) {
            if (v4Var.f27238p != null) {
                return false;
            }
        } else if (!str3.equals(v4Var.f27238p)) {
            return false;
        }
        String str4 = this.f27239q;
        if (str4 == null) {
            if (v4Var.f27239q != null) {
                return false;
            }
        } else if (!str4.equals(v4Var.f27239q)) {
            return false;
        }
        C10400s4 s4Var = this.f27240r;
        if (s4Var == null) {
            if (v4Var.f27240r != null) {
                return false;
            }
        } else if (!s4Var.equals(v4Var.f27240r)) {
            return false;
        }
        String str5 = this.f27241s;
        if (str5 == null) {
            if (v4Var.f27241s != null) {
                return false;
            }
        } else if (!str5.equals(v4Var.f27241s)) {
            return false;
        }
        if (this.f27242t != v4Var.f27242t) {
            return false;
        }
        C10406t4 t4Var = this.f27243u;
        if (t4Var == null) {
            if (v4Var.f27243u != null) {
                return false;
            }
        } else if (!t4Var.equals(v4Var.f27243u)) {
            return false;
        }
        if (!Arrays.equals(this.f27244v, v4Var.f27244v)) {
            return false;
        }
        String str6 = this.f27245w;
        if (str6 == null) {
            if (v4Var.f27245w != null) {
                return false;
            }
        } else if (!str6.equals(v4Var.f27245w)) {
            return false;
        }
        if (!C10302e4.m26075a(this.f27246x, v4Var.f27246x)) {
            return false;
        }
        C10346k4 k4Var = this.f27247y;
        if (k4Var == null) {
            if (v4Var.f27247y != null) {
                return false;
            }
        } else if (!k4Var.equals(v4Var.f27247y)) {
            return false;
        }
        if (this.f27248z != v4Var.f27248z) {
            return false;
        }
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            return this.f26879f.equals(v4Var.f26879f);
        }
        C10288c4 c4Var2 = v4Var.f26879f;
        return c4Var2 == null || c4Var2.mo27857a();
    }

    public final int hashCode() {
        int hashCode = (C10418v4.class.getName().hashCode() + 527) * 31;
        long j = this.f27229g;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f27230h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        String str = this.f27231i;
        int i3 = 0;
        int hashCode2 = (((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.f27232j) * 31;
        String str2 = this.f27233k;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i4 = 1237;
        int a = ((((((hashCode2 + hashCode3) * 31 * 31) + 1237) * 31) + C10302e4.m26072a((Object[]) this.f27234l)) * 31) + Arrays.hashCode(this.f27235m);
        C10335j4 j4Var = this.f27236n;
        int hashCode4 = ((((a * 31) + (j4Var == null ? 0 : j4Var.hashCode())) * 31) + Arrays.hashCode(this.f27237o)) * 31;
        String str3 = this.f27238p;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27239q;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        C10400s4 s4Var = this.f27240r;
        int hashCode7 = ((hashCode6 * 31) + (s4Var == null ? 0 : s4Var.hashCode())) * 31;
        String str5 = this.f27241s;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j3 = this.f27242t;
        int i5 = hashCode8 + ((int) (j3 ^ (j3 >>> 32)));
        C10406t4 t4Var = this.f27243u;
        int hashCode9 = ((((i5 * 31) + (t4Var == null ? 0 : t4Var.hashCode())) * 31) + Arrays.hashCode(this.f27244v)) * 31;
        String str6 = this.f27245w;
        int hashCode10 = (((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31 * 31) + C10302e4.m26070a(this.f27246x)) * 31;
        C10346k4 k4Var = this.f27247y;
        int hashCode11 = ((hashCode10 * 31) + (k4Var == null ? 0 : k4Var.hashCode())) * 31;
        if (this.f27248z) {
            i4 = 1231;
        }
        int i6 = (hashCode11 + i4) * 31;
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            i3 = this.f26879f.hashCode();
        }
        return i6 + i3;
    }
}
