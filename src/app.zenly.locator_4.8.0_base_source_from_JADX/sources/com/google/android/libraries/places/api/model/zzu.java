package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

abstract class zzu extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    zzu(LatLng latLng, LatLng latLng2) {
        if (latLng != null) {
            this.zza = latLng;
            if (latLng2 != null) {
                this.zzb = latLng2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            return this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast());
        }
    }

    public LatLng getNortheast() {
        return this.zzb;
    }

    public LatLng getSouthwest() {
        return this.zza;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("RectangularBounds{southwest=");
        sb.append(valueOf);
        sb.append(", northeast=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
