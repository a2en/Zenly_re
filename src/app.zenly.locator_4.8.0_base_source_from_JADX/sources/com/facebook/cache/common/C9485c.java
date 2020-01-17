package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger.C9481a;

/* renamed from: com.facebook.cache.common.c */
public class C9485c implements CacheErrorLogger {

    /* renamed from: a */
    private static C9485c f24594a;

    private C9485c() {
    }

    /* renamed from: a */
    public static synchronized C9485c m23136a() {
        C9485c cVar;
        synchronized (C9485c.class) {
            if (f24594a == null) {
                f24594a = new C9485c();
            }
            cVar = f24594a;
        }
        return cVar;
    }

    public void logError(C9481a aVar, Class<?> cls, String str, Throwable th) {
    }
}
