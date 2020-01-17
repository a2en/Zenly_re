package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.r */
final class C10518r implements Notifier<C10566d> {

    /* renamed from: a */
    private final /* synthetic */ LocationAvailability f27421a;

    C10518r(C10514p pVar, LocationAvailability locationAvailability) {
        this.f27421a = locationAvailability;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((C10566d) obj).onLocationAvailability(this.f27421a);
    }

    public final void onNotifyListenerFailed() {
    }
}
