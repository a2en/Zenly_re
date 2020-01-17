package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C10029i.C10030a;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
final class C10028h0 extends C10029i<A, ResultT> {

    /* renamed from: c */
    private final /* synthetic */ C10030a f26392c;

    C10028h0(C10030a aVar, Feature[] featureArr, boolean z) {
        this.f26392c = aVar;
        super(featureArr, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27206a(A a, C10694d<ResultT> dVar) throws RemoteException {
        this.f26392c.f26395a.accept(a, dVar);
    }
}
