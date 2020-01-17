package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
public final class C10043o0<ResultT> extends C10046q {

    /* renamed from: a */
    private final C10029i<AnyClient, ResultT> f26410a;

    /* renamed from: b */
    private final C10694d<ResultT> f26411b;

    /* renamed from: c */
    private final StatusExceptionMapper f26412c;

    public C10043o0(int i, C10029i<AnyClient, ResultT> iVar, C10694d<ResultT> dVar, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.f26411b = dVar;
        this.f26410a = iVar;
        this.f26412c = statusExceptionMapper;
    }

    /* renamed from: a */
    public final void mo27154a(C10017a<?> aVar) throws DeadObjectException {
        try {
            this.f26410a.mo27206a(aVar.mo27178f(), this.f26411b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo27153a(C10015c0.m25119a(e2));
        } catch (RuntimeException e3) {
            mo27156a(e3);
        }
    }

    /* renamed from: b */
    public final Feature[] mo27222b(C10017a<?> aVar) {
        return this.f26410a.mo27208b();
    }

    /* renamed from: c */
    public final boolean mo27223c(C10017a<?> aVar) {
        return this.f26410a.mo27207a();
    }

    /* renamed from: a */
    public final void mo27153a(Status status) {
        this.f26411b.mo29328b(this.f26412c.getException(status));
    }

    /* renamed from: a */
    public final void mo27156a(RuntimeException runtimeException) {
        this.f26411b.mo29328b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo27155a(C10061x0 x0Var, boolean z) {
        x0Var.mo27240a(this.f26411b, z);
    }
}
