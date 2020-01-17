package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours.Builder;
import java.util.List;

final class zzk extends Builder {
    private List<Period> zza;
    private List<String> zzb;

    zzk() {
    }

    public final Builder setPeriods(List<Period> list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        throw new NullPointerException("Null periods");
    }

    public final Builder setWeekdayText(List<String> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        throw new NullPointerException("Null weekdayText");
    }

    /* access modifiers changed from: 0000 */
    public final OpeningHours zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" periods");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" weekdayText");
        }
        if (str.isEmpty()) {
            return new zzaj(this.zza, this.zzb);
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
