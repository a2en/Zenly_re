package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.C10578i0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.p */
final class C10514p extends C10578i0 {

    /* renamed from: a */
    private final ListenerHolder<C10566d> f27418a;

    C10514p(ListenerHolder<C10566d> listenerHolder) {
        this.f27418a = listenerHolder;
    }

    /* renamed from: a */
    public final synchronized void mo28373a() {
        this.f27418a.mo27133a();
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        this.f27418a.mo27134a(new C10518r(this, locationAvailability));
    }

    public final void onLocationResult(LocationResult locationResult) {
        this.f27418a.mo27134a(new C10516q(this, locationResult));
    }
}
