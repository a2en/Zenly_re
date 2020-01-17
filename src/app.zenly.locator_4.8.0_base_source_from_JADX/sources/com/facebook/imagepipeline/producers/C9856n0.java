package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9536j;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.producers.n0 */
public class C9856n0 implements Producer<C9732e> {

    /* renamed from: a */
    private final ThumbnailProducer<C9732e>[] f25883a;

    /* renamed from: com.facebook.imagepipeline.producers.n0$a */
    private class C9857a extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private final ProducerContext f25884c;

        /* renamed from: d */
        private final int f25885d;

        /* renamed from: e */
        private final C9701e f25886e = this.f25884c.getImageRequest().mo26739l();

        public C9857a(Consumer<C9732e> consumer, ProducerContext producerContext, int i) {
            super(consumer);
            this.f25884c = producerContext;
            this.f25885d = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (eVar != null && (C9796b.m24325b(i) || C9861o0.m24555a(eVar, this.f25886e))) {
                mo26659b().onNewResult(eVar, i);
            } else if (C9796b.m24323a(i)) {
                C9732e.m24069c(eVar);
                if (!C9856n0.this.m24545a(this.f25885d + 1, mo26659b(), this.f25884c)) {
                    mo26659b().onNewResult(null, 1);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            if (!C9856n0.this.m24545a(this.f25885d + 1, mo26659b(), this.f25884c)) {
                mo26659b().onFailure(th);
            }
        }
    }

    public C9856n0(ThumbnailProducer<C9732e>... thumbnailProducerArr) {
        C9536j.m23271a(thumbnailProducerArr);
        this.f25883a = (ThumbnailProducer[]) thumbnailProducerArr;
        C9536j.m23270a(0, this.f25883a.length);
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        if (producerContext.getImageRequest().mo26739l() == null) {
            consumer.onNewResult(null, 1);
        } else if (!m24545a(0, consumer, producerContext)) {
            consumer.onNewResult(null, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m24545a(int i, Consumer<C9732e> consumer, ProducerContext producerContext) {
        int a = m24544a(i, producerContext.getImageRequest().mo26739l());
        if (a == -1) {
            return false;
        }
        this.f25883a[a].produceResults(new C9857a(consumer, producerContext, a), producerContext);
        return true;
    }

    /* renamed from: a */
    private int m24544a(int i, C9701e eVar) {
        while (true) {
            ThumbnailProducer<C9732e>[] thumbnailProducerArr = this.f25883a;
            if (i >= thumbnailProducerArr.length) {
                return -1;
            }
            if (thumbnailProducerArr[i].canProvideImageForSize(eVar)) {
                return i;
            }
            i++;
        }
    }
}
