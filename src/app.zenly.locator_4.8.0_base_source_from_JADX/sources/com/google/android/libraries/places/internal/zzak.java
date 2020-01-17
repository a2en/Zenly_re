package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.internal.zzcq;
import java.util.Map;

public abstract class zzak<TypeT, RequestT extends zzcq> {
    private final RequestT zza;

    protected zzak(RequestT requestt) {
        this.zza = requestt;
    }

    /* access modifiers changed from: protected */
    public final RequestT zza() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final C10689a zzb() {
        return this.zza.getCancellationToken();
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, String> zzc();

    /* access modifiers changed from: protected */
    public abstract String zzd();
}
