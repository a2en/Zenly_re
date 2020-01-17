package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.t4 */
public final class C10406t4 extends C10269a4<C10406t4> implements Cloneable {

    /* renamed from: g */
    private byte[] f27216g = C10329i4.f27023e;

    /* renamed from: h */
    private String f27217h = "";

    /* renamed from: i */
    private byte[][] f27218i = C10329i4.f27022d;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C10406t4 clone() {
        try {
            C10406t4 t4Var = (C10406t4) super.clone();
            byte[][] bArr = this.f27218i;
            if (bArr != null && bArr.length > 0) {
                t4Var.f27218i = (byte[][]) bArr.clone();
            }
            return t4Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo27792a(C10441z3 z3Var) throws IOException {
        if (!Arrays.equals(this.f27216g, C10329i4.f27023e)) {
            z3Var.mo28217a(1, this.f27216g);
        }
        byte[][] bArr = this.f27218i;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f27218i;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    z3Var.mo28217a(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f27217h;
        if (str != null && !str.equals("")) {
            z3Var.mo28215a(4, this.f27217h);
        }
        super.mo27792a(z3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo27793b() {
        int b = super.mo27793b();
        if (!Arrays.equals(this.f27216g, C10329i4.f27023e)) {
            b += C10441z3.m26639b(1, this.f27216g);
        }
        byte[][] bArr = this.f27218i;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f27218i;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += C10441z3.m26640b(bArr3);
                }
                i++;
            }
            b = b + i2 + (i3 * 1);
        }
        String str = this.f27217h;
        return (str == null || str.equals("")) ? b : b + C10441z3.m26638b(4, this.f27217h);
    }

    /* renamed from: c */
    public final /* synthetic */ C10309f4 mo27794c() throws CloneNotSupportedException {
        return (C10406t4) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ C10269a4 mo27796d() throws CloneNotSupportedException {
        return (C10406t4) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10406t4)) {
            return false;
        }
        C10406t4 t4Var = (C10406t4) obj;
        if (!Arrays.equals(this.f27216g, t4Var.f27216g)) {
            return false;
        }
        String str = this.f27217h;
        if (str == null) {
            if (t4Var.f27217h != null) {
                return false;
            }
        } else if (!str.equals(t4Var.f27217h)) {
            return false;
        }
        if (!C10302e4.m26078a(this.f27218i, t4Var.f27218i)) {
            return false;
        }
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            return this.f26879f.equals(t4Var.f26879f);
        }
        C10288c4 c4Var2 = t4Var.f26879f;
        return c4Var2 == null || c4Var2.mo27857a();
    }

    public final int hashCode() {
        int hashCode = (((C10406t4.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f27216g)) * 31;
        String str = this.f27217h;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C10302e4.m26073a(this.f27218i)) * 31) + 1237) * 31;
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            i = this.f26879f.hashCode();
        }
        return hashCode2 + i;
    }
}
