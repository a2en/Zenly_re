package com.google.android.libraries.places.internal;

import android.content.Intent;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

public abstract class zzeq {
    public static zzeq zza(Intent intent) {
        return new zzdk().zza((List<Field>) intent.getParcelableArrayListExtra("place_fields")).zza((LocationBias) intent.getParcelableExtra("location_bias")).zza((LocationRestriction) intent.getParcelableExtra("location_restriction")).zza(intent.getStringExtra("country")).zza((TypeFilter) intent.getSerializableExtra("types")).zza();
    }

    public abstract zzgv<Field> zza();

    public abstract LocationBias zzb();

    public abstract LocationRestriction zzc();

    public abstract String zzd();

    public abstract TypeFilter zze();
}
