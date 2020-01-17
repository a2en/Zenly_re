package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class RectangularBounds implements LocationBias, LocationRestriction {

    static abstract class zza {
        zza() {
        }

        /* access modifiers changed from: 0000 */
        public abstract zza zza(LatLng latLng);

        /* access modifiers changed from: 0000 */
        public abstract RectangularBounds zza();

        /* access modifiers changed from: 0000 */
        public abstract zza zzb(LatLng latLng);
    }

    public static RectangularBounds newInstance(LatLngBounds latLngBounds) {
        return new zzx().zza(latLngBounds.f27650e).zzb(latLngBounds.f27651f).zza();
    }

    public abstract LatLng getNortheast();

    public abstract LatLng getSouthwest();

    public static RectangularBounds newInstance(LatLng latLng, LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }
}
