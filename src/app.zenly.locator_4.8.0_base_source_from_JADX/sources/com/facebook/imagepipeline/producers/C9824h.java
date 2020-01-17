package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9530g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.h */
public class C9824h implements Producer<CloseableReference<C9730c>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MemoryCache<CacheKey, C9730c> f25794a;

    /* renamed from: b */
    private final CacheKeyFactory f25795b;

    /* renamed from: c */
    private final Producer<CloseableReference<C9730c>> f25796c;

    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    class C9825a extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> {

        /* renamed from: c */
        final /* synthetic */ CacheKey f25797c;

        /* renamed from: d */
        final /* synthetic */ boolean f25798d;

        C9825a(Consumer consumer, CacheKey cacheKey, boolean z) {
            this.f25797c = cacheKey;
            this.f25798d = z;
            super(consumer);
        }

        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            CloseableReference<C9730c> closeableReference2;
            CloseableReference closeableReference3;
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean a = C9796b.m24323a(i);
                closeableReference2 = null;
                if (closeableReference == null) {
                    if (a) {
                        mo26659b().onNewResult(null, i);
                    }
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                    return;
                }
                if (!((C9730c) closeableReference.mo25724b()).mo26407b()) {
                    if (!C9796b.m24326b(i, 8)) {
                        if (!a) {
                            closeableReference3 = C9824h.this.f25794a.get(this.f25797c);
                            if (closeableReference3 != null) {
                                QualityInfo qualityInfo = ((C9730c) closeableReference.mo25724b()).getQualityInfo();
                                QualityInfo qualityInfo2 = ((C9730c) closeableReference3.mo25724b()).getQualityInfo();
                                if (qualityInfo2.isOfFullQuality() || qualityInfo2.getQuality() >= qualityInfo.getQuality()) {
                                    mo26659b().onNewResult(closeableReference3, i);
                                    CloseableReference.m23355b(closeableReference3);
                                    if (FrescoSystrace.m24705c()) {
                                        FrescoSystrace.m24702a();
                                    }
                                    return;
                                }
                                CloseableReference.m23355b(closeableReference3);
                            }
                        }
                        if (this.f25798d) {
                            closeableReference2 = C9824h.this.f25794a.cache(this.f25797c, closeableReference);
                        }
                        if (a) {
                            mo26659b().onProgressUpdate(1.0f);
                        }
                        Consumer b = mo26659b();
                        if (closeableReference2 != null) {
                            closeableReference = closeableReference2;
                        }
                        b.onNewResult(closeableReference, i);
                        CloseableReference.m23355b(closeableReference2);
                        if (FrescoSystrace.m24705c()) {
                            FrescoSystrace.m24702a();
                        }
                        return;
                    }
                }
                mo26659b().onNewResult(closeableReference, i);
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

    public C9824h(MemoryCache<CacheKey, C9730c> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<CloseableReference<C9730c>> producer) {
        this.f25794a = memoryCache;
        this.f25795b = cacheKeyFactory;
        this.f25796c = producer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26638a() {
        return "BitmapMemoryCacheProducer";
    }

    public void produceResults(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("BitmapMemoryCacheProducer#produceResults");
            }
            ProducerListener listener = producerContext.getListener();
            String id = producerContext.getId();
            listener.onProducerStart(id, mo26638a());
            CacheKey bitmapCacheKey = this.f25795b.getBitmapCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
            CloseableReference closeableReference = this.f25794a.get(bitmapCacheKey);
            String str = "cached_value_found";
            Map map = null;
            if (closeableReference != null) {
                boolean isOfFullQuality = ((C9730c) closeableReference.mo25724b()).getQualityInfo().isOfFullQuality();
                if (isOfFullQuality) {
                    listener.onProducerFinishWithSuccess(id, mo26638a(), listener.requiresExtraMap(id) ? C9530g.m23258a(str, "true") : null);
                    listener.onUltimateProducerReached(id, mo26638a(), true);
                    consumer.onProgressUpdate(1.0f);
                }
                C9796b.m24322a(isOfFullQuality);
                consumer.onNewResult(closeableReference, isOfFullQuality ? 1 : 0);
                closeableReference.close();
                if (isOfFullQuality) {
                    return;
                }
            }
            String str2 = "false";
            if (producerContext.getLowestPermittedRequestLevel().mo26749a() >= C9886b.BITMAP_MEMORY_CACHE.mo26749a()) {
                listener.onProducerFinishWithSuccess(id, mo26638a(), listener.requiresExtraMap(id) ? C9530g.m23258a(str, str2) : null);
                listener.onUltimateProducerReached(id, mo26638a(), false);
                consumer.onNewResult(null, 1);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return;
            }
            Consumer a = mo26637a(consumer, bitmapCacheKey, producerContext.getImageRequest().mo26746s());
            String a2 = mo26638a();
            if (listener.requiresExtraMap(id)) {
                map = C9530g.m23258a(str, str2);
            }
            listener.onProducerFinishWithSuccess(id, a2, map);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("mInputProducer.produceResult");
            }
            this.f25796c.produceResults(a, producerContext);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Consumer<CloseableReference<C9730c>> mo26637a(Consumer<CloseableReference<C9730c>> consumer, CacheKey cacheKey, boolean z) {
        return new C9825a(consumer, cacheKey, z);
    }
}
