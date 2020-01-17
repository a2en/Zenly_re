package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.q */
final class C10516q implements Notifier<C10566d> {

    /* renamed from: a */
    private final /* synthetic */ LocationResult f27420a;

    C10516q(C10514p pVar, LocationResult locationResult) {
        this.f27420a = locationResult;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((C10566d) obj).onLocationResult(this.f27420a);
    }

    public final void onNotifyListenerFailed() {
    }
}
