package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Period.Builder;

final class zzm extends Builder {
    private TimeOfWeek zza;
    private TimeOfWeek zzb;

    zzm() {
    }

    public final Period build() {
        return new zzal(this.zza, this.zzb);
    }

    public final Builder setClose(TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    public final Builder setOpen(TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }
}
