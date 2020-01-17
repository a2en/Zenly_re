package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;

final class zzbc extends zzbl<Object, FetchPhotoResponse> {
    private final Bitmap zza;

    private zzbc(Bitmap bitmap) {
        this.zza = bitmap;
    }

    public final FetchPhotoResponse zza() {
        return FetchPhotoResponse.newInstance(this.zza);
    }
}
