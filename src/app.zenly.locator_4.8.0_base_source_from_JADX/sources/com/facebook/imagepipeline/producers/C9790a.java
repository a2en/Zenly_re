package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.producers.a */
public class C9790a implements Producer<C9732e> {

    /* renamed from: a */
    private final Producer<C9732e> f25714a;

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    private static class C9792b extends C9848m<C9732e, C9732e> {
        private C9792b(Consumer<C9732e> consumer) {
            super(consumer);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (eVar == null) {
                mo26659b().onNewResult(null, i);
                return;
            }
            if (!C9732e.m24070d(eVar)) {
                eVar.mo26440n();
            }
            mo26659b().onNewResult(eVar, i);
        }
    }

    public C9790a(Producer<C9732e> producer) {
        this.f25714a = producer;
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        this.f25714a.produceResults(new C9792b(consumer), producerContext);
    }
}
