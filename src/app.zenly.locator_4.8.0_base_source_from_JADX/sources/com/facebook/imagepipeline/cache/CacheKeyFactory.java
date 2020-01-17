package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.C9884a;

public interface CacheKeyFactory {
    CacheKey getBitmapCacheKey(C9884a aVar, Object obj);

    CacheKey getEncodedCacheKey(C9884a aVar, Uri uri, Object obj);

    CacheKey getEncodedCacheKey(C9884a aVar, Object obj);

    CacheKey getPostprocessedBitmapCacheKey(C9884a aVar, Object obj);
}
