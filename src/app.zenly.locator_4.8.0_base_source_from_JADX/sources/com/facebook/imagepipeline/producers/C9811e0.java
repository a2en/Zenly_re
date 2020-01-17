package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9530g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.e0 */
public class C9811e0 implements Producer<CloseableReference<C9730c>> {

    /* renamed from: a */
    private final MemoryCache<CacheKey, C9730c> f25768a;

    /* renamed from: b */
    private final CacheKeyFactory f25769b;

    /* renamed from: c */
    private final Producer<CloseableReference<C9730c>> f25770c;

    /* renamed from: com.facebook.imagepipeline.producers.e0$a */
    public static class C9812a extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> {

        /* renamed from: c */
        private final CacheKey f25771c;

        /* renamed from: d */
        private final boolean f25772d;

        /* renamed from: e */
        private final MemoryCache<CacheKey, C9730c> f25773e;

        /* renamed from: f */
        private final boolean f25774f;

        public C9812a(Consumer<CloseableReference<C9730c>> consumer, CacheKey cacheKey, boolean z, MemoryCache<CacheKey, C9730c> memoryCache, boolean z2) {
            super(consumer);
            this.f25771c = cacheKey;
            this.f25772d = z;
            this.f25773e = memoryCache;
            this.f25774f = z2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            CloseableReference<C9730c> closeableReference2 = null;
            if (closeableReference == null) {
                if (C9796b.m24323a(i)) {
                    mo26659b().onNewResult(closeableReference2, i);
                }
            } else if (!C9796b.m24325b(i) || this.f25772d) {
                if (this.f25774f) {
                    closeableReference2 = this.f25773e.cache(this.f25771c, closeableReference);
                }
                try {
                    mo26659b().onProgressUpdate(1.0f);
                    Consumer b = mo26659b();
                    if (closeableReference2 != null) {
                        closeableReference = closeableReference2;
                    }
                    b.onNewResult(closeableReference, i);
                } finally {
                    CloseableReference.m23355b(closeableReference2);
                }
            }
        }
    }

    public C9811e0(MemoryCache<CacheKey, C9730c> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<C9730c>> producer) {
        this.f25768a = memoryCache;
        this.f25769b = cacheKeyFactory;
        this.f25770c = producer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26635a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    public void produceResults(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        C9884a imageRequest = producerContext.getImageRequest();
        Object callerContext = producerContext.getCallerContext();
        Postprocessor f = imageRequest.mo26732f();
        if (f == null || f.getPostprocessorCacheKey() == null) {
            this.f25770c.produceResults(consumer, producerContext);
            return;
        }
        listener.onProducerStart(id, mo26635a());
        CacheKey postprocessedBitmapCacheKey = this.f25769b.getPostprocessedBitmapCacheKey(imageRequest, callerContext);
        CloseableReference closeableReference = this.f25768a.get(postprocessedBitmapCacheKey);
        String str = "cached_value_found";
        Map map = null;
        if (closeableReference != null) {
            String a = mo26635a();
            if (listener.requiresExtraMap(id)) {
                map = C9530g.m23258a(str, "true");
            }
            listener.onProducerFinishWithSuccess(id, a, map);
            listener.onUltimateProducerReached(id, "PostprocessedBitmapMemoryCacheProducer", true);
            consumer.onProgressUpdate(1.0f);
            consumer.onNewResult(closeableReference, 1);
            closeableReference.close();
        } else {
            Consumer<CloseableReference<C9730c>> consumer2 = consumer;
            C9812a aVar = new C9812a(consumer2, postprocessedBitmapCacheKey, f instanceof RepeatedPostprocessor, this.f25768a, producerContext.getImageRequest().mo26746s());
            String a2 = mo26635a();
            if (listener.requiresExtraMap(id)) {
                map = C9530g.m23258a(str, "false");
            }
            listener.onProducerFinishWithSuccess(id, a2, map);
            this.f25770c.produceResults(aVar, producerContext);
        }
    }
}
