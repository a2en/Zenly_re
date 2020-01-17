package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
public final class C10045p0 extends C10041n0<Void> {

    /* renamed from: b */
    private final C10025g<AnyClient, ?> f26413b;

    /* renamed from: c */
    private final C10034k<AnyClient, ?> f26414c;

    public C10045p0(C10012b0 b0Var, C10694d<Void> dVar) {
        super(3, dVar);
        this.f26413b = b0Var.f26333a;
        this.f26414c = b0Var.f26334b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo27155a(C10061x0 x0Var, boolean z) {
    }

    /* renamed from: b */
    public final Feature[] mo27222b(C10017a<?> aVar) {
        return this.f26413b.mo27204c();
    }

    /* renamed from: c */
    public final boolean mo27223c(C10017a<?> aVar) {
        return this.f26413b.mo27205d();
    }

    /* renamed from: d */
    public final void mo27219d(C10017a<?> aVar) throws RemoteException {
        this.f26413b.mo27202a(aVar.mo27178f(), this.f26407a);
        if (this.f26413b.mo27203b() != null) {
            aVar.mo27181i().put(this.f26413b.mo27203b(), new C10012b0(this.f26413b, this.f26414c));
        }
    }
}
