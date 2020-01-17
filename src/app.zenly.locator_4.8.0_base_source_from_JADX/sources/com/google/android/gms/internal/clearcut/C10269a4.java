package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10269a4;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.a4 */
public class C10269a4<M extends C10269a4<M>> extends C10309f4 {

    /* renamed from: f */
    protected C10288c4 f26879f;

    /* renamed from: a */
    public void mo27792a(C10441z3 z3Var) throws IOException {
        if (this.f26879f != null) {
            for (int i = 0; i < this.f26879f.mo27858b(); i++) {
                this.f26879f.mo27856a(i).mo27878a(z3Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo27793b() {
        if (this.f26879f != null) {
            for (int i = 0; i < this.f26879f.mo27858b(); i++) {
                this.f26879f.mo27856a(i).mo27877a();
            }
        }
        return 0;
    }

    /* renamed from: c */
    public /* synthetic */ C10309f4 mo27794c() throws CloneNotSupportedException {
        return (C10269a4) clone();
    }

    /* renamed from: d */
    public M clone() throws CloneNotSupportedException {
        M m = (C10269a4) super.clone();
        C10302e4.m26074a(this, (C10269a4) m);
        return m;
    }
}
