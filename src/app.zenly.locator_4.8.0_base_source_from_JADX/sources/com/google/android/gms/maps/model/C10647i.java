package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.maps.zzac;

/* renamed from: com.google.android.gms.maps.model.i */
public final class C10647i {

    /* renamed from: a */
    private final zzac f27729a;

    public C10647i(zzac zzac) {
        C10123l.m25505a(zzac);
        this.f27729a = zzac;
    }

    /* renamed from: a */
    public final void mo29206a() {
        try {
            this.f27729a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10647i)) {
            return false;
        }
        try {
            return this.f27729a.zza(((C10647i) obj).f27729a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f27729a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
