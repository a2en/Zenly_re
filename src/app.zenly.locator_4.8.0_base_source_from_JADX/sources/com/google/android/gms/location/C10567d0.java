package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.C10034k;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.internal.location.C10526v;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.location.d0 */
final class C10567d0 extends C10034k<C10526v, C10566d> {

    /* renamed from: b */
    private final /* synthetic */ C10559a f27535b;

    C10567d0(C10559a aVar, C10006a aVar2) {
        this.f27535b = aVar;
        super(aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27214a(AnyClient anyClient, C10694d dVar) throws RemoteException {
        try {
            ((C10526v) anyClient).mo28389b(mo27213a(), this.f27535b.m26998a(dVar));
        } catch (RuntimeException e) {
            dVar.mo29328b((Exception) e);
        }
    }
}
