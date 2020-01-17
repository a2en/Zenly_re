package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.LocationListener;

/* renamed from: com.google.android.gms.internal.location.u */
final class C10524u implements Notifier<LocationListener> {

    /* renamed from: a */
    private final /* synthetic */ Location f27431a;

    C10524u(C10522t tVar, Location location) {
        this.f27431a = location;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f27431a);
    }

    public final void onNotifyListenerFailed() {
    }
}
