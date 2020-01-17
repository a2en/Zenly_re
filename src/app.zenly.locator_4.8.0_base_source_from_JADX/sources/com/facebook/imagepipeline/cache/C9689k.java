package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: com.facebook.imagepipeline.cache.k */
public class C9689k {

    /* renamed from: com.facebook.imagepipeline.cache.k$a */
    static class C9690a implements MemoryCacheTracker<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ ImageCacheStatsTracker f25317a;

        C9690a(ImageCacheStatsTracker imageCacheStatsTracker) {
            this.f25317a = imageCacheStatsTracker;
        }

        /* renamed from: a */
        public void onCacheHit(CacheKey cacheKey) {
            this.f25317a.onMemoryCacheHit(cacheKey);
        }

        public void onCacheMiss() {
            this.f25317a.onMemoryCacheMiss();
        }

        public void onCachePut() {
            this.f25317a.onMemoryCachePut();
        }
    }

    /* renamed from: a */
    public static C9691l<CacheKey, PooledByteBuffer> m23828a(CountingMemoryCache<CacheKey, PooledByteBuffer> countingMemoryCache, ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerEncodedMemoryCache(countingMemoryCache);
        return new C9691l<>(countingMemoryCache, new C9690a(imageCacheStatsTracker));
    }
}
