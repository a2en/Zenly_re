package com.google.android.libraries.places.api.model;

abstract class zzt extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    zzt(Place place, double d) {
        if (place != null) {
            this.zza = place;
            this.zzb = d;
            return;
        }
        throw new NullPointerException("Null place");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            return this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood());
        }
    }

    public double getLikelihood() {
        return this.zzb;
    }

    public Place getPlace() {
        return this.zza;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb)));
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        double d = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
        sb.append("PlaceLikelihood{place=");
        sb.append(valueOf);
        sb.append(", likelihood=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
