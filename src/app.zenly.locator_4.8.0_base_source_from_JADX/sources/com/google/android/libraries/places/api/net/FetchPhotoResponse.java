package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

public abstract class FetchPhotoResponse {
    public static FetchPhotoResponse newInstance(Bitmap bitmap) {
        return new zze(bitmap);
    }

    public abstract Bitmap getBitmap();
}
