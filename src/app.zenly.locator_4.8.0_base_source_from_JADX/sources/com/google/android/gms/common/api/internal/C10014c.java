package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.C10125m;

/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class C10014c<R extends Result, A extends AnyClient> extends BasePendingResult<R> implements BaseImplementation$ResultHolder<R> {
    protected C10014c(Api<?> api, GoogleApiClient googleApiClient) {
        C10123l.m25506a(googleApiClient, (Object) "GoogleApiClient must not be null");
        super(googleApiClient);
        C10123l.m25506a(api, (Object) "Api must not be null");
        api.mo27007a();
    }

    /* renamed from: a */
    private void m25115a(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27150a(A a) throws RemoteException;

    /* renamed from: b */
    public final void mo27151b(A a) throws DeadObjectException {
        if (a instanceof C10125m) {
            a = ((C10125m) a).mo27501n();
        }
        try {
            mo27150a(a);
        } catch (DeadObjectException e) {
            m25115a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m25115a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27152b(R r) {
    }

    public final void setFailedResult(Status status) {
        C10123l.m25513a(!status.isSuccess(), (Object) "Failed result must not be success");
        Result a = mo27107a(status);
        mo27108a(a);
        mo27152b((R) a);
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.mo27108a((Result) obj);
    }
}
