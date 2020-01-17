package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

/* renamed from: com.google.android.gms.internal.location.d */
final class C10490d extends C10502j {

    /* renamed from: a */
    private final BaseImplementation$ResultHolder<Status> f27399a;

    public C10490d(BaseImplementation$ResultHolder<Status> baseImplementation$ResultHolder) {
        this.f27399a = baseImplementation$ResultHolder;
    }

    public final void zza(zzad zzad) {
        this.f27399a.setResult(zzad.getStatus());
    }
}
