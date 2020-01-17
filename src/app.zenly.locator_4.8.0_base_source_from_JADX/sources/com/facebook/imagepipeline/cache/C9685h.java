package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.C9487e;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.Postprocessor;

/* renamed from: com.facebook.imagepipeline.cache.h */
public class C9685h implements CacheKeyFactory {

    /* renamed from: a */
    private static C9685h f25315a;

    protected C9685h() {
    }

    /* renamed from: a */
    public static synchronized C9685h m23823a() {
        C9685h hVar;
        synchronized (C9685h.class) {
            if (f25315a == null) {
                f25315a = new C9685h();
            }
            hVar = f25315a;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Uri mo26246a(Uri uri) {
        return uri;
    }

    public CacheKey getBitmapCacheKey(C9884a aVar, Object obj) {
        Uri p = aVar.mo26743p();
        mo26246a(p);
        C9675c cVar = new C9675c(p.toString(), aVar.mo26739l(), aVar.mo26741n(), aVar.mo26728c(), null, null, obj);
        return cVar;
    }

    public CacheKey getEncodedCacheKey(C9884a aVar, Object obj) {
        return getEncodedCacheKey(aVar, aVar.mo26743p(), obj);
    }

    public CacheKey getPostprocessedBitmapCacheKey(C9884a aVar, Object obj) {
        String str;
        CacheKey cacheKey;
        Postprocessor f = aVar.mo26732f();
        if (f != null) {
            CacheKey postprocessorCacheKey = f.getPostprocessorCacheKey();
            str = f.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            str = null;
        }
        Uri p = aVar.mo26743p();
        mo26246a(p);
        C9675c cVar = new C9675c(p.toString(), aVar.mo26739l(), aVar.mo26741n(), aVar.mo26728c(), cacheKey, str, obj);
        return cVar;
    }

    public CacheKey getEncodedCacheKey(C9884a aVar, Uri uri, Object obj) {
        mo26246a(uri);
        return new C9487e(uri.toString());
    }
}
