package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
public final class C10047q0 extends C10041n0<Boolean> {

    /* renamed from: b */
    private final C10006a<?> f26415b;

    public C10047q0(C10006a<?> aVar, C10694d<Boolean> dVar) {
        super(4, dVar);
        this.f26415b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo27155a(C10061x0 x0Var, boolean z) {
    }

    /* renamed from: b */
    public final Feature[] mo27222b(C10017a<?> aVar) {
        C10012b0 b0Var = (C10012b0) aVar.mo27181i().get(this.f26415b);
        if (b0Var == null) {
            return null;
        }
        return b0Var.f26333a.mo27204c();
    }

    /* renamed from: c */
    public final boolean mo27223c(C10017a<?> aVar) {
        C10012b0 b0Var = (C10012b0) aVar.mo27181i().get(this.f26415b);
        return b0Var != null && b0Var.f26333a.mo27205d();
    }

    /* renamed from: d */
    public final void mo27219d(C10017a<?> aVar) throws RemoteException {
        C10012b0 b0Var = (C10012b0) aVar.mo27181i().remove(this.f26415b);
        if (b0Var != null) {
            b0Var.f26334b.mo27214a(aVar.mo27178f(), this.f26407a);
            b0Var.f26333a.mo27201a();
            return;
        }
        this.f26407a.mo29329b(Boolean.valueOf(false));
    }
}
