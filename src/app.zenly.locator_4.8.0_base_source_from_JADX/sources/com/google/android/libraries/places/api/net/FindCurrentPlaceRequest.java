package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.internal.zzcq;
import com.google.android.libraries.places.internal.zzgv;
import java.util.Collection;
import java.util.List;

public abstract class FindCurrentPlaceRequest implements zzcq {

    public static abstract class Builder {
        public FindCurrentPlaceRequest build() {
            zza(zzgv.zza((Collection<? extends E>) zza().getPlaceFields()));
            return zza();
        }

        public abstract Builder setCancellationToken(C10689a aVar);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(List<Field> list);

        /* access modifiers changed from: 0000 */
        public abstract FindCurrentPlaceRequest zza();
    }

    public static Builder builder(List<Field> list) {
        return new zzn().zza(list);
    }

    public static FindCurrentPlaceRequest newInstance(List<Field> list) {
        return builder(list).build();
    }

    public abstract C10689a getCancellationToken();

    public abstract List<Field> getPlaceFields();
}
