package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

public final class zzbe implements zzao<zzbc> {
    private Bitmap zza;

    public final zzao<zzbc> zza(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }

    public final /* synthetic */ zzaj zza() {
        zzgg.zzb(this.zza != null, (Object) "Photo must be set to non-null value.");
        return new zzbc(this.zza);
    }
}
