package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.w4 */
public final class C10424w4 extends C10269a4<C10424w4> implements Cloneable {

    /* renamed from: i */
    private static volatile C10424w4[] f27306i;

    /* renamed from: g */
    private String f27307g;

    /* renamed from: h */
    private String f27308h;

    public C10424w4() {
        String str = "";
        this.f27307g = str;
        this.f27308h = str;
    }

    /* renamed from: e */
    public static C10424w4[] m26581e() {
        if (f27306i == null) {
            synchronized (C10302e4.f26985a) {
                if (f27306i == null) {
                    f27306i = new C10424w4[0];
                }
            }
        }
        return f27306i;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C10424w4 clone() {
        try {
            return (C10424w4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo27792a(C10441z3 z3Var) throws IOException {
        String str = this.f27307g;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            z3Var.mo28215a(1, this.f27307g);
        }
        String str3 = this.f27308h;
        if (str3 != null && !str3.equals(str2)) {
            z3Var.mo28215a(2, this.f27308h);
        }
        super.mo27792a(z3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo27793b() {
        int b = super.mo27793b();
        String str = this.f27307g;
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            b += C10441z3.m26638b(1, this.f27307g);
        }
        String str3 = this.f27308h;
        return (str3 == null || str3.equals(str2)) ? b : b + C10441z3.m26638b(2, this.f27308h);
    }

    /* renamed from: c */
    public final /* synthetic */ C10309f4 mo27794c() throws CloneNotSupportedException {
        return (C10424w4) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ C10269a4 mo27796d() throws CloneNotSupportedException {
        return (C10424w4) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10424w4)) {
            return false;
        }
        C10424w4 w4Var = (C10424w4) obj;
        String str = this.f27307g;
        if (str == null) {
            if (w4Var.f27307g != null) {
                return false;
            }
        } else if (!str.equals(w4Var.f27307g)) {
            return false;
        }
        String str2 = this.f27308h;
        if (str2 == null) {
            if (w4Var.f27308h != null) {
                return false;
            }
        } else if (!str2.equals(w4Var.f27308h)) {
            return false;
        }
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            return this.f26879f.equals(w4Var.f26879f);
        }
        C10288c4 c4Var2 = w4Var.f26879f;
        return c4Var2 == null || c4Var2.mo27857a();
    }

    public final int hashCode() {
        int hashCode = (C10424w4.class.getName().hashCode() + 527) * 31;
        String str = this.f27307g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27308h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C10288c4 c4Var = this.f26879f;
        if (c4Var != null && !c4Var.mo27857a()) {
            i = this.f26879f.hashCode();
        }
        return hashCode3 + i;
    }
}
