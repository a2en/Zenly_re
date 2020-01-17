package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a.C9886b;

/* renamed from: com.facebook.imagepipeline.producers.p */
public class C9862p extends C9797b0<Pair<CacheKey, C9886b>, C9732e> {

    /* renamed from: c */
    private final CacheKeyFactory f25896c;

    public C9862p(CacheKeyFactory cacheKeyFactory, Producer producer) {
        super(producer);
        this.f25896c = cacheKeyFactory;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<CacheKey, C9886b> m24559a(ProducerContext producerContext) {
        return Pair.create(this.f25896c.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext()), producerContext.getLowestPermittedRequestLevel());
    }

    /* renamed from: a */
    public C9732e mo26618a(C9732e eVar) {
        return C9732e.m24068b(eVar);
    }
}
