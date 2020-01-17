package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;

final class zzdz implements PlaceSelectionListener {
    private final /* synthetic */ zzdn zza;

    zzdz(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final void onError(Status status) {
        try {
            this.zza.zza(2, (Place) null, status);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onPlaceSelected(Place place) {
        try {
            this.zza.zza(place);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
