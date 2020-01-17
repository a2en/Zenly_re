package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.os.Parcelable;
import android.util.TypedValue;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzdf;
import com.google.android.libraries.places.internal.zzdg;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.ArrayList;
import java.util.List;

public final class Autocomplete {

    public static class IntentBuilder extends zzdg {
        private final AutocompleteActivityMode zza;
        private final List<Field> zzb;
        private zzdf zzc = zzdf.INTENT;
        private String zzd;
        private String zze;
        private LocationBias zzf;
        private LocationRestriction zzg;
        private String zzh;
        private TypeFilter zzi;

        public IntentBuilder(AutocompleteActivityMode autocompleteActivityMode, List<Field> list) {
            this.zza = autocompleteActivityMode;
            this.zzb = list;
        }

        public Intent build(Context context) {
            String str = "primary_color_dark";
            String str2 = "primary_color";
            Class<AutocompleteActivity> cls = AutocompleteActivity.class;
            try {
                Intent intent = new Intent();
                intent.setClass(context, cls);
                Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(16843827, typedValue, true) && !intent.hasExtra(str2)) {
                    intent.putExtra(str2, typedValue.data);
                }
                if (theme.resolveAttribute(16843828, typedValue2, true) && !intent.hasExtra(str)) {
                    intent.putExtra(str, typedValue2.data);
                }
                zzdg.zza(intent, "mode", (Parcelable) this.zza);
                intent.putExtra("place_fields", new ArrayList(this.zzb));
                zzdg.zza(intent, "origin", (Parcelable) this.zzc);
                zzdg.zza(intent, "initial_query", this.zzd);
                zzdg.zza(intent, "hint", this.zze);
                zzdg.zza(intent, "location_bias", (Parcelable) this.zzf);
                zzdg.zza(intent, "location_restriction", (Parcelable) this.zzg);
                zzdg.zza(intent, "country", this.zzh);
                String str3 = "types";
                TypeFilter typeFilter = this.zzi;
                if (typeFilter != null) {
                    intent.putExtra(str3, typeFilter);
                } else {
                    intent.removeExtra(str3);
                }
                return intent;
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }

        public IntentBuilder setCountry(String str) {
            this.zzh = str;
            return this;
        }

        public IntentBuilder setHint(String str) {
            this.zze = str;
            return this;
        }

        public IntentBuilder setInitialQuery(String str) {
            this.zzd = str;
            return this;
        }

        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zzf = locationBias;
            return this;
        }

        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zzg = locationRestriction;
            return this;
        }

        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zzi = typeFilter;
            return this;
        }

        public final IntentBuilder zza(zzdf zzdf) {
            this.zzc = zzdf;
            return this;
        }
    }

    private Autocomplete() {
    }

    public static Place getPlaceFromIntent(Intent intent) {
        try {
            zzgg.zza(intent, (Object) "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("selected_place");
            zzgg.zza(place != null, (Object) "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public static Status getStatusFromIntent(Intent intent) {
        try {
            zzgg.zza(intent, (Object) "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("status");
            zzgg.zza(status != null, (Object) "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
