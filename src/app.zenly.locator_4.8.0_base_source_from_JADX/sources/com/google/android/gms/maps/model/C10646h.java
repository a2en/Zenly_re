package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.maps.zzz;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.h */
public final class C10646h {

    /* renamed from: a */
    private final zzz f27728a;

    public C10646h(zzz zzz) {
        C10123l.m25505a(zzz);
        this.f27728a = zzz;
    }

    /* renamed from: a */
    public final void mo29201a() {
        try {
            this.f27728a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10646h)) {
            return false;
        }
        try {
            return this.f27728a.zzb(((C10646h) obj).f27728a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f27728a.zzj();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo29203a(List<LatLng> list) {
        try {
            this.f27728a.setPoints(list);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo29202a(int i) {
        try {
            this.f27728a.setColor(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
