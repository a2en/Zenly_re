package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.C10025g;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.C10526v;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.location.c0 */
final class C10565c0 extends C10025g<C10526v, C10566d> {

    /* renamed from: d */
    private final /* synthetic */ zzbd f27533d;

    /* renamed from: e */
    private final /* synthetic */ ListenerHolder f27534e;

    C10565c0(C10559a aVar, ListenerHolder listenerHolder, zzbd zzbd, ListenerHolder listenerHolder2) {
        this.f27533d = zzbd;
        this.f27534e = listenerHolder2;
        super(listenerHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27202a(AnyClient anyClient, C10694d dVar) throws RemoteException {
        ((C10526v) anyClient).mo28382a(this.f27533d, this.f27534e, (zzaj) new C10560a(dVar));
    }
}
