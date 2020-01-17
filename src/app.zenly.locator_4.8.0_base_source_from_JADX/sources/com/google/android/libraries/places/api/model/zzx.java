package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

final class zzx extends zza {
    private LatLng zza;
    private LatLng zzb;

    zzx() {
    }

    /* access modifiers changed from: 0000 */
    public final zza zza(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        throw new NullPointerException("Null southwest");
    }

    /* access modifiers changed from: 0000 */
    public final zza zzb(LatLng latLng) {
        if (latLng != null) {
            this.zzb = latLng;
            return this;
        }
        throw new NullPointerException("Null northeast");
    }

    /* access modifiers changed from: 0000 */
    public final RectangularBounds zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" southwest");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" northeast");
        }
        if (str.isEmpty()) {
            return new zzav(this.zza, this.zzb);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
