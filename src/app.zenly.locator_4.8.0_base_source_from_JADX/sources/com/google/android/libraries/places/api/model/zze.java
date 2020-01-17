package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;

abstract class zze extends zza {
    private final int zza;
    private final int zzb;

    zze(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zza2 = (zza) obj;
            return this.zza == zza2.zza() && this.zzb == zza2.zzb();
        }
    }

    public int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(54);
        sb.append("SubstringMatch{offset=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final int zza() {
        return this.zza;
    }

    /* access modifiers changed from: 0000 */
    public final int zzb() {
        return this.zzb;
    }
}
