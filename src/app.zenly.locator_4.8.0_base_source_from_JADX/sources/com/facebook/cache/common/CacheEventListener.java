package com.facebook.cache.common;

public interface CacheEventListener {

    /* renamed from: com.facebook.cache.common.CacheEventListener$a */
    public enum C9482a {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    void onCleared();

    void onEviction(CacheEvent cacheEvent);

    void onHit(CacheEvent cacheEvent);

    void onMiss(CacheEvent cacheEvent);

    void onReadException(CacheEvent cacheEvent);

    void onWriteAttempt(CacheEvent cacheEvent);

    void onWriteException(CacheEvent cacheEvent);

    void onWriteSuccess(CacheEvent cacheEvent);
}
