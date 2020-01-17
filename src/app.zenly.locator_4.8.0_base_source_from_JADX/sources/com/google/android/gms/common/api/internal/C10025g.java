package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.g */
public abstract class C10025g<A extends AnyClient, L> {

    /* renamed from: a */
    private final ListenerHolder<L> f26389a;

    /* renamed from: b */
    private final Feature[] f26390b = null;

    /* renamed from: c */
    private final boolean f26391c = false;

    protected C10025g(ListenerHolder<L> listenerHolder) {
        this.f26389a = listenerHolder;
    }

    /* renamed from: a */
    public void mo27201a() {
        this.f26389a.mo27133a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27202a(A a, C10694d<Void> dVar) throws RemoteException;

    /* renamed from: b */
    public C10006a<L> mo27203b() {
        return this.f26389a.mo27135b();
    }

    /* renamed from: c */
    public Feature[] mo27204c() {
        return this.f26390b;
    }

    /* renamed from: d */
    public final boolean mo27205d() {
        return this.f26391c;
    }
}
