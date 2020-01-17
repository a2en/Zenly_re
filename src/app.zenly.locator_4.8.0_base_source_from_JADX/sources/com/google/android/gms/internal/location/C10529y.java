package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.location.C10573g;

/* renamed from: com.google.android.gms.internal.location.y */
final class C10529y extends C10506l {

    /* renamed from: a */
    private BaseImplementation$ResultHolder<Status> f27435a;

    public C10529y(BaseImplementation$ResultHolder<Status> baseImplementation$ResultHolder) {
        this.f27435a = baseImplementation$ResultHolder;
    }

    /* renamed from: a */
    private final void m26930a(int i) {
        if (this.f27435a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.f27435a.setResult(C10573g.m27021b(C10573g.m27020a(i)));
        this.f27435a = null;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        m26930a(i);
    }

    public final void zza(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    public final void zzb(int i, String[] strArr) {
        m26930a(i);
    }
}
