package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder;
import java.util.List;

final class zzn extends Builder {
    private List<Field> zza;
    private C10689a zzb;

    zzn() {
    }

    public final Builder setCancellationToken(C10689a aVar) {
        this.zzb = aVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(List<Field> list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        throw new NullPointerException("Null placeFields");
    }

    /* access modifiers changed from: 0000 */
    public final FindCurrentPlaceRequest zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" placeFields");
        }
        if (str.isEmpty()) {
            return new zzl(this.zza, this.zzb);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
