package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.internal.zzcq;
import com.google.android.libraries.places.internal.zzgv;
import java.util.Collection;
import java.util.List;

public abstract class FetchPlaceRequest implements zzcq {

    public static abstract class Builder {
        public FetchPlaceRequest build() {
            zza((List<Field>) zzgv.zza((Collection<? extends E>) zza().getPlaceFields()));
            return zza();
        }

        public abstract Builder setCancellationToken(C10689a aVar);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(List<Field> list);

        /* access modifiers changed from: 0000 */
        public abstract FetchPlaceRequest zza();
    }

    public static Builder builder(String str, List<Field> list) {
        return new zzf().zza(str).zza(list);
    }

    public static FetchPlaceRequest newInstance(String str, List<Field> list) {
        return builder(str, list).build();
    }

    public abstract C10689a getCancellationToken();

    public abstract List<Field> getPlaceFields();

    public abstract String getPlaceId();

    public abstract AutocompleteSessionToken getSessionToken();
}
