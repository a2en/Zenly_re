package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9732e;

public interface PlatformDecoder {
    CloseableReference<Bitmap> decodeFromEncodedImage(C9732e eVar, Config config, Rect rect);

    CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, ColorSpace colorSpace);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImage(C9732e eVar, Config config, Rect rect, int i);

    CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, int i, ColorSpace colorSpace);
}
