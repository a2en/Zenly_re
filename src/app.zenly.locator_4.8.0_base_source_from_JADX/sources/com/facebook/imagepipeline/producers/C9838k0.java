package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9536j;

/* renamed from: com.facebook.imagepipeline.producers.k0 */
public class C9838k0<T> implements Producer<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Producer<T> f25828a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9847l0 f25829b;

    /* renamed from: com.facebook.imagepipeline.producers.k0$a */
    class C9839a extends C9836j0<T> {

        /* renamed from: j */
        final /* synthetic */ ProducerListener f25830j;

        /* renamed from: k */
        final /* synthetic */ String f25831k;

        /* renamed from: l */
        final /* synthetic */ Consumer f25832l;

        /* renamed from: m */
        final /* synthetic */ ProducerContext f25833m;

        C9839a(Consumer consumer, ProducerListener producerListener, String str, String str2, ProducerListener producerListener2, String str3, Consumer consumer2, ProducerContext producerContext) {
            this.f25830j = producerListener2;
            this.f25831k = str3;
            this.f25832l = consumer2;
            this.f25833m = producerContext;
            super(consumer, producerListener, str, str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25653a(T t) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo25654b() throws Exception {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo25655b(T t) {
            this.f25830j.onProducerFinishWithSuccess(this.f25831k, "BackgroundThreadHandoffProducer", null);
            C9838k0.this.f25828a.produceResults(this.f25832l, this.f25833m);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.k0$b */
    class C9840b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ C9836j0 f25835a;

        C9840b(C9836j0 j0Var) {
            this.f25835a = j0Var;
        }

        public void onCancellationRequested() {
            this.f25835a.mo25651a();
            C9838k0.this.f25829b.mo26658b(this.f25835a);
        }
    }

    public C9838k0(Producer<T> producer, C9847l0 l0Var) {
        C9536j.m23271a(producer);
        this.f25828a = producer;
        this.f25829b = l0Var;
    }

    public void produceResults(Consumer<T> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        C9839a aVar = new C9839a(consumer, listener, "BackgroundThreadHandoffProducer", id, listener, id, consumer, producerContext);
        producerContext.addCallbacks(new C9840b(aVar));
        this.f25829b.mo26657a(aVar);
    }
}
