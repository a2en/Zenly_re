package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.f4 */
public class C10309f4 {

    /* renamed from: e */
    protected volatile int f26991e = -1;

    /* renamed from: a */
    public static final void m26104a(C10309f4 f4Var, byte[] bArr, int i, int i2) {
        try {
            C10441z3 a = C10441z3.m26633a(bArr, 0, i2);
            f4Var.mo27792a(a);
            a.mo28210a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public final int mo27910a() {
        int b = mo27793b();
        this.f26991e = b;
        return b;
    }

    /* renamed from: a */
    public void mo27792a(C10441z3 z3Var) throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo27793b() {
        return 0;
    }

    /* renamed from: c */
    public C10309f4 clone() throws CloneNotSupportedException {
        return (C10309f4) super.clone();
    }

    public String toString() {
        return C10323h4.m26132a(this);
    }
}
