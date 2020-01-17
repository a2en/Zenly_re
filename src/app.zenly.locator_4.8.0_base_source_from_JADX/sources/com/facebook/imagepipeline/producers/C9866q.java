package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9530g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.q */
public class C9866q implements Producer<C9732e> {

    /* renamed from: a */
    private final MemoryCache<CacheKey, PooledByteBuffer> f25905a;

    /* renamed from: b */
    private final CacheKeyFactory f25906b;

    /* renamed from: c */
    private final Producer<C9732e> f25907c;

    /* renamed from: com.facebook.imagepipeline.producers.q$a */
    private static class C9867a extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private final MemoryCache<CacheKey, PooledByteBuffer> f25908c;

        /* renamed from: d */
        private final CacheKey f25909d;

        /* renamed from: e */
        private final boolean f25910e;

        public C9867a(Consumer<C9732e> consumer, MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.f25908c = memoryCache;
            this.f25909d = cacheKey;
            this.f25910e = z;
        }

        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            CloseableReference b;
            CloseableReference closeableReference;
            C9732e eVar2;
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!C9796b.m24325b(i) && eVar != null && !C9796b.m24324a(i, 10)) {
                    if (eVar.mo26432g() != ImageFormat.f25182b) {
                        b = eVar.mo26421b();
                        if (b != null) {
                            closeableReference = null;
                            if (this.f25910e) {
                                closeableReference = this.f25908c.cache(this.f25909d, b);
                            }
                            CloseableReference.m23355b(b);
                            if (closeableReference != null) {
                                eVar2 = new C9732e(closeableReference);
                                eVar2.mo26420a(eVar);
                                CloseableReference.m23355b(closeableReference);
                                mo26659b().onProgressUpdate(1.0f);
                                mo26659b().onNewResult(eVar2, i);
                                C9732e.m24069c(eVar2);
                                if (FrescoSystrace.m24705c()) {
                                    FrescoSystrace.m24702a();
                                }
                                return;
                            }
                        }
                        mo26659b().onNewResult(eVar, i);
                        if (FrescoSystrace.m24705c()) {
                            FrescoSystrace.m24702a();
                        }
                        return;
                    }
                }
                mo26659b().onNewResult(eVar, i);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            } catch (Throwable th) {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                throw th;
            }
        }
    }

    public C9866q(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<C9732e> producer) {
        this.f25905a = memoryCache;
        this.f25906b = cacheKeyFactory;
        this.f25907c = producer;
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        C9732e eVar;
        String str = "EncodedMemoryCacheProducer";
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("EncodedMemoryCacheProducer#produceResults");
            }
            String id = producerContext.getId();
            ProducerListener listener = producerContext.getListener();
            listener.onProducerStart(id, str);
            CacheKey encodedCacheKey = this.f25906b.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
            CloseableReference closeableReference = this.f25905a.get(encodedCacheKey);
            String str2 = "cached_value_found";
            Map map = null;
            if (closeableReference != null) {
                try {
                    eVar = new C9732e(closeableReference);
                    if (listener.requiresExtraMap(id)) {
                        map = C9530g.m23258a(str2, "true");
                    }
                    listener.onProducerFinishWithSuccess(id, str, map);
                    listener.onUltimateProducerReached(id, str, true);
                    consumer.onProgressUpdate(1.0f);
                    consumer.onNewResult(eVar, 1);
                    C9732e.m24069c(eVar);
                    CloseableReference.m23355b(closeableReference);
                } catch (Throwable th) {
                    CloseableReference.m23355b(closeableReference);
                    throw th;
                }
            } else {
                String str3 = "false";
                if (producerContext.getLowestPermittedRequestLevel().mo26749a() >= C9886b.ENCODED_MEMORY_CACHE.mo26749a()) {
                    listener.onProducerFinishWithSuccess(id, str, listener.requiresExtraMap(id) ? C9530g.m23258a(str2, str3) : null);
                    listener.onUltimateProducerReached(id, str, false);
                    consumer.onNewResult(null, 1);
                    CloseableReference.m23355b(closeableReference);
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                    return;
                }
                C9867a aVar = new C9867a(consumer, this.f25905a, encodedCacheKey, producerContext.getImageRequest().mo26746s());
                if (listener.requiresExtraMap(id)) {
                    map = C9530g.m23258a(str2, str3);
                }
                listener.onProducerFinishWithSuccess(id, str, map);
                this.f25907c.produceResults(aVar, producerContext);
                CloseableReference.m23355b(closeableReference);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }
}
