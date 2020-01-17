package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.d */
public final class C10606d {

    /* renamed from: a */
    private final IUiSettingsDelegate f27604a;

    C10606d(IUiSettingsDelegate iUiSettingsDelegate) {
        this.f27604a = iUiSettingsDelegate;
    }

    /* renamed from: a */
    public final void mo28827a(boolean z) {
        try {
            this.f27604a.setCompassEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo28828b(boolean z) {
        try {
            this.f27604a.setTiltGesturesEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
