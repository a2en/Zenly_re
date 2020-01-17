package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10099b;
import com.google.android.gms.internal.location.C10502j;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.location.e0 */
final class C10570e0 extends C10502j {

    /* renamed from: a */
    private final /* synthetic */ C10694d f27542a;

    C10570e0(C10559a aVar, C10694d dVar) {
        this.f27542a = dVar;
    }

    public final void zza(zzad zzad) throws RemoteException {
        Status status = zzad.getStatus();
        if (status == null) {
            this.f27542a.mo29328b((Exception) new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.mo27059a() == 0) {
            this.f27542a.mo29327a(Boolean.valueOf(true));
        } else {
            this.f27542a.mo29328b((Exception) C10099b.m25428a(status));
        }
    }
}
