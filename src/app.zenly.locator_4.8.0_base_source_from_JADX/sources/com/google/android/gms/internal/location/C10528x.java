package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.location.C10573g;

/* renamed from: com.google.android.gms.internal.location.x */
final class C10528x extends C10506l {

    /* renamed from: a */
    private BaseImplementation$ResultHolder<Status> f27434a;

    public C10528x(BaseImplementation$ResultHolder<Status> baseImplementation$ResultHolder) {
        this.f27434a = baseImplementation$ResultHolder;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    public final void zza(int i, String[] strArr) {
        if (this.f27434a == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.f27434a.setResult(C10573g.m27021b(C10573g.m27020a(i)));
        this.f27434a = null;
    }

    public final void zzb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
