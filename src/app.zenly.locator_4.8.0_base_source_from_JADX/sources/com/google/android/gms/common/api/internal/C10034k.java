package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.k */
public abstract class C10034k<A extends AnyClient, L> {

    /* renamed from: a */
    private final C10006a<L> f26398a;

    protected C10034k(C10006a<L> aVar) {
        this.f26398a = aVar;
    }

    /* renamed from: a */
    public C10006a<L> mo27213a() {
        return this.f26398a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27214a(A a, C10694d<Boolean> dVar) throws RemoteException;
}
