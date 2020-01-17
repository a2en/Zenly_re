package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;

/* renamed from: com.facebook.imagepipeline.producers.i */
public class C9830i implements Producer<CloseableReference<C9730c>> {

    /* renamed from: a */
    private final Producer<CloseableReference<C9730c>> f25814a;

    /* renamed from: b */
    private final int f25815b;

    /* renamed from: c */
    private final int f25816c;

    /* renamed from: d */
    private final boolean f25817d;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    private static class C9831a extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> {

        /* renamed from: c */
        private final int f25818c;

        /* renamed from: d */
        private final int f25819d;

        C9831a(Consumer<CloseableReference<C9730c>> consumer, int i, int i2) {
            super(consumer);
            this.f25818c = i;
            this.f25819d = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            m24471a(closeableReference);
            mo26659b().onNewResult(closeableReference, i);
        }

        /* renamed from: a */
        private void m24471a(CloseableReference<C9730c> closeableReference) {
            if (closeableReference != null && closeableReference.mo25728d()) {
                C9730c cVar = (C9730c) closeableReference.mo25724b();
                if (cVar != null && !cVar.isClosed() && (cVar instanceof C9731d)) {
                    Bitmap c = ((C9731d) cVar).mo26411c();
                    if (c != null) {
                        int rowBytes = c.getRowBytes() * c.getHeight();
                        if (rowBytes >= this.f25818c && rowBytes <= this.f25819d) {
                            c.prepareToDraw();
                        }
                    }
                }
            }
        }
    }

    public C9830i(Producer<CloseableReference<C9730c>> producer, int i, int i2, boolean z) {
        C9536j.m23275a(i <= i2);
        C9536j.m23271a(producer);
        this.f25814a = producer;
        this.f25815b = i;
        this.f25816c = i2;
        this.f25817d = z;
    }

    public void produceResults(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext) {
        if (!producerContext.isPrefetch() || this.f25817d) {
            this.f25814a.produceResults(new C9831a(consumer, this.f25815b, this.f25816c), producerContext);
        } else {
            this.f25814a.produceResults(consumer, producerContext);
        }
    }
}
