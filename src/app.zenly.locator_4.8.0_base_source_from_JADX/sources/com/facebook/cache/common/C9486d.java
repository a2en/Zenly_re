package com.facebook.cache.common;

/* renamed from: com.facebook.cache.common.d */
public class C9486d implements CacheEventListener {

    /* renamed from: a */
    private static C9486d f24595a;

    private C9486d() {
    }

    /* renamed from: a */
    public static synchronized C9486d m23137a() {
        C9486d dVar;
        synchronized (C9486d.class) {
            if (f24595a == null) {
                f24595a = new C9486d();
            }
            dVar = f24595a;
        }
        return dVar;
    }

    public void onCleared() {
    }

    public void onEviction(CacheEvent cacheEvent) {
    }

    public void onHit(CacheEvent cacheEvent) {
    }

    public void onMiss(CacheEvent cacheEvent) {
    }

    public void onReadException(CacheEvent cacheEvent) {
    }

    public void onWriteAttempt(CacheEvent cacheEvent) {
    }

    public void onWriteException(CacheEvent cacheEvent) {
    }

    public void onWriteSuccess(CacheEvent cacheEvent) {
    }
}
