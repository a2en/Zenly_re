package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.C9730c;

/* renamed from: com.facebook.imagepipeline.cache.b */
public class C9673b {

    /* renamed from: com.facebook.imagepipeline.cache.b$a */
    static class C9674a implements MemoryCacheTracker<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ ImageCacheStatsTracker f25283a;

        C9674a(ImageCacheStatsTracker imageCacheStatsTracker) {
            this.f25283a = imageCacheStatsTracker;
        }

        /* renamed from: a */
        public void onCacheHit(CacheKey cacheKey) {
            this.f25283a.onBitmapCacheHit(cacheKey);
        }

        public void onCacheMiss() {
            this.f25283a.onBitmapCacheMiss();
        }

        public void onCachePut() {
            this.f25283a.onBitmapCachePut();
        }
    }

    /* renamed from: a */
    public static C9691l<CacheKey, C9730c> m23796a(CountingMemoryCache<CacheKey, C9730c> countingMemoryCache, ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerBitmapMemoryCache(countingMemoryCache);
        return new C9691l<>(countingMemoryCache, new C9674a(imageCacheStatsTracker));
    }
}
