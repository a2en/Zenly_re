package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
abstract class C10041n0<T> extends C10046q {

    /* renamed from: a */
    protected final C10694d<T> f26407a;

    public C10041n0(int i, C10694d<T> dVar) {
        super(i);
        this.f26407a = dVar;
    }

    /* renamed from: a */
    public void mo27153a(Status status) {
        this.f26407a.mo29328b((Exception) new ApiException(status));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo27219d(C10017a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo27156a(RuntimeException runtimeException) {
        this.f26407a.mo29328b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo27154a(C10017a<?> aVar) throws DeadObjectException {
        try {
            mo27219d(aVar);
        } catch (DeadObjectException e) {
            mo27153a(C10015c0.m25119a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo27153a(C10015c0.m25119a(e2));
        } catch (RuntimeException e3) {
            mo27156a(e3);
        }
    }
}
