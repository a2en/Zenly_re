package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import p333g.p339c.p352d.p355b.C12058f;

public interface Postprocessor {
    String getName();

    CacheKey getPostprocessorCacheKey();

    CloseableReference<Bitmap> process(Bitmap bitmap, C12058f fVar);
}
