package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C10123l;
import p214e.p228e.C7573b;

/* renamed from: com.google.android.gms.common.api.internal.n */
public class C10040n extends C10051s0 {

    /* renamed from: j */
    private final C7573b<C10011b<?>> f26405j = new C7573b<>();

    /* renamed from: k */
    private C10016d f26406k;

    private C10040n(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f26316e.addCallback("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: a */
    public static void m25228a(Activity activity, C10016d dVar, C10011b<?> bVar) {
        LifecycleFragment a = LifecycleCallback.m25095a(activity);
        C10040n nVar = (C10040n) a.getCallbackOrNull("ConnectionlessLifecycleHelper", C10040n.class);
        if (nVar == null) {
            nVar = new C10040n(a);
        }
        nVar.f26406k = dVar;
        C10123l.m25506a(bVar, (Object) "ApiKey cannot be null");
        nVar.f26405j.add(bVar);
        dVar.mo27164a(nVar);
    }

    /* renamed from: i */
    private final void m25229i() {
        if (!this.f26405j.isEmpty()) {
            this.f26406k.mo27164a(this);
        }
    }

    /* renamed from: c */
    public void mo27124c() {
        super.mo27124c();
        m25229i();
    }

    /* renamed from: d */
    public void mo27125d() {
        super.mo27125d();
        m25229i();
    }

    /* renamed from: e */
    public void mo27126e() {
        super.mo27126e();
        this.f26406k.mo27166b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo27217f() {
        this.f26406k.mo27165b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C7573b<C10011b<?>> mo27218h() {
        return this.f26405j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27216a(ConnectionResult connectionResult, int i) {
        this.f26406k.mo27160a(connectionResult, i);
    }
}
