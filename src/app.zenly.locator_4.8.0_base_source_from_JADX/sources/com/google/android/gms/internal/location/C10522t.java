package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.C10582k0;
import com.google.android.gms.location.LocationListener;

/* renamed from: com.google.android.gms.internal.location.t */
final class C10522t extends C10582k0 {

    /* renamed from: a */
    private final ListenerHolder<LocationListener> f27428a;

    C10522t(ListenerHolder<LocationListener> listenerHolder) {
        this.f27428a = listenerHolder;
    }

    /* renamed from: a */
    public final synchronized void mo28376a() {
        this.f27428a.mo27133a();
    }

    public final synchronized void onLocationChanged(Location location) {
        this.f27428a.mo27134a(new C10524u(this, location));
    }
}
