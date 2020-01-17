package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.Collection;
import java.util.List;

final class zzdk extends zzep {
    private zzgv<Field> zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private String zzd;
    private TypeFilter zze;

    zzdk() {
    }

    /* access modifiers changed from: 0000 */
    public final zzep zza(List<Field> list) {
        this.zza = zzgv.zza((Collection<? extends E>) list);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zzep zza(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zzep zza(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zzep zza(String str) {
        this.zzd = str;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zzep zza(TypeFilter typeFilter) {
        this.zze = typeFilter;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zzeq zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" placeFields");
        }
        if (!str.isEmpty()) {
            String str2 = "Missing required properties:";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        zzdi zzdi = new zzdi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        return zzdi;
    }
}
