package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;

/* renamed from: com.facebook.imagepipeline.producers.j */
public class C9833j implements Producer<C9732e> {

    /* renamed from: a */
    private final Producer<C9732e> f25820a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Producer<C9732e> f25821b;

    /* renamed from: com.facebook.imagepipeline.producers.j$b */
    private class C9835b extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private ProducerContext f25822c;

        private C9835b(Consumer<C9732e> consumer, ProducerContext producerContext) {
            super(consumer);
            this.f25822c = producerContext;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            C9884a imageRequest = this.f25822c.getImageRequest();
            boolean a = C9796b.m24323a(i);
            boolean a2 = C9861o0.m24555a(eVar, imageRequest.mo26739l());
            if (eVar != null && (a2 || imageRequest.mo26729d())) {
                if (!a || !a2) {
                    mo26659b().onNewResult(eVar, C9796b.m24327c(i, 1));
                } else {
                    mo26659b().onNewResult(eVar, i);
                }
            }
            if (a && !a2) {
                C9732e.m24069c(eVar);
                C9833j.this.f25821b.produceResults(mo26659b(), this.f25822c);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            C9833j.this.f25821b.produceResults(mo26659b(), this.f25822c);
        }
    }

    public C9833j(Producer<C9732e> producer, Producer<C9732e> producer2) {
        this.f25820a = producer;
        this.f25821b = producer2;
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        this.f25820a.produceResults(new C9835b(consumer, producerContext), producerContext);
    }
}
