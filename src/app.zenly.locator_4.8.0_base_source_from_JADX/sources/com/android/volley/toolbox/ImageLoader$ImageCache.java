package com.android.volley.toolbox;

import android.graphics.Bitmap;

public interface ImageLoader$ImageCache {
    Bitmap getBitmap(String str);

    void putBitmap(String str, Bitmap bitmap);
}
