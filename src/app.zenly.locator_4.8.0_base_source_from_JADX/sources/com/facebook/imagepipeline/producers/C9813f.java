package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.C9730c;

/* renamed from: com.facebook.imagepipeline.producers.f */
public class C9813f extends C9824h {
    public C9813f(MemoryCache<CacheKey, C9730c> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<C9730c>> producer) {
        super(memoryCache, cacheKeyFactory, producer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Consumer<CloseableReference<C9730c>> mo26637a(Consumer<CloseableReference<C9730c>> consumer, CacheKey cacheKey, boolean z) {
        return consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26638a() {
        return "BitmapMemoryCacheGetProducer";
    }
}
