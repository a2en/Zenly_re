package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.C10694d;

final class zzo extends C10566d {
    private final /* synthetic */ C10694d zza;

    zzo(zzk zzk, C10694d dVar) {
        this.zza = dVar;
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        try {
            super.onLocationAvailability(locationAvailability);
            if (!locationAvailability.mo28635a()) {
                this.zza.mo29328b((Exception) new ApiException(new Status(8, "Location unavailable.")));
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onLocationResult(LocationResult locationResult) {
        try {
            super.onLocationResult(locationResult);
            this.zza.mo29329b(locationResult.mo28661a());
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
