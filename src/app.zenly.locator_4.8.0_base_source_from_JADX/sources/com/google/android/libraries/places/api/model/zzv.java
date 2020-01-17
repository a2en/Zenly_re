package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PlusCode.Builder;

final class zzv extends Builder {
    private String zza;
    private String zzb;

    zzv() {
    }

    public final PlusCode build() {
        return new zzat(this.zza, this.zzb);
    }

    public final Builder setCompoundCode(String str) {
        this.zza = str;
        return this;
    }

    public final Builder setGlobalCode(String str) {
        this.zzb = str;
        return this;
    }
}
