package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9885a;

/* renamed from: com.facebook.imagepipeline.producers.o */
public class C9858o implements Producer<C9732e> {

    /* renamed from: a */
    private final C9678e f25888a;

    /* renamed from: b */
    private final C9678e f25889b;

    /* renamed from: c */
    private final CacheKeyFactory f25890c;

    /* renamed from: d */
    private final Producer<C9732e> f25891d;

    /* renamed from: com.facebook.imagepipeline.producers.o$b */
    private static class C9860b extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private final ProducerContext f25892c;

        /* renamed from: d */
        private final C9678e f25893d;

        /* renamed from: e */
        private final C9678e f25894e;

        /* renamed from: f */
        private final CacheKeyFactory f25895f;

        private C9860b(Consumer<C9732e> consumer, ProducerContext producerContext, C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory) {
            super(consumer);
            this.f25892c = producerContext;
            this.f25893d = eVar;
            this.f25894e = eVar2;
            this.f25895f = cacheKeyFactory;
        }

        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (C9796b.m24325b(i) || eVar == null || C9796b.m24324a(i, 10) || eVar.mo26432g() == ImageFormat.f25182b) {
                mo26659b().onNewResult(eVar, i);
                return;
            }
            C9884a imageRequest = this.f25892c.getImageRequest();
            CacheKey encodedCacheKey = this.f25895f.getEncodedCacheKey(imageRequest, this.f25892c.getCallerContext());
            if (imageRequest.mo26727b() == C9885a.SMALL) {
                this.f25894e.mo26233a(encodedCacheKey, eVar);
            } else {
                this.f25893d.mo26233a(encodedCacheKey, eVar);
            }
            mo26659b().onNewResult(eVar, i);
        }
    }

    public C9858o(C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, Producer<C9732e> producer) {
        this.f25888a = eVar;
        this.f25889b = eVar2;
        this.f25890c = cacheKeyFactory;
        this.f25891d = producer;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.facebook.imagepipeline.producers.Consumer] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24550a(com.facebook.imagepipeline.producers.Consumer<com.facebook.imagepipeline.image.C9732e> r9, com.facebook.imagepipeline.producers.ProducerContext r10) {
        /*
            r8 = this;
            com.facebook.imagepipeline.request.a$b r0 = r10.getLowestPermittedRequestLevel()
            int r0 = r0.mo26749a()
            com.facebook.imagepipeline.request.a$b r1 = com.facebook.imagepipeline.request.C9884a.C9886b.DISK_CACHE
            int r1 = r1.mo26749a()
            if (r0 < r1) goto L_0x0016
            r10 = 0
            r0 = 1
            r9.onNewResult(r10, r0)
            goto L_0x0035
        L_0x0016:
            com.facebook.imagepipeline.request.a r0 = r10.getImageRequest()
            boolean r0 = r0.mo26745r()
            if (r0 == 0) goto L_0x0030
            com.facebook.imagepipeline.producers.o$b r0 = new com.facebook.imagepipeline.producers.o$b
            com.facebook.imagepipeline.cache.e r4 = r8.f25888a
            com.facebook.imagepipeline.cache.e r5 = r8.f25889b
            com.facebook.imagepipeline.cache.CacheKeyFactory r6 = r8.f25890c
            r7 = 0
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r0
        L_0x0030:
            com.facebook.imagepipeline.producers.Producer<com.facebook.imagepipeline.image.e> r0 = r8.f25891d
            r0.produceResults(r9, r10)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9858o.m24550a(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.ProducerContext):void");
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        m24550a(consumer, producerContext);
    }
}
