package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;

/* renamed from: com.facebook.imagepipeline.cache.o */
public class C9695o implements ImageCacheStatsTracker {

    /* renamed from: a */
    private static C9695o f25327a;

    private C9695o() {
    }

    /* renamed from: a */
    public static synchronized C9695o m23830a() {
        C9695o oVar;
        synchronized (C9695o.class) {
            if (f25327a == null) {
                f25327a = new C9695o();
            }
            oVar = f25327a;
        }
        return oVar;
    }

    public void onBitmapCacheHit(CacheKey cacheKey) {
    }

    public void onBitmapCacheMiss() {
    }

    public void onBitmapCachePut() {
    }

    public void onDiskCacheGetFail() {
    }

    public void onDiskCacheHit(CacheKey cacheKey) {
    }

    public void onDiskCacheMiss() {
    }

    public void onMemoryCacheHit(CacheKey cacheKey) {
    }

    public void onMemoryCacheMiss() {
    }

    public void onMemoryCachePut() {
    }

    public void onStagingAreaHit(CacheKey cacheKey) {
    }

    public void onStagingAreaMiss() {
    }

    public void registerBitmapMemoryCache(CountingMemoryCache<?, ?> countingMemoryCache) {
    }

    public void registerEncodedMemoryCache(CountingMemoryCache<?, ?> countingMemoryCache) {
    }
}
