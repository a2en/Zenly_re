package com.bluelinelabs.conductor;

import android.os.Bundle;
import com.bluelinelabs.conductor.internal.C8850d;

/* renamed from: com.bluelinelabs.conductor.h */
public class C8836h {

    /* renamed from: g */
    private static int f22939g = -1;

    /* renamed from: a */
    final C8819d f22940a;

    /* renamed from: b */
    private String f22941b;

    /* renamed from: c */
    private ControllerChangeHandler f22942c;

    /* renamed from: d */
    private ControllerChangeHandler f22943d;

    /* renamed from: e */
    private boolean f22944e;

    /* renamed from: f */
    int f22945f = f22939g;

    private C8836h(C8819d dVar) {
        this.f22940a = dVar;
    }

    /* renamed from: a */
    public static C8836h m21058a(C8819d dVar) {
        return new C8836h(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24027b() {
        this.f22944e = true;
    }

    /* renamed from: c */
    public ControllerChangeHandler mo24028c() {
        ControllerChangeHandler g = this.f22940a.mo23942g();
        return g == null ? this.f22943d : g;
    }

    /* renamed from: d */
    public ControllerChangeHandler mo24029d() {
        ControllerChangeHandler h = this.f22940a.mo23943h();
        return h == null ? this.f22942c : h;
    }

    /* renamed from: e */
    public Bundle mo24030e() {
        Bundle bundle = new Bundle();
        bundle.putBundle("RouterTransaction.controller.bundle", this.f22940a.mo23954t());
        ControllerChangeHandler controllerChangeHandler = this.f22942c;
        if (controllerChangeHandler != null) {
            bundle.putBundle("RouterTransaction.pushControllerChangeHandler", controllerChangeHandler.mo23854e());
        }
        ControllerChangeHandler controllerChangeHandler2 = this.f22943d;
        if (controllerChangeHandler2 != null) {
            bundle.putBundle("RouterTransaction.popControllerChangeHandler", controllerChangeHandler2.mo23854e());
        }
        bundle.putString("RouterTransaction.tag", this.f22941b);
        bundle.putInt("RouterTransaction.transactionIndex", this.f22945f);
        bundle.putBoolean("RouterTransaction.attachedToRouter", this.f22944e);
        return bundle;
    }

    /* renamed from: a */
    public C8819d mo24022a() {
        return this.f22940a;
    }

    /* renamed from: b */
    public C8836h mo24026b(ControllerChangeHandler controllerChangeHandler) {
        if (!this.f22944e) {
            this.f22942c = controllerChangeHandler;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8836h.class.getSimpleName());
        sb.append("s can not be modified after being added to a Router.");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public C8836h mo24024a(String str) {
        if (!this.f22944e) {
            this.f22941b = str;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8836h.class.getSimpleName());
        sb.append("s can not be modified after being added to a Router.");
        throw new RuntimeException(sb.toString());
    }

    C8836h(Bundle bundle) {
        this.f22940a = C8819d.m20860c(bundle.getBundle("RouterTransaction.controller.bundle"));
        this.f22942c = ControllerChangeHandler.m20791c(bundle.getBundle("RouterTransaction.pushControllerChangeHandler"));
        this.f22943d = ControllerChangeHandler.m20791c(bundle.getBundle("RouterTransaction.popControllerChangeHandler"));
        this.f22941b = bundle.getString("RouterTransaction.tag");
        this.f22945f = bundle.getInt("RouterTransaction.transactionIndex");
        this.f22944e = bundle.getBoolean("RouterTransaction.attachedToRouter");
    }

    /* renamed from: a */
    public C8836h mo24023a(ControllerChangeHandler controllerChangeHandler) {
        if (!this.f22944e) {
            this.f22943d = controllerChangeHandler;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8836h.class.getSimpleName());
        sb.append("s can not be modified after being added to a Router.");
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24025a(C8850d dVar) {
        if (this.f22945f == f22939g) {
            this.f22945f = dVar.mo24077a();
        }
    }
}
