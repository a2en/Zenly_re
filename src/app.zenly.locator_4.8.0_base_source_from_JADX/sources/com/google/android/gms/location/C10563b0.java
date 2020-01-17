package com.google.android.gms.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.C10029i;
import com.google.android.gms.internal.location.C10526v;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.location.b0 */
final class C10563b0 extends C10029i<C10526v, Location> {
    C10563b0(C10559a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27206a(AnyClient anyClient, C10694d dVar) throws RemoteException {
        dVar.mo29327a(((C10526v) anyClient).mo27501n());
    }
}
