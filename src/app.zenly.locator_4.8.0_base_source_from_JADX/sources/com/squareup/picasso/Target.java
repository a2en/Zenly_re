package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.C11847d;

public interface Target {
    void onBitmapFailed(Drawable drawable);

    void onBitmapLoaded(Bitmap bitmap, C11847d dVar);

    void onPrepareLoad(Drawable drawable);
}
