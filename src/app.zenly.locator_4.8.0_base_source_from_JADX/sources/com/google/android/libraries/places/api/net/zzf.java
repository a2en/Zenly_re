package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place.Field;
import com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder;
import java.util.List;

final class zzf extends Builder {
    private String zza;
    private List<Field> zzb;
    private AutocompleteSessionToken zzc;
    private C10689a zzd;

    zzf() {
    }

    public final Builder setCancellationToken(C10689a aVar) {
        this.zzd = aVar;
        return this;
    }

    public final Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null placeId");
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(List<Field> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        throw new NullPointerException("Null placeFields");
    }

    /* access modifiers changed from: 0000 */
    public final FetchPlaceRequest zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" placeId");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" placeFields");
        }
        if (!str.isEmpty()) {
            String str2 = "Missing required properties:";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        zzd zzd2 = new zzd(this.zza, this.zzb, this.zzc, this.zzd);
        return zzd2;
    }
}
